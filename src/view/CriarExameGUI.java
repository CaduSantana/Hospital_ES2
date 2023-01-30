package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ControladorGeral;
import controller.ControladorMedico;
import controller.ControladorPaciente;
import database.Database;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CriarExameGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldCRM;
	private JTextField textFieldCPF;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriarExameGUI frame = new CriarExameGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CriarExameGUI() {
		setResizable(false);
		setTitle("Criar exame");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 581, 261);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome do exame:");
		lblNome.setBounds(10, 11, 116, 14);
		contentPane.add(lblNome);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(112, 8, 320, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblCRM = new JLabel("CRM do médico responsável: ");
		lblCRM.setBounds(10, 36, 159, 14);
		contentPane.add(lblCRM);
		
		textFieldCRM = new JTextField();
		textFieldCRM.setBounds(179, 33, 159, 20);
		contentPane.add(textFieldCRM);
		textFieldCRM.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF do paciente:");
		lblCPF.setBounds(10, 61, 94, 14);
		contentPane.add(lblCPF);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setBounds(112, 61, 146, 20);
		contentPane.add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		lblResultado = new JLabel("Resultado do exame:");
		lblResultado.setBounds(10, 92, 116, 14);
		contentPane.add(lblResultado);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 111, 371, 55);
		contentPane.add(scrollPane);
		
		JTextArea textAreaResultado = new JTextArea();
		scrollPane.setViewportView(textAreaResultado);
		textAreaResultado.setText("Insira resultado aqui.");
		textAreaResultado.setWrapStyleWord(true);
		textAreaResultado.setLineWrap(true);
		
		JCheckBox chckbxGrave = new JCheckBox("É grave?");
		chckbxGrave.setBounds(410, 126, 76, 23);
		contentPane.add(chckbxGrave);
		
		JButton btnCriar = new JButton("Criar");
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(textFieldCPF.getText());
				Database.carregarDados();
				
				ControladorGeral controladorGeral = new ControladorGeral();
				ControladorPaciente controladorPaciente = new ControladorPaciente();
				ControladorMedico controladorMedico = new ControladorMedico();
				
//				String nomePaciente;
//				String nomeMedico;
				try {
					String nomePaciente = Database.pesquisarPaciente(textFieldCPF.getText()).getNome();
					String nomeMedico = Database.pesquisarMedico(textFieldCRM.getText()).getNome();
					Database.exames.add(controladorGeral.solicitarCriarExame(controladorPaciente, textFieldNome.getText(), nomePaciente, nomeMedico, textAreaResultado.getText(), chckbxGrave.isSelected()));
					Database.salvarDados();
					JOptionPane.showMessageDialog(null, "Exame criado com sucesso!");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
				
				dispose();

			}
		});
		btnCriar.setBounds(229, 188, 89, 23);
		contentPane.add(btnCriar);
	}
}

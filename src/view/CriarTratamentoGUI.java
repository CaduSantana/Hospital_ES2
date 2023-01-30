package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ControladorGeral;
import controller.ControladorPaciente;
import database.Database;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class CriarTratamentoGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCPF;
	private JTextField textFieldCRM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriarTratamentoGUI frame = new CriarTratamentoGUI();
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
	public CriarTratamentoGUI() {
		setTitle("Criar tratamento");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCPF = new JLabel("CPF do paciente:");
		lblCPF.setBounds(10, 11, 95, 14);
		contentPane.add(lblCPF);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setBounds(142, 8, 142, 20);
		contentPane.add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		JLabel lblCRM = new JLabel("CRM do médico:");
		lblCRM.setBounds(10, 36, 95, 14);
		contentPane.add(lblCRM);
		
		textFieldCRM = new JTextField();
		textFieldCRM.setBounds(142, 33, 86, 20);
		contentPane.add(textFieldCRM);
		textFieldCRM.setColumns(10);
		
		JLabel lblRecomendacoes = new JLabel("Recomendações:");
		lblRecomendacoes.setBounds(10, 61, 114, 14);
		contentPane.add(lblRecomendacoes);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 86, 414, 141);
		contentPane.add(scrollPane);
		
		JTextArea textAreaRecomendacoes = new JTextArea();
		scrollPane.setViewportView(textAreaRecomendacoes);
		
		JButton btnCriar = new JButton("Criar");
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Database.carregarDados();
				ControladorGeral controladorGeral = new ControladorGeral();
				ControladorPaciente controladorPaciente = new ControladorPaciente();
				
				try {
					ArrayList<String> recomendacoes = new ArrayList<String>();
					recomendacoes.add(textAreaRecomendacoes.getText());
					Database.tratamentos.add(controladorGeral.solicitarCriarTratamento(controladorPaciente, textFieldCPF.getText(), recomendacoes, textFieldCRM.getText()));
					Database.salvarDados();
					JOptionPane.showMessageDialog(null, "Tratamento criado com sucesso!");

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1);
				}
				
				dispose();
			}
		});
		btnCriar.setBounds(170, 243, 89, 23);
		contentPane.add(btnCriar);
	}

}

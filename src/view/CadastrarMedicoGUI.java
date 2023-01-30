package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ControladorGeral;
import controller.ControladorMedico;
import database.Database;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastrarMedicoGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldCRM;
	private JTextField textFieldEspecializacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarMedicoGUI frame = new CadastrarMedicoGUI();
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
	public CadastrarMedicoGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 205);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(20, 11, 45, 14);
		contentPane.add(lblNome);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(75, 8, 408, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblCRM = new JLabel("CRM:");
		lblCRM.setBounds(20, 42, 45, 14);
		contentPane.add(lblCRM);
		
		textFieldCRM = new JTextField();
		textFieldCRM.setBounds(75, 39, 82, 20);
		contentPane.add(textFieldCRM);
		textFieldCRM.setColumns(10);
		
		JLabel lblArea = new JLabel("Area de especialização:");
		lblArea.setBounds(216, 42, 143, 14);
		contentPane.add(lblArea);
		
		textFieldEspecializacao = new JTextField();
		textFieldEspecializacao.setBounds(369, 39, 114, 20);
		contentPane.add(textFieldEspecializacao);
		textFieldEspecializacao.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorGeral controladorGeral = new ControladorGeral();
				ControladorMedico controladorMedico = new ControladorMedico();
				Database.medicos.add(controladorGeral.solicitarCriarMedico(controladorMedico, textFieldNome.getText(), textFieldCRM.getText(), true, textFieldEspecializacao.getText()));
				Database.salvarDados();
				JOptionPane.showMessageDialog(null, "Médico cadastrado com sucesso!");
				dispose();
			}
		});
		btnCadastrar.setBounds(201, 107, 89, 23);
		contentPane.add(btnCadastrar);
	}
}

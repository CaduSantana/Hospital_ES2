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
import java.awt.event.ActionEvent;

public class RealizarTriagemGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCpfPaciente;
	private JTextField textFieldCpfAssistente;
	private JLabel lblAltura;
	private JTextField textFieldAltura;
	private JLabel lblPressao;
	private JTextField textFieldPressao;
	private JLabel lblPeso;
	private JTextField textFieldPeso;
	private JLabel lblTemperatura;
	private JTextField textFieldTemperatura;
	private JLabel lblSintomas;
	private JTextArea textAreaSintomas;
	private JScrollPane scrollPane;
	private JButton btnSalvar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RealizarTriagemGUI frame = new RealizarTriagemGUI();
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
	public RealizarTriagemGUI() {
		setTitle("Realizar triagem");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 569, 284);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCpfPaciente = new JLabel("CPF do paciente:");
		lblCpfPaciente.setBounds(10, 11, 100, 14);
		contentPane.add(lblCpfPaciente);
		
		textFieldCpfPaciente = new JTextField();
		textFieldCpfPaciente.setBounds(120, 11, 121, 20);
		contentPane.add(textFieldCpfPaciente);
		textFieldCpfPaciente.setColumns(10);
		
		JLabel lblCpfAssistente = new JLabel("CPF do assistente:");
		lblCpfAssistente.setBounds(10, 42, 100, 14);
		contentPane.add(lblCpfAssistente);
		
		textFieldCpfAssistente = new JTextField();
		textFieldCpfAssistente.setBounds(120, 39, 121, 20);
		contentPane.add(textFieldCpfAssistente);
		textFieldCpfAssistente.setColumns(10);
		
		lblAltura = new JLabel("Altura (em metros):");
		lblAltura.setBounds(10, 70, 113, 14);
		contentPane.add(lblAltura);
		
		textFieldAltura = new JTextField();
		textFieldAltura.setBounds(120, 67, 86, 20);
		contentPane.add(textFieldAltura);
		textFieldAltura.setColumns(10);
		
		lblPressao = new JLabel("Pressão:");
		lblPressao.setBounds(10, 95, 63, 14);
		contentPane.add(lblPressao);
		
		textFieldPressao = new JTextField();
		textFieldPressao.setBounds(120, 95, 86, 20);
		contentPane.add(textFieldPressao);
		textFieldPressao.setColumns(10);
		
		lblPeso = new JLabel("Peso (em Kg):");
		lblPeso.setBounds(10, 125, 86, 14);
		contentPane.add(lblPeso);
		
		textFieldPeso = new JTextField();
		textFieldPeso.setBounds(120, 122, 86, 20);
		contentPane.add(textFieldPeso);
		textFieldPeso.setColumns(10);
		
		lblTemperatura = new JLabel("Temperatura:");
		lblTemperatura.setBounds(10, 150, 86, 14);
		contentPane.add(lblTemperatura);
		
		textFieldTemperatura = new JTextField();
		textFieldTemperatura.setBounds(120, 147, 86, 20);
		contentPane.add(textFieldTemperatura);
		textFieldTemperatura.setColumns(10);
		
		lblSintomas = new JLabel("Sintomas:");
		lblSintomas.setBounds(283, 11, 63, 14);
		contentPane.add(lblSintomas);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(283, 37, 260, 127);
		contentPane.add(scrollPane);
		
		textAreaSintomas = new JTextArea();
		scrollPane.setViewportView(textAreaSintomas);
		textAreaSintomas.setWrapStyleWord(true);
		textAreaSintomas.setLineWrap(true);
		
		btnSalvar = new JButton("Salvar dados");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Database.carregarDados();
				
				ControladorGeral controladorGeral = new ControladorGeral();
				ControladorPaciente controladorPaciente = new ControladorPaciente();
				
				try {
					Database.triagens.add(controladorGeral.solicitarFazerTriagem(controladorPaciente, textFieldCpfAssistente.getText(), textFieldCpfPaciente.getText(), Float.parseFloat(textFieldAltura.getText()), Float.parseFloat(textFieldPressao.getText()), Float.parseFloat(textFieldPeso.getText()), Integer.parseInt(textFieldTemperatura.getText()), textAreaSintomas.getText()));
					Database.salvarDados();
					JOptionPane.showMessageDialog(null, "Triagem realizada com sucesso!");
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1.getMessage());
				} catch (Exception e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
				
				dispose();
			}
		});
		btnSalvar.setBounds(211, 210, 121, 23);
		contentPane.add(btnSalvar);
	}

}

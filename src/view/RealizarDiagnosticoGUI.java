package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ControladorGeral;
import controller.ControladorPaciente;
import database.Database;
import model.ExameModel;
import model.ReceitaModel;
import model.TratamentoModel;
import model.TriagemModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class RealizarDiagnosticoGUI extends JFrame {

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
					RealizarDiagnosticoGUI frame = new RealizarDiagnosticoGUI();
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
	public RealizarDiagnosticoGUI() {
		setResizable(false);
		setTitle("Realizar diagnóstico");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCPF = new JLabel("CPF do paciente:");
		lblCPF.setBounds(10, 11, 95, 14);
		contentPane.add(lblCPF);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setColumns(10);
		textFieldCPF.setBounds(115, 8, 142, 20);
		contentPane.add(textFieldCPF);
		
		JLabel lblCRM = new JLabel("CRM do médico:");
		lblCRM.setBounds(10, 36, 95, 14);
		contentPane.add(lblCRM);
		
		textFieldCRM = new JTextField();
		textFieldCRM.setColumns(10);
		textFieldCRM.setBounds(115, 33, 86, 20);
		contentPane.add(textFieldCRM);
		
		JLabel lblCausa = new JLabel("Causa do problema:");
		lblCausa.setBounds(10, 61, 130, 14);
		contentPane.add(lblCausa);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 86, 414, 114);
		contentPane.add(scrollPane);
		
		JTextArea textAreaCausa = new JTextArea();
		scrollPane.setViewportView(textAreaCausa);
		
		JButton btnRealizar = new JButton("Realizar diagnóstico");
		btnRealizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Database.carregarDados();
				ControladorGeral controladorGeral = new ControladorGeral();
				ControladorPaciente controladorPaciente = new ControladorPaciente();
				
				String nomePaciente = Database.pesquisarPaciente(textFieldCPF.getText()).getNome();
				String cpfPaciente = Database.pesquisarPaciente(textFieldCPF.getText()).getCpf();
				
				ArrayList<ExameModel> exames = new ArrayList<ExameModel>();
				ArrayList<ReceitaModel> receitas = new ArrayList<ReceitaModel>();
				
				try {
					for (ExameModel exame : Database.exames) 
						if(exame.getNomePaciente().equals(nomePaciente)) 
							exames.add(exame);
					for (ReceitaModel receita : Database.receitas) 
						if(receita.getCpfPaciente().equals(cpfPaciente))
							receitas.add(receita);
					
					TratamentoModel tratamento = null;
					for (TratamentoModel tratamentoAux : Database.tratamentos) {
						if(tratamentoAux.getNomePaciente().equals(nomePaciente)) {
							tratamento = tratamentoAux;
							break;
						}
					}
					
					TriagemModel triagem = null;
					for (TriagemModel triagemAux : Database.triagens) {
						if(triagemAux.getPaciente().getCpf().equals(cpfPaciente)) {
							triagem = triagemAux;
							break;
						}
					}
					
					Database.diagnosticos.add(controladorGeral.solicitarCriarDiagnositco(controladorPaciente, cpfPaciente, textFieldCRM.getText(), textAreaCausa.getText(), exames, tratamento, triagem, receitas));
					
					Database.salvarDados();
					JOptionPane.showMessageDialog(null, "Diagnóstico realizado com sucesso!");

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1);
				}
				
				dispose();
			}
		});
		btnRealizar.setBounds(126, 227, 166, 23);
		contentPane.add(btnRealizar);
	}

}

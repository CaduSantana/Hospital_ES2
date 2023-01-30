package view;

import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import database.Database;
import model.ExameModel;
import model.PacienteModel;
import model.ReceitaModel;
import model.TratamentoModel;
import model.TriagemModel;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class FichaPacienteGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FichaPacienteGUI frame = new FichaPacienteGUI();
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
	public FichaPacienteGUI() {
		setResizable(false);
		setTitle("Ficha paciente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 93, 414, 283);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		
		JLabel lblCPF = new JLabel("CPF do paciente:");
		lblCPF.setBounds(10, 11, 111, 14);
		contentPane.add(lblCPF);
		
		JLabel lblRelatorio = new JLabel("Relatório:");
		lblRelatorio.setBounds(10, 68, 85, 14);
		contentPane.add(lblRelatorio);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setBounds(131, 8, 130, 20);
		contentPane.add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Database.carregarDados();
				
				PacienteModel paciente = Database.pesquisarPaciente(textFieldCPF.getText());
				ArrayList<String> relatorio = new ArrayList<String>();
				
				ArrayList<ExameModel> exames = new ArrayList<ExameModel>();
				ArrayList<ReceitaModel> receitas = new ArrayList<ReceitaModel>();
				
				try {
					for (ExameModel exame : Database.exames) 
						if(exame.getNomePaciente().equals(paciente.getNome())) 
							exames.add(exame);
					for (ReceitaModel receita : Database.receitas) 
						if(receita.getCpfPaciente().equals(paciente.getCpf()))
							receitas.add(receita);
					
					TratamentoModel tratamento = null;
					for (TratamentoModel tratamentoAux : Database.tratamentos) {
						if(tratamentoAux.getNomePaciente().equals(paciente.getNome())) {
							tratamento = tratamentoAux;
							break;
						}
					}
					
					TriagemModel triagem = null;
					for (TriagemModel triagemAux : Database.triagens) {
						if(triagemAux.getPaciente().getCpf().equals(paciente.getCpf())) {
							triagem = triagemAux;
							break;
						}
					}
				
				relatorio.add("Paciente: \n");
				relatorio.add(paciente.getNome());
				relatorio.add("Sintomas: " + triagem.getSintomas());
				
				relatorio.add("Exames: \n");
				for (ExameModel exame : exames) {
					relatorio.add(exame.getNomeExame());
					relatorio.add(exame.getResultadoExame());
				}
				
				relatorio.add("Receitas: \n");
				for (ReceitaModel receita : receitas) {
					relatorio.add(receita.getNome());
					relatorio.add(""+receita.getDosagem());
					relatorio.add(""+receita.getQtdDias()+" dias");
				}
				
				relatorio.add("Tratamento: \n");
				relatorio.add("Médico: " + tratamento.getNomeMedico());
				relatorio.add("Recomendações: \n");
				for (String recomendacao : tratamento.getRecomendacoesMedico()) {
					relatorio.add(recomendacao);
				}
				
				textArea.setText(relatorio.toString());
						
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnPesquisar.setBounds(323, 7, 89, 23);
		contentPane.add(btnPesquisar);
	}

}

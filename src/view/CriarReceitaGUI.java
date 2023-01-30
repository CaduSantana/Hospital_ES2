package view;

import java.awt.EventQueue;
import java.awt.HeadlessException;

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
import java.util.Date;
import java.awt.event.ActionEvent;

public class CriarReceitaGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldDosagem;
	private JTextField textFieldDuracao;
	private JLabel lblCPF;
	private JTextField textFieldCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriarReceitaGUI frame = new CriarReceitaGUI();
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
	public CriarReceitaGUI() {
		setResizable(false);
		setTitle("Gerar receita");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 446, 191);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome da medicação:");
		lblNome.setBounds(10, 11, 139, 14);
		contentPane.add(lblNome);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(144, 8, 276, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblDosagem = new JLabel("Dosagem:");
		lblDosagem.setBounds(10, 36, 78, 14);
		contentPane.add(lblDosagem);
		
		textFieldDosagem = new JTextField();
		textFieldDosagem.setBounds(144, 36, 79, 20);
		contentPane.add(textFieldDosagem);
		textFieldDosagem.setColumns(10);
		
		JLabel lblDuracao = new JLabel("Duração em dias:");
		lblDuracao.setBounds(236, 39, 106, 14);
		contentPane.add(lblDuracao);
		
		textFieldDuracao = new JTextField();
		textFieldDuracao.setBounds(342, 36, 78, 20);
		contentPane.add(textFieldDuracao);
		textFieldDuracao.setColumns(10);
		
		JButton btnCriar = new JButton("Criar");
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Database.carregarDados();
				ControladorGeral controladorGeral = new ControladorGeral();
				ControladorMedico controladorMedico = new ControladorMedico();
				
				
				try {
					String cpfPaciente = Database.pesquisarPaciente(textFieldCPF.getText()).getCpf();

					controladorMedico.criarReceita(textFieldNome.getText(), cpfPaciente, Float.parseFloat(textFieldDosagem.getText()), new Date(), Integer.parseInt(textFieldDuracao.getText()));
					Database.salvarDados();
					JOptionPane.showMessageDialog(null, "Receita gerada com sucesso!");
					Database.salvarDados();
					
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1.getMessage());
					
				} catch (HeadlessException e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1.getMessage());
					
				} catch (Exception e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
				
				dispose();				
			}
		});
		btnCriar.setBounds(165, 118, 89, 23);
		contentPane.add(btnCriar);
		
		lblCPF = new JLabel("CPF do paciente:");
		lblCPF.setBounds(10, 64, 98, 14);
		contentPane.add(lblCPF);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setBounds(144, 61, 139, 20);
		contentPane.add(textFieldCPF);
		textFieldCPF.setColumns(10);
	}

}

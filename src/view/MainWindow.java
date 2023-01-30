package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("Arquivo");
		menuBar.add(mnFile);
		
		JMenuItem mntmSalvarDados = new JMenuItem("Salvar dados");
		mnFile.add(mntmSalvarDados);
		
		JMenuItem mntmCarregarDados = new JMenuItem("Carregar dados");
		mnFile.add(mntmCarregarDados);
		
		JMenu mnOperacoes = new JMenu("Operações");
		menuBar.add(mnOperacoes);
		
		JMenuItem mntmCadastrarMedico = new JMenuItem("Cadastrar médico");
		mntmCadastrarMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarMedicoGUI cadastrarMedicoGUI = new CadastrarMedicoGUI();
				cadastrarMedicoGUI.show();
			}
		});
		mnOperacoes.add(mntmCadastrarMedico);
		
		JMenuItem mntmCadastrarAssistente = new JMenuItem("Cadastrar assistente");
		mntmCadastrarAssistente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarAssistenteGUI cadastrarAssistenteGUI = new CadastrarAssistenteGUI();
				cadastrarAssistenteGUI.show();
			}
		});
		mnOperacoes.add(mntmCadastrarAssistente);
		
		JMenuItem mntmCadastrarPaciente = new JMenuItem("Cadastrar paciente");
		mntmCadastrarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarPacienteGUI cadastrarPacienteGUI = new CadastrarPacienteGUI();
				cadastrarPacienteGUI.show();
			}
		});
		mnOperacoes.add(mntmCadastrarPaciente);
		
		JMenuItem mntmCriarExame = new JMenuItem("Criar exame");
		mntmCriarExame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CriarExameGUI criarExameGUI = new CriarExameGUI();
				criarExameGUI.show();
			}
		});
		mnOperacoes.add(mntmCriarExame);
		
		JMenuItem mntmCriarReceita = new JMenuItem("Gerar receita");
		mntmCriarReceita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CriarReceitaGUI criarReceitaGUI = new CriarReceitaGUI();
				criarReceitaGUI.show();
			}
		});
		mnOperacoes.add(mntmCriarReceita);
		
		JMenuItem mntmTriagem = new JMenuItem("Realizar triagem");
		mntmTriagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RealizarTriagemGUI realizarTriagemGUI = new RealizarTriagemGUI();
				realizarTriagemGUI.show();
			}
		});
		mnOperacoes.add(mntmTriagem);
		
		JMenuItem mntmCriarTratamento = new JMenuItem("Criar tratamento");
		mntmCriarTratamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CriarTratamentoGUI criarTratamentoGUI = new CriarTratamentoGUI();
				criarTratamentoGUI.show();
			}
		});
		mnOperacoes.add(mntmCriarTratamento);
		
		JMenuItem mntmDiagnostico = new JMenuItem("Realizar diagnostico");
		mntmDiagnostico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RealizarDiagnosticoGUI realizarDiagnosticoGUI = new RealizarDiagnosticoGUI();
				realizarDiagnosticoGUI.show();
			}
		});
		mnOperacoes.add(mntmDiagnostico);
		
		JMenu mnRelatorio = new JMenu("Relatório");
		menuBar.add(mnRelatorio);
		
		JMenuItem mntmFicha = new JMenuItem("Ficha de paciente");
		mntmFicha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FichaPacienteGUI fichaPacienteGUI = new FichaPacienteGUI();
				fichaPacienteGUI.show();
			}
		});
		mnRelatorio.add(mntmFicha);
	}
}

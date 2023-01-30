package view;

import java.util.ArrayList;
import java.util.Date;
import controller.ControladorGeral;
import controller.ControladorMedico;
import controller.ControladorPaciente;
import database.Database;
import model.AssistenteModel;
import model.ExameModel;
import model.PacienteModel;
import model.ReceitaModel;
import model.TratamentoModel;
import model.TriagemModel;

public class teste {
	static Database db = new Database();
	
	public static void main(String[] args) {
//		 TODO Auto-generated method stub
//		ControladorGeral controladorGeral = new ControladorGeral();
//		ControladorPaciente controladorPaciente = new ControladorPaciente();
//		ControladorMedico controladorMedico = new ControladorMedico();
//		
//		Database.assistentes.add(controladorGeral.solicitarCriarAssistente("Marcos", "09088371431", "mail@mail.com", "40028922"));
//		Database.pacientes.add(controladorGeral.solicitarCriarPaciente(controladorPaciente, "09088371431", "Zeca", "28343544803", "40028922", "Rua Nova"));
//		System.out.println(controladorGeral.solicitarPesquisarPaciente(controladorPaciente, "09088371431", "28343544803"));
//		Database.medicos.add(controladorGeral.solicitarCriarMedico(controladorMedico, "Estranho", "12345", true, "Sangue"));
//		Database.exames.add(controladorGeral.solicitarCriarExame(controladorPaciente, "Sangue", "Zeca", "Estranho", "Turbo AIDS", false));
//		Database.receitas.add(controladorMedico.criarReceita("Receita", 2f, new Date(), 7));
//		TriagemModel triagem = controladorGeral.solicitarFazerTriagem(controladorPaciente, "09088371431", "28343544803", 1.7f, 60f, 82.3f, 28.2f, "Super herpes");
//		
//		ArrayList<String> recomendacoes = new ArrayList<String>();
//		recomendacoes.add("Tomar muita água");
//		recomendacoes.add("Tomar cloroquina 2 (duas) vezes por dia");
//		recomendacoes.add("Evitar relações sexuais");
//		TratamentoModel tratamento = controladorGeral.solicitarCriarTratamento(controladorPaciente, "28343544803", recomendacoes, "12345");
//		Database.tratamentos.add(tratamento);
//		
//		ArrayList<ExameModel> exames = new ArrayList<ExameModel>();
//		ArrayList<ReceitaModel> receitas = new ArrayList<ReceitaModel>();
//		Database.diagnosticos.add(controladorGeral.solicitarCriarDiagnositco(controladorPaciente, "28343544803", "12345", "Virose", exames, tratamento, triagem, receitas));
//		
//		Database.salvarDados();
		Database.carregarDados();
		Database.pesquisarPaciente("09088371431");
//
		Database.listar();
//		System.out.println("Fim");

		MainWindow mainWindow = new MainWindow();
		mainWindow.main(args);
		
	}

}

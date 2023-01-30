package controller;

import java.util.ArrayList;
import java.util.Date;

import database.Database;
import model.DiagnosticoModel;
import model.ExameModel;
import model.MedicoModel;
import model.ReceitaModel;
import model.TratamentoModel;
import model.TriagemModel;

public class ControladorMedico {
	
	public DiagnosticoModel criarDiagnostico(ControladorPaciente controladorPaciente, String cpfPaciente,
			String crm, String causaDoProblema, ArrayList <ExameModel> exames, TratamentoModel tratamento, TriagemModel triagem,
			ArrayList <ReceitaModel> receitas) {
		int idAtual = Database.diagnosticos.size() + 1;
		String nomePaciente = Database.pesquisarPaciente(cpfPaciente).getNome();
		String nomeMedico = Database.pesquisarMedico(crm).getNome();
		return new DiagnosticoModel(idAtual, nomePaciente, nomeMedico, causaDoProblema, receitas, exames, tratamento, triagem);
	}

	public ExameModel criarExame(ControladorPaciente controladorPaciente, String nomeExame, String nomePaciente, String nomeMedico,
			String resultadoExame, boolean grave) {
		int idAtual = Database.exames.size() + 1;
		return new ExameModel(idAtual, nomeExame, nomePaciente, nomeMedico, resultadoExame, grave);
	}
	
	public MedicoModel criar(String nome, String crm, boolean isGrave, String areaPlantao) {
		return new MedicoModel(nome, crm,  false, areaPlantao);
	}

	public ReceitaModel criarReceita(String nome, float dosagem, Date horario, int qtdDias) {
		int idAtual = Database.receitas.size() + 1;
		
		return new ReceitaModel(idAtual, nome, dosagem, horario, qtdDias);
	}

	public TratamentoModel criarTratamento(ControladorPaciente controladorPaciente, String cpfPaciente,
			ArrayList<String> recomendacoes, String crm) {
		int idAtual = Database.tratamentos.size() + 1;
		String nomeMedico = Database.pesquisarMedico(crm).getNome();
		String nomePaciente = Database.pesquisarPaciente(cpfPaciente).getNome();

		return new TratamentoModel(idAtual, nomePaciente, nomeMedico, recomendacoes);
	}

	public boolean solicitarExcluirPaciente(ControladorPaciente controladorPaciente, String cpfAssistente, String cpfPaciente) {
		return controladorPaciente.excluirPaciente(cpfAssistente, cpfPaciente);
	}
}

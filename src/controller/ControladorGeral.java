package controller;

import java.util.ArrayList;
import java.util.Date;

import model.AssistenteModel;
import model.DiagnosticoModel;
import model.ExameModel;
import model.MedicoModel;
import model.PacienteModel;
import model.ReceitaModel;
import model.TratamentoModel;
import model.TriagemModel;

public class ControladorGeral {

	ControladorGerente controladorGerente = new ControladorGerente();
	ControladorPaciente controladorPaciente = new ControladorPaciente();
	ControladorMedico controladorMedico = new ControladorMedico();
	ControladorAssistente controladorAssistente =  new ControladorAssistente();
	
	public AssistenteModel solicitarCriarAssistente(String nome, String cpf, String email, String telefone) {
		return controladorGerente.criarAssistente(nome, cpf, email, telefone);
	}
	
	public DiagnosticoModel solicitarCriarDiagnositco(ControladorPaciente controladorPaciente, String cpfPaciente, String crm, String causaDoProblema, ArrayList <ExameModel> exames, TratamentoModel tratamento, TriagemModel triagem, ArrayList <ReceitaModel> receitas) {
		return controladorMedico.criarDiagnostico(controladorPaciente, cpfPaciente, crm, causaDoProblema, exames, tratamento, triagem, receitas);
	}
	
	public ExameModel solicitarCriarExame(ControladorPaciente controladorPaciente, String nomeExame, String nomePaciente, String nomeMedico,
			String resultadoExame, boolean grave) {
		return controladorMedico.criarExame(controladorPaciente, nomeExame, nomePaciente, nomeMedico, resultadoExame, grave);
	}
	
	public MedicoModel solicitarCriarMedico(ControladorMedico controladorMedico, String nome, String crm, boolean plantao, String areaPlantao) {
		return controladorGerente.criarMedico(controladorMedico, nome, crm, plantao, areaPlantao);
	}
	
	public PacienteModel solicitarCriarPaciente(ControladorPaciente controladorPaciente, String cpfAssistente, String nome, String cpfPaciente, String telefone, String endereco) {
		return controladorAssistente.criarPaciente(controladorPaciente, cpfAssistente, nome, cpfPaciente, telefone, endereco);
	}
	
	public ReceitaModel solicitarCriarReceita(String nome, String cpfPaciente, float dosagem, Date horario, int qtdDias) {
		return controladorMedico.criarReceita(nome, cpfPaciente, dosagem, horario, qtdDias);
	}
	
	public TratamentoModel solicitarCriarTratamento(ControladorPaciente controladorPaciente, String cpfPaciente, ArrayList<String> recomendacoes, String crm) {
		return controladorMedico.criarTratamento(controladorPaciente, cpfPaciente, recomendacoes, crm);
	}
	
	public TriagemModel solicitarFazerTriagem(ControladorPaciente controladorPaciente, String cpfFuncionario, String cpfPaciente, float altura, float pressao, float peso, int temperatura, String sintomas) {
		return controladorAssistente.criarTriagem(controladorPaciente, cpfFuncionario, cpfPaciente, altura, pressao, peso, temperatura, sintomas);
	}
	
	public PacienteModel solicitarPesquisarPaciente(ControladorPaciente controladorPaciente, String cpfFuncionario, String cpfPaciente) {
		return controladorAssistente.pesquisarPaciente(controladorPaciente, cpfFuncionario, cpfPaciente);
	}
}

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
	
	public DiagnosticoModel solicitarCriarDiagnositco(ControladorPaciente controladorPaciente, String cpfPaciente, String cpfMedico, ArrayList <ExameModel> exames, TratamentoModel tratamento, TriagemModel triagem, ArrayList <ReceitaModel> receitas) {
		return controladorMedico.criarDiagnostico(controladorPaciente, cpfPaciente, cpfMedico, exames, tratamento, triagem, receitas);
	}
	
	public ExameModel solicitarCriarExame(ControladorPaciente controladorPaciente, String cpfPaciente, String nomeExame, boolean grave, String cpfMedico) {
		return controladorMedico.criarExame(controladorPaciente, cpfPaciente, nomeExame, grave, cpfMedico);
	}
	
	public MedicoModel solicitarCriarMedico(ControladorMedico controladorMedico, String name, String cpf, String telefone, String crm, String especializacao, String cpfGerente) {
		return controladorGerente.criarMedico(controladorMedico, name, cpf, telefone, crm, especializacao, cpfGerente);
	}
	
	public PacienteModel solicitarCriarPaciente(ControladorPaciente controladorPaciente, String cpfAssistente, String nome, String cpfPaciente, String email, String endereco) {
		return controladorAssistente.criarPaciente(controladorPaciente, cpfAssistente, nome, cpfPaciente, email, endereco);
	}
	
	public ReceitaModel solicitarCriarReceita(ControladorPaciente controladorPaciente, String cpfPaciente, String dosagem, int qtdDias, Date horario, String cpfMedico) {
		return controladorMedico.criarReceita(controladorPaciente, cpfPaciente, dosagem, qtdDias, horario, cpfMedico);
	}
	
	public TratamentoModel solicitarCriarTratamento(ControladorPaciente controladorPaciente, String cpfPaciente, ArrayList<String> recomendacoes, String cpfMedico) {
		return controladorMedico.criarTratamento(controladorPaciente, cpfPaciente, recomendacoes, cpfMedico);
	}
}

package controller;

import java.util.Date;

import database.Database;
import model.AssistenteModel;
import model.PacienteModel;
import model.TriagemModel;

public class ControladorAssistente {
	ControladorPaciente controladorPaciente = new ControladorPaciente();

	public AssistenteModel criar(String nome, String cpf , String email, String telefone) {
		return new AssistenteModel(nome, cpf, email, "senha123", new Date(), new Date(), telefone, "4000");
	}

	public PacienteModel criarPaciente(ControladorPaciente controladorPaciente, String cpfAssistente, String nome,
			String cpfPaciente, String telefone, String endereco) {
		return controladorPaciente.criar(controladorPaciente, cpfAssistente, nome, cpfPaciente, telefone, endereco);
	}

	public TriagemModel criarTriagem(ControladorPaciente controladorPaciente, String cpfFuncionario,
		String cpfPaciente, float altura, float pressao, float peso, int temperatura, String sintomas) {
		PacienteModel paciente = Database.pesquisarPaciente(cpfPaciente);
		AssistenteModel assistente = Database.pesquisarAssistente(cpfFuncionario);
		
		return new TriagemModel(assistente, paciente, altura, pressao, peso, temperatura, sintomas);
	}

	public PacienteModel pesquisarPaciente(ControladorPaciente controladorPaciente2, String cpfFuncionario,
			String cpfPaciente) {
		return Database.pesquisarPaciente(cpfPaciente);
	}

}

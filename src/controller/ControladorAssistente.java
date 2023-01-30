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
			String cpfPaciente, String email, String endereco) {
		return controladorPaciente.criar(controladorPaciente, cpfAssistente, nome, cpfPaciente, email, endereco);
	}

	public TriagemModel criarTriagem(ControladorPaciente controladorPaciente, String cpfFuncionario,
			String cpfPaciente, float altura, float pressao, float peso, float temperatura, String sintomas) {
//		controladorPaciente.getByCpf(cpfPaciente);
		return new TriagemModel(peso, altura, cpfPaciente, 0, null, null, sintomas);
	}

	public PacienteModel pesquisarPaciente(ControladorPaciente controladorPaciente2, String cpfFuncionario,
			String cpfPaciente) {
		return Database.pesquisarPaciente(cpfPaciente);
	}

}

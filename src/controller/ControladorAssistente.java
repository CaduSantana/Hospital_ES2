package controller;

import java.util.Date;

import model.AssistenteModel;
import model.PacienteModel;

public class ControladorAssistente {
	ControladorPaciente controladorPaciente = new ControladorPaciente();

	public AssistenteModel criar(String cpf, String nome, String email, String telefone) {
		return new AssistenteModel(nome, cpf, email, "senha123", new Date(), new Date(), telefone, "4000");
	}

	public PacienteModel criarPaciente(ControladorPaciente controladorPaciente, String cpfAssistente, String nome,
			String cpfPaciente, String email, String endereco) {
		return controladorPaciente.criar(controladorPaciente, cpfAssistente, nome, cpfPaciente, email, endereco);
	}

}

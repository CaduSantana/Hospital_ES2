package controller;

import model.PacienteModel;

public class ControladorPaciente {

	public PacienteModel criar(ControladorPaciente controladorPaciente, String cpfAssistente, String nome,
			String cpfPaciente, String email, String endereco) {
		// TODO Auto-generated method stub
		return new PacienteModel(nome, cpfPaciente, endereco, endereco);
		
	}

}

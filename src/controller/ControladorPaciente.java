package controller;

import database.Database;
import model.PacienteModel;

public class ControladorPaciente {
	

	public PacienteModel criar(ControladorPaciente controladorPaciente, String cpfAssistente, String nome,
			String cpfPaciente, String telefone, String endereco) {
		// TODO Auto-generated method stub
		return new PacienteModel(nome, cpfPaciente, telefone, endereco);
		
	}

	public boolean excluirPaciente(String cpfAssistente, String cpfPaciente) {
		// TODO Deletar da base de dados, depois carregar.
		return true;
	}
	
	public PacienteModel pesquisarPaciente(String cpfPaciente) {
		return Database.pesquisarPaciente("er");
	}

}

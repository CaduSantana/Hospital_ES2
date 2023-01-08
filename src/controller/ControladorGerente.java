package controller;

import model.AssistenteModel;
import model.MedicoModel;

public class ControladorGerente {

	ControladorAssistente controladorAssistente = new ControladorAssistente();
	ControladorMedico controladorMedico = new ControladorMedico();
	
	public AssistenteModel criarAssistente(String cpf, String nome, String email, String telefone) {
		return controladorAssistente.criar(cpf, nome, email, telefone);
	}

	public MedicoModel criarMedico(ControladorMedico controladorMedico, String nome, String cpf, String telefone,
			String crm, String especializacao, String cpfGerente) {
		// TODO Auto-generated method stub
		return controladorMedico.criar(nome, cpf, telefone, crm, especializacao);
	}

}

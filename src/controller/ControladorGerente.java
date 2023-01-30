package controller;

import model.AssistenteModel;
import model.MedicoModel;

public class ControladorGerente {

	ControladorAssistente controladorAssistente = new ControladorAssistente();
	ControladorMedico controladorMedico = new ControladorMedico();
	
	public AssistenteModel criarAssistente(String nome, String cpf, String email, String telefone) {
		return controladorAssistente.criar(nome, cpf, email, telefone);
	}

	public MedicoModel criarMedico(ControladorMedico controladorMedico, String nome, String crm, boolean plantao, String areaPlantao) {
		// TODO Auto-generated method stub
		return controladorMedico.criar(nome, crm, plantao, areaPlantao);
	}

}

package model;

import java.util.ArrayList;

public class TratamentoModel {
	// Variáveis
	
	private int idDiagnostico;
	private String nomePaciente;
	private String nomeMedico;
	private ArrayList<String> recomendacoesMedico;
	
	// Construtor
	public TratamentoModel(int idDiagnostico, String nomePaciente, String nomeMedico,
			ArrayList<String> recomendacoesMedico) {
		super();
		this.idDiagnostico = idDiagnostico;
		this.nomePaciente = nomePaciente;
		this.nomeMedico = nomeMedico;
		this.recomendacoesMedico = recomendacoesMedico;
	}
	
	// Getters e Setters
	
	public int getIdDiagnostico() {
		return idDiagnostico;
	}
	public void setIdDiagnostico(int idDiagnostico) {
		this.idDiagnostico = idDiagnostico;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public String getNomeMedico() {
		return nomeMedico;
	}
	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}
	public ArrayList<String> getRecomendacoesMedico() {
		return recomendacoesMedico;
	}
	public void setRecomendacoesMedico(ArrayList<String> recomendacoesMedico) {
		this.recomendacoesMedico = recomendacoesMedico;
	}
	
	
}

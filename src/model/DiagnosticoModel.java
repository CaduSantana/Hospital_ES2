package model;

import java.util.ArrayList;

public class DiagnosticoModel {
	// Variáveis 
	
	private int idDiagnostico;
	private String nomePaciente;
	private String nomeMedico;
	private String causaDoProblema;
	private ArrayList<ReceitaModel> receita;
	private ArrayList<ExameModel> exames;
	private TratamentoModel tratamento;
	private TriagemModel triagem;
	
	// Construtor
	
	public DiagnosticoModel(int idDiagnostico, String nomePaciente, String nomeMedico, String causaDoProblema,
			ArrayList<ReceitaModel> receita, ArrayList<ExameModel> exames, TratamentoModel tratamento, TriagemModel triagem) {
		this.idDiagnostico = idDiagnostico;
		this.nomePaciente = nomePaciente;
		this.nomeMedico = nomeMedico;
		this.causaDoProblema = causaDoProblema;
		this.receita = receita;
		this.exames = exames;
		this.tratamento = tratamento;
		this.triagem = triagem;
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
	public String getCausaDoProblema() {
		return causaDoProblema;
	}
	public void setCausaDoProblema(String causaDoProblema) {
		this.causaDoProblema = causaDoProblema;
	}
	public ArrayList<ReceitaModel> getReceita() {
		return receita;
	}
	public void setReceita(ArrayList<ReceitaModel> receita) {
		this.receita = receita;
	}
	public ArrayList<ExameModel> getExames() {
		return exames;
	}
	public void setExames(ArrayList<ExameModel> exames) {
		this.exames = exames;
	}
	public TratamentoModel getTratamento() {
		return tratamento;
	}
	public void setTratamento(TratamentoModel tratamento) {
		this.tratamento = tratamento;
	}
	public TriagemModel getTriagem() {
		return triagem;
	}
	public void setTriagem(TriagemModel triagem) {
		this.triagem = triagem;
	}
	
	
}

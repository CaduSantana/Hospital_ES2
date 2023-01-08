package model;

import java.util.Date;

public class ReceitaModel {
	// Variáveis
	
	private int idDiagnostico;
	private String nome;
	private float dosagem;
	private Date horario;
	private int qtdDias;
	
	// Construtor
	
	public ReceitaModel(int idDiagnostico, String nome, float dosagem, Date horario, int qtdDias) {
		super();
		this.idDiagnostico = idDiagnostico;
		this.nome = nome;
		this.dosagem = dosagem;
		this.horario = horario;
		this.qtdDias = qtdDias;
	}

	// Getters e Setters
	
	public int getIdDiagnostico() {
		return idDiagnostico;
	}

	public void setIdDiagnostico(int idDiagnostico) {
		this.idDiagnostico = idDiagnostico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getDosagem() {
		return dosagem;
	}

	public void setDosagem(float dosagem) {
		this.dosagem = dosagem;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public int getQtdDias() {
		return qtdDias;
	}

	public void setQtdDias(int qtdDias) {
		this.qtdDias = qtdDias;
	}
}

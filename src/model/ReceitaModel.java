package model;

import java.util.Date;

public class ReceitaModel {
	// Variáveis
	
	private int idReceita;
	private String nome;
	private float dosagem;
	private Date horario;
	private int qtdDias;
	
	// Construtor
	
	public ReceitaModel(int idReceita, String nome, float dosagem, Date horario, int qtdDias) {
		super();
		this.idReceita = idReceita;
		this.nome = nome;
		this.dosagem = dosagem;
		this.horario = horario;
		this.qtdDias = qtdDias;
	}

	// Getters e Setters
	
	public int getIdReceita() {
		return idReceita;
	}

	public void setIdReceita(int idReceita) {
		this.idReceita = idReceita;
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

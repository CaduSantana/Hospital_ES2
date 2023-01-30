package model;

import java.io.Serializable;

public class TriagemModel  implements Serializable{
	// Variáveis
	
	private float peso;
	private float altura;
	private float pressao;
	private int temperatura;
	private PacienteModel paciente;
	private AssistenteModel assistente;
	private String sintomas;
	
	// Construtor
	public TriagemModel(AssistenteModel assistente, PacienteModel paciente, float altura, float pressao, float peso, int temperatura, String sintomas) {
		super();
		this.assistente = assistente;
		this.paciente = paciente;
		this.altura = altura;
		this.pressao = pressao;
		this.peso = peso;
		this.temperatura = temperatura;
		this.sintomas = sintomas;
	}
	
	// Getters e Setters

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPressao() {
		return pressao;
	}

	public void setPressao(float pressao) {
		this.pressao = pressao;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public PacienteModel getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteModel paciente) {
		this.paciente = paciente;
	}

	public AssistenteModel getAssistente() {
		return assistente;
	}

	public void setAssistente(AssistenteModel assistente) {
		this.assistente = assistente;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	
	
	

}

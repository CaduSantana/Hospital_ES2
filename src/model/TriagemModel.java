package model;

public class TriagemModel {
	// Variáveis
	
	private float peso;
	private float altura;
	private String pressao;
	private int temperatura;
	private PacienteModel paciente;
	private AssistenteModel assistente;
	private String sintomas;
	
	// Construtor
	public TriagemModel(float peso, float altura, String pressao, int temperatura, PacienteModel paciente,
			AssistenteModel assistente, String sintomas) {
		super();
		this.peso = peso;
		this.altura = altura;
		this.pressao = pressao;
		this.temperatura = temperatura;
		this.paciente = paciente;
		this.assistente = assistente;
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

	public String getPressao() {
		return pressao;
	}

	public void setPressao(String pressao) {
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

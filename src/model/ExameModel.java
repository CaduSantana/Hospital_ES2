package model;

public class ExameModel {
	// Variáveis
	
	private int idExame;
	private String nomeExame;
	private String nomePaciente;
	private String nomeMedico;
	private String resultadoExame;
	private boolean grave;
	
	// Construtor
	
	public ExameModel(int idExame, String nomeExame, String nomePaciente, String nomeMedico,
			String resultadoExame, boolean grave) {
		super();
		this.idExame = idExame;
		this.nomeExame = nomeExame;
		this.nomePaciente = nomePaciente;
		this.nomeMedico = nomeMedico;
		this.resultadoExame = resultadoExame;
		this.grave = grave;
	}

	// Getters e Setters
	
	public int getIdExame() {
		return idExame;
	}

	public void setIdExame(int idExame) {
		this.idExame = idExame;
	}

	public String getNomeExame() {
		return nomeExame;
	}

	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
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

	public String getResultadoExame() {
		return resultadoExame;
	}

	public void setResultadoExame(String resultadoExame) {
		this.resultadoExame = resultadoExame;
	}

	public boolean isGrave() {
		return grave;
	}

	public void setGrave(boolean grave) {
		this.grave = grave;
	}	
}

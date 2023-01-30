package model;

import java.io.Serializable;

public class MedicoModel  implements Serializable{
	// Variáveis
	
	private String nome;
	private String crm;
	private boolean plantao;
	private String areaPlantao;
	
	// Construtor
	
	public MedicoModel(String nome, String crm, boolean plantao, String areaPlantao) {
		this.nome = nome;
		this.crm = crm;
		this.plantao = plantao;
		this.areaPlantao = areaPlantao;
	}

	// Getters e Setters
	
	public String getCrm() {
		return crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public boolean isPlantao() {
		return plantao;
	}

	public void setPlantao(boolean plantao) {
		this.plantao = plantao;
	}

	public String getAreaPlantao() {
		return areaPlantao;
	}

	public void setAreaPlantao(String areaPlantao) {
		this.areaPlantao = areaPlantao;
	}
	
	// Métodos
	
	private ExameModel requisitarExame() {
		return new ExameModel(0, areaPlantao, areaPlantao, crm, areaPlantao, plantao);
	}
	
	private DiagnosticoModel inserirDiagnostico() {
		return new DiagnosticoModel(0, areaPlantao, crm, areaPlantao, null, null, null, null);
	}
	
	private ReceitaModel inserirReceitaMedicamento() {
		return new ReceitaModel(0, areaPlantao, 0, null, 0);
	}
	
	private TratamentoModel inserirTratamento() {
		return new TratamentoModel(0, crm, areaPlantao, null);
	}
}

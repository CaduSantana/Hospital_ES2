package model;

import java.io.Serializable;
import java.util.Date;

public class FuncionarioModel  implements Serializable{
	// Variáveis
	
	private String nome;
	private String cpf;
	private String email;
	private String senha;
	private Date horarioEntrada;
	private Date horarioSaida;
	private String telefone;
	private String salario;
	
	// Construtor
	public FuncionarioModel(String nome, String cpf, String email, String senha, Date horarioEntrada, Date horarioSaida,
			String telefone, String salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		this.horarioEntrada = horarioEntrada;
		this.horarioSaida = horarioSaida;
		this.telefone = telefone;
		this.salario = salario;
	}

	// Getters e Setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getHorarioEntrada() {
		return horarioEntrada;
	}

	public void setHorarioEntrada(Date horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}

	public Date getHorarioSaida() {
		return horarioSaida;
	}

	public void setHorarioSaida(Date horarioSaida) {
		this.horarioSaida = horarioSaida;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	
}

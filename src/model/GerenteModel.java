 package model;

import java.io.Serializable;
import java.util.Date;

public class GerenteModel extends FuncionarioModel implements Serializable{

	public GerenteModel(String nome, String cpf, String email, String senha, Date horarioEntrada, Date horarioSaida,
			String telefone, String salario) {
		super(nome, cpf, email, senha, horarioEntrada, horarioSaida, telefone, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	@Override
	public String getCpf() {
		// TODO Auto-generated method stub
		return super.getCpf();
	}

	@Override
	public void setCpf(String cpf) {
		// TODO Auto-generated method stub
		super.setCpf(cpf);
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return super.getEmail();
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		super.setEmail(email);
	}

	@Override
	public String getSenha() {
		// TODO Auto-generated method stub
		return super.getSenha();
	}

	@Override
	public void setSenha(String senha) {
		// TODO Auto-generated method stub
		super.setSenha(senha);
	}

	@Override
	public Date getHorarioEntrada() {
		// TODO Auto-generated method stub
		return super.getHorarioEntrada();
	}

	@Override
	public void setHorarioEntrada(Date horarioEntrada) {
		// TODO Auto-generated method stub
		super.setHorarioEntrada(horarioEntrada);
	}

	@Override
	public Date getHorarioSaida() {
		// TODO Auto-generated method stub
		return super.getHorarioSaida();
	}

	@Override
	public void setHorarioSaida(Date horarioSaida) {
		// TODO Auto-generated method stub
		super.setHorarioSaida(horarioSaida);
	}

	@Override
	public String getTelefone() {
		// TODO Auto-generated method stub
		return super.getTelefone();
	}

	@Override
	public void setTelefone(String telefone) {
		// TODO Auto-generated method stub
		super.setTelefone(telefone);
	}

	@Override
	public String getSalario() {
		// TODO Auto-generated method stub
		return super.getSalario();
	}

	@Override
	public void setSalario(String salario) {
		// TODO Auto-generated method stub
		super.setSalario(salario);
	}

	// Métodos
	
	private FuncionarioModel cadastrarFuncionario() {
		return new FuncionarioModel(getNome(), getCpf(), getEmail(), getSenha(), getHorarioEntrada(), getHorarioSaida(), getTelefone(), getSalario());
	}

	private float modificarSalario() {
		return 0f;
	}
}

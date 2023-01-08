package controller;

import java.util.ArrayList;
import java.util.Date;

import model.DiagnosticoModel;
import model.ExameModel;
import model.MedicoModel;
import model.ReceitaModel;
import model.TratamentoModel;
import model.TriagemModel;

public class ControladorMedico {
	
	public DiagnosticoModel criarDiagnostico(ControladorPaciente controladorPaciente, String cpfPaciente,
			String cpfMedico, ArrayList <ExameModel> exames, TratamentoModel tratamento, TriagemModel triagem,
			ArrayList <ReceitaModel> receitas) {
		return new DiagnosticoModel(0, cpfPaciente, cpfMedico, cpfMedico, receitas, exames, tratamento, tratamento);
	}

	public ExameModel criarExame(ControladorPaciente controladorPaciente, String cpfPaciente, String nomeExame,
			boolean grave, String cpfMedico) {
		
		return new ExameModel(0, nomeExame, cpfPaciente, cpfMedico, cpfMedico, grave);
	}
	
	public MedicoModel criar(String nome, String cpf, String telefone, String crm, String especializacao) {
		return new MedicoModel(crm, false, especializacao);
	}

	public ReceitaModel criarReceita(ControladorPaciente controladorPaciente, String cpfPaciente, String dosagem,
			int qtdDias, Date horario, String cpfMedico) {
		// TODO Auto-generated method stub
		return new ReceitaModel(qtdDias, cpfMedico, qtdDias, horario, qtdDias);
	}

	public TratamentoModel criarTratamento(ControladorPaciente controladorPaciente, String cpfPaciente,
			ArrayList<String> recomendacoes, String cpfMedico) {
		// TODO Auto-generated method stub
		return new TratamentoModel(0, cpfPaciente, cpfMedico, recomendacoes);
	}

}

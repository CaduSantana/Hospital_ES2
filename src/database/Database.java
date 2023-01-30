package database;

import java.util.ArrayList;

import model.AssistenteModel;
import model.DiagnosticoModel;
import model.ExameModel;
import model.MedicoModel;
import model.PacienteModel;
import model.ReceitaModel;
import model.TratamentoModel;
import model.TriagemModel;

public class Database {
	public static ArrayList<AssistenteModel> assistentes;
	public static ArrayList<DiagnosticoModel> diagnosticos;
	public static ArrayList<ExameModel> exames;
	public static ArrayList<PacienteModel> pacientes;
	public static ArrayList<ReceitaModel> receitas;
	public static ArrayList<TratamentoModel> tratamentos;
	public static ArrayList<TriagemModel> triagens;
	public static ArrayList<MedicoModel> medicos;
	
	public Database() {
		assistentes = new ArrayList<AssistenteModel>();
		diagnosticos = new ArrayList<DiagnosticoModel>();
		exames = new ArrayList<ExameModel>();
		pacientes = new ArrayList<PacienteModel>();
		receitas = new ArrayList<ReceitaModel>();
		tratamentos = new ArrayList<TratamentoModel>();
		triagens = new ArrayList<TriagemModel>();
		medicos = new ArrayList<MedicoModel>();
	}
	
	public static AssistenteModel pesquisarAssistente(String cpfAssistente) {
		for (AssistenteModel assistente : assistentes) {
			if(assistente.getCpf() == cpfAssistente)
				return assistente;
		}
		
		return null;
	}
	
	public static DiagnosticoModel pesquisarDiagnostico(int idDiagnostico) {
		for (DiagnosticoModel diagnostico : diagnosticos) {
			if(diagnostico.getIdDiagnostico() == idDiagnostico)
				return diagnostico;
		}
		
		return null;
	}
	
	public static PacienteModel pesquisarPaciente(String cpfPaciente) {
		for (PacienteModel paciente : pacientes) {
			if(paciente.getCpf() == cpfPaciente)
				return paciente;
		}
		
		return null;
	}
	
	public static ExameModel pesquisarExame(int idExame) {
		for (ExameModel exame : exames) {
			if(exame.getIdExame() == idExame)
				return exame;
		}
		
		return null;
	}
	
	public static ReceitaModel pesquisarReceita(int idReceita) {
		for (ReceitaModel receita : receitas) {
			if(receita.getIdReceita() == idReceita)
				return receita;
		}
		
		return null;
	}
	
	public static TratamentoModel pesquisarTratamento(int idTratamento) {
		for (TratamentoModel tratamento : tratamentos) {
			if(tratamento.getIdTratamento() == idTratamento)
				return tratamento;
		}
		
		return null;
	}
	
	public static TriagemModel pesquisarTriagem(String cpfPaciente) {
		PacienteModel pacienteAux = pesquisarPaciente(cpfPaciente);
		for (TriagemModel triagem : triagens) {
			if(triagem.getPaciente() == pacienteAux)
				return triagem;
		}
		
		return null;
	}
	
	public static MedicoModel pesquisarMedico(String crm) {
		for (MedicoModel medico : medicos) {
			if(medico.getCrm() == crm)
				return medico;
		}
		
		return null;
	}
	
	
	
	
}

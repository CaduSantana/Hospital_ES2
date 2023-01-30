package database;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
	
	
	// Serialização
	
	public static void salvarDados() {
		try {
			FileOutputStream fileOutAssistentes = new FileOutputStream("assistentes.ser");
            ObjectOutputStream outAssistentes = new ObjectOutputStream(fileOutAssistentes);
            outAssistentes.writeObject(assistentes);
            outAssistentes.close();
            fileOutAssistentes.close();
            
			FileOutputStream fileOutDiagnosticos = new FileOutputStream("diagnosticos.ser");
            ObjectOutputStream outDiagnosticos = new ObjectOutputStream(fileOutDiagnosticos);
            outDiagnosticos.writeObject(diagnosticos);
            outDiagnosticos.close();
            fileOutDiagnosticos.close();
            
			FileOutputStream fileOutExames = new FileOutputStream("exames.ser");
            ObjectOutputStream outExames = new ObjectOutputStream(fileOutExames);
            outExames.writeObject(exames);
            outExames.close();
            fileOutExames.close();
            
			FileOutputStream fileOutPacientes = new FileOutputStream("pacientes.ser");
            ObjectOutputStream outPacientes = new ObjectOutputStream(fileOutPacientes);
            outPacientes.writeObject(pacientes);
            outPacientes.close();
            fileOutPacientes.close();
            
			FileOutputStream fileOutReceitas = new FileOutputStream("receitas.ser");
            ObjectOutputStream outReceitas = new ObjectOutputStream(fileOutReceitas);
            outReceitas.writeObject(receitas);
            outReceitas.close();
            fileOutReceitas.close();
            
			FileOutputStream fileOutTratamentos = new FileOutputStream("tratamentos.ser");
            ObjectOutputStream outTratamentos = new ObjectOutputStream(fileOutTratamentos);
            outTratamentos.writeObject(tratamentos);
            outTratamentos.close();
            fileOutTratamentos.close();
            
			FileOutputStream fileOutTriagem = new FileOutputStream("triagem.ser");
            ObjectOutputStream outTriagem = new ObjectOutputStream(fileOutTriagem);
            outTriagem.writeObject(triagens);
            outTriagem.close();
            fileOutTriagem.close();
            
			FileOutputStream fileOutMedico = new FileOutputStream("medicos.ser");
            ObjectOutputStream outMedico = new ObjectOutputStream(fileOutMedico);
            outMedico.writeObject(medicos);
            outMedico.close();
            fileOutMedico.close();

            System.out.printf("\n\tOs dados serializados estão em cada arquivo .ser pertinente à entidade sujeita.\n");
		}
		catch (IOException i) {
            i.printStackTrace();
        }
	}
	
	public static void carregarDados() {
		
		try {
	         FileInputStream fileInAssistentes = new FileInputStream("assistentes.ser");
	         ObjectInputStream inAssistentes = new ObjectInputStream(fileInAssistentes);
	         assistentes = (ArrayList<AssistenteModel>) inAssistentes.readObject();
	         inAssistentes.close();
	         fileInAssistentes.close();
	         
	         FileInputStream fileInDiagnosticos = new FileInputStream("diagnosticos.ser");
	         ObjectInputStream inDiagnosticos = new ObjectInputStream(fileInDiagnosticos);
	         diagnosticos = (ArrayList<DiagnosticoModel>) inDiagnosticos.readObject();
	         inDiagnosticos.close();
	         fileInDiagnosticos.close();
	         
	         FileInputStream fileInExames = new FileInputStream("exames.ser");
	         ObjectInputStream inExames = new ObjectInputStream(fileInExames);
	         exames = (ArrayList<ExameModel>) inExames.readObject();
	         inExames.close();
	         fileInExames.close();
	         
	         FileInputStream fileInPacientes = new FileInputStream("pacientes.ser");
	         ObjectInputStream inPacientes = new ObjectInputStream(fileInPacientes);
	         pacientes = (ArrayList<PacienteModel>) inPacientes.readObject();
	         inPacientes.close();
	         fileInPacientes.close();
	         
	         FileInputStream fileInReceitas = new FileInputStream("receitas.ser");
	         ObjectInputStream inReceitas = new ObjectInputStream(fileInReceitas);
	         receitas = (ArrayList<ReceitaModel>) inReceitas.readObject();
	         inReceitas.close();
	         fileInReceitas.close();
	         
	         FileInputStream fileInTratamentos = new FileInputStream("tratamentos.ser");
	         ObjectInputStream inTratamentos = new ObjectInputStream(fileInTratamentos);
	         tratamentos = (ArrayList<TratamentoModel>) inTratamentos.readObject();
	         inTratamentos.close();
	         fileInTratamentos.close();
	         
	         FileInputStream fileInTriagem = new FileInputStream("triagem.ser");
	         ObjectInputStream inTriagem = new ObjectInputStream(fileInTriagem);
	         triagens = (ArrayList<TriagemModel>) inTriagem.readObject();
	         inTriagem.close();
	         fileInTriagem.close();
	         
	         FileInputStream fileInMedicos = new FileInputStream("medicos.ser");
	         ObjectInputStream inMedicos = new ObjectInputStream(fileInMedicos);
	         medicos = (ArrayList<MedicoModel>) inMedicos.readObject();
	         inMedicos.close();
	         fileInMedicos.close();	         
		} catch (IOException | ClassNotFoundException i) {
	         i.printStackTrace();
	      }
	}
	
	public static void listarAssistentes() {
		System.out.println(medicos.toString());
	}
	
	
	
}

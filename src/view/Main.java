package view;

import java.util.ArrayList;
import java.util.Date;
import controller.ControladorGeral;
import controller.ControladorMedico;
import controller.ControladorPaciente;
import database.Database;
import model.AssistenteModel;
import model.ExameModel;
import model.PacienteModel;
import model.ReceitaModel;
import model.TratamentoModel;
import model.TriagemModel;

public class Main {
	static Database db = new Database();
	
	public static void main(String[] args) {
		Database.carregarDados();
		MainWindow mainWindow = new MainWindow();
		mainWindow.main(args);
		
	}

}

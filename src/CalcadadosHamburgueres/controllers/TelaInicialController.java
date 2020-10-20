package CalcadadosHamburgueres.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import CalcadadosHamburgueres.basics.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TelaInicialController implements Initializable {

	@FXML
	private Button btnFuncionario;
	
	@FXML 
	private void botaoFuncionario (ActionEvent event)
	{
		
		Funcionario f = new Funcionario();
		try {
			f.start(new Stage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
	

}

package controller;

import java.net.URL;
import java.util.ResourceBundle;

import beans.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class TelaInicialController implements Initializable {

	@FXML private Button btnFuncionario;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		 btnFuncionario.setOnMouseClicked((MouseEvent e)->{
	            
	           
	    });
		
	}
	

}

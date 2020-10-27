package controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import beans.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import telas.TelaInicial;
import telas.TelaLoginFuncionario;

public class TelaInicialController implements Initializable {

	@FXML private Button btnFuncionario;
	@FXML private Button btnCliente;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		 btnFuncionario.setOnMouseClicked((MouseEvent e)->{
			 
			TelaLoginFuncionario f = new TelaLoginFuncionario(); 
			 try {
				f.start(new Stage());
			} catch (Exception e1) {
				Logger.getLogger(TelaLoginFuncionario.class.getName()).log(Level.SEVERE, null, e1);
			}
	           
	    });
		 
		 btnCliente.setOnMouseClicked((MouseEvent e)->{
	            
	           
		    });
		 
		
	}
	

}

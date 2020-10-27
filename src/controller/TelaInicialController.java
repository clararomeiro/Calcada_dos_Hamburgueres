package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import beans.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import telas.TelaCliente;
import telas.TelaLoginFuncionario;

public class TelaInicialController implements Initializable {
	
	private static Stage stage;
	
	@FXML private Button btnFuncionario;
	@FXML private Button btnCliente;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		 btnFuncionario.setOnMouseClicked((MouseEvent e)->{
			TelaLoginFuncionario a = new TelaLoginFuncionario();
			try {
				a.start(new Stage());
			} catch (Exception e1) {
				 Logger.getLogger(TelaInicialController.class.getName()).log(Level.SEVERE, null, e1);
			}
			
	    });
		 
		 btnCliente.setOnMouseClicked((MouseEvent e)->{
			 TelaCliente b = new TelaCliente();
				try {
					b.start(new Stage());
				} catch (Exception e1) {
					 Logger.getLogger(TelaInicialController.class.getName()).log(Level.SEVERE, null, e1);
				}
	           
		    });
		 
		
	}
	

}

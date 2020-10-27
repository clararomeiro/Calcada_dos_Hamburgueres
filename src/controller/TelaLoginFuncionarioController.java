package controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import telas.TelaAdministrador;
import telas.TelaLoginFuncionario;

public class TelaLoginFuncionarioController implements Initializable{
	@FXML private TextField txtCpf;
    @FXML private PasswordField txtSenha;
    @FXML private Button btnEntrar;
    
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		btnEntrar.setOnMouseClicked((MouseEvent e)->{
		
			
	    });
		
	}
}

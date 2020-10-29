package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import negocio.ICalcada;
import telas.TelaCadastroFuncionario;
import telas.TelaCliente;
import telas.TelaLoginFuncionario;

public class TelaCadastroFuncionarioController extends Saida implements Initializable{

	 @FXML private TextField txtNome;
	 @FXML private TextField txtEmail;
	 @FXML private TextField txtCpf;
	 @FXML private Button btnCadastro;
	 @FXML private Button btnVoltar;
	 ICalcada fachada;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		 btnVoltar.setOnMouseClicked((MouseEvent e)->{
	            saida();
	        	fechar();
	        });
		 
		 btnVoltar.setOnKeyPressed((KeyEvent e) -> {
			 saida();
			 fechar();
		 });
		
	}
	
	public void fechar ()
	{
		TelaCadastroFuncionario.getStage().close();
	}

}

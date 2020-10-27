package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import telas.TelaAdministrador;
import telas.TelaInicial;
import telas.TelaLoginFuncionario;

public class TelaLoginFuncionarioController implements Initializable{
	@FXML private TextField txtCpf;
    @FXML private PasswordField txtSenha;
    @FXML private Button btnEntrar;
    
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		btnEntrar.setOnMouseClicked((MouseEvent e)->{
		if (txtSenha.getText().equals("funcionario"))
		{
			
			TelaAdministrador g = new TelaAdministrador();
			try {
				g.start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
			
	    });
		
	}
	
}

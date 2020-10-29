package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import telas.TelaAdministrador;
import telas.TelaCadastroFuncionario;
import telas.TelaInicial;
import telas.TelaLoginFuncionario;
import telas.TelaPedidos;

public class TelaLoginFuncionarioController implements Initializable{
	@FXML private TextField txtCpf;
    @FXML private PasswordField txtSenha;
    @FXML private Button btnEntrar;
    @FXML private Hyperlink btnCadastrar;
    
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		btnEntrar.setOnMouseClicked((MouseEvent e)->{
		if (txtSenha.getText().equals("funcionario") || txtSenha.getText().equals(" "))
		{
			fechar();
			TelaAdministrador g = new TelaAdministrador();
			try {
				g.start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
			
	    });
		
		btnEntrar.setOnKeyPressed((KeyEvent e) -> { 
		if (txtSenha.getText().equals("funcionario") || txtSenha.getText().equals(" "))
		{
			 fechar();
			 TelaAdministrador v = new TelaAdministrador();
			 try {
				v.start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	 });
		
		btnCadastrar.setOnMouseClicked((MouseEvent e)->{
				fechar();
				TelaCadastroFuncionario m = new TelaCadastroFuncionario();
				try {
					m.start(new Stage());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
		    });
		
		btnCadastrar.setOnKeyPressed((KeyEvent e) -> { 
				 fechar();
				 TelaCadastroFuncionario n = new TelaCadastroFuncionario();
				 try {
					n.start(new Stage());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		 });
		
	}
	
	public void fechar(){
        TelaLoginFuncionario.getStage().close();
    }
	
}

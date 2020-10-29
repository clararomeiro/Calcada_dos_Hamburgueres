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
import telas.TelaAdministrador;
import telas.TelaCardapio;
import telas.TelaCliente;
import telas.TelaLoginFuncionario;

public class TelaClienteController implements Initializable {
	  @FXML private TextField txtNome;
	  @FXML private TextField txtCpf;
	  @FXML private Button btnEntrar;
	  
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		btnEntrar.setOnMouseClicked((MouseEvent e)->{
			if (txtNome.getText().equals("Nicole") && txtCpf.getText().equals("123456"))
			{
				fechar();
				TelaCardapio g = new TelaCardapio();
				try {
					g.start(new Stage());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
				
		    });
		
		 btnEntrar.setOnKeyPressed((KeyEvent e) -> {
			 if(e.getCode() == KeyCode.ENTER)
			 {
				 fechar();
				 TelaCardapio h = new TelaCardapio();
				 try {
					h.start(new Stage());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			 }
			 
		 });
		
	}
	
	public void fechar ()
	{
		TelaCliente.getStage().close();
	}
	  
	  

}

package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import telas.TelaCliente;
import telas.TelaInicial;
import telas.TelaLoginFuncionario;

public class TelaInicialController implements Initializable {

	@FXML private Button btnFuncionario;
	@FXML private Button btnCliente;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		 btnFuncionario.setOnMouseClicked((MouseEvent e)->{
			 fechar();
			 TelaLoginFuncionario a = new TelaLoginFuncionario();
			 try {
				a.start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	           
	    });
		 
		 btnFuncionario.setOnKeyPressed((KeyEvent e) -> {
			 if(e.getCode() == KeyCode.ENTER)
			 {
				 fechar();
				 TelaLoginFuncionario b = new TelaLoginFuncionario();
				 try {
					b.start(new Stage());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			 }
			 
		 });
		 
		 btnCliente.setOnMouseClicked((MouseEvent e)->{
			 fechar();
			 TelaCliente c = new TelaCliente();
			 try {
				c.start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	           
		  });
		 
		 btnCliente.setOnKeyPressed((KeyEvent e) -> {
			 if(e.getCode() == KeyCode.ENTER)
			 {
				 fechar();
				 TelaCliente d = new TelaCliente();
				 try {
					d.start(new Stage());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			 }
		 });
		 
		 
	}
	
	public void fechar ()
	{
		TelaInicial.getStage().close();
	}
	

}

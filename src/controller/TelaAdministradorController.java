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
import telas.TelaAdministrador;
import telas.TelaLoginFuncionario;
import telas.TelaPedidos;


public class TelaAdministradorController implements Initializable {

    @FXML private Button btnSim;
    @FXML private Button btnSair;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnSair.setOnMouseClicked((MouseEvent e)->{
            fechar();
        });
        
        btnSair.setOnKeyPressed((KeyEvent e) -> {
        	fechar();
		 });
        
        btnSim.setOnMouseClicked((MouseEvent e)->{
        	fechar();
	    	TelaPedidos tp = new TelaPedidos();
	    	try {
				tp.start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}    
        });
        
        btnSim.setOnKeyPressed((KeyEvent e) -> {
        	fechar();
	    	TelaPedidos tp = new TelaPedidos();
	    	try {
				tp.start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}     
		 });
    
 }
    
    
    public void fechar(){
        TelaAdministrador.getStage().close();
    }
}

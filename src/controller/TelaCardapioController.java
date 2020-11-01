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
import telas.TelaCardapio;
import telas.TelaProdutos;


public class TelaCardapioController extends Saida implements Initializable {

    @FXML private Button btnRealizarPedido;
    @FXML private Button btnVoltar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	
        btnVoltar.setOnMouseClicked((MouseEvent e)->{
            saida();
        	voltar();
         });
        
        btnVoltar.setOnKeyPressed((KeyEvent e) -> {
        	if(e.getCode() == KeyCode.ENTER)
			 {
        		saida();
            	voltar();
			 }
		 });
        
        btnRealizarPedido.setOnMouseClicked((MouseEvent e)->{
        	voltar();
	    	TelaProdutos a = new TelaProdutos();
	    	try {
				a.start(new Stage());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}  
        });
        
        btnRealizarPedido.setOnKeyPressed((KeyEvent e) -> {
        	if(e.getCode() == KeyCode.ENTER)
			 {
        		voltar();
        		TelaProdutos a = new TelaProdutos();
    	    	try {
    				a.start(new Stage());
    			} catch (Exception e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}  
			 }	
		 });
    
 }
    
    
    public void voltar(){
        TelaCardapio.getStage().close();
    }
}

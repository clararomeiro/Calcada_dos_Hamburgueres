package controller;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import telas.TelaPedidos;

public class TelaPedidosController extends Saida implements Initializable {
			
	@FXML private Button btnSair;
    @FXML private Button btnCancelar;
    @FXML private Button btnAtualizar;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		btnSair.setOnMouseClicked((MouseEvent e)->{
		 	   saida();
		 	   fechar();
		    });
	}
	
	private void fechar(){
        TelaPedidos.getStage().close();
    }

}

package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import beans.Pedido;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import telas.TelaNotaFiscal;
import telas.TelaPedidos;
import negocio.FachadaCalcada;
import negocio.ICalcada;

public class TelaNotaFiscalController extends Saida implements Initializable{
	@FXML private Button btnSair;
	@FXML private ListView<String> lvNotaFiscal;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		btnSair.setOnMouseClicked((MouseEvent e)->{
		 	   saida();
		 	   fechar();
		    });
		
		 btnSair.setOnKeyPressed((KeyEvent e) -> {
			 saida();
		 	 fechar();
		 });
	}
	
	private void listar() {
		ArrayList<String> listaNotaFiscal = new ArrayList<>();
		
	}
	
	private void fechar(){
        TelaNotaFiscal.getStage().close();
    }

}

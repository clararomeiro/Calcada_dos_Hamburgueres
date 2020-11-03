package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import beans.Pagamento;
import beans.Pedido;
import telas.TelaNotaFiscal;
import negocio.FachadaCalcada;
import negocio.ICalcada;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class TelaNotaFiscalController extends Saida implements Initializable{
	@FXML private Button btnSair;
	@FXML private ListView<String> lvNotaFiscal;
	@FXML private AnchorPane tela;
	
	ICalcada fachada;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		listar();
		
		btnSair.setOnMouseClicked((MouseEvent e)->{
		 	   saida();
		 	   fechar();
		    });
		
		 btnSair.setOnKeyPressed((KeyEvent e) -> {
			 if(e.getCode() == KeyCode.ENTER)
			 {
				 saida();
			 	 fechar();
			 }
			 
		 });
	}
	
	private void listar() {
		ArrayList<String> listaNotaFiscal = new ArrayList<>();
		try {
            fachada = FachadaCalcada.getInstance();
        } catch (IOException ex) {
            Logger.getLogger(TelaPedidosController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPedidosController.class.getName()).log(Level.SEVERE, null, ex);
        }
		
		listaNotaFiscal.add("CPF do cliente   Hamburguer   Quantidade   Acompanhamento    Bebida    Valor do pedido");

		for (Pedido p : fachada.listarPedidos()) {
			if(p != null) {
			listaNotaFiscal.add(p.toString()); 
			} else {
				System.out.print("ERRO");
			}
		}
		for (Pagamento p : fachada.listarPagamento()) {
			if(p != null) {
				listaNotaFiscal.add(p.toString()); 
				} else {
					System.out.print("ERRO");
				}  
		}

		ObservableList<String> obsPedido = FXCollections.observableArrayList(listaNotaFiscal);
        lvNotaFiscal.setItems(obsPedido);
	}
	
	private void fechar(){
        TelaNotaFiscal.getStage().close();
    }

}

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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import telas.TelaPedidos;
import negocio.FachadaCalcada;
import negocio.ICalcada;
import telas.TelaProdutosAdm;

public class TelaPedidosController extends Saida implements Initializable {
			
	@FXML private Button btnSair;
    @FXML private Button btnCancelar;
    @FXML private ListView<String> lvPedidos;
    @FXML private Button btnEditar;
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
		 
		 btnCancelar.setOnMouseClicked((MouseEvent e)->{
	           ArrayList<Pedido> mudarStatus = new ArrayList<>(fachada.listarPedidos());
	           int index = lvPedidos.getSelectionModel().getSelectedIndex();
	            if (index == -1) {
	                Alert alert = new Alert(Alert.AlertType.ERROR);
	                alert.setHeaderText("Selecionar pedido");
	                alert.setContentText("Selecionar pedido");
	                alert.show();
	            }
	           fachada.removerPedido(fachada.listarPedidos().get(index-1));
	           listar();
	           
	        });

		 btnEditar.setOnMouseClicked((MouseEvent e)->{
		 	ArrayList<Pedido> editarPedido = new ArrayList<>(fachada.listarPedidos());
		 	int index = lvPedidos.getSelectionModel().getSelectedIndex();
			 if (index == -1) {
				 Alert alert = new Alert(Alert.AlertType.ERROR);
				 alert.setHeaderText("Selecionar pedido");
				 alert.setContentText("Selecionar pedido");
				 alert.show();
			 }
			 fachada.removerPedido(fachada.listarPedidos().get(index-1));
			 fechar();
			 TelaProdutosAdm tp = new TelaProdutosAdm();
		 });
	
	}	 	 
	
	 private void listar() {
	        ArrayList<String> listaPedidos = new ArrayList<>();
	        try {
	            fachada = FachadaCalcada.getInstance();
	        } catch (IOException ex) {
	            Logger.getLogger(TelaPedidosController.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (ClassNotFoundException ex) {
	            Logger.getLogger(TelaPedidosController.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        listaPedidos.add("CPF do cliente   Hamburguer   Quantidade   Acompanhamento    Bebida    Status do pedido");
	        
	        for (Pedido p : fachada.listarPedidos()) {
	        	if(p != null) {
	        		listaPedidos.add(p.toString()); 
	    			} else {
	    				System.out.print("ERRO");
	    			}   
	        }
	        
	        ObservableList<String> obsFuncionario = FXCollections.observableArrayList(listaPedidos);
	        lvPedidos.setItems(obsFuncionario);
	}
	private void fechar(){
		TelaPedidos.getStage().close();
	}

}

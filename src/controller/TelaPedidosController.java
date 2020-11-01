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
import telas.TelaPedidos;
import negocio.FachadaCalcada;
import negocio.ICalcada;

public class TelaPedidosController extends Saida implements Initializable {
			
	@FXML private Button btnSair;
    @FXML private Button btnCancelar;
    @FXML private ListView<String> lvPedidos;
    @FXML private Button btnAtualizar;
    
    ICalcada fachada;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		btnSair.setOnMouseClicked((MouseEvent e)->{
		 	   saida();
		 	   fechar();
		    });
		
		 btnSair.setOnKeyPressed((KeyEvent e) -> {
			 saida();
		 	 fechar();
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
	           fachada.mudarStatus(mudarStatus.get(index-1).getCliente().getCpf());
	           fachada.removerPedido(fachada.listarPedidos().get(index-1));
	           /*Alert alert = new Alert(Alert.AlertType.ERROR);
	           alert.setHeaderText("Pedido cancelado");
               alert.setContentText("Pedido cancelado");
               alert.show();*/
	           
	           listar();
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
	            
	             listaPedidos.add(p.toString());   
	        }
	        
	        ObservableList<String> obsFuncionario = FXCollections.observableArrayList(listaPedidos);
	        lvPedidos.setItems(obsFuncionario);
	}
	
	private void fechar(){
        TelaPedidos.getStage().close();
    }

}

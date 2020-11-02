package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import beans.Cliente;
import beans.Pagamento;
import beans.Pedido;
import telas.TelaNotaFiscal;
import negocio.FachadaCalcada;
import negocio.ICalcada;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class TelaNotaFiscalController extends Saida implements Initializable{
	@FXML private Button btnSair;
	@FXML private ListView<String> lvNotaFiscal;
	
	ICalcada fachada;
	
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
		try {
            fachada = FachadaCalcada.getInstance();
        } catch (IOException ex) {
            Logger.getLogger(TelaPedidosController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPedidosController.class.getName()).log(Level.SEVERE, null, ex);
        }
		for (Pedido p : fachada.listarPedidos()) {
            
			listaNotaFiscal.add(p.toString());   
		}
		for (Pagamento p : fachada.listarPagamento()) {
            
			listaNotaFiscal.add(p.toString());   
		}
		for (Cliente c : fachada.listar()) {
            
			listaNotaFiscal.add(c.toString());
		}
	}
	
	private void fechar(){
        TelaNotaFiscal.getStage().close();
    }

}

package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import beans.Calda;
import beans.Consumidor;
import beans.Incremento;
import beans.Pedido;
import beans.SaborSorvete;
import beans.Sorvete;
import beans.Venda;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import negocio.FachadaSorveteria;

public class TelaProdutosController {
	@FXML
    private AnchorPane tela;

    @FXML
    private Button Sair;
    
    @FXML
    private Button btnRealizarPedido;
    
    @FXML
    private Button btncalcularPedido;
    
    @FXML
    private ComboBox<Integer> hambZendaya;

    @FXML
    private ComboBox<Integer> cbBatataFrita;

    @FXML
    private ComboBox<Integer> cbAgua;

    @FXML
    private ComboBox<Integer> cbBatataCdd;

    @FXML
    private ComboBox<Integer> cbBBH;

    @FXML
    private ComboBox<Integer> cbPS;

    @FXML
    private ComboBox<Integer> cbSuco;

    @FXML
    private ComboBox<Integer> cbTwice;

    @FXML
    private ComboBox<Integer> cbRefrigante;

    @FXML
    private ComboBox<String> FormaPagamento;

    @FXML
    private ComboBox<Integer> cbOnion;

    @FXML
    private ComboBox<Integer> CbNCT;

    @FXML
    private ComboBox<Integer> cbMilkshak;

    @FXML
    private Label PrecoTotal;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	qtdZendaya();
    	qtdBBH();
    	qtdPS();
    	qtdTwice();
    	qtdNCT();
    	qtdBatata();
    	qtdAgua();
    	qtdBatataCdd();
    	qtdPS();
    	qtdSuco();
    	qtdRefri();
    	qtdOnion();
    	qtdMilkshak();
    	formaPagamento();
    	
    	tela.setOnMouseMoved((MouseEvent e)->{
            label();
        });
        
        Sair.setOnMouseClicked((MouseEvent e)->{
            sair();
            
        });
        
        //verificar
        btnRealizarPedido.setOnMouseClicked((MouseEvent e)->{
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
	    alert.setHeaderText("Sucesso");
            alert.setTitle("Pedido realizado");
	    alert.setContentText("Pedido realizado com sucesso");
	    alert.show();
            
            try {
                fachada = FachadaSorveteria.getInstance();
                fachada.cadastrarPedido(pedido);
                fachada.cadastrarVenda(venda);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
        
        //verificar
        btncalcularPedido.setOnMouseClicked((MouseEvent e)->{
            ckBoxes();
            sorvetes = new ArrayList<>();
            Sorvete sorvete = new Sorvete(sabores, incremento, calda, cbBolas.getSelectionModel().getSelectedItem());
            sorvetes.add(sorvete);
            pedido = new Pedido(sorvetes,"Pedido em espera",cliente);
            venda = new Venda(pedido,cbFormaPagamento.getSelectionModel().getSelectedItem());
            precos();
        });
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public Consumidor getCliente(){
        return this.cliente;
    }
    
    private void precos(){
        precoPedido.setText("R$" + pedido.getPreco());
        precoFrete.setText("R$"+venda.getFrete());
        precoTotal.setText("R$"+venda.getValorTotalPedido());
    }
    
    private void qtdBolas(){
        ObservableList<Integer> bolas = FXCollections.observableArrayList(1,2,3,4,5,6,7,8,9,10);
        cbBolas.setValue(0);
        cbBolas.setItems(bolas);
    }
    
    private void formaPagamento(){
        ObservableList<String> pagamento = FXCollections.observableArrayList("DINHEIRO","DEBITO","CREDITO");
        cbFormaPagamento.setValue("Forma de pagamento");
        cbFormaPagamento.setItems(pagamento);
    }
    
    
}
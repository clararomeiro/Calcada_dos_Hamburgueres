package controller;

import beans.Hamburguer;
import beans.Bebida;
import beans.Acompanhamento;
import beans.Pedido;
import beans.Produto; //pedido montado pelo cliente
import beans.Pagamento;
import negocio.FachadaCalcada;
import negocio.ICalcada;
import telas.TelaProdutos;
import beans.Cliente;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class TelaProdutosController extends Saida implements Initializable{
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
    
    ICalcada fachada;
    
    private Cliente cliente;
    private Hamburguer hamburguer;
    private Bebida bebida;
    private Acompanhamento acompanhamento;
    private List<Produto> produto;
    private Pedido pedido;
    private Pagamento pagamento;
    
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
    	qtdSuco();
    	qtdRefri();
    	qtdOnion();
    	qtdMilkshake();
    	formaPagamento();
    	
    	tela.setOnMouseMoved((MouseEvent e)->{
            label();
        });
        
        Sair.setOnMouseClicked((MouseEvent e)->{
            sair();
            
        });
        
        btnRealizarPedido.setOnMouseClicked((MouseEvent e)->{
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
	    alert.setHeaderText("Sucesso");
            alert.setTitle("Pedido realizado");
	    alert.setContentText("Pedido realizado com sucesso");
	    alert.show();
            
            try {
                fachada = FachadaCalcada.getInstance();
                fachada.cadastrar(pedido);
                fachada.cadastrarPagamento(pagamento);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TelaProdutosController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TelaProdutosController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
        
        btncalcularPedido.setOnMouseClicked((MouseEvent e)->{
            ckBoxes();
            produto = new ArrayList<>();
            Produto produto = new Produto(qtdZendaya.getSelectionModel().getSelectedItem(), qtdBBH.getSelectionModel().getSelectedItem(), 
            		qtdPS.getSelectionModel().getSelectedItem(), qtdTwice.getSelectionModel().getSelectedItem(), 
            		qtdNCT.getSelectionModel().getSelectedItem(), qtdBatata.getSelectionModel().getSelectedItem(), 
            		qtdAgua.getSelectionModel().getSelectedItem(), qtdBatataCdd.getSelectionModel().getSelectedItem(),
            		qtdSuco.getSelectionModel().getSelectedItem(), qtdRefri.getSelectionModel().getSelectedItem(),
            		qtdOnion.getSelectionModel().getSelectedItem(), qtdMilkshak.getSelectionModel().getSelectedItem());
            produto.add(produto);
            pedido = new Pedido(produto, "Pedido em espera", cliente);
            pagamento = new Pagamento(pedido, formaPagamento.getSelectionModel().getSelectedItem());
            preco();
        });
    }
    
    private void preco(){
        precoProduto.setText("R$" + produto.getPreco());
    }
    
    private void qtdZendaya(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1,2,3,4);
        hambZendaya.setValue(0);
        hambZendaya.setItems(qtd);
    }
    
    private void qtdBBH(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1,2,3,4);
        cbBBH.setValue(0);
        cbBBH.setItems(qtd);
    }
    
    private void qtdNCT(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1,2,3,4);
        CbNCT.setValue(0);
        CbNCT.setItems(qtd);
    }
    
    private void qtdTwice(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1,2,3,4);
        cbTwice.setValue(0);
        cbTwice.setItems(qtd);
    }
    
    private void qtdBatata(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1,2,3,4);
        cbBatataFrita.setValue(0);
        cbBatataFrita.setItems(qtd);
    }
    
    private void qtdAgua(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1,2,3,4);
        cbAgua.setValue(0);
        cbAgua.setItems(qtd);
    }
    
    private void qtdBatataCdd(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1,2,3,4);
        cbBatataCdd.setValue(0);
        cbBatataCdd.setItems(qtd);
    }
    
    private void qtdPS(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1,2,3,4);
        cbPS.setValue(0);
        cbPS.setItems(qtd);
    }
    
    private void qtdSuco(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1,2,3,4);
        qtdSuco.setValue(0);
        qtdSuco.setItems(qtd);
    }
    
    private void qtdRefri(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1,2,3,4);
        cbSuco.setValue(0);
        cbSuco.setItems(qtd);
    }
    
    private void qtdOnion(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1,2,3,4);
        cbOnion.setValue(0);
        cbOnion.setItems(qtd);
    }
    
    private void qtdMilkshake(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1,2,3,4);
        cbMilkshak.setValue(0);
        cbMilkshak.setItems(qtd);
    }
    
    private void formaPagamento(){
        ObservableList<String> pagamento = FXCollections.observableArrayList("DINHEIRO","DEBITO","CREDITO");
        FormaPagamento.setValue("Forma de pagamento");
        FormaPagamento.setItems(pagamento);
    }
    
    
}
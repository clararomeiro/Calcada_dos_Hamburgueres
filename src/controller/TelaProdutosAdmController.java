package controller;

import beans.Hamburguer;
import beans.Bebida;
import beans.Acompanhamento;
import beans.Pedido;
import beans.Produto; //pedido montado pelo cliente
import beans.Pagamento;
import negocio.FachadaCalcada;
import negocio.ICalcada;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import telas.TelaNotaFiscal;
import telas.TelaProdutosAdm;

public class TelaProdutosAdmController extends Saida implements Initializable {
    @FXML
    private AnchorPane tela;

    @FXML
    private Button Sair;

    @FXML
    private Button btnAtualizarPedido;

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
    private ComboBox<Integer> cbRefrigerante;

    @FXML
    private ComboBox<String> FormaPagamento;

    @FXML
    private ComboBox<Integer> cbOnion;

    @FXML
    private ComboBox<Integer> CbNCT;

    @FXML
    private ComboBox<Integer> cbMilkshake;

    @FXML
    private Label PrecoTotal;

    @FXML
    private Label precoPedido;


    ICalcada fachada;

    private Cliente cliente;
    private Hamburguer hamburguer;
    private Bebida bebida;
    private Acompanhamento acompanhamento;
    private List<Produto> produtos;
    private Pedido pedido;
    private Pagamento pagamento;
    private double preco = 0;


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

        Sair.setOnMouseClicked((MouseEvent e) -> {
            saida();
            fechar();

        });

        Sair.setOnKeyPressed((KeyEvent e) -> {
            if (e.getCode() == KeyCode.ENTER) {
                saida();
                fechar();
            }
        });

        btnAtualizarPedido.setOnMouseClicked((MouseEvent e) -> {
        	
            if(hambZendaya.getValue() > 0 || cbBatataFrita.getValue() > 0 || cbAgua.getValue() > 0 || cbBatataCdd.getValue() > 0 || 
        			cbBBH.getValue() > 0 || cbPS.getValue() > 0 || cbSuco.getValue() > 0 || cbTwice.getValue() > 0 || 
        			cbRefrigerante.getValue() > 0 || cbOnion.getValue() > 0 || CbNCT.getValue() > 0 || cbMilkshake.getValue() > 0)
        	{
        		if(!FormaPagamento.getValue().equals("Forma de pagamento"))
        		{
        			Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            	    alert.setHeaderText("Sucesso");
                    alert.setTitle("Pedido atualizado");
            	    alert.setContentText("Pedido atualizado com sucesso");
            	    alert.show(); 
                	try {
                         fachada = FachadaCalcada.getInstance();
                         fachada.atualizarPedido(pedido);
                         fachada.cadastrarPagamento(pagamento); 
                     } catch (ClassNotFoundException ex) {
                         Logger.getLogger(TelaProdutosController.class.getName()).log(Level.SEVERE, null, ex);
                     } catch (IOException ex) {
                         Logger.getLogger(TelaProdutosController.class.getName()).log(Level.SEVERE, null, ex);
                     }
            	}
        		
        		else if (FormaPagamento.getValue().equals("Forma de pagamento"))
            	{
            		Alert alert1 = new Alert(AlertType.ERROR);
                    alert1.setHeaderText("ERRO");
                    alert1.setTitle("Erro ao atualizar");
                    alert1.setContentText("Selecione a forma de pagamento!");
                    alert1.show();
            	}
        	}

        	else
        	{
        		Alert alert1 = new Alert(AlertType.ERROR);
                alert1.setHeaderText("ERRO");
                alert1.setTitle("Erro ao atualizar");
                alert1.setContentText("Selecao em falta!");
                alert1.show();
        	}    
        });

        btncalcularPedido.setOnMouseClicked((MouseEvent e) -> {

            preco = cbAgua.getValue()*Bebida.AGUA.getValor() + cbSuco.getValue()*Bebida.SUCO.getValor()
                    + cbRefrigerante.getValue()*Bebida.REFRIGERANTE.getValor()
                    + cbBatataFrita.getValue()*Acompanhamento.BATATA_FRITA.getValor()
                    + cbBatataCdd.getValue()*Acompanhamento.BATATA_CHEDDAR.getValor()
                    + cbOnion.getValue()*Acompanhamento.ONION_RINGS.getValor()
                    + cbMilkshake.getValue()*Acompanhamento.MILK_SHAKE.getValor()
                    + hambZendaya.getValue()*Hamburguer.ZENDAYA.getValor() + cbBBH.getValue()*Hamburguer.BBH.getValor()
                    + cbTwice.getValue()*Hamburguer.TWICE.getValor() + cbPS.getValue()*Hamburguer.PRISCILA_SENNA.getValor()
                    + CbNCT.getValue()*Hamburguer.NCT.getValor();
            PrecoTotal.setText("R$ " + preco);

        });
    }

    private void qtdZendaya(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(0,1,2,3,4);
        hambZendaya.setValue(0);
        hambZendaya.setItems(qtd);
    }
    
    private void qtdBBH(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(0,1,2,3,4);
        cbBBH.setValue(0);
        cbBBH.setItems(qtd);
    }
    
    private void qtdNCT(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(0,1,2,3,4);
        CbNCT.setValue(0);
        CbNCT.setItems(qtd);
    }
    
    private void qtdTwice(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(0,1,2,3,4);
        cbTwice.setValue(0);
        cbTwice.setItems(qtd);
    }
    
    private void qtdBatata(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(0,1,2,3,4);
        cbBatataFrita.setValue(0);
        cbBatataFrita.setItems(qtd);
    }
    
    private void qtdAgua(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(0,1,2,3,4);
        cbAgua.setValue(0);
        cbAgua.setItems(qtd);
    }
    
    private void qtdBatataCdd(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(0,1,2,3,4);
        cbBatataCdd.setValue(0);
        cbBatataCdd.setItems(qtd);
    }
    
    private void qtdPS(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(0,1,2,3,4);
        cbPS.setValue(0);
        cbPS.setItems(qtd);
    }
    
    private void qtdSuco(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(0,1,2,3,4);
        cbSuco.setValue(0);
        cbSuco.setItems(qtd);
    }
    
    private void qtdRefri(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(0,1,2,3,4);
        cbRefrigerante.setValue(0);
        cbRefrigerante.setItems(qtd);
    }
    
    private void qtdOnion(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(0,1,2,3,4);
        cbOnion.setValue(0);
        cbOnion.setItems(qtd);
    }
    
    private void qtdMilkshake(){
        ObservableList<Integer> qtd = FXCollections.observableArrayList(0,1,2,3,4);
        cbMilkshake.setValue(0);
        cbMilkshake.setItems(qtd);
    }

    private void formaPagamento() {
        ObservableList<String> pagamento = FXCollections.observableArrayList("DINHEIRO", "DEBITO", "CREDITO");
        FormaPagamento.setValue("Forma de pagamento");
        FormaPagamento.setItems(pagamento);
    }

    public void fechar() {
        TelaProdutosAdm.getStage().close();
    }


}
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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
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
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText("Sucesso");
            alert.setTitle("Pedido atualizado");
            alert.setContentText("Pedido atualizado com sucesso");
            alert.show();

            try {
                fachada = FachadaCalcada.getInstance();
                fachada.cadastrar(pedido);
                fachada.cadastrarPagamento(pagamento);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TelaProdutosAdmController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TelaProdutosAdmController.class.getName()).log(Level.SEVERE, null, ex);
            }

        });

        btncalcularPedido.setOnMouseClicked((MouseEvent e) -> {
            produtos = new ArrayList<>();
            Produto produto = new Produto(hamburguer, bebida, acompanhamento, hambZendaya.getSelectionModel().getSelectedItem(),
                    cbBBH.getSelectionModel().getSelectedItem(), cbPS.getSelectionModel().getSelectedItem(), cbTwice.getSelectionModel().getSelectedItem(),
                    CbNCT.getSelectionModel().getSelectedItem(), cbBatataFrita.getSelectionModel().getSelectedItem(),
                    cbAgua.getSelectionModel().getSelectedItem(), cbBatataCdd.getSelectionModel().getSelectedItem(),
                    cbSuco.getSelectionModel().getSelectedItem(), cbRefrigerante.getSelectionModel().getSelectedItem(),
                    cbOnion.getSelectionModel().getSelectedItem(), cbMilkshake.getSelectionModel().getSelectedItem());

            produtos.add(produto);
            pedido = new Pedido(produtos, "Pedido em espera", cliente);
            pagamento = new Pagamento(pedido, FormaPagamento.getSelectionModel().getSelectedItem());
            preco();
        });
    }

    private void preco() {
        precoPedido.setText("R$" + pedido.getPreco());
    }

    private void qtdZendaya() {
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1, 2, 3, 4);
        hambZendaya.setValue(0);
        hambZendaya.setItems(qtd);
    }

    private void qtdBBH() {
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1, 2, 3, 4);
        cbBBH.setValue(0);
        cbBBH.setItems(qtd);
    }

    private void qtdNCT() {
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1, 2, 3, 4);
        CbNCT.setValue(0);
        CbNCT.setItems(qtd);
    }

    private void qtdTwice() {
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1, 2, 3, 4);
        cbTwice.setValue(0);
        cbTwice.setItems(qtd);
    }

    private void qtdBatata() {
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1, 2, 3, 4);
        cbBatataFrita.setValue(0);
        cbBatataFrita.setItems(qtd);
    }

    private void qtdAgua() {
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1, 2, 3, 4);
        cbAgua.setValue(0);
        cbAgua.setItems(qtd);
    }

    private void qtdBatataCdd() {
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1, 2, 3, 4);
        cbBatataCdd.setValue(0);
        cbBatataCdd.setItems(qtd);
    }

    private void qtdPS() {
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1, 2, 3, 4);
        cbPS.setValue(0);
        cbPS.setItems(qtd);
    }

    private void qtdSuco() {
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1, 2, 3, 4);
        cbSuco.setValue(0);
        cbSuco.setItems(qtd);
    }

    private void qtdRefri() {
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1, 2, 3, 4);
        cbRefrigerante.setValue(0);
        cbRefrigerante.setItems(qtd);
    }

    private void qtdOnion() {
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1, 2, 3, 4);
        cbOnion.setValue(0);
        cbOnion.setItems(qtd);
    }

    private void qtdMilkshake() {
        ObservableList<Integer> qtd = FXCollections.observableArrayList(1, 2, 3, 4);
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
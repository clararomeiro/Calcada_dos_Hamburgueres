package controller;

import java.net.URL;
import java.util.ResourceBundle;
import beans.Funcionario;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import negocio.FachadaCalcada;
import negocio.ICalcada;
import telas.TelaCadastroFuncionario;
import telas.TelaLoginFuncionario;

public class TelaCadastroFuncionarioController extends Saida implements Initializable{

	 @FXML private TextField txtNome;
	 @FXML private TextField txtEmail;
	 @FXML private TextField txtCpf;
	 @FXML private Button btnCadastro;
	 @FXML private Button btnVoltar;
	 ICalcada fachada;
	 FachadaCalcada fachadacalcada;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		 btnVoltar.setOnMouseClicked((MouseEvent e)->{
	            saida();
	        	fechar();
	        });
		 
		 btnVoltar.setOnKeyPressed((KeyEvent e) -> {
			 if(e.getCode() == KeyCode.ENTER)
			 {
				 saida();
				 fechar();
			 } 
		 });
		 
		 btnCadastro.setOnMouseClicked((MouseEvent e) -> {
			 fechar();
			 TelaLoginFuncionario p = new TelaLoginFuncionario();
			 try {
					p.start(new Stage());
					fachada = FachadaCalcada.getInstance();
					Funcionario f = new Funcionario (txtNome.getText(), txtEmail.getText(), txtCpf.getText());
					fachada.cadastrar(f);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

		 });
		
		 btnCadastro.setOnKeyPressed((KeyEvent e) -> {
			 if(e.getCode() == KeyCode.ENTER)
			 {
				 fechar();
				 TelaLoginFuncionario q = new TelaLoginFuncionario();
				 try {
						q.start(new Stage());
						fachada = FachadaCalcada.getInstance();
						Funcionario f = new Funcionario (txtNome.getText(), txtEmail.getText(), txtCpf.getText());
						fachada.cadastrar(f);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			 }
		 });
	}
	
	public void fechar ()
	{
		TelaCadastroFuncionario.getStage().close();
	}

}

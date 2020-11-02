package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
	            voltar();
	        	fechar();
	        });
		 
		 btnVoltar.setOnKeyPressed((KeyEvent e) -> {
			 if(e.getCode() == KeyCode.ENTER)
			 {
				 voltar();
				 fechar();
			 } 
		 });
		 
		 btnCadastro.setOnMouseClicked((MouseEvent e) -> {
			 try {
	               fachada = FachadaCalcada.getInstance();
	               Funcionario f = new Funcionario(txtNome.getText(), txtEmail.getText(),  txtCpf.getText()); 
	               fachada.cadastrar(f);
	           } catch (ClassNotFoundException ex) {
	               Logger.getLogger(TelaCadastroFuncionarioController.class.getName()).log(Level.SEVERE, null, ex);
	           } catch (IOException ex) {
	               Logger.getLogger(TelaCadastroFuncionarioController.class.getName()).log(Level.SEVERE, null, ex);
	           }

		 });
		
		 btnCadastro.setOnKeyPressed((KeyEvent e) -> {
			 if(e.getCode() == KeyCode.ENTER) 
			 {
				 try {
		               fachada = FachadaCalcada.getInstance();
		               Funcionario f = new Funcionario(txtNome.getText(), txtEmail.getText(),  txtCpf.getText()); 
		               fachada.cadastrar(f);
		           } catch (ClassNotFoundException ex) {
		               Logger.getLogger(TelaCadastroFuncionarioController.class.getName()).log(Level.SEVERE, null, ex);
		           } catch (IOException ex) {
		               Logger.getLogger(TelaCadastroFuncionarioController.class.getName()).log(Level.SEVERE, null, ex);
		           } 
			 }
 
		 });
	}
	
	public void fechar ()
	{
		TelaCadastroFuncionario.getStage().close();
	}
	
	public void voltar(){
        TelaLoginFuncionario l = new TelaLoginFuncionario();
            
        try {
			l.start(new Stage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}

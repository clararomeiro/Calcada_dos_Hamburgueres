package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import beans.Funcionario;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import negocio.FachadaCalcada;
import negocio.ICalcada;
import telas.TelaAdministrador;
import telas.TelaCadastroFuncionario;
import telas.TelaLoginFuncionario;

public class TelaLoginFuncionarioController extends Saida implements Initializable{
	@FXML private TextField txtCpf;
    @FXML private PasswordField txtSenha;
    @FXML private Button btnEntrar;
    @FXML private Button btnVoltar;
    @FXML private Hyperlink btnCadastrar;
    Funcionario funcionario;
    ICalcada fachada;
    
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		btnEntrar.setOnMouseClicked((MouseEvent e)->{
			logar();	
	    });
		
		btnEntrar.setOnKeyPressed((KeyEvent e) -> { 
			if(e.getCode() == KeyCode.ENTER)
			{
				logar();
			}		
	 });
		
		btnVoltar.setOnMouseClicked((MouseEvent e) -> {
			fechar();
			saida();
		});
		
		btnVoltar.setOnKeyPressed((KeyEvent e) -> { 
			if(e.getCode() == KeyCode.ENTER)
			{
				fechar();
				saida();
			}		
	 });
		
		btnCadastrar.setOnMouseClicked((MouseEvent e)->{
				fechar();
				TelaCadastroFuncionario m = new TelaCadastroFuncionario();
				try {
					m.start(new Stage());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
		    });
		
		btnCadastrar.setOnKeyPressed((KeyEvent e) -> { 
			if(e.getCode() == KeyCode.ENTER)
			{
				 fechar();
				 TelaCadastroFuncionario n = new TelaCadastroFuncionario();
				 try {
					n.start(new Stage());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		 });
		
	}
	
	private void logar(){
        try {
            boolean entrou = false;
            fachada = FachadaCalcada.getInstance();
                
                if (entrou == false) {
                	if(fachada.logarF(txtCpf.getText(), txtSenha.getText()) != null)
                	{
                		TelaAdministrador tp = new TelaAdministrador();
                        try {
                        	tp.start(new Stage());
                        } catch (Exception ex) {
                        	ex.printStackTrace();
                        }
                        entrou = true;
                        fechar();
                    	}
                	}    
                else{
                	TelaAdministrador h = new TelaAdministrador();
                	try {
    					h.start(new Stage());
    				} catch (Exception e1) {
    					// TODO Auto-generated catch block
    					e1.printStackTrace();
    				}
                            entrou = true;
                            fechar();
                }
                
                    if(entrou == false){
                Alert alert = new Alert(AlertType.ERROR);
                alert.setHeaderText("ERRO");
                alert.setTitle("Erro ao entrar");
                alert.setContentText("Usuario ou senha invalido, tente novamente");
                alert.show();
            }  
              
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaLoginFuncionarioController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaLoginFuncionarioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
	
	public void fechar(){
        TelaLoginFuncionario.getStage().close();
    }
	
}

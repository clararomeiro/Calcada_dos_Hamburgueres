package controller;

import java.net.URL;
import java.util.ResourceBundle;
import beans.Cliente;
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
import telas.TelaCardapio;
import telas.TelaCliente;

public class TelaClienteController implements Initializable {
	  @FXML private TextField txtNome;
	  @FXML private TextField txtCpf;
	  @FXML private Button btnEntrar;
	  ICalcada fachada;
	  FachadaCalcada fachadacalcada;
	  
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		btnEntrar.setOnMouseClicked((MouseEvent e) -> {
			fechar();
			TelaCardapio k = new TelaCardapio();
			try {
				k.start(new Stage());
				fachada = FachadaCalcada.getInstance();
				Cliente c = new Cliente(txtNome.getText(), txtCpf.getText());
				fachada.cadastrarCliente(c);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		btnEntrar.setOnKeyPressed((KeyEvent e) -> {
			if(e.getCode() == KeyCode.ENTER)
			{
				fechar();
				TelaCardapio j = new TelaCardapio();
				try {
					j.start(new Stage());
					fachada = FachadaCalcada.getInstance();
					Cliente c = new Cliente(txtNome.getText(), txtCpf.getText());
					fachada.cadastrarCliente(c);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
	}
	
	public void fechar ()
	{
		TelaCliente.getStage().close();
	}
	  
	  

}

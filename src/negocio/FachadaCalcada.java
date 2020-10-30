package negocio;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import beans.Cliente;
import beans.Funcionario;
import beans.Pagamento;
import exceptions.FuncionarioException;
import javafx.scene.control.Alert;

public class FachadaCalcada implements ICalcada{
	
	private final CadastroFuncionario funcionario;
	private final Login login;
	private static ICalcada instance;
	
	private FachadaCalcada() throws ClassNotFoundException, IOException {
		this.funcionario = new CadastroFuncionario();
		this.login = new Login(null);
	}
	
	 public static ICalcada getInstance() throws ClassNotFoundException, IOException {
		    if (instance == null) {
		      instance = new FachadaCalcada();
		    }
		    return instance;
		  }

	@Override
	public Cliente logar(String nome, String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente selecionarCliente(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cadastrarPagamento(Pagamento pagamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> listarFuncionariosString() {
		return funcionario.listar();
	}

	@Override
	public List<Funcionario> listarFuncionarios() {
		 return funcionario.listarFuncionario();
	}

	@Override
	public Funcionario logarF(String usuario, String senha) {
		try {
            this.funcionario.cadastrar(f);
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
	    alert.setHeaderText("Sucesso");
            alert.setTitle("Cadastro realizado");
	    alert.setContentText("Cadastro realizado com sucesso");
	    alert.show();
        } catch (FuncionarioException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Funcionario já cadastrado");
            alert.setContentText(ex.getMessage());
            alert.show();
            Logger.getLogger(FachadaCalcada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


	@Override
	public void mudarStatus(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrar(Funcionario f) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
package negocio;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import beans.Cliente;
import beans.Funcionario;
import beans.Pagamento;
import beans.Pedido;
import exceptions.ClienteException;
import exceptions.FuncionarioException;
//import exceptions.PagamentoException;
import javafx.scene.control.Alert;

public class FachadaCalcada implements ICalcada{
	
	private final CadastroFuncionario funcionario;
	private final CadastroCliente cliente;
	private final CadastroPagamento pagamento;
	private final CadastroPedido pedido;
	private final Login login;
	private static ICalcada instance;
	
	private FachadaCalcada() throws ClassNotFoundException, IOException {
		
		this.pagamento = new CadastroPagamento();
		this.cliente = new CadastroCliente();
		this.funcionario = new CadastroFuncionario();
		this.login = new Login();
		this.pedido = new CadastroPedido();
	}
	
	 public static ICalcada getInstance() throws ClassNotFoundException, IOException {
		    if (instance == null) {
		      instance = new FachadaCalcada();
		    }
		    return instance;
		  }		

	@Override
	public void cadastrarPagamento(Pagamento pagamento) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void cadastrar(Funcionario f) {
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
		catch (IOException ex) 
		{
            Logger.getLogger(FachadaCalcada.class.getName()).log(Level.SEVERE, null, ex);
        }
		
	}


	@Override
	public void mudarStatus(String cpf) {
		pedido.mudarStatus(cpf);
		
	}

	@Override
	public void cadastrar(Pedido pedido) {
		this.pedido.cadastrar(pedido);
		
	}
	@Override
	public void atualizarPedido(Pedido pedido){
		this.pedido.atualizarPedido(pedido);
	}

	@Override
	public void removerPedido(Pedido pedido) {
		this.pedido.removerPedido(pedido);
	}

	@Override
	public List<Pedido> listarPedidos() {
		return pedido.listarPedidos();
	}
	
	@Override
	public List<Pagamento> listarPagamento() {
		return pagamento.listarPagamento();
	}
	
	@Override
	public List<Cliente> listar() {
		return cliente.listar();
	}
	
	@Override
	public List<Funcionario> listarFuncionario() {
		return funcionario.listar();
	}

	@Override
	public void cadastrarCliente(Cliente c) {
		 try {
	           this.cliente.cadastrar(c);
	           Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
	           alert.setHeaderText("Sucesso");
	           alert.setTitle("Cadastro realizado");
	           alert.setContentText("Cadastro realizado com sucesso");
	           alert.show();
	        } catch (ClienteException ex) {
	            Alert alert = new Alert(Alert.AlertType.ERROR);
	            alert.setHeaderText("Cliente ja cadastrado");
	            alert.setContentText(ex.getMessage());
	            alert.show();
	            Logger.getLogger(FachadaCalcada.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (IOException ex) {
	            Logger.getLogger(FachadaCalcada.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }
	
	public Cliente selecionarCliente(String cpf) {
		Cliente clientes = null;
		try {
			clientes = cliente.selecionar(cpf);
		}catch (ClienteException ex) {
            Logger.getLogger(FachadaCalcada.class.getName()).log(Level.SEVERE, null, ex);
        }
		return clientes;
	}

	@Override
	public Funcionario logarF(String usuario, String senha) {
		Funcionario funcionarios = null;
        if (this.login.loginFunci(usuario, senha) != null) {
            funcionarios = this.login.loginFunci(usuario, senha);
        }
        return funcionarios;
	}

	}
	

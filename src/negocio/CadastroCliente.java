package negocio;

import java.io.IOException;
import java.util.List;

import beans.Cliente;
import dados.RepositorioClientes;
import exceptions.ClienteException;

public class CadastroCliente {
	private RepositorioClientes rCliente;
	
	public CadastroCliente() {
		this.rCliente = RepositorioClientes.getInstance();
	}
	
	public void cadastrar(Cliente cliente) throws ClienteException, IOException{
		if(this.eNumero(cliente.getCpf())) {
			this.rCliente.cadastrar(cliente);
			this.rCliente.salvarArquivo();
		}
	}
	
	public List<Cliente> listar(){
		return rCliente.listar();
	}
	
	public Cliente selecionar(String cpf) throws ClienteException{
		return rCliente.selecionar(cpf);
	}
	
	private boolean eNumero(String s) {
		boolean r;
	
		if(s.contains("^[a-Z]")) {
			r = false;
		}else{
			r =true;
		}
		return r;
		
	}

}

package dados;

import java.util.List;

import beans.Cliente;

public interface IRepositorioClientes {

	List<Cliente> listar();
	
	void salvarArquivo() throws ClienteException;
	
	void cadastrar(Cliente cliente) throws ClienteException; 
	
}

package dados;

import java.util.List;

import beans.Cliente;
import exceptions.ClienteException;

public interface IRepositorioClientes {

	List<Cliente> listar();
	
	void salvarArquivo();
	
	void cadastrar(Cliente cliente) throws ClienteException; 
	
	Cliente selecionar(String cpf) throws ClienteException;
	
}

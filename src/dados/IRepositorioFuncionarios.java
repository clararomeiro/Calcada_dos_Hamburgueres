package dados;

import java.util.List;

import beans.Funcionario;
import exceptions.FuncionarioException;


public interface IRepositorioFuncionarios {

	List<String> listar();
	
	void salvarArquivo() throws FuncionarioException;
	
	void cadastrar(Funcionario funcionario) throws FuncionarioException; 
		
}

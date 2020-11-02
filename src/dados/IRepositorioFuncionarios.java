package dados;

import java.util.List;

import beans.Funcionario;
import exceptions.FuncionarioException;


public interface IRepositorioFuncionarios {

	List<Funcionario> listar();
	
	void salvarArquivo();
	
	void cadastrar(Funcionario funcionario) throws FuncionarioException; 
	
		
}

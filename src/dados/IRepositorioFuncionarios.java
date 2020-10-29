package dados;

import beans.Funcionario;


public interface IRepositorioFuncionarios {

	void salvarArquivo();
	
	void cadastrar(Funcionario funcionario); 
		
}

package negocio;

import java.io.IOException;
import java.util.List;

import beans.Funcionario;
import dados.RepositorioFuncionarios;
import exceptions.FuncionarioException;

public class CadastroFuncionario {
	
	private RepositorioFuncionarios rFuncionario;
	
	 public CadastroFuncionario() {
	        this.rFuncionario = RepositorioFuncionarios.getInstance();
	    }
	 
	 public void cadastrar(Funcionario funcionario) throws FuncionarioException, IOException{
		 if(this.eNumero(funcionario.getCpf())) {
				this.rFuncionario.cadastrar(funcionario);
				this.rFuncionario.salvarArquivo();
			}
	    
	    }
	 
	 public List<Funcionario> listar() {
			return rFuncionario.listar();
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

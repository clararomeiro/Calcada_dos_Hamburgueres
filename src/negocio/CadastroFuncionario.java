package negocio;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import beans.Funcionario;
import dados.RepositorioFuncionarios;
import exceptions.FuncionarioException;

public class CadastroFuncionario {
	
	private RepositorioFuncionarios repFuncionario;
	
	 public CadastroFuncionario() throws IOException{
	        this.repFuncionario = RepositorioFuncionarios.getInstance();
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
	 
	 public void cadastrar(Funcionario funcionario) throws FuncionarioException{
	        if (funcionario != null && this.eNumero(funcionario.getCpf())) {
				this.repFuncionario.cadastrar(funcionario);
				this.repFuncionario.salvarArquivo();
			}
	    
	    }

	public List<String> listar() {
		return repFuncionario.listar();
	}
	
	public List<Funcionario> listarFuncionario(){
        return repFuncionario.listarFuncionarios();
    }
	
}

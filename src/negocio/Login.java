package negocio;

import beans.Funcionario;
import dados.RepositorioFuncionarios;

public class Login {
	
	RepositorioFuncionarios repFuncionario;

	public Login() {
		this.repFuncionario = RepositorioFuncionarios.getInstance();
	}
	
	 public Funcionario loginFunci(String usuario, String senha){
	        Funcionario funcionario = null;
	        for (Funcionario f : repFuncionario.listar()) {
	            if (f.getCpf().equals(usuario) && f.getSenha().equals(senha)) {
	                funcionario = f;
	            }  
	        }
	         return funcionario;
	    }
	

}

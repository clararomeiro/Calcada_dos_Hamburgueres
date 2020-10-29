package negocio;

import beans.Funcionario;
import dados.RepositorioFuncionarios;

public class Login {
	
	RepositorioFuncionarios repFuncionario;

	public Login(RepositorioFuncionarios repFuncionario) {
		this.repFuncionario = repFuncionario;
	}
	
	 public Funcionario loginFunci(String usuario, String senha){
	        Funcionario funcionario = null;
	        for (Funcionario f : repFuncionario.listarFuncionarios()) {
	            if (f.getNome().equals(usuario) && f.getSenha().equals("funcionario")) {
	                funcionario = f;
	            }  
	        }
	         return funcionario;
	    }
	

}

package beans;

import java.io.Serializable;


public class Funcionario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
    private String nome;
    private String email;
    private String senha;
	 
	 
	 public Funcionario(String nome, String email, String senha) 
	 { 
		this.nome = nome;
        this.email = email;
        this.senha = senha;   
        
	 }
	 
	public String getEmail() {
	        return email;
	    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
	
	    

}
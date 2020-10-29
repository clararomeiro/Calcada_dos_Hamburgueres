package beans;

import java.io.Serializable;


public class Funcionario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
    private String nome;
    private String email;
    private String cpf;
    private String usuario;
	 
	 
	 public Funcionario(String nome, String email, String cpf, String usuario) 
	 { 
		this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.usuario = usuario;
        
	 }
	 
	public String getEmail() {
	        return email;
	    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    public String getUsuario() {
        return usuario;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
	
    public String toString() {
		String s = this.nome+"\t"+this.cpf+"\t"+this.email+"\t"+this.usuario.toString();
		return s;
	}
	    

}
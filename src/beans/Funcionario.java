package beans;

import java.io.Serializable;


public class Funcionario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
    private String nome;
    private String email;
    private String cpf;
    private String usuario;
    private String senha = "funcionario";
	 
	 
	 public Funcionario(String nome, String email, String cpf) 
	 { 
		this.nome = nome;
        this.email = email;
        this.cpf = cpf;   
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
 
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
	
    public String toString() {
		String s = this.nome+"\t"+this.cpf+"\t"+this.email+"\t"+this.usuario.toString();
		return s;
	}

	public String getSenha() {
		return senha;
	}
	    

}
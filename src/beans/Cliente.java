package beans;

import java.io.Serializable;

public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 5860472332476238715L;
	
	private String nome;
	private String cpf;
	
	public Cliente(String nome, String cpf)
	{
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getCpf() 
	{
		return cpf;
	}

	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}
	
	
	public String toString() {
		String s = super.toString()+","+ this.nome+","+this.cpf;
		return s;
	}
	
	public boolean equals(Cliente c) {
		boolean igual = false;
		if(c !=null) {
			if(this.getCpf().equals(c.getCpf()) && this.getNome().equalsIgnoreCase(c.getNome())) {
				igual =true;
			}
			
		}
		return igual;
	}
	
	

}

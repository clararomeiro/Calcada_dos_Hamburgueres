package CalcadadosHamburgueres;

import java.util.Scanner;

public class Cliente extends Funcionario {
	
	private String nome;
	private long cpf;
	
	public Cliente(String nome, long cpf)
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

	public long getCpf() 
	{
		return cpf;
	}

	public void setCpf(long cpf) 
	{
		this.cpf = cpf;
	}
	

	public void verCardapio()
	{
		Cardapio cliente = new Cardapio();
		cliente.print();
	}
	
	public void fazerPedido()
	{
		
	}
	
	public void formaDePagamento()
	{	
	
	}
	
	public void verCarrinho()
	{
		//if e else perguntando se ele quer adicionar mais alguma coisa
	}
	
	public void finalizarPedido()
	{
		
	}
	
	public void monitorarPedido()
	{
		
	}
	

}

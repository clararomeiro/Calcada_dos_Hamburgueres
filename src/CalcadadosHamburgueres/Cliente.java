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
	
	//cliente pode ver o cardapio
	public void verCardapio()
	{
		Cardapio cliente = new Cardapio();
		cliente.print();
	}
	
	//cliente pode fazer pedido
	public void fazerPedido()
	{
		
	}
	
	public String formaDePagamento()
	{	
		String formaDePagamento;
		//formaDePagamento ainda precisa ser definida
		return formaDePagamento;
	}
	
	public void verCarrinho()
	{
		//if e else perguntando se ele quer adicionar mais alguma coisa
	}
	
	//cliente pode finalizar pedido
	public void finalizarPedido()
	{
		
	}
	
	//cliente pode saber o andamento do pedido
	public void monitorarPedido()
	{
		
	}
	

}

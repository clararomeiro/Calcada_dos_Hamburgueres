package CalcadadosHamburgueres;

public class Cliente {
	
	private String nome;
	private Long cpf;
	
	public Cliente(String nome, Long cpf)
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

	public Long getCpf() 
	{
		return cpf;
	}

	public void setCpf(Long cpf) 
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
	
	public void monitorarPedido()
	{
		
	}

}

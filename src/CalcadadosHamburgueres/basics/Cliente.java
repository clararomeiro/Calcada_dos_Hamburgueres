package CalcadadosHamburgueres.basics;

public class Cliente {
	
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
	}
	
	//cliente pode fazer pedido
	public void fazerPedido()
	{
		
	}
	
	public String formaDePagamento()
	{	
		String formaDePagamento = null;
		//formaDePagamento ainda precisa ser definida
		return formaDePagamento;
	}
	
	public void verCarrinho()
	{
		boolean verCarrinho = false;
		if(verCarrinho = true) {
			ItemPedido observacaoPedido;
		}
		else {
			//seguir para finalização do pedido
		}
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

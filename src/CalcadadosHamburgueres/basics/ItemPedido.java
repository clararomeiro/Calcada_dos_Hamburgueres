package CalcadadosHamburgueres.basics;
import java.util.Scanner;



public class ItemPedido {
	private Produto produto;
	private int quantidade;
	private int numeroCliente=0;
	
	public ItemPedido(Produto produto) {
		this.produto = produto;
        	this.quantidade = quantidade;
	}
	public int gerarNumeroCliente(){
		numeroCliente=numeroCliente+1;
		return numeroCliente;
	}
	//adicionar alguma informacao do hamburguer
	public String observacaoPedido() {
		Scanner interagir = new Scanner(System.in);
		String observacaoPedido;
		observacaoPedido="Sem observacoes";
		System.out.println("Adicionar alguma observacao no pedido? SIM-1 NAO-2");
		int escolha;
		escolha=interagir.nextInt();
			if(escolha==1) {
				System.out.println("Insira a observacao");
				observacaoPedido=interagir.nextLine();
				return observacaoPedido;
			}
			else {
				return observacaoPedido;
			}
			
	public void setProduto(Produto produto) {
		this.produto=produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	

}}

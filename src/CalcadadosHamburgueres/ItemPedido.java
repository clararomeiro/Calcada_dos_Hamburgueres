package CalcadadosHamburgueres;
import java.util.ArrayList;
import java.util.Scanner;



public class ItemPedido {
	ArrayList<Cardapio> itemPedido;
	private int numeroCliente=0;
	
	public ItemPedido(Cardapio sanduiche, Cardapio bebida, Cardapio acompanhamento) {
		itemPedido = new ArrayList();
		itemPedido.add(sanduiche);
		itemPedido.add(bebida);
		itemPedido.add(acompanhamento);
		
	}
	public void removeSanduiche(String sanduiche, double valor) {
		itemPedido.remove(sanduiche);
		itemPedido.remove(valor);
	}
	public void removeBebida(String bebida, double valor) {
		itemPedido.remove(bebida);
		itemPedido.remove(valor);
	}
	public void removeAcompanhamento(String acompanhamento, double valor) {
		itemPedido.remove(acompanhamento);
		itemPedido.remove(valor);
	}
	public int gerarNumeroCliente(){
		numeroCliente=numeroCliente+1;
		return numeroCliente;
	}
	//adicionar alguma informação do hamburguer
	public String observaçaoPedido() {
		interagir = new Scanner(System.in);
		String observaçaoPedido;
		System.out.println("Adicionar alguma observação no pedido?");
		observaçaoPedido=interagir.nextLine();
		
		return observaçaoPedido;
	}
		
		
	public ArrayList<Cardapio> getItemPedido(){
		return itemPedido;
	}
	
	
	

}

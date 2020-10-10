package projeto;
import java.util.ArrayList;
import java.util.Random;


public class ItemPedido {
	ArrayList<Cardapio> itemPedido;
	
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
	public int gerarNumeroCliente(int num){
		num=0;
		num++;
		return num;		
	}
		
	public ArrayList<Cardapio> getItemPedido(){
		return itemPedido;
	}
	
	
	

}

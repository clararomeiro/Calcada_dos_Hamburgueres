package negocio;

import java.util.List;

import beans.Pedido;
import dados.RepositorioPedidos;

public class CadastroPedido {
	
	private RepositorioPedidos rPedido;
	
	public CadastroPedido() {
		this.rPedido = RepositorioPedidos.getInstance();
	}
	
	public List<Pedido> listarPedidos() {
		return this.rPedido.listarPedidos();
	}
	
	public void cadastrar(Pedido pedido) {
		this.rPedido.cadastrarPedido(pedido);
		this.rPedido.salvarArquivo();
	}
	
	public void removerPedido(Pedido pedido) {
		this.rPedido.removerPedido(pedido);
		this.rPedido.salvarArquivo();
	}
	
	public void mudarStatus(String cpf) {
		this.rPedido.mudarStatus(cpf);
		this.rPedido.salvarArquivo();
	}

	public void atualizarPedido(Pedido pedido){
		int id = pedido.getId();
		this.rPedido.removerPedido(pedido);
		this.rPedido.cadastrarPedido(pedido);
	}
}

package beans;

import java.time.LocalDate;
import java.io.Serializable;


public class Pagamento implements Serializable{
	
	private static final long serialVersionUID = -8634188873103876178L;
	private Pedido pedido;
	private String modoPagamento;
	private LocalDate dataVenda;
	
	private static final String DEBITO ="debito";
	private static final String CREDITO ="credito";
	private static final String DINHEIRO ="dinheiro";


	public Pagamento(Pedido pedido, String modoPag) {
		this.pedido = pedido;
		this.setModoPagamento(modoPag);
     
	}
	
	public Pagamento(Pedido pedido)
	{
		this.pedido = pedido;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public String getModoPagamento() {
		return modoPagamento;
	}

	public void setModoPagamento(String modoPagamento) {
		if (modoPagamento != null) {
			if (modoPagamento.equals(DEBITO) || modoPagamento.equals(CREDITO)
					|| modoPagamento.equals(DINHEIRO)) {
				this.modoPagamento = modoPagamento;
			}
		}
	}
	
	public LocalDate getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}

	public String toString() {
		String s = this.pedido.toString()+","+this.modoPagamento+","+ this.dataVenda.toString() ;
		return s;
	}
}

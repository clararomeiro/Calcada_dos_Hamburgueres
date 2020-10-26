package beans;

public class FormaDePagamento {
	
	
	private double valorTotalPedido;
	private Pedido pedido;
	private String modoPagamento;
	
	private static final String DEBITO ="debito";
	private static final String CREDITO ="credito";
	private static final String DINHEIRO ="dinheiro";
		
	public void Venda(Pedido pedido, String modoPag) {
		this.pedido = pedido;
		this.setModoPagamento(modoPag);
        setValorTotalPedido();
	}
	
	public void Venda(Pedido pedido)
	{
		this.pedido = pedido;
	}
	
	public double getValorTotalPedido() {
		return valorTotalPedido;
	}
	public void setValorTotalPedido() {
		//this.valorTotalPedido = pedido.getPreco();
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
	

	public String toString() {
		String s = this.pedido.toString()+","+","+this.valorTotalPedido+ ","
				+this.modoPagamento+",";
		return s;
	}

		
}

package beans;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pagamento {
	
	private ControladorPedido controladorPedido;
	private String modoPagamento;
	private LocalDate dataVenda;
	
	private static final String DEBITO ="debito";
	private static final String CREDITO ="credito";
	private static final String DINHEIRO ="dinheiro";


	public Pagamento(ControladorPedido controladorPedido, String modoPag) {
		this.controladorPedido = controladorPedido;
		this.setModoPagamento(modoPag);
     
	}
	
	public Pagamento(ControladorPedido controladorPedido)
	{
		this.controladorPedido = controladorPedido;
	}
	public ControladorPedido getControladorPedido() {
		return controladorPedido;
	}
	public void setPedido(ControladorPedido controladorPedido) {
		this.controladorPedido = controladorPedido;
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
		String s = this.controladorPedido.toString()+","+this.modoPagamento+","+ this.dataVenda.toString() ;
		return s;
	}
}

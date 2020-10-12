package projeto;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido {
	Cliente cliente;
	ItemPedido itempedido;
	Pedido pedido;
	
	public Pedido(Cliente cliente, Pedido pedido) {
		this.cliente = cliente;
		this.pedido = pedido;
	}
	
	public LocalTime obterHorario() {
		LocalTime horaAgora = LocalTime.now();
		return horaAgora;
	}
	
	public LocalDate obterData() {
		LocalDate dataAgora = LocalDate.now();
		return dataAgora;
	}
	
	public String toStringNotaFiscal() {
		return "Numero do pedido: " + this.itempedido.gerarNumeroCliente() + "\n" + "CPF: " + this.cliente.getCpf() + "\n" + "Metodo de pagamento: " + this.cliente.formaDePagamento() + "\n" + "Itens da compra:\n" + this.itempedido.getItemPedido() + "\n" + "Data da compra: " + obterData() + "\n" + "Horario da compra: " + obterHorario();
	}
}

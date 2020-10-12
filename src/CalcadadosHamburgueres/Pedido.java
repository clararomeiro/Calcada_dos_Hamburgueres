package CalcadadosHamburgueres;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido {
	Cliente cliente;
	ItemPedido itempedido;
	
	public Pedido(Cliente cliente, ItemPedido itempedido) {
		this.cliente = cliente;
		this.pedido = pedido;
	}
	
	//obtem a hora local
	public LocalTime obterHorario() {
		LocalTime horaAgora = LocalTime.now();
		return horaAgora;
	}
	
	//obtem a data local
	public LocalDate obterData() {
		LocalDate dataAgora = LocalDate.now();
		return dataAgora;
	}
	
	//retorna a nota fiscal
	public String toStringNotaFiscal() {
		return "Numero do pedido: " + this.itempedido.gerarNumeroCliente() + "\n" + "CPF: " + this.cliente.getCpf() + "\n" + "Metodo de pagamento: " + this.cliente.formaDePagamento() + "\n" + "Itens da compra:\n" + this.itempedido.getItemPedido() + "\n" + "Data da compra: " + obterData() + "\n" + "Horario da compra: " + obterHorario();
	}
}

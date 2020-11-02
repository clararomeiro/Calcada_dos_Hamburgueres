package beans;

import java.io.Serializable;
import java.util.List;

public class NotaFiscal implements Serializable{

	private static final long serialVersionUID = 1L;
	private List<Produto> produto;
	private Pagamento pagamento;
	private Cliente cliente;
	
	public NotaFiscal(List<Produto> produto, Cliente cliente, Pagamento pagamento) {
		this.setProduto(produto);
		this.setCliente(cliente);
		this.setPagamento(pagamento);
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String toString() {
		 return this.cliente.getNome() + "\t" + this.cliente.getCpf() + "\t"+ this.produto.get(0).getHamburgueres() +"\t"+
				this.produto.get(0).getAcompanhamentos()+"\t" + this.produto.get(0).getBebidas() + "\t" +
				this.produto.get(0).getQtdZendaya() + this.produto.get(0).getQtdBBH() + this.produto.get(0).getQtdPS() +
				this.produto.get(0).getQtdTwice() + this.produto.get(0).getQtdNCT() + this.produto.get(0).getQtdBatata() +
				this.produto.get(0).getQtdAgua() + this.produto.get(0).getQtdBatataCdd() + this.produto.get(0).getQtdSuco() +
				this.produto.get(0).getQtdSuco() + this.produto.get(0).getQtdRefri() + this.produto.get(0).getQtdOnion() +
				this.produto.get(0).getQtdMilkshak() + "\t" + this.pagamento.getModoPagamento() + "\t" + this.pagamento.getDataVenda();
	}
}

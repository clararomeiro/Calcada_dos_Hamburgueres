package beans;

import java.io.Serializable;
import java.util.List;

public class Pedido implements Serializable {
	
	private static final long serialVersionUID = 3491137690432125567L;
	
	private List<Produto> produto;
	private String status;
	private Cliente cliente;
	private double preco;
	private int id;
	
	public Pedido(List<Produto> produto,String status, Cliente cliente) {
		this.produto = produto;
		this.status = status;
		this.cliente = cliente;
		this.calcularPreco();
	}
	
	public List<Produto> getProduto(){
		return produto;
	}
	
	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getPreco() {
		return preco;
	}
	
	private void calcularPreco() {
		this.preco = 0;
		for(Produto p: produto) {
			this.preco+= p.getAcompanhamentos().getValor()+ p.getBebidas().getValor()+
					p.getHamburgueres().getValor();
		}
	
	}
	
	public void mudarStatus() {
		
	}
	
	public String toString() {
		
		return this.cliente.getCpf() + "\t"+ this.produto.get(0).getHamburgueres() +"\t"+
				this.produto.get(0).getAcompanhamentos()+"\t" + 
				this.produto.get(0).getBebidas() + "\t"+ this.status;
		//quantidades tbm
	}
	
	


	
	
	
	
	
	
}
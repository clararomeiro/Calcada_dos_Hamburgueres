package beans;

import java.io.Serializable;
import java.util.List;

public class Pedido implements Serializable {
	
	private static final long serialVersionUID = 3491137690432125567L;
	
	private List<Produto> hamburgueres;
	private String status;
	private Cliente cliente;
	private double preco;
	private int id;
	
	public Pedido(List<Produto> hamburguer,String status, Cliente cliente) {
		this.hamburgueres = hamburguer;
		this.status = status;
		this.cliente = cliente;
		this.calcularPreco();
	}
	
	public List<Produto> getHamburgueres(){
		return hamburgueres;
	}
	
	public void setHamburgueres(List<Produto> hamburgueres) {
		this.hamburgueres = hamburgueres;
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
		/*for(Produto p: hamburgueres) {
			this.preco += p }*/
	}
	
	public void mudarStatus() {
		
	}
	
	public String toString() {
		
		return this.cliente.getCpf() + " " + this.status;
	}
	
	


	
	
	
	
	
	
}
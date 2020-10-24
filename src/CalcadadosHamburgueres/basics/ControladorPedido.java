package CalcadadosHamburgueres;
import java.util.List;

public class ControladorPedido {
	private List<Carrinho> carrinho;
	private Cliente cliente;
	private String status;
	private double preco;
	private int id;

	public ControladorPedido(List<Carrinho> carrinho, String status, Cliente cliente) {
		
		this.carrinho = carrinho;
		this.status = status;
		this.cliente = cliente;
	    this.calcularPreco();
	        
		}


		public List<Carrinho> getCarrinho() {
			return carrinho;
		}

		public void setCarrinho(List<Carrinho> carrinho) {
			this.carrinho = carrinho;
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
		
		public int getId()
		{
			return this.id;
		}
		
		public void setId(int id)
		{
			this.id = id;
		}
		

		public double getPreco() {
			return preco;
		}

		private void calcularPreco() {
			this.preco =0;
			for (Carrinho s: carrinho) {
	                    for (Cardapio cardapio : s.getCardapio()) {
	                        preco+=Cardapio.getPreco();
	                    }			
			}
		}
	      
	        
	    public void mudarStatus(){
	            
	    }
	    public String toString() {
			
			return this.cliente.getCpf()+"\t"+this.carrinho.get(0).getCardapio()+"    "+ this.carrinho.get(0).getQtd()+"\t"+this.status+"\t";
			
		}
}

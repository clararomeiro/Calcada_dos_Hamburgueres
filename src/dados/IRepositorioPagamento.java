package dados;

import java.util.List;

import beans.Cliente;
import beans.Pagamento;

public interface IRepositorioPagamento {
	
	void cadastrar(Pagamento p);
	
	boolean remover(Pagamento p);
	
	void cancelarVenda(Pagamento p);
	
	List<Pagamento> listarVendas();
	
	List<Pagamento> listarPorCliente(Cliente c);
	
	void salvar();
	
}

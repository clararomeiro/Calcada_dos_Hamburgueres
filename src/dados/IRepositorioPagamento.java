package dados;

import java.util.List;
import java.time.LocalDate;

import beans.Cliente;
import beans.Pagamento;

public interface IRepositorioPagamento {
	
	void cadastrar(Pagamento p);
	
	boolean remover(Pagamento p);
	
	void cancelarVenda(Pagamento p);
	
	List<Pagamento> listarPorData(LocalDate d);
	
	List<Pagamento> listarPagamento();
	
	List<Pagamento> listarPorCliente(Cliente c);
	
	void salvar();

	
}

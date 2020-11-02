package negocio;

import java.time.LocalDate;
import java.util.List;

import beans.Cliente;
import beans.Pagamento;
import dados.RepositorioPagamento;
import exceptions.PagamentoException;

public class CadastroPagamento {
	
	private RepositorioPagamento repPag;
	
	public CadastroPagamento() {
		this.repPag = RepositorioPagamento.getInstance();
	}
	
	
	public void cadastrar(Pagamento pag) throws PagamentoException  {
		if (pag  != null) {	
			this.repPag.cadastrar(pag);
			this.repPag.salvar();
		}
	}
	
	
	
	public void cancelarVenda(Pagamento pag) {
		repPag.cancelarVenda(pag);
	}

	public boolean remover(Pagamento pag) {
		return repPag.remover(pag);
	}

	public List<Pagamento> listarPorData(LocalDate d) {
		return repPag.listarPorData(d);
	}

	public List<Pagamento> listarPagamento() {
		return repPag.listarPagamento();
	}

	public List<Pagamento> listarPorCliente(Cliente c) {
		return repPag.listarPorCliente(c);
	}
}

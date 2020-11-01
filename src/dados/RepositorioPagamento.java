package dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import beans.Cliente;
import beans.Pagamento;
import dados.IRepositorioPagamento;
import exceptions.PagamentoException;

public class RepositorioPagamento implements IRepositorioPagamento ,Serializable{

	private static final long serialVersionUID = -441651136385215292L;
	private List<Pagamento> pagamentos;
	public static RepositorioPagamento instance;
	
	private  RepositorioPagamento() {
		pagamentos = new ArrayList<Pagamento>();
	}
	
	public static RepositorioPagamento getInstance() {
		if (instance == null) {
			instance = RepositorioPagamento.lerArquivo();
		}
		return instance;
	}

	@Override
	public void cadastrar(Pagamento p) {
		p.setDataVenda(LocalDate.now());
		pagamentos.add(p);
		
		
	}

	@Override
	public boolean remover(Pagamento p) {
		boolean removido = false;
		if(p !=null) {
			pagamentos.remove(p);
			removido = true;
		}
		return removido;
	}

	@Override
	public List<Pagamento> listarPorData(LocalDate d) {
		List<Pagamento> lista = new ArrayList<Pagamento>();
		for(Pagamento p: pagamentos) {
			if(p.getDataVenda().equals(d)) {
				lista.add(p);
			}
		}
		
		return lista;
	}

	@Override
	public List<Pagamento> listarVendas() {
		return this.pagamentos;
	}
	
	@Override
	public List<Pagamento> listarPorCliente (Cliente c) {
		List<Pagamento> lista = new ArrayList<Pagamento>();
		for(Pagamento p: pagamentos) {
			if(p.getControladorPedido().getCliente().equals(c)) {
				lista.add(p);
			}
		}
		return lista;
	}
	
	@Override
	public void cancelarVenda(Pagamento p) {
		for(Pagamento pa: pagamentos) {
			if(pa.getControladorPedido().getId() == p.getControladorPedido().getId()) {
				pa.getControladorPedido().setStatus("CANCELADO!");
			}
		}
		
	}
	

	
	
	
	

	
	
	

}
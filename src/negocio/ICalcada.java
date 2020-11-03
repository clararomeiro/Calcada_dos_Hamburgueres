package negocio;

import beans.Cliente;
import beans.Funcionario;
import beans.Pedido;
import beans.Pagamento;
import java.util.List;


public interface ICalcada {
	
	void cadastrarCliente(Cliente c);
	
	public Cliente selecionarCliente(String cpf);
	
	void cadastrar(Funcionario f);
	
	void cadastrarPagamento(Pagamento pagamento);
	
	void cadastrar(Pedido pedido);

	void atualizarPedido(Pedido pedido);

	public void removerPedido(Pedido pedido);
	
	List<Pedido> listarPedidos();
	List<Pagamento> listarPagamento();
	List<Cliente> listar();
	List<Funcionario> listarFuncionario();
	
	Funcionario logarF(String usuario, String senha);
	
	void mudarStatus(String cpf);

}

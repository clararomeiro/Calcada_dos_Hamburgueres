package negocio;

import beans.Cliente;
import beans.Funcionario;
import beans.Pedido;
import beans.Pagamento;
import java.util.ArrayList;
import java.util.List;


public interface ICalcada {
		
	Cliente logar(String nome, String cpf);
	
	public Cliente selecionarCliente(String cpf);
	
	void cadastrar(Funcionario f);
	
	void cadastrarPagamento(Pagamento pagamento);
	
	void cadastrar(Pedido pedido);
	public void removerPedido(Pedido pedido);
	
	List<String> listarFuncionariosString();
	List<Funcionario> listarFuncionarios();
	List<Pedido> listarPedidos();
	
	Funcionario logarF(String usuario, String senha);
	
	void mudarStatus(String cpf);

}

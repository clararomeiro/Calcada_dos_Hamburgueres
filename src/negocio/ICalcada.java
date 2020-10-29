package negocio;

import beans.Cliente;
import beans.Funcionario;
//importar a classe nova de pedidos
import beans.Pagamento;
import java.util.ArrayList;
import java.util.List;


public interface ICalcada {
		
	Cliente logar(String nome, String cpf);
	
	public Cliente selecionarCliente(String cpf);
	
	void cadastrar(Funcionario f);
	
	void cadastrarPagamento(Pagamento pagamento);
	
	List<String> listarFuncionariosString();
	List<Funcionario> listarFuncionarios();
	
	Funcionario logarF(String usuario, String senha);
	
	void mudarStatus(String cpf);

}

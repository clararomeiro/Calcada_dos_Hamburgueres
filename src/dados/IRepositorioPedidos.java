package dados;
import java.util.List;

import beans.Pedido;
import exceptions.PedidosException;


public interface IRepositorioPedidos {

    List<String> listarPedidoString();

    void salvarArquivo() throws PedidosException;

    void cadastrarPedido(Pedido pedido) throws PedidosException;

    void removerPedido(Pedido pedido) throws PedidosException;


}

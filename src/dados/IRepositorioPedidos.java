package dados;

import java.util.List;
import beans.Pedido;


public interface IRepositorioPedidos {

    List<Pedido> listarPedidos();

    void cadastrarPedido(Pedido pedido);

    void removerPedido(Pedido pedido);
    
    public void salvarArquivo();


}

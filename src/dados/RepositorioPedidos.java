package dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import beans.Pedido;

public class RepositorioPedidos implements IRepositorioPedidos, Serializable {
   
	private static final long serialVersionUID = -5143865582744552115L;
	private List<Pedido> pedidos;
    private static RepositorioPedidos instance;
    private List<String> pedidoString;

    private RepositorioPedidos() {
        pedidos = new ArrayList<Pedido>();
    }

    @Override
    public List<String> listarPedidoString() {
        pedidoString = new ArrayList<>();
        pedidoString.add("CPF / STATUS");
        for(Pedido pedido: pedidos){
            pedidoString.add(pedido.toString());
        }
        return pedidoString;
    }

    public List<Pedido>listarPedidos(){
        return pedidos;
    }


    private static RepositorioPedidos lerArquivo() {
        RepositorioPedidos instanciaLocal =  null;
        File f = new File ("baseDados"+"arqFuncionarios.dat");
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try{

            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            instanciaLocal = (RepositorioPedidos) o;

        }
        catch(Exception e){


            instanciaLocal = new RepositorioPedidos();

        }
        finally{
            if(ois!=null){
                try{
                    ois.close();
                }
                catch(IOException e){
                    System.out.println("Nao foi possivel fechar o arquivo!");
                    e.printStackTrace();
                }
            }
        }

        return instanciaLocal;
    }

    public static RepositorioPedidos getInstance() {
        if (instance == null) {
            instance = RepositorioPedidos.lerArquivo();
        }
        return instance;
    }

    @Override
    public void salvarArquivo() {
        if(instance == null){
            return;
        }

        File f =  new File("baseDados"+"arqFuncionarios.dat");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            if(!f.exists()) {
                f.createNewFile();
            }
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(instance);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(oos!=null){

                try{
                    oos.close();
                }catch(IOException e){
                    System.out.println("Nao foi possivel fechar o arquivo.");
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void cadastrarPedido(Pedido pedido) {
        pedidos.add(pedido);

    }

    private int proximoId(){
        int id = 0;
        if(!this.pedidos.isEmpty()){
            int i = this.pedidos.size()-1;
            id = this.pedidos.get(i).getId()+1;
        }
        return id;
    }

    @Override
    public void removerPedido(Pedido pedido) {

        boolean temId = false;
        for(Pedido p: pedidos){
            if(p.getId() == pedido.getId()){
                temId = true;
            }
        }
        if(temId){
            pedidos.remove(pedido);
        }
    }
    
    public void mudarStatus(String cpf){
        for (Pedido p : pedidos) {
            if (p.getCliente().getCpf().equals(cpf)) {
                p.setStatus("Pedido pronto");
            }
        }
    }
    
    

}

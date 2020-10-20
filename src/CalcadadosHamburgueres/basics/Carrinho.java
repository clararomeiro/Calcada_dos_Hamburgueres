package CalcadadosHamburgueres.basics;

import java.util.ArrayList;

public class Carrinho {
   private ArrayList<Produto> carrinho = new ArrayList<>();


    public Carrinho(Produto produto){
        carrinho.add(produto);
    }

    public void addProduto(Produto produto, int qtd){
        for(int i =0; i< qtd; i++){
            carrinho.add(produto);
        }
    }
    public void removeProduto(Produto produto, int qtd){
        for(int i =0; i< qtd; i++){
            carrinho.remove(produto);
        }
    }
}

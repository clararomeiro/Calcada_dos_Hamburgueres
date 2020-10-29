package beans;

import beans.Produto;
import beans.Tipo;

import java.util.ArrayList;

public class Cardapio {

    private ArrayList<Produto> cardapio = new ArrayList<>();

    public Cardapio(){
        Produto bbh = new Produto("BBH", 6.14, "(PÃ£o italiano, frango empanado, cheddar, cebola)", Tipo.SANDUICHE);
        Produto nct = new Produto("NCT", 10.00, "(PÃ£o verde, carne vegetal, tomate, alface, cebola empanada e molho especial)", Tipo.SANDUICHE);
        Produto zendaya = new Produto("Zendaya", 11.50, "(pÃ£o com gergelim, 2 veggie burgers, queijo, alface, cebola e molho especial)", Tipo.SANDUICHE);
        Produto twice = new Produto("Twice", 9.00, "(PÃ£o italiano, duas carnes bovinas, cheddar, cebola shoyu)", Tipo.SANDUICHE);
        Produto ps = new Produto("Priscila Senna", 7.50, "(PÃ£o brioche, carne bovina, muzzarela, alface, tomate, molho especial)", Tipo.SANDUICHE);
        Produto bf = new Produto("Batata Frita", 5.00, "(Serve 2 pessoas)", Tipo.ACOMPANHAMENTO);
        Produto batatacheddar = new Produto("Batata Cheddar", 7.00, "(Batata Frita com Cheddar, serve 2 pessoas)", Tipo.ACOMPANHAMENTO);
        Produto onionrings = new Produto("Onion Rings", 6.50, "Cebola empanada", Tipo.ACOMPANHAMENTO );
        Produto agua = new Produto("Ã?gua", 2.50, "(500ml)", Tipo.BEBIDA);
        Produto suco = new Produto("Suco", 4.00, "(Laranja, LimÃ£o, Acerola, MaracujÃ¡)", Tipo.BEBIDA);
        Produto refri = new Produto("Refrigerante", 3.50, "(350ml)", Tipo.BEBIDA);
        Produto milkshake = new Produto("MilkShake", 8.50, "(Chocolate, Baunilha, Morango)", Tipo.BEBIDA);
        cardapio.add(bbh);
        cardapio.add(nct);
        cardapio.add(zendaya);
        cardapio.add(twice);
        cardapio.add(ps);
        cardapio.add(bf);
        cardapio.add(batatacheddar);
        cardapio.add(onionrings);
        cardapio.add(agua);
        cardapio.add(suco);
        cardapio.add(refri);
        cardapio.add(milkshake);

    }

    public void addProduto(Produto produto){
        cardapio.add(produto);
    }
    public void removeProduto(Produto produto){
        cardapio.remove(produto);
    }
    public ArrayList<Produto> mostrarCardapio(){
        return cardapio;
    }
}


import java.util.ArrayList;

public class Cardapio {
    private ArrayList sanduiches = new ArrayList();
    private ArrayList bebidas = new ArrayList();
    private ArrayList acompanhamentos = new ArrayList();

    public Cardapio() {
        sanduiches.add("BBH");
        sanduiches.add(6.14);
        sanduiches.add("NCT");
        sanduiches.add(5.00);
        sanduiches.add("Zendaya");
        sanduiches.add(11.00);
        sanduiches.add("Twice");
        sanduiches.add(14.50);
        sanduiches.add("Priscila Senna");
        sanduiches.add(7.00);
        bebidas.add("Refrigerante");
        bebidas.add(4.50);
        bebidas.add("Água");
        bebidas.add(2.50);
        bebidas.add("Suco");
        bebidas.add(5.00);
        bebidas.add("MilkShake");
        bebidas.add(8.00);
        acompanhamentos.add("Batata Frita");
        acompanhamentos.add(5.00);
        acompanhamentos.add("Batata Cheddar");
        acompanhamentos.add(7.50);
        acompanhamentos.add("Onion Rings");
        acompanhamentos.add(6.00);
    }

    public void print() {
        System.out.println("\nCARDAPIO:");
        System.out.println("\nSanduiches:");
        for (int i = 0; i < sanduiches.size(); i++) {
            System.out.println(sanduiches.get(i) + " ----- R$" + sanduiches.get(i + 1));
            i++;
        }
        System.out.println("\nBebidas:");
        for (int i = 0; i < bebidas.size(); i++) {
            System.out.println(bebidas.get(i) + " ----- R$" + bebidas.get(i + 1));
            i++;
        }
        System.out.println("\nAcompanhamentos:");
        for (int i = 0; i < acompanhamentos.size(); i++) {
            System.out.println(acompanhamentos.get(i) + " ----- R$" + acompanhamentos.get(i + 1));
            i++;
        }
    }

    public void addSanduiches(String sanduiche, double valor){
        sanduiches.add(sanduiche);
        sanduiches.add(valor);
    }

    public void addBebidas(String bebida, double valor){
        bebidas.add(bebida);
        bebidas.add(valor);
    }



}



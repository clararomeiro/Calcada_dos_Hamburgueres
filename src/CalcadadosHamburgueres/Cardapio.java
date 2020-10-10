package CalcadadosHamburgueres;
import java.util.ArrayList;

public class Cardapio {
    public ArrayList sanduiches = new ArrayList();
    public ArrayList bebidas = new ArrayList();
    public ArrayList acompanhamentos = new ArrayList();
    private ArrayList descricaoSanduiches = new ArrayList();


    public Cardapio() {
        //INSTANCIA CARDAPIO
        sanduiches.add("None");
        sanduiches.add(0.00);
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
        bebidas.add("None");
        bebidas.add(0.00);
        bebidas.add("Refrigerante");
        bebidas.add(4.50);
        bebidas.add("Água");
        bebidas.add(2.50);
        bebidas.add("Suco");
        bebidas.add(5.00);
        bebidas.add("MilkShake");
        bebidas.add(8.00);
        acompanhamentos.add("None");
        acompanhamentos.add(0.00);
        acompanhamentos.add("Batata Frita");
        acompanhamentos.add(5.00);
        acompanhamentos.add("Batata Cheddar");
        acompanhamentos.add(7.50);
        acompanhamentos.add("Onion Rings");
        acompanhamentos.add(6.00);
        descricaoSanduiches.add(" ");
        descricaoSanduiches.add(" ");
        descricaoSanduiches.add(2, "(pão italiano, frango empanado, cheddar, cebola)");
        descricaoSanduiches.add(" ");
        descricaoSanduiches.add(4, "(pão verde, carne vegetal, tomate, alface, cebola empanada e molho especial)");
        descricaoSanduiches.add(" ");
        descricaoSanduiches.add(6, "(pão com gergelim, 2 veggie burgers, queijo, alface, cebola e molho especial)");
        descricaoSanduiches.add(" ");
        descricaoSanduiches.add(8, "(pão de leite, duas carnes bovinas, queijo cheddar, cebola, molho especial)");
        descricaoSanduiches.add(" ");
        descricaoSanduiches.add(10,"(pão com gergelim, queijo parmesão, alface, tomate, cebola caramelizada, molho especial)");

    }

    public void print() {
        //MOSTRA O CARDAPIO NA TELA
        System.out.println("\nCARDAPIO:");
        System.out.println("\nSanduiches:");
        for (int i = 0; i < sanduiches.size(); i++) {
            System.out.println(sanduiches.get(i) + " ----- R$" + sanduiches.get(i + 1) + "   " + descricaoSanduiches.get(i));
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

    //PARA FUNCIONARIO ADICIONAR SANDUICHES NOVOS AO CARDAPIO
    public void addSanduiches(String sanduiche, double valor){
        sanduiches.add(sanduiche);
        sanduiches.add(valor);
    }
    //PARA FUNCIONARIO ADICIONAR BEBIDAS NOVOS AO CARDAPIO
    public void addBebidas(String bebida, double valor){
        bebidas.add(bebida);
        bebidas.add(valor);
    }

    //PARA FUNCIONARIO ADICIONAR ACOMPANHAMENTOS NOVOS AO CARDAPIO
    public void addAcompanhamento(String acompanhamento, double valor){
        acompanhamentos.add(acompanhamento);
        acompanhamentos.add(valor);
    }

    //RETORNA O VALOR DE UM DETERMINADO SANDUICHE
    public Double getValorSanduiche(String sanduiche){
        Double valor = 0.0;
        for(int i = 0; i < sanduiches.size(); i++){
            if(sanduiches.get(i).equals(sanduiche)){
               valor = (Double) sanduiches.get(i+1);
            }
        }
        return valor;
    }

    //RETORNA O VALOR DE UMA DETERMINADA BEBIDA
    public Double getValorBebida(String bebida){
        Double valor = 0.0;
        for(int i = 0; i < bebidas.size(); i++){
            if(bebidas.get(i).equals(bebida)){
                valor = (Double) bebidas.get(i+1);
            }
        }
        return valor;
    }

    //RETORNA O VALOR DE UM DETERMINADO ACOMPANHAMENTO
    public Double getValorAcompanhamento(String acompanhamento){
        Double valor = 0.0;
        for(int i = 0; i < acompanhamentos.size(); i++){
            if(acompanhamentos.get(i).equals(acompanhamento)){
                valor = (Double) acompanhamentos.get(i+1);
            }
        }
        return valor;
    }

}




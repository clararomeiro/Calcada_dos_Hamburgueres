package beans;

import java.io.Serializable;

public class PrecoFinal implements Serializable {
    private Acompanhamento acompanhamento;
    private Bebida bebida;
    private Hamburguer hamburguer;
    private int qtdHam;
    private int qtdBe;
    private int qtdAcom;
    private double preco;

    public PrecoFinal(Acompanhamento acompanhamento, int qtdAcom, Bebida bebida, int qtdBe, Hamburguer hamburguer, int qtdHam){
        preco = 0;
        if(qtdAcom>=0){
            preco = preco + acompanhamento.getValor()*qtdAcom;

            if(qtdBe>=0){
                preco = preco + bebida.getValor()*qtdBe;

                if(qtdHam>=0){
                    preco = preco + hamburguer.getValor()*qtdHam;
                }
            }
        }


    }

    public float calcularPreco(){
        for
    }

}

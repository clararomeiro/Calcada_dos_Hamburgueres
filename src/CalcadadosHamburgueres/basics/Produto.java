package CalcadadosHamburgueres.basics;

public class Produto {
    private String nome;
    private double preco;
    private String descricao;
    private Tipo tipo;


    public Produto(){
        nome = "none";
        preco = 0.0;
        descricao = " ";
        tipo = Tipo.NONE;


    }
    public Produto(String nome, double preco, String descricao, Tipo tipo){
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setTipo(Tipo tipo){
        this.tipo = tipo;
    }
    public double getPreco(){
        return this.preco;
    }
    public String getNome(){
        return this.nome;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public Tipo getTipo(){
        return this.tipo;
    }

}



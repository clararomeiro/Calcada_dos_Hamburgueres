package exceptions;

public class FuncionarioException extends Exception{

    private String nome;

    public FuncionarioException(String msg) {
        super(msg);
        this.nome = nome;
    }

}

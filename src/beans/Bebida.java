package beans;

public enum Bebida{
	REFRIGERANTE(4.50),
	AGUA(2),
	SUCO(5),
	SEM_BEBIDA(0);

	public double valorBebida;
		Bebida(double valor){
		this.valorBebida = valor;

	}
	public double getValor() {
		return this.valorBebida;
	}

}

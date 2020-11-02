package beans;

public enum Bebida{
	REFRIGERANTE(3.50),
	AGUA(2.50),
	SUCO(4.00),
	SEM_BEBIDA(0);

	public double valorBebida;
		Bebida(double valor){
		this.valorBebida = valor;

	}
	public double getValor() {
		return this.valorBebida;
	}

}

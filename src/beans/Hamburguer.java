package beans;


public enum Hamburguer{
	BBH(6.14),
	NCT(10.00),
	ZENDAYA(11.50),
	TWICE(9),
	PRISCILA_SENNA(7.50),
	SEM_HAMBURGUER(0);


	public double valorHamburguer;
	Hamburguer(double valor){
		this.valorHamburguer = valor;

	}
	public double getValor() {
		return this.valorHamburguer;
	}

}



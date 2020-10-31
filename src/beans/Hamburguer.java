package beans;


public enum Hamburguer{
	BBH(6.14),
	NCT(5.00),
	ZENDAYA(11.50),
	TWICE(14.50),
	PRISCILA_SENNA(7),
	SEM_HAMBURGUER(0);


	public double valorHamburguer;
	Hamburguer(double valor){
		this.valorHamburguer = valor;

	}
	public double getValor() {
		return this.valorHamburguer;
	}

}



package beans;

public enum Acompanhamento{
	BATATA_FRITA(5),
	BATATA_CHEDDAR(7),
	ONION_RINGS(6.50),
	MILK_SHAKE(8.50),
	SEM_ACOMPANHAMENTO(0);

	public double valorAcompanhamento;
	Acompanhamento(double valor){
		this.valorAcompanhamento = valor;

	}
	public double getValor() {
		return this.valorAcompanhamento;
	}

} 

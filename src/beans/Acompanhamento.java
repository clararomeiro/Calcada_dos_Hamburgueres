package beans;

public enum Acompanhamento{
	BATATA_FRITA(4),
	BATATA_CHEDDAR(6),
	ONION_RINGS(5),
	MILK_SHAKE(8),
	SEM_ACOMPANHAMENTO(0);

	public double valorAcompanhamento;
	Acompanhamento(double valor){
		this.valorAcompanhamento = valor;

	}
	public double getValor() {
		return this.valorAcompanhamento;
	}

} 

package beans;

import java.io.Serializable;

public class Produto implements Serializable {
  
	private static final long serialVersionUID = 3924775242700710075L;
	
	private Hamburguer hamburgueres;
	private Bebida bebidas;
	private Acompanhamento acompanhamentos;
	
	//private int quantidade;
	
	public Produto(Hamburguer hamburgueres, Bebida bebidas, 
			 Acompanhamento acompanhamentos/*,int quantidade*/) 
	{
		if(hamburgueres == null) {
			this.hamburgueres = Hamburguer.SEM_HAMBURGUER;
		}
		else {
			this.hamburgueres = hamburgueres;
		}
		if(bebidas == null) {
			this.bebidas = Bebida.SEM_BEBIDA;
		}
		else {
			this.bebidas = bebidas;
		}
		if(acompanhamentos == null) {
			this.acompanhamentos = Acompanhamento.SEM_ACOMPANHAMENTO;
		}
		else {
			this.acompanhamentos = acompanhamentos;
		}
	}
	
	public Hamburguer getHamburgueres() {
		return hamburgueres;
	}

	public void setHamburgueres(Hamburguer hamburgueres) {
		this.hamburgueres = hamburgueres;
	}

	public Bebida getBebidas() {
		return bebidas;
	}

	public void setBebidas(Bebida bebidas) {
		this.bebidas = bebidas;
	}

	public Acompanhamento getAcompanhamentos() {
		return acompanhamentos;
	}

	public void setAcompanhamentos(Acompanhamento acompanhamentos) {
		this.acompanhamentos = acompanhamentos;
	} 
		
	}

  



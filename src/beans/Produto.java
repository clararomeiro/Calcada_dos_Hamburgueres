package beans;

import java.io.Serializable;

public class Produto implements Serializable {
  
	private static final long serialVersionUID = 3924775242700710075L;
	
	private Hamburguer hamburgueres;
	private Bebida bebidas;
	private Acompanhamento acompanhamentos;
	
    private int qtdZendaya;
    private int qtdBBH;
    private int qtdPS;
    private int qtdTwice;
    private int qtdNCT;
    private int qtdBatata;
    private int qtdAgua;
    private int qtdBatataCdd;
    private int qtdSuco;
    private int qtdRefri;
    private int qtdOnion;
    private int qtdMilkshak;
	
	public Produto(Hamburguer hamburgueres, Bebida bebidas, 
			 Acompanhamento acompanhamentos, int qtdZendaya) 
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
		this.qtdZendaya = qtdZendaya;
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

	public int getQtdZendaya() {
		return qtdZendaya;
	}

	public void setQtdZendaya(int qtdZendaya) {
		this.qtdZendaya = qtdZendaya;
	}

	public int getQtdBBH() {
		return qtdBBH;
	}

	public void setQtdBBH(int qtdBBH) {
		this.qtdBBH = qtdBBH;
	}

	public int getQtdPS() {
		return qtdPS;
	}

	public void setQtdPS(int qtdPS) {
		this.qtdPS = qtdPS;
	}

	public int getQtdTwice() {
		return qtdTwice;
	}

	public void setQtdTwice(int qtdTwice) {
		this.qtdTwice = qtdTwice;
	}

	public int getQtdNCT() {
		return qtdNCT;
	}

	public void setQtdNCT(int qtdNCT) {
		this.qtdNCT = qtdNCT;
	}

	public int getQtdBatata() {
		return qtdBatata;
	}

	public void setQtdBatata(int qtdBatata) {
		this.qtdBatata = qtdBatata;
	}

	public int getQtdAgua() {
		return qtdAgua;
	}

	public void setQtdAgua(int qtdAgua) {
		this.qtdAgua = qtdAgua;
	}

	public int getQtdBatataCdd() {
		return qtdBatataCdd;
	}

	public void setQtdBatataCdd(int qtdBatataCdd) {
		this.qtdBatataCdd = qtdBatataCdd;
	}

	public int getQtdSuco() {
		return qtdSuco;
	}

	public void setQtdSuco(int qtdSuco) {
		this.qtdSuco = qtdSuco;
	}

	public int getQtdRefri() {
		return qtdRefri;
	}

	public void setQtdRefri(int qtdRefri) {
		this.qtdRefri = qtdRefri;
	}

	public int getQtdOnion() {
		return qtdOnion;
	}

	public void setQtdOnion(int qtdOnion) {
		this.qtdOnion = qtdOnion;
	}

	public int getQtdMilkshak() {
		return qtdMilkshak;
	}

	public void setQtdMilkshak(int qtdMilkshak) {
		this.qtdMilkshak = qtdMilkshak;
	} 
		
	}
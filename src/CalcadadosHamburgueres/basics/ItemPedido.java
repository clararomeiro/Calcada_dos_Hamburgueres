package CalcadadosHamburgueres.basics;
import java.util.Scanner;



public class ItemPedido {
	private EnumHamburguer hamburguer;
	private EnumBebida bebida;
	private EnumAcompanhamento acompanhamento;
	private int quantidade;
	private int numeroCliente=0;
	
	public ItemPedido(EnumHamburguer hamburguer, EnumBebida bebida, EnumAcompanhamento acompanhamento, int quantidade) {
		if (hamburguer == null) {
			this.hamburguer = NumHamburguer.SEMHAMBURGUER; 
		}
		
		else {
			this.hamburguer = hamburguer;
		}
		
        if (bebida == null) {
        	this.bebida = NumBebida.SEMBEBIDA;
        }
        
        else{
        	this.bebida = bebida;
        }
        
        if (acompanhamento == null) {
        	this.acompanhamento = NumAcompanhamento.SEMACOMPANHAMENTO;
        }
        
        else{
          this.acompanhamento = acompanhamento;
        }
        
        this.quantidade = quantidade;
	}
	public int gerarNumeroCliente(){
		numeroCliente=numeroCliente+1;
		return numeroCliente;
	}
	//adicionar alguma informação do hamburguer
	public String observacaoPedido() {
		Sacnner interagir = new Scanner(System.in);
		String observacaoPedido;
		observacaoPedido="Sem observações";
		System.out.println("Adicionar alguma observação no pedido? SIM-1 NÃO-2");
		int escolha;
		escolha=interagir.nextInt();
			if(escolha==1) {
				System.out.println("Insira a observação")
				observacaoPedido=interagir.nextLine();
				return observacaoPedido;
			}
			else {
				return observacao;
			}
			
	}
	public NumHamburguer getHamburguer() {
		return hamburguer;
	}

	public void setHamburguer(NumHamburguer hamburguer) {
		this.hamburguer=hamburguer;
	}

	public NumBebida getBebida() {
		return bebida;
	}

	public void setBebida(NumBebida bebida) {
		this.bebida = bebida;
	}

	public NumAcompanhamento getAcompanhamento() {
		return acompanhamento;
	}

	public void setAcompanhamento(NumAcompanhamento acompanhamento) {
		this.acompanhamento = acompanhamento;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	

}

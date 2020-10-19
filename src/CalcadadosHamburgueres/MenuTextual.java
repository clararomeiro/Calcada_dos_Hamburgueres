package CalcadadosHamburgueres;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuTextual {
	ItemPedido itemPedido;
	Funcionario funcionario;
	Cliente cliente;
    Scanner ler = new Scanner(System.in);
    
	public ControladorPedidos(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public String checarPedido(ItemPedido itemPedido, Cliente cliente) {
		String statusPedido;
	
		System.out.println(this.itemPedido.getItemPedido());
		System.out.println("Forma de pagamento: " + this.cliente.formaDePagamento());
		System.out.println("Aprovar pedido? 1- SIM 2- NAO");
		int opcao = ler.nextInt();
		
		if(opcao == 1) {
			statusPedido = "Seu pedido foi aprovado e logo estará pronto!";
		} else {
			System.out.println("Digite o motivo do pedido ser negado: ");
			String motivo = ler.next();
			statusPedido = motivo;
		}
		
		return statusPedido;
	}
	
	public ArrayList<Cardapio> alterarItens(ItemPedido itemPedido, Cliente cliente) {
		System.out.println("O que deve ser alterado no pedido? 1- Sanduiche 2- Bebida 3- Acompanhamento");
		int opcao = ler.nextInt();
		
		if(opcao == 1) {
			System.out.println("Nome do sanduiche a ser alterado: ");
			String sanduiche = ler.next();
			System.out.println("Valor do sanduiche a ser alterado: ");
			int valor = ler.nextInt();
			this.itemPedido.removeSanduiche(sanduiche, valor);
		}
		if(opcao == 2) {
			System.out.println("Nome da bebida a ser alterado: ");
			String bebida = ler.next();
			System.out.println("Valor da bebida a ser alterado: ");
			int valor = ler.nextInt();
			this.itemPedido.removeBebida(bebida, valor);
		}
		if(opcao == 3) {
			System.out.println("Nome do acompanhamento a ser alterado: ");
			String acompanhamento = ler.next();
			System.out.println("Valor do acompanhamento a ser alterado: ");
			int valor = ler.nextInt();
			this.itemPedido.removeAcompanhamento(acompanhamento, valor);
		}
		
		return this.itemPedido.getItemPedido();
	}
}

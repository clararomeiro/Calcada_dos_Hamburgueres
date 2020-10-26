package CalcadadosHamburgueres.basics;

import java.util.ArrayList;
import java.util.Scanner;

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class Funcionario {
	
	 private ArrayList<String> funcionario;
	 private ArrayList<Integer> senha;
	 
	 public Funcionario()
	 {
		 funcionario = new ArrayList<String>();
		 senha = new ArrayList<Integer>();
	 }
	 
	 
	 
	 //public void start (Stage stage) throws Exception
	 //{
		// FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/gui/LoginFuncionario.fxml"));
	  //   Parent root = loader.load();
	   //  stage.setScene(new Scene(root));
	    // stage.show();
	     
	// }
	 
	 public ArrayList<Integer> getSenha() {
		 return senha;
	 }
	 
	 public void setSenha(ArrayList<Integer> senha) {
		 this.senha = senha;
	 }
	 
	 public ArrayList<String> getFuncionario() {
		 return funcionario;
	 }
	 
	 public void setFuncionario(ArrayList<String> funcionario) {
		 this.funcionario = funcionario;
	 }
	 
	 //login do funcionario
	 public void login() 
	 {
		 
	 }
	 
	 //checa se o funcionario tem uma conta e entra
	 public void entradaAutorizada()
	 {
		 int entrada = 0;
		 boolean autorizacao;
		 if(autorizacao = true)
		 {
			 entrada = 1;
			 
			 if (entrada == 1)
			 {	Scanner resposta = new Scanner(System.in);
				System.out.println("Deseja adicionar algo?");
				String answer = resposta.next(); 
				
				if (answer.equals("sim") || answer.equals("Sim"))
				{
					System.out.println("1- Sanduiches/n 2-Acompanhamentos/n 3- Bebidas");
					int num = resposta.nextInt();
					Funcionario funcionario = new Funcionario();
					 
					 switch (num) 
					 {
				     case 1:
				       System.out.println("Voce escolheu 01");
				      
				       funcionario.adcSanduiches();
				       break;
				     case 2:
				       System.out.println("Voce escolheu 02");
				       funcionario.adcAcompanhamentos();
				       break;
				     case 3:
				       System.out.println("Voce escolheu 03");
				       funcionario.adcBebidas();
				       break;
				     default:
				       System.out.println("Opcao invalida");
				     }
				 }
			 }
				
				else 
				{
					autorizacao = false;
					System.out.println("Nao foi possivel realizar a opera�ao.");
					
				}
			 }
		 }
	 
	 
	//funcionario pode adicionar sanduiches ao cardapio
	public void adcSanduiches()
	{
		Cardapio funcionario = new Cardapio();
		funcionario.addSanduiches(sanduiche, valor);
	}
	
	//funcionario pode adicionar acompanhamentos ao cardapio
	public void adcAcompanhamentos()
	{
		Cardapio funcionario = new Cardapio();
		funcionario.addAcompanhamento(acompanhamento, valor);(sanduiche, valor);
	}
		 
	//funcionario pode adicionar bebidas ao cardapio
	public void adcBebidas()
	{
		Cardapio funcionario = new Cardapio();
		funcionario.addBebidas(bebida, valor);(sanduiche, valor);
	}
		  
}
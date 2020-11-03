package dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import beans.Cliente;
import beans.Pagamento;

public class RepositorioPagamento implements IRepositorioPagamento ,Serializable{

	private static final long serialVersionUID = -441651136385215292L;
	private List<Pagamento> pagamentos;
	public static RepositorioPagamento instance;
	
	private  RepositorioPagamento() {
		pagamentos = new ArrayList<Pagamento>();
	}
	
	public static RepositorioPagamento getInstance() {
		if (instance == null) {
			instance = RepositorioPagamento.lerArquivo();
		}
		return instance;
	}

	@Override
	public void cadastrar(Pagamento p) {
		p.setDataVenda(LocalDate.now());
		pagamentos.add(p);
		
	}
	
	@Override
	public boolean remover(Pagamento p) {
		boolean removido = false;
		if(p !=null) {
			pagamentos.remove(p);
			removido = true;
		}
		return removido;
	}

	@Override
	public List<Pagamento> listarPorData(LocalDate d) {
		List<Pagamento> lista = new ArrayList<Pagamento>();
		for(Pagamento p: pagamentos) {
			if(p.getDataVenda().equals(d)) {
				lista.add(p);
			}
		}
		
		return lista;
	}

	@Override
	public List<Pagamento> listarPagamento() {
		return this.pagamentos;
	}	
	
	@Override
	public List<Pagamento> listarPorCliente (Cliente c) {
		List<Pagamento> lista = new ArrayList<Pagamento>();
		for(Pagamento p: pagamentos) {
			if(p.getPedido().getCliente().equals(c)) {
				lista.add(p);
			}
		}
		return lista;
	}
	
	@Override
	public void cancelarVenda(Pagamento p) {
		for(Pagamento pa: pagamentos) {
			if(pa.getPedido().getId() == p.getPedido().getId()) {
				pa.getPedido().setStatus("CANCELADO!");
			}
		}
		
	}
	
	private static RepositorioPagamento lerArquivo() {
		RepositorioPagamento instanciaLocal =  null;
		File f = new File("bancoDados" + File.separatorChar+ "pedido" +File.separatorChar+ "arqPagamentos.dat");
	    FileInputStream fis = null;
	    ObjectInputStream ois = null;
	   
	    try{
	    	
	    	fis = new FileInputStream(f);
	 	    ois = new ObjectInputStream(fis);
	 	    Object o = ois.readObject();
	 	    instanciaLocal = (RepositorioPagamento) o;
	 	    
	      }
	      catch(Exception e){
	    	  
	        
	    	  instanciaLocal = new RepositorioPagamento();
	        
	      }
	      finally{
	        if(ois!=null){
	            try{
	              ois.close();
	            }
	            catch(IOException e){
	              System.out.println("Nao foi possivel fechar o arquivo");
	              e.printStackTrace();
	            }
	        }
	      }

	    return instanciaLocal;
	}
	

	@Override
	public void salvar() {
		if(instance == null){
			return;
		}
		     
		File f = new File("bancoDados" + File.separatorChar+ "pedido" +File.separatorChar+ "arqPagamentos.dat");
	    FileOutputStream fos = null;
	    ObjectOutputStream oos = null;
	    try{
	    	 if(!f.exists()) {
	    		 f.createNewFile();
	    	 }
	    	 fos = new FileOutputStream(f);
			 oos = new ObjectOutputStream(fos);
			 
			 oos.writeObject(instance);   
	    }catch(Exception e){
	    	e.printStackTrace();
	    }finally{
	        if(oos!=null){
	          
	          try{
	              oos.close();
	          }catch(IOException e){
	        	  System.out.println("Nao foi possivel fechar o arquivo.");
	        	  e.printStackTrace();
	          }
	        }
	    }
	}

	
	
	

}
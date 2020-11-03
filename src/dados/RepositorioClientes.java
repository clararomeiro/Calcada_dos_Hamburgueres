package dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import beans.Cliente;
import exceptions.ClienteException;

public class RepositorioClientes implements IRepositorioClientes, Serializable {

	private static final long serialVersionUID = -3074684968182040865L;
	private static RepositorioClientes instance;
	private List<Cliente> clientes;

	private RepositorioClientes() {
		clientes =  new ArrayList<Cliente>();
	}
	
	@Override
	public List<Cliente> listar() {
		return this.clientes;
	}
	
	private static RepositorioClientes lerArquivo() {
		RepositorioClientes instanciaLocal =  null;
		File f = new File("bancoDados" + File.separatorChar + "pessoas" +File.separatorChar+ "arqClientes.dat");
	    FileInputStream fis = null;
	    ObjectInputStream ois = null;
  
	    try{
	    	
	    	fis = new FileInputStream(f);
	 	    ois = new ObjectInputStream(fis);
	 	    Object o = ois.readObject();
	 	    instanciaLocal = (RepositorioClientes) o;
	 	    
	      }
	      catch(Exception e){
	    	  
	        
	    	  instanciaLocal = new RepositorioClientes();
	        
	      }
	      finally{
	        if(ois!=null){
	            try{
	              ois.close();
	            }
	            catch(IOException e){
	              System.out.println("Nao foi possivel fechar o arquivo!");
	              e.printStackTrace();
	            }
	        }
	      }


	    return instanciaLocal;
	}
	
	public static RepositorioClientes getInstance() {
		if (instance == null) {
			instance = RepositorioClientes.lerArquivo();
		}
		return instance;
	}

	@Override
	public void salvarArquivo() {
		if(instance == null){
			return;
		}
		     
		File f = new File("bancoDados" + File.separatorChar + "pessoas" +File.separatorChar+ "arqClientes.dat");
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
		

	@Override
	public void cadastrar(Cliente cliente) throws ClienteException {
    boolean temCpf = false;
		
        if(clientes.isEmpty()){
        	clientes.add(cliente);
        }else{
        	for(Cliente c: clientes) {
        		if(c.getCpf().equals(cliente.getCpf())) {
        			temCpf = true;
        		}
        		
        	}
        	
        	if(!temCpf)
        	{
        		clientes.add(cliente);
        	}
        	else 
        	{
        		ClienteException cadastrarcliente = new ClienteException("Cliente nao encontrado!");
        		throw cadastrarcliente;
        	}
        }
		
	}
	
	public Cliente selecionar(String cpf) throws ClienteException {
		Cliente resultado = null;
		
		if(cpf != null)
		{
			for (Cliente c : clientes)
			{
				if(c.getCpf().equals(cpf))
				{
					resultado = c;
				}
			}if(resultado == null){

				ClienteException selecionarcliente = new ClienteException("Cliente nao encotrado!");
				throw selecionarcliente;
			}
		}
		
		return resultado;
		
	}

	

	}

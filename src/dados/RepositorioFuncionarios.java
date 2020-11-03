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

import beans.Funcionario;
import exceptions.FuncionarioException;



public class RepositorioFuncionarios implements IRepositorioFuncionarios, Serializable {

	private static final long serialVersionUID = 1025911660485970999L;
	private List<Funcionario> funcionarios;
	public static RepositorioFuncionarios instance;

	
	private RepositorioFuncionarios() {
		funcionarios = new ArrayList<Funcionario>();		
	}
	
	@Override
	public List<Funcionario> listar(){
		 
		return this.funcionarios;
		
	}

	public static RepositorioFuncionarios getInstance() {
		if (instance == null) {
			instance = RepositorioFuncionarios.lerArquivo();
		}
			return instance;
		}
        
	
	private static RepositorioFuncionarios lerArquivo() {
		RepositorioFuncionarios instanciaLocal =  null;
		File f = new File ("bancoDados" + File.separatorChar + "pessoas" +File.separatorChar+ "arqFuncionarios.dat");
	    FileInputStream fis = null;
	    ObjectInputStream ois = null;
   
	    try{
	    	
	    	fis = new FileInputStream(f);
	 	    ois = new ObjectInputStream(fis);
	 	    Object o = ois.readObject();
	 	    instanciaLocal = (RepositorioFuncionarios) o;
	 	    
	      }
	      catch(Exception e){
	    	  
	        
	    	  instanciaLocal = new RepositorioFuncionarios();
	        
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
	
	
	
	@Override
	public void salvarArquivo() {
		if(instance == null){
			return;
		}
		     
		File f =  new File("bancoDados" + File.separatorChar + "pessoas" +File.separatorChar+ "arqFuncionarios.dat");
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
	public void cadastrar(Funcionario funcionario) throws FuncionarioException {
		 boolean temEmail = false;
		 boolean temCpf = false;
		 boolean temNome = false;
			
	        if(funcionarios.isEmpty()){
	        	funcionarios.add(funcionario);
	        }else{
	        	for(Funcionario f: funcionarios) {
	        		if(f.getCpf().equals(funcionario.getCpf())) {
	        			temEmail = true;
	        			temCpf = true;
	        			temNome = true;
	        		}
	        		
	        	}
	        	if(!temEmail && !temCpf && !temNome)
	        	{
	        		funcionarios.add(funcionario);
	        	}
	        	else
	        	{
	        		FuncionarioException cadastrarfuncionario = new FuncionarioException("Funcionario nao encontrado!");
	        		throw cadastrarfuncionario;
	        	}
	        }
			
	}
	private int retornarIndice(String cpf) {
		int indice =-1;
		for(int i =0; i< funcionarios.size(); i++) {
			if(funcionarios.get(i).getCpf().equals(cpf)) {
				indice = i;
			}
		}
		return indice;
	}	
	
}


/*

 
  
  
 */

public class SmartTV extends TV {
	
	
	
	
	public boolean conectar = true;
	public boolean desconectar = false;
    public int Conexao = 0;
	public int login = 123456;
	public int senha = 987654; 
	public int modo = 1;

	
    
    
    
    
    
	   
	   
	   
public int conectar(int login, int senha) {
	if ( login == 123456 && senha == 987654) {
		
	
	Conexao = 1;
	
}
	return Conexao;
}


public void desconectar() {
	Conexao = 0;
	
	
}

	
	 
	 public void alterarsenha( int nsenha, int nlogin) {
		 
		 if (Conexao == 1    ) {
			senha = nsenha;
			login = nlogin;
			 }
		 
		
		
			 
		 }
	 public void selecionar_modo(int nmodo) {
		 if( Conexao == 1) {
			 if (nmodo == 1 || nmodo ==2 ) {
				 modo = nmodo;
			 }
		 
		 }
	 }   
	 
	 
	 
		  
		  
	  }
		 
	 



	     
	 
	 

		
	



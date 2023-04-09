/*
O código em questão é um pequeno programa em Java que cria uma aplicação de controle remoto para duas TVs (sala e quarto) e uma TV para a varanda. O programa questiona ao usuário qual tipo de TV ele deseja instalar em cada cômodo e então oferece um menu para que o usuário possa ligar/desligar, alterar o canal e aumentar/diminuir o volume das TVs.

O programa utiliza classes como TV e SmartTV, além de um controle remoto (Controle) que é usado para executar as ações de mudança de canal e volume. Há três métodos principais: menuSala(), menuQuarto() e menuVaranda(), que implementam os menus para cada TV, e um método main() que gerencia a criação das TVs e do controle remoto, bem como o fluxo de interação com o usuário.




 */
import java.util.Scanner;
public class Main {
   // objetos criados fora do método main para serem acessados apartir dos métodos "menuSala", "menuQuarto", "menuVaranda"
	public static  TV sala;
	private static	TV quarto;
	private static	TV varanda;
	// Variáveis que tem a função de captar se o usuario quer instanciar TV ou SMART, e foram criadas fora do método main para serem acessadas nos métodos de menu.
	public static int salaop;
	public static int quartoop;
     public static int varandaop;
	

	
	 
	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		
		 
		

 

  // Essa parte do código se comunica com o usuario e questiona se ele quer instanciar TV ou SMART em cada comodo. 
		 
		System.out.println("Qual TV instalar na sala? 1 para: 'Smart' ou 2 para: 'TV'");
		salaop = ler.nextInt();
		if (salaop ==1) {
			 sala = new SmartTV();
			 
				
		}else { sala = new TV();
	    
		

		} 
		
		
	
		System.out.println("Qual TV instalar no quarto? 1 para: 'Smart' ou 2 para: 'TV'");
		 quartoop = ler.nextInt();
		if (quartoop ==1) {
			quarto = new SmartTV();
		}else { quarto = new TV();
	
		}
		
		System.out.println("Qual TV instalar na varanda?  1 para: 'Smart' ou 2 para: 'TV' ");
	 varandaop = ler.nextInt();
		if (varandaop ==1) {
			varanda = new SmartTV();
		}else { varanda= new TV();
		}
		
		System.out.println("");
		System.out.println("");
		
		 int op = 0;
		 
		Controle controle = new Controle();
			//controle.ControleSala(sala);
			  
		
		// Após instanciar as TVS, aqui vai questionar qual comodo ele quer acessar a TV. 
		while(op != 4  ) {
	//Essa estrutura de repetição mantém o usuario nas opções, a menos que ele queira sair e escolha 4 para encerrar o While
		System.out.println("Qual TV você deseja acessar? ");
		System.out.println("");
		System.out.println("Para acessar a TV da sala escolha    (1)");
		System.out.println("Para acessar a TV do quarto escolha  (2)");
		System.out.println("Para acessar a TV da varanda escolha (3)");
		System.out.println("Para sair escolha (4)");
		op = ler.nextInt();
		
		// O case direciona o usuário para um método que executa um menú de determinada TV. 
		switch(op) {
		case 1:  // O usuario tem opção de acessar os comandos apartir de um controle remoto: 
			System.out.println("Para acessar com controle remoto escolha 1 e para acessar diretamente na TV escolha 2:");
			
	int opc = ler.nextInt();		
	if(opc == 1) { 
		System.out.println("Controle remoto: ");
	
	controle.ControleSala();
	
	} else {
			menuSala();
		System.out.println("Para repetir as opçoes digite 2, voltar ao menú principal digite 1.");
		      int opz = ler.nextInt();
		      while (opz != 1 ) {
		    	  
		    	  menuSala();
		    	  
		    	  System.out.println("Para repetir as opçoes digite 2, voltar ao menú principal digite 1.");
		    	  opz = ler.nextInt();
		      }
		      }
		 
			break;
		
			
		case 2:
			System.out.println("Para acessar com controle remoto escolha 1 e para acessar diretamente na TV escolha 2:");
			
			int op1 = ler.nextInt();		
			if(op1 == 1) { 
				System.out.println("Controle remoto: ");
			
			controle.ControleSala();
			
			} else {
			menuQuarto();
			 
				System.out.println("Para repetir as opçoes digite 2, voltar ao menú principal digite 1.");
				      int opz = ler.nextInt();
				      while (opz != 1) {
				    	  
				    	  menuQuarto();
				    	  System.out.println("Para repetir as opçoes digite 2, voltar ao menú principal digite 1.");
				    	  opz = ler.nextInt();
				      }
			}
			
			break;
			
		case 3:
			System.out.println("Para acessar com controle remoto escolha 1 e para acessar diretamente na TV escolha 2:");
			
			int op2 = ler.nextInt();		
			if(op2 == 1) { 
				System.out.println("Controle remoto: ");
			
			controle.ControleSala();
			
			} else {
			menuVaranda();
			
				System.out.println("Para repetir as opçoes digite 2, voltar ao menú principal digite 1.");
				  int  opz = ler.nextInt();
				      while (opz  != 1) {
				    	  
				    	  menuVaranda();
				    	  System.out.println("Para repetir as opçoes digite 2, voltar ao menú principal digite 1.");
				    	  opz = ler.nextInt();
				      }
			}
			
			
			break;
			
		}
	
		
	

		} System.out.println("Programa encerrado!");
		


	
	}
	
	// 
	

 
	// Métodos do menú: Aqui executa as funções da TV prorpiamente dita. Foi criado um menú para cada cômodo.  
	
	 public static void  menuSala() {
		 Scanner ler = new Scanner(System.in);
		 System.out.println("O que deseja fazer?");
		 System.out.println("");
		 System.out.println("Para ligar ou desligar a TV escolha (1)");
		 System.out.println("");
		 System.out.println("Para controlar o volume escolha: (2)");
		 System.out.println("");
		 System.out.println("Para editar canais válidos escolha: (3)");
		 System.out.println("");
		 System.out.println("Para mudar de canal escolha: (4)");
		 System.out.println("");
		 // Caso a TV seja smart, o if vai capturar a partir da variavel que foi usada para instanciar as TVS lá no inicio e vai oferecer opções de TV SMART.
		 if ( salaop == 1) { 
			 System.out.println("Para conectar escolha 5");
			 System.out.println("Para Desconectar escolha 6");
			 System.out.println("Para alterar senha escolha 7");
			 System.out.println("Para selecionar modo escolha 8");
			 } 
	
		 int ops = ler.nextInt();
		 TV tvs;
		 switch(ops) {
		 case 1:  		sala.ligar_desligar();
		 if (sala.Power == true) {
		   System.out.println("TV Ligada!");}else{System.out.println("TV Desligada!");}
		   break;
		   
		 case 2: System.out.println("Para aumentar o volume escolha 1 e para diminuir escolha 2: ");
		 int opvol = ler.nextInt();
		 if (opvol == 1 ) {sala.aumentar_volume(); } else { sala.diminuir_volume();}
		 break;
		 
		 case 3: 
			 System.out.println("Qual destes canais válidos você deseja alterar? Escolha a posição e depois o numero do novo canal ");
			 for (int a = 0; a<5;a++) {
				 System.out.println("Canal: " + sala.canal[a] + " A Posição: " +a); 
				
			 } int p = ler.nextInt();
			   int nc = ler.nextInt();
				 sala.editar_canal(p,nc);
				 break;
				 
		 case 4: System.out.println("Insira qual canal você deseja assistir: ");
		 int opcanal = ler.nextInt();
			 sala.trocar_canal(opcanal);
			 System.out.println("Novo canal: " + sala.canal_atual);
			 break;
			 
			 // A partir do 5º case, é utilizado um if com instanceof para saber se o objeto instanciado foi TV ou Smart e executar comando de Smart.
		 case 5:  if (sala instanceof SmartTV){
	            ((SmartTV)sala).conectar(123456,987654);
	            if (((SmartTV) sala).Conexao == 1 ) { System.out.println("Conectado!");
	        }else{
	            System.out.println("Não é possivel conectar!!");
	        }		 
	           
	            
	                   
		
		 }
		 break; 
		 case 6: if (sala instanceof SmartTV) { 
			 ((SmartTV)sala).desconectar();
			 if (((SmartTV) sala).Conexao == 0 ) { System.out.println("Desconectado!");
			 
		 } 
			
		 }
		 break;
		 case 7:
			 
			 System.out.println("Digite a nova senha e em seguida o novo login: ");
			 int nsenha = ler.nextInt();
			 int nlogin = ler.nextInt();
			 if (sala instanceof SmartTV) {
				 
				 ((SmartTV)sala).alterarsenha(nsenha, nlogin);
				 System.out.println("Senha alterada com sucesso!");
			 } 
			 break; 
			 
		 case 8:  
			 System.out.println("Para escolhar o modo 1 insira (1) e para escolher o modo 2 insira (2) ");
			 int smodo = ler.nextInt();
			 if (sala instanceof SmartTV){
			 
	            ((SmartTV)sala).selecionar_modo(smodo);
	        }else{
	            System.out.println("Não foi possivel!!");
	        }
		 }
		 
		 
		 }
		
			
		
		 
		 
		
			 
		 
	 public static void menuQuarto() {
		 
		 Scanner ler = new Scanner(System.in);
		 System.out.println("O que deseja fazer?");
		 System.out.println("");
		 System.out.println("Para ligar ou desligar a TV escolha (1)");
		 System.out.println("");
		 System.out.println("Para controlar o volume escolha: (2)");
		 System.out.println("");
		 System.out.println("Para editar canais válidos escolha: (3)");
		 System.out.println("");
		 System.out.println("Para mudar de canal escolha: (4)");
		 System.out.println("");
		 if ( quartoop == 1) { 
			 System.out.println("Para conectar escolha 5");
			 System.out.println("Para Desconectar escolha 6");
			 System.out.println("Para alterar senha escolha 7");
			 System.out.println("Para selecionar modo escolha 8");
			 } 
	
		 int ops = ler.nextInt();
		 TV tvs;
		 switch(ops) {
		 case 1:  		quarto.ligar_desligar();
		 if (quarto.Power == true) {
		   System.out.println("TV Ligada!");}else{System.out.println("TV Desligada!");}
		   break;
		   
		 case 2: System.out.println("Para aumentar o volume escolha 1 e para diminuir escolha 2: ");
		 int opvol = ler.nextInt();
		 if (opvol == 1 ) {quarto.aumentar_volume(); } else { quarto.diminuir_volume();}
		 break;
		 
		 case 3: 
			 System.out.println("Qual destes canais válidos você deseja alterar? Escolha a posição e depois o numero do novo canal ");
			 for (int a = 0; a<5;a++) {
				 System.out.println("Canal: " + quarto.canal[a] + " Posição: " +a); 
				 
			 } int p = ler.nextInt();
			   int nc = ler.nextInt();
				 quarto.editar_canal(p,nc);
				 break;
				 
		 case 4: System.out.println("Insira qual canal você deseja assistir: ");
		 int opcanal = ler.nextInt();
			 quarto.trocar_canal(opcanal);
			 System.out.println("Novo canal: " + quarto.canal_atual);
			 break;
			 
		 case 5:  if (quarto instanceof SmartTV){
	            ((SmartTV)sala).conectar(123456,987654);
	            if (((SmartTV) quarto).Conexao == 1 ) { System.out.println("Conectado!");
	        }else{
	            System.out.println("Não é possivel conectar!!");
	        }		 
	           
	            
	                   
		
		 }
		 break; 
		 case 6: if (quarto instanceof SmartTV) { 
			 ((SmartTV)quarto).desconectar();
			 if (((SmartTV) quarto).Conexao == 0 ) { System.out.println("Desconectado!");
			 
		 }
			
		 }
		 break;
		 case 7:
			 
			 System.out.println("Digite a nova senha e em seguida o novo login: ");
			 int nsenha = ler.nextInt();
			 int nlogin = ler.nextInt();
			 if (quarto instanceof SmartTV) {
				 
				 ((SmartTV)quarto).alterarsenha(nsenha, nlogin);
				 System.out.println("Senha alterada com sucesso!");
			 }
			 break; 
			 
		 case 8:  
			 System.out.println("Para escolhar o modo 1 insira (1) e para escolher o modo 2 insira (2) ");
			 int smodo = ler.nextInt();
			 if (quarto instanceof SmartTV){
			 
	            ((SmartTV)quarto).selecionar_modo(smodo);
	        }else{
	            System.out.println("Não foi possivel!!");
	        }
		 }
		 
		 
		 }
		
			
		
		 
		 
		 
			
		

	 
	 public static void menuVaranda() {
		 
		 Scanner ler = new Scanner(System.in);
		 System.out.println("O que deseja fazer?");
		 System.out.println("");
		 System.out.println("Para ligar ou desligar a TV escolha (1)");
		 System.out.println("");
		 System.out.println("Para controlar o volume escolha: (2)");
		 System.out.println("");
		 System.out.println("Para editar canais válidos escolha: (3)");
		 System.out.println("");
		 System.out.println("Para mudar de canal escolha: (4)");
		 System.out.println("");
		 
		 if ( varandaop == 1) { 
		 System.out.println("Para conectar escolha 5");
		 System.out.println("Para Desconectar escolha 6");
		 System.out.println("Para alterar senha escolha 7");
		 System.out.println("Para selecionar modo escolha 8");
		 } 
		 
	
	
		 int ops = ler.nextInt();
		 //TV tvs;
		 switch(ops) {
		 case 1:  		varanda.ligar_desligar();
		 if (varanda.Power == true) {
		   System.out.println("TV Ligada!");}else{System.out.println("TV Desligada!");}
		   break;
		   
		 case 2: System.out.println("Para aumentar o volume escolha 1 e para diminuir escolha 2: ");
		 int opvol = ler.nextInt();
		 if (opvol == 1 ) {varanda.aumentar_volume(); } else { varanda.diminuir_volume();}
		 break;
		 
		 case 3: 
			 System.out.println("Qual destes canais válidos você deseja alterar? Escolha a posição e depois o numero do novo canal ");
			 for (int a = 0; a<5;a++) {
				 System.out.println("Canal: " + varanda.canal[a] + " Posição:" +a); 
			 } int p = ler.nextInt();
			   int nc = ler.nextInt();
				 varanda.editar_canal(p,nc);
				 break;
				 
		 case 4: System.out.println("Insira qual canal você deseja assistir: ");
		 int opcanal = ler.nextInt();
			 varanda.trocar_canal(opcanal);
			 System.out.println("Novo canal: " + varanda.canal_atual);
			 break;
			 
		 case 5:  if (varanda instanceof SmartTV){
	            ((SmartTV)varanda).conectar(123456,987654);
	            if (((SmartTV) varanda).Conexao == 1 ) { System.out.println("Conectado!");
	        }else{
	            System.out.println("Não é possivel conectar!!");
	        }		 
	           
	            
	                   
		
		 }
		 break; 
		 case 6: if (varanda instanceof SmartTV) { 
			 ((SmartTV)varanda).desconectar();
			 if (((SmartTV) varanda).Conexao == 0 ) { System.out.println("Desconectado!");
			 
		 }
			
		 }
		 break;
		 case 7:
			 
			 System.out.println("Digite a nova senha e em seguida o novo login: ");
			 int nsenha = ler.nextInt();
			 int nlogin = ler.nextInt();
			 if (varanda instanceof SmartTV) {
				 
				 ((SmartTV)varanda).alterarsenha(nsenha, nlogin);
				 System.out.println("Senha alterada com sucesso!");
			 }
			 break; 
			 
		 case 8:  
			 System.out.println("Para escolhar o modo 1 insira (1) e para escolher o modo 2 insira (2) ");
			 int smodo = ler.nextInt();
			 if (varanda instanceof SmartTV){
			 
	            ((SmartTV)varanda).selecionar_modo(smodo);
	        }else{
	            System.out.println("Não foi possivel!!");
	        }
		 }
		 
		 
		 }
		
			
		
		 
		 
		 
		 
		 
	 }

	

	



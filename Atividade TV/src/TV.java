	
//import java.util.HashMap;
import java.util.ArrayList;

import java.util.Scanner;
	public class  TV {
		
	Scanner ler = new Scanner(System.in);
	
	public boolean Power = true; 
	public boolean Ligar = true;
	public boolean Desligar = false;
	public int Volume = 0;
	 public static int [] canal = {1,3,5,7,11};
	 //  ArrayList<Integer> canall = new ArrayList<Integer>();
	 public int canal_atual; 


	
	public void ligar_desligar() {
		
		
		if(Power == false ) {
			Power = true;
		}else { Power = false;
		}
		 
		 
		 
	 }
	
	//Método que inclui/exclui canais. 
	public static void  editar_canal(int qual, int ncanal ) {
		
			 
			 canal [qual] = ncanal; 

	
				
			 }
		 
	//Método que troca o canal atual da TV. 	 
	public int trocar_canal(int ncanal) {
		
		 if (Power == true) {
				if (ncanal == canal[0] || ncanal == canal[1]|| ncanal == canal[2]|| ncanal == canal[3] || ncanal ==canal[4]) {
				canal_atual = ncanal;
	
	}
			
	}
		 return canal_atual; 
	}
	
	
	
	
	 
	
	
	 //Método que controla o volume da TV.
	 public void aumentar_volume () { 
		  
		 if (Power == true) {
			 if (Volume < 100) {
				 Volume++;
				 
			 }
		
		 }
	 }
	 public void diminuir_volume(){
		 if (Power == true) {
			 if(Volume>0) {
				 Volume--;
			 }
		 }
	 }
	}
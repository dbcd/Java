package edu.femxa.val;

import java.util.Scanner;

public class CalcularNumeroMayor {
	

 public static float pedirNumeroFloat(){
	 
	float num_leido=0;
	Scanner scanner= new Scanner(System.in);//Declaro un objeto scanner para leer de teclado.(entrada estandar).
	num_leido= scanner.nextFloat();//Leo del teclado y asigno el valor num_leido.
	
	return num_leido; 
}

 public static void  compararNumero (float a, float b ,float c){
		
		if ((a > b)&&(a>c))
			System.out.println("mayor es "+a);
		else if ((b > a) && (b >c)) {
			System.out.println("mayor "+b);

		} else if ((c >a) && (c > b)) {
			System.out.println("mayor "+c);

		}
		
		if((a < b)&&(a<c)){
			System.out.println("menor es "+a);
		
        }
		
		else if ((b < a) && (b <c)) {
		System.out.println("menor "+b);

	      } else if ((c <a) && (c < b)) {
	    	System.out.println("menor "+c);
	}else {
		System.out.println("Son iguales");
	}
 
}
 

	
	public static void main(String[] args) {
		
	/*	float a=0;
		float b=0;
		float c=0;
		
		
		
		 a =pedirNumeroFloat();
		 b=pedirNumeroFloat();
		 c=pedirNumeroFloat();
		 
		 compararNumero(a,b,c);
		*/
		
		float numero_leido=0;
		float numero_mayor=0;
		
		
		
		
		for(int i =0;i<10;i++){
			//inicio
	      
			System.out.println("Introducir Numeros"+ (i+1));
			  numero_leido=pedirNumeroFloat();
			
			if(numero_leido>numero_mayor){
				
				numero_mayor=numero_leido;
			}
			
			
		}//
		
		//System.out.println("Ha pedido todos ");
		System.out.println("Numero Mayor "+numero_mayor);
		
	}

}

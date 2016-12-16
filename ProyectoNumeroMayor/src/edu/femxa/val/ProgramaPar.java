package edu.femxa.val;

import java.util.Scanner;



public class ProgramaPar {
	
	public static boolean  numeroPar(int i ){
		
		if(i%2==0)
			
		return true;
		else return false;
			
		
	}
	public static int introducirNumeroInt(){
		 
		int num_leido=0;
		Scanner scanner= new Scanner(System.in);//Declaro un objeto scanner para leer de teclado.(entrada estandar).
		num_leido= scanner.nextInt();//Leo del teclado y asigno el valor num_leido.
		
		return num_leido; 
	}
	
	public static void main(String[] args) {
		
		int numeroincrementado=0;
		int mumerosdelusuario=0;
		
		mumerosdelusuario=introducirNumeroInt();
		
		for(int i =0;numeroincrementado<mumerosdelusuario;i++){
			
			  if(numeroPar(i)){ // si la función se cumple osea es true 
			 	
				  
				  
				  numeroincrementado++; //incrementa el número en 1
				System.out.println(i);// imprimo los 50 primeros números pares 
			}
			
			  
			
			
			}
			
			
		}//
	}



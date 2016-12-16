package edu.cam.femxa;

import java.util.Scanner;

/**
 * @author Administrador
 * @version 1.0
 * @created 12-dic.-2016 17:53:37
 */
public class Main {
	
	static int pedirNumero(){
		
	int num_leido=0;
	Scanner scanner= new Scanner(System.in);
	num_leido=scanner.nextInt();
	return num_leido;
	}
	
	
	/**
	 * Esta función suma dos número
	 * @param num1
	 * @param num2
	 * @return la suma de num1 y num2
	 */
	static int suma (int num1 , int num2){
		
		int resultado_Suma=0;
		
		resultado_Suma= num1+num2;
		
		return resultado_Suma;
		
	}
	
	/*public static void main(String[] args) {
		
		int num_leido=pedirNumero();
		int num_leido2=pedirNumero();
		int resultado=suma (num_leido,num_leido2);
	
		
		System.out.println(resultado);
		
	
		/*int resultado =suma(6,9);
		
		System.out.println("El resultado de la suma es :"+resultado);
		*/
	

	/*
	public static void main(String[] args) {
		
		//1.Pedir datos 
		Persona persona= PedirDatos.pedirDatosPersona();
	
		//2.Calcular datos
		
		float imc_persona=CalcularIMC.calcula(persona);
		
		//3 Mostrar Persona IMC.
		

	}*/
	
	public static void main(String[] args) {
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
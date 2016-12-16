package edu.femxa.val;

import java.util.Scanner;

public class Principal {
	
	  public static final int NUMERO_ALUMNOS=3;
	  
	
	
	 public static String pedirNombre(){
		 
			String nombre=null;
			Scanner scanner= new Scanner(System.in);//Declaro un objeto scanner para leer de teclado.(entrada estandar).
			nombre= scanner.next();//Leo del teclado y asigno el valor num_leido.
			
			return nombre; 
		}
	 
	 public static int pedirEdad(){
		 
			int edad=0;
			Scanner scanner= new Scanner(System.in);//Declaro un objeto scanner para leer de teclado.(entrada estandar).
			edad= scanner.nextInt();//Leo del teclado y asigno el valor num_leido.
			
			return edad; 
		}
	public static void main(String[] args) {
		
		int edad_metida=0;
		int edadmayor=0;
		String nombre_metido=null;
		
		
		//String nombre= null;
		//int edad=0;
		
		//Persona p =null;//declaro variable y la inicializo
		//p=new Persona("Diego",25);// si tiene memoria
		
		//Persona p2 =null;//declaro variable y la inicializo
		//p2=new Persona("Manolo",24);// si tiene memoria
		
		
		/*System.out.println("Introducir Nombre");
		nombre=pedirNombre();
		System.out.println("Introducir eDAD");
		edad=pedirEdad();*/
		Persona p=new Persona();
		Persona mayor =new Persona();
		
		
		
		
		for(int i =0;i<NUMERO_ALUMNOS;i++){
			//inicio
			System.out.println("Introducir Nombre"+ (i+1));
			nombre_metido=pedirNombre();
			p.setNombre(nombre_metido);
			
			System.out.println("Introducir Edad"+ (i+1));
			  edad_metida=pedirEdad();
			  p.setEdad(edad_metida);
			
			if(edad_metida>edadmayor){
				
				edadmayor=edad_metida;
				
				mayor.setNombre(nombre_metido);
			}
			
			
		}//
		
		System.out.println("El mayor es : "+mayor.getNombre());
		
	}

}

package PractinaNAVI;

import java.util.Scanner;

public class PrincipalPersona {
	
	static Scanner scanner = new Scanner(System.in); // Sirve para recoger texto
	// por consola
static int select = -1; // opción elegida del usuario

public static final int NUM_PERSONAS = 5;

public static void main(String[] args) {
// Array es un objeto por eso se iguala a null

// inicializo el array
Persona array_persona[] = null;

// creo el array de persona y voy creando 5 objetos de tipo persona
array_persona = new Persona[NUM_PERSONAS];
Persona persona1 = new Persona("Alex", 27);
Persona persona2 = new Persona("Manuel", 23);
Persona persona3 = new Persona("Diego", 26);
Persona persona4 = new Persona("Dante", 19);
Persona persona5 = new Persona("Cristain", 25);

array_persona[0] = persona1;
array_persona[1] = persona2;
array_persona[2] = persona3;
array_persona[3] = persona4;
array_persona[4] = persona5;
String palabra = null;

int pos=0;

// Mientras la opción elegida sea 0, preguntamos al usuario
while (select != 0) {
// Try catch para evitar que el programa termine si hay un error
try {
System.out.println("Elige opción:\n\n1.- Mostrar Lista Personas \n" +

"2.- Buscar Persona \n" + "3.- BORRAR PERSONA\n" + "0.- Salir");
// Recoger una variable por consola
select = Integer.parseInt(scanner.nextLine());

// Ejemplo de switch case en Java
switch (select) {
case 1:
mostrarPersonas(array_persona);
;
break;
case 2:

// System.out.println("AQUI VA EL METODO BUSCAR");
System.out.println("Introduce el nombre que quieres buscar");
palabra = pedirPalabra();
// verificarPalabra(array_persona,palabra);

if (verificarPalabra(array_persona, palabra) == true) {
System.out.println("La palabra " + palabra + " está ");
} else {
System.out.println("La palabra " + palabra + " NO está ");
}
break;
case 3:
// eliminamos el elemento en el indice n.

System.out.println("Introduce la posición del elemento que quieres borrar");
pedirNumero();
Persona[] arrayresultante = borrarElemento(array_persona, pos);

for (int i = 0; i < arrayresultante.length; i++)

// String array= (String)arrayresultante();

System.out.println(i + "   " + arrayresultante[i].getNombre());

System.out.println("AQUI VA EL METODO BORRAR");
break;
case 0:
System.out.println("Adios!");
break;
default:
System.out.println("Número no reconocido");
break;
}

System.out.println("\n"); // Mostrar un salto de línea en Java

} catch (Exception e) {
System.out.println("Uoop! Error!");
}
}

}

public static void mostrarPersonas(Persona array_persona[]) {

Persona persona_aux = null;
String nombre_aux = null;
int edad_aux = 0;

for (int i = 0; i < NUM_PERSONAS; i++) {

persona_aux = array_persona[i];
nombre_aux = persona_aux.getNombre();
edad_aux = persona_aux.getEdad();
System.out.println(i + "--> " + "Nombre = " + nombre_aux + "  Edad  = " + edad_aux);

}

}

private static Persona[] borrarElemento(Persona array_persona[], int pos) {

Persona[] nuevoArray = new Persona[array_persona.length - 1];
if (pos > 0) {

System.arraycopy(array_persona, 0, nuevoArray, 0, pos);
}
if (nuevoArray.length > pos) {
System.arraycopy(array_persona, pos + 1, nuevoArray, pos, nuevoArray.length - pos);
}
return nuevoArray;
}

public static String pedirPalabra() {
String palabra_introducida = null;
Scanner scanner = null;
scanner = new Scanner(System.in);
palabra_introducida = scanner.nextLine();

//System.out.println("Escribe una palabra");
return palabra_introducida;
}

public static int pedirNumero() {
int num_introducido = 0;
Scanner scanner = null;
scanner = new Scanner(System.in);
num_introducido = scanner.nextInt();

//System.out.println("Escribe una palabra");
return num_introducido;
}

public static boolean verificarPalabra(Persona array_persona[], String palabra) {
boolean palabinsert = false;
int longitud_palabra = 0;
char letra_palabra = 0;
int contador_letras = 0;

longitud_palabra = palabra.length();

for (int i = 0; i < array_persona.length; i++) {

if (array_persona[i].getNombre().length() == longitud_palabra) {


System.out.println("El nombre insertado es correcto está en la lista "+ " Su NOMBRE ES :   " +  array_persona[i].getNombre() +"<<>>"+ " Su edad:  " +array_persona[i].getEdad());

} else {

System.out.println("No esta el nombre en la lista ");
}

}

return palabinsert;
}
}
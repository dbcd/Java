package edu.femxa.val;

public class Persona {
	
	String nombre;
	//String apellido;
	//long telefono;
	int edad;
	
    public Persona(String nombre_recibido, int edad_recibida ){
    	
    	nombre=nombre_recibido;
    	//apellido=apellido_recibido;
    	//=telefono_recibido;
    	edad=edad_recibida;
	 
 
    }
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public void mostrarPersona(){
    	
    	System.out.println("  mi nombre es :" +this.nombre   + "  mi edad es " + this.edad );

    }
    
    
}

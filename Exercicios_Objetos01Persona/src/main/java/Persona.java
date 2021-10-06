package ejemplos07Objetos01Persona;

import java.io.Serializable;

public class Persona implements Serializable {
	
	/* serialVersionUID = 1L
	El tiempo de ejecución de serialización asocia con cada clase serializable 
	un número de versión, llamado serialVersionUID, que se utiliza durante la deserialización para 
	verificar que el emisor y el receptor de un objeto serializado hayan cargado clases para ese objeto 
	que son compatibles con respecto a la serialización*/
	
	private static final long serialVersionUID = 1L; 
	//atributos
	String nombre;
	int edad;

	// constructores
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona() {
		super();
	}
	// metodos get y set
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
}

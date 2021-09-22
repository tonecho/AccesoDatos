package ejemplos01Excepciones;
import java.io.Serializable;
public class Ejemplo04ExcepcionesPersona implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		//atributos
		String nombre;
		int edad;
		
		// constructores
		public Ejemplo04ExcepcionesPersona(String nombre, int edad) {
			super();
			this.nombre = nombre;
			this.edad = edad;
		}

		public Ejemplo04ExcepcionesPersona() {
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


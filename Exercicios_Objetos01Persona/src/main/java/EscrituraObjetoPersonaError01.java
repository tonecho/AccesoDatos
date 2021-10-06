package ejemplos08Objetos02Persona;

/* EXEMPLOS PARA DETALLAR DISTINTOS POSIBLES PROBLEMAS A HORA DE TRATAR CON SERIALIZACI�N
 * Neste exemplo, instanciamos unha clase persona unha �nica vez
 * pero a hora de gravar no disco (serializar) cambiamos os valore dos atributos..
 * O que pasa � que rexistra tantos obxectos persoas como lle indiquemos, neste caso 5
 * pero quedar�se cos atributos da primeira persoa para todos os casos.

 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import ejemplos07Objetos01Persona.Persona;



public class EscrituraObjetoPersonaError01 {
	public static void main(final String[] args) {
		escribirDisco(); // m�todo onde imos serializar, gardar en disco os obxectso.
		leerDisco();

	}
	// metodo para escribir objetos en un fichero en disco
	static void escribirDisco(){ //analogo a exemplos anteriores
		// creamos los objetos que nos permiten escribir en disco objetos
		FileOutputStream fs = null;
		ObjectOutputStream os = null;

		try{
			fs = new FileOutputStream("Personas01.txt");
			os = new ObjectOutputStream(fs);
			//instanciamos la clase Persona una vez fuera del bucle
			Persona p = new Persona();
			 
			for (int i= 0; i<5; i++){  //simulamos que gardamos 5 empregados
				//Persona p = new Persona(); /Instanciando para cada empleado xa funciona ben.
				//introducimos los datos por teclado
				p.setNombre(introducirDatos("Introduce el nombre del empleado: "));
				p.setEdad(Integer.parseInt(introducirDatos("Introduce la edad del empleado: ")));

				//escribimos el objeto p en el disco
				os.writeObject(p);
			}
			os.close();
		}catch(FileNotFoundException fne){
			System.out.println("Error en el fichero");
		}catch(IOException ioe){
			System.out.println("Error E/L");
		}
	}

	// metodo para escribir objetos en un fichero en disco
	static void leerDisco(){ //an�logo a exemplos anteriores.
		// creamos los objetos que nos permiten leer del disco objetos
		//abrimos el fichero de lectura 
		FileInputStream fs = null;
		ObjectInputStream os = null;

		System.out.println("Nombre \t Edad" );
		try{
			fs = new FileInputStream("Personas01.txt");
			os = new ObjectInputStream(fs);
			while(true){ // lectura del fichero mientras haya objetos
				// os debe realizar un castingal tipo original
				Persona p = (Persona)os.readObject();
				System.out.println(p.getNombre() +"\t" +p.getEdad());
			}	
		}catch(ClassNotFoundException cnf){
			System.out.println("Error la clase");
		}catch(FileNotFoundException fnfe){
			System.out.println("Error en el fichero");
		}catch(IOException ioe){
		}
	}// fin metodo leerDisco()


	// metodo para introducir datos desde el teclado
	static String introducirDatos(String mensaje){ 
		BufferedReader br = null;

		try {
			System.out.println("--------------------------------------------------------");
			System.out.print(mensaje);
			return (new BufferedReader(new InputStreamReader(System.in))).readLine();
		} catch (IOException ioe) {
			System.out.println("\nError interno en sistema de entrada/salida\n");
		}
		return "";
	} // fin del m�todo introducirDatos
}

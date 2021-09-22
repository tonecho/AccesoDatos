package ejemplos02ClaseFile;
import java.io.File;
import java.io.IOException;

/*
* Ejemplo que crea un objeto File con una ruta y un fichero inexistentes
*/
public class EjemploFile01 {

	public static void main(String[] args) throws IOException  {
		File f = new File("aaaa1.txt");
		f.createNewFile();
	
	}
}



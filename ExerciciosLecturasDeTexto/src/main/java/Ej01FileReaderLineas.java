package ejemplos04ALecturaTexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//ejemplo que lee el fichero nombres linea a linea
//LECTURA DO FICHEIRO LIÑA A LIÑA.
public class Ej01FileReaderLineas {

	public static void main(String[] args) {
	//	File f;
		
		FileReader fr;
		BufferedReader br = null;
		String separador = File.separator;
		try{
			//f = new File("Nombres.txt");
			File f = new File("C:"+separador+"workspace_ad_2022"+separador+"AccesoDatos_2022_UD1"+separador+"NUEVODIR"+separador+"Resultado_exemplo_1.txt");
			if(f.exists()){
				fr = new FileReader(f);
				br = new BufferedReader(fr);
				String nombre; // variable donde se recupera la informacion
				while((nombre = br.readLine())!= null){//Se queremos ler caracter a caracter poñemos directamente read en vez de readline
					System.out.println(nombre);  // o metodo read devolve un enteiro que representa o caracter unicode lido, ou -1 se non hai nada.
				}
			}else
				System.out.println(("El fichero no existe"));
		}catch(FileNotFoundException fn){
			System.out.println("No se encuentra el fichero");
		}catch(IOException ioe){
			System.out.println("Error de L/E");
		}finally{
			try{
				System.out.println("Fin del programa");
				br.close();
			}catch(IOException ioe){
				System.out.println("Error al cerrar el fichero");
			}
		}
	}
}

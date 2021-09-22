package ejemplos02ClaseFile;

import java.io.File;

//Ejemplo que muestra información del fichero prueba.pdf

public class EjemploFile04 {
	public static void main(final String[] args) {
		System.out.println("Información sobre el fichero\n");
		String separador= File.separator;
		/*
		 * En carpeta almaceno el path de la carpeta que quiero mirar sus subelementos
		 * File f= new File("D:" +separador+ "Ciclos Formativos" +separador
		 * +"CSDAMultiplataforma" +separador +"BBDD" +separador +"Practicas"
		 * +"alumnos.dat");
		 */
		
		File f= new File("F:" +separador+ "probasAD"+separador+"ciclosFormativos" 
				+separador +"CSDAMultiplataforma" +separador
				+"BBDD" +separador +"Practicas" +separador+"alumnos.dat");
		System.out.println("Nombre del fichero: " +f.getName());
		System.out.println("Ruta : " +f.getPath());
		System.out.println("Ruta absoluta : " +f.getAbsolutePath());
		System.out.println("Ruta anterior : " +f.getParent());
		System.out.println("Se puede escribir : " +f.canWrite());
		System.out.println("Se puede leer : " +f.canRead());
		System.out.println("Tamaño : " +f.length());
		System.out.println("Es un directorio : " +f.isDirectory());
		System.out.println("Se puede fichero : " +f.isFile());
	}
}


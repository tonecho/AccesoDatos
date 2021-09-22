package ejemplos01Excepciones;

public class Ejemplo01Excepciones {
	public static void main(final String[] args) {
		int numerador = 10, denominador = 0, cociente;
			
		try{
			//codigo que puede producir errores
			cociente = numerador/denominador;
			System.out.println("Resultado = "+cociente);
			}catch(NumberFormatException nfe){
			//tratamiento de la excepción
			}catch (ArithmeticException ae) {
			//tratamiento de la excepción
			}catch (ArrayIndexOutOfBoundsException aio) {
			//tratamiento de la excepción
			}catch (Exception e) {
			//tratamiento si se produce cualquier otra excepción
			}finally{
			//se ejecuta haya o no excepción
				System.out.println("Final");
			}
	}
}



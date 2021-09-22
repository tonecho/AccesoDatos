package ejemplos01Excepciones;

public class NumeroFueraRangoException extends Exception{

   public NumeroFueraRangoException(int i_rango, int f_rango) {
		        super("Número fuera de rango, debe introducir un nº entre "
		                + i_rango+" y "+f_rango);
		    }
	public static void main(String[] args) {
	    try {
	        int x = 10;
	        if (x < 20 || x > 100) {
	            throw new NumeroFueraRangoException(20,100);
	        }
	    } catch (NumeroFueraRangoException e) {
	        System.out.println(e.getMessage());
	    }
	}
}
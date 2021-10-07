import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class EscrituraObxectoVehiculo {
    public static void main(final String[] args) {
// creamos los objetos que nos permiten escribir
        FileOutputStream fs = null;
        ObjectOutputStream os = null;

        try {
            fs = new FileOutputStream("Vehiculos.obj");
            os = new ObjectOutputStream(fs);

            Vehiculo v = new Vehiculo()


        }
    }
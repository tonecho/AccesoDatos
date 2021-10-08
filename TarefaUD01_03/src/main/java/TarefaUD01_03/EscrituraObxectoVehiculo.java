package TarefaUD01_03;


import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class EscrituraObxectoVehiculo {
    public static void main(String[] args) throws NumberFormatException,
            IOException {
        File f = new File("Vehículos.dat");
        int opcion;
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));

        do{
            System.out.println("1.- Insertar Registros.");
            System.out.println("2.- Leer Registros.");
            System.out.println("3.- Salir.");
            System.out.println("Elegir opcion: ");
            opcion = Integer.parseInt(br.readLine());
            switch(opcion){
                case 1:
                    if(f.exists()){
                        System.out.println("Vehiculos.dat existe");
                        escrituraObjetosExisteFichero(f);
                    }else{
                        System.out.println("Vehiculos.dat no existe");
                        escrituraObjetosNuevoFichero(f);
                    }
                    break;
                case 2:
                    lecturaObjetos(f);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Error en la opcion.");
            }// fin switch
        }while(opcion != 3);

    }

    private static void escrituraObjetosNuevoFichero(File f) {
        FileOutputStream fo = null;
        ObjectOutputStream oo = null;
        try{
            fo = new FileOutputStream(f);
            oo = new ObjectOutputStream(fo);
//creo los objetos a escribir
            Vehiculo vehiculo1 = new Vehiculo("3255BCD", "Seat", "Ibiza" );
            Vehiculo vehiculo2 = new Vehiculo("4255BCD", "Renault","Megane");
            Vehiculo vehiculo3 = new Vehiculo("5255BCD", "Mercedes", "Benz");
            System.out.println("Escribiendo registros. Espere");
// escribimos en el fichero
            oo.writeObject(vehiculo1);
            oo.writeObject(vehiculo2);
            oo.writeObject(vehiculo3);
        }catch(FileNotFoundException fn){
            System.out.println("Error. Fichero no existe");
        }catch(IOException io){
            System.out.println("Error de escritura");
        }finally{
            try{
                if(fo != null){
                    fo.close();
                    oo.close();
                }
            }catch(IOException io){
                System.out.println("Error al cerrar el fichero");
            }
        }

    }


    private static void escrituraObjetosExisteFichero(File f) {
        FileOutputStream fo = null;
        MiObjectOutputStream mo = null;
        try{
            fo = new FileOutputStream(f);
            oo = new ObjectOutputStream(fo);
//creo los objetos a escribir
            Vehiculo vehiculo1 = new Vehiculo("3255BCD", "Seat", "Ibiza" );
            Vehiculo vehiculo2 = new Vehiculo("4255BCD", "Renault","Megane");
            Vehiculo vehiculo3 = new Vehiculo("5255BCD", "Mercedes", "Benz");
            System.out.println("Escribiendo registros. Espere");
// escribimos en el fichero
            mo.writeObject(vehiculo1);
            mo.writeObject(vehiculo2);
            mo.writeObject(vehiculo3);
        }catch(FileNotFoundException fn){
            System.out.println("Error. Fichero no existe");
        }catch(IOException io){
            System.out.println("Error de escritura");
        }finally{
            try{
                if(fo != null){
                    fo.close();
                    mo.close();
                }
            }catch(IOException io){
                System.out.println("Error al cerrar el fichero");
            }
        }

    }


    private static void lecturaObjetos(File f) {


    }


    }

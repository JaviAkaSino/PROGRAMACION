package introduccion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        /*2.- Implementa un programa que vaya escribiendo líneas de texto en un 
        archivo. El archivo se llamará “teclado.txt” y se creará en la raíz del 
        proyecto. El programa irá solicitando líneas de texto al usuario (cada 
        línea termina con un salto de línea , ‘\n’) y las irá escribiendo en el 
        fichero. Cuando en una nueva línea el usuario introduzca el texto “EOF”, 
        el programa terminará y esa línea no se escribirá en el fichero. 
        Controla las posibles excepciones que pudieran ocurrir.*/
        //
        //
        //Fichero a crear
        String idFichero = "teclado.txt";
        Scanner sc = new Scanner(System.in);
        String linea;
        //Try-Catch with resources
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {

            do {

                linea = sc.next();

                if (!linea.equals("EOF")) {

                    flujo.write(linea);

                    flujo.newLine();

                    System.out.println(linea);

                }

            } while (!linea.equals("EOF"));

            // Metodo flush() guarda cambios en disco 
            flujo.flush();

        } catch (IOException ioe) {

            System.out.println(ioe.getMessage());
        }

    }
}

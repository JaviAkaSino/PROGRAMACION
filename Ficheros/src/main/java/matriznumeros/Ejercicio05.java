package matriznumeros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author JaviA
 */
public class Ejercicio05 {

    public static void main(String[] args) {

        /*5.- Implementa un programa para leer los datos del fichero del 
        ejercicio 1. El programa, al finalizar de leer la matriz debe mostrar 
        la suma de todos los valores.*/
        // Fichero a leer
        String idFichero = "matriz.txt";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new FileReader(idFichero))) {

            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine(); //Se lee la línea
                System.out.println(linea); // Se imprime en pantalla
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // El mismo ejemplo pero separando cada elemento
        // leído usando el método split() de la clase String */
        int total = 0;

        try (Scanner datosFichero = new Scanner(new FileReader(idFichero))) {

            System.out.println("Suma de todos los valores");

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                // Se suma cada elemento de la línea en función del carácter separador tab
                tokens = linea.split("\t");

                for (String numero : tokens) {

                    total += Integer.valueOf(numero);
                }
            }

            System.out.println(total);

        } catch (FileNotFoundException e) {

            System.out.println(e.getMessage());
        }

    }

}

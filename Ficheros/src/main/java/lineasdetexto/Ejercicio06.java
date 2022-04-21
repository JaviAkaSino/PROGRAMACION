package lineasdetexto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author javiakasino
 */
public class Ejercicio06 {

    public static void main(String[] args) {

        /*6.- Implementa un programa que lea el fichero del ejercicio 3 y 
        muestre el contenido del fichero. Además buscará la primera ocurrencia,
        en cada línea, de las letras seguidas ‘w’, ‘e’, ‘b’, informando de la 
        posición que ocupan en la línea, si es que existe esa ocurrencia.*/
        // Fichero a leer
        String idFichero = "letrasRandom.txt";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        int numeroLinea = 1;

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new FileReader(idFichero))) {

            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine(); //Se lee la línea
                System.out.println(numeroLinea + " - " + linea); // Se imprime en pantalla

                tokens = linea.split(";"); //Teniendo en cuenta el separador

                for (int i = 0; i < tokens.length; i++) {

                    if (tokens[i].equals("w") && tokens[i + 1].equals("e") && tokens[i + 2].equals("b")) {

                        System.out.println("Están en la línea "+ numeroLinea + " en la posición: " + i + ", " + (i + 1) + ", " + (i + 2) + ", ");

                    }

                }
                
                numeroLinea++;
            }
            
           

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}

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
        String linea = "";
        int numeroLinea = 1;
        int lineaOcurrencia = 0;
        boolean condicion = linea.contains("w;e;b;");

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new FileReader(idFichero))) {

            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine(); //Se lee la línea
                System.out.println(numeroLinea + " - " + linea); // Se imprime en pantalla
                
                
                tokens = linea.split(";"); //Teniendo en cuenta el separador

                if (linea.contains("w;e;b;")){ 
                    
                    System.out.println("La secuencia 'w', 'e', 'b' aparece"
                            + "en la línea " + numeroLinea);
                    
                    
                    int letrab = linea.indexOf("b", linea.indexOf("w"));
                    
                    System.out.println(letrab);
                    
                    int indice = linea.indexOf("w;e;b;");
                    
                    System.out.println(indice);
                    
                    
                }
                
                numeroLinea++;
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }
    
}

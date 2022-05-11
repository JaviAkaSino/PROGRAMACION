package examen2021;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author JaviA
 */
public class LecturaCSV {
    
     public static Map<String, String> mapModulos(String ruta) {

        Map<String, String> mapModulos = new TreeMap<>(); //Declaramos el map a devolver
        String[] tokens; //Se guardarán los datos separados
        String linea; //Donde se guardará cada línea

        try (Scanner datosFichero = new Scanner(new FileReader(ruta))) {

            linea = datosFichero.nextLine(); //Salta la priemra línea

            while (datosFichero.hasNextLine()) { // Mientras haya líneas por leer

                linea = datosFichero.nextLine();

                tokens = linea.split(";"); //Crea el tokens, separando los datos en base al ;

                mapModulos.put(tokens[0], tokens[1]); //Introduce el dato en el 

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return mapModulos;
    }
    
}

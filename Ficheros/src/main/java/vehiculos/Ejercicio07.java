package vehiculos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author javiakasino
 */
public class Ejercicio07 {

    public static void main(String[] args) {

        /* Realiza un programa que lea los datos del ejercicio 4. Para ello 
         creará una lista de objetos de tipo Vehículo. El programa irá 
         almacenando en la lista los objetos leídos desde el archivo de texto 
         “vehículos.txt”. Una vez cargados todos los datos en la lista, ordena 
         los vehículos por Marca y muestra el resultado por consola.*/
        
        ArrayList<Vehiculo> lista = new ArrayList<>();
        String idFichero = "vehiculos.txt";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new FileReader(idFichero))) {

            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine(); //Se lee la línea
                
                tokens = linea.substring(4).split(";"); //Teniendo en cuenta el separador quitando los 4 primeros caracteres
                
               
                
                switch (linea.charAt(0)) {
                //Es un Turismo (8 atributos)
                    case '0':
                        
                        lista.add(new Turismo(Integer.valueOf(tokens[6]),Boolean.valueOf(tokens[7]),Long.valueOf(tokens[0]), tokens[1],tokens[2],tokens[3],tokens[4],Double.valueOf(tokens[5])));
                        
                        break;
                //Es un Deportivo (7 atributos)
                    case '1':
                        
                        lista.add(new Deportivo(Integer.valueOf(tokens[6]),Long.valueOf(tokens[0]), tokens[1],tokens[2],tokens[3],tokens[4],Double.valueOf(tokens[5])));
                        
                        break;
                //Es una furgoneta (8 atributos)
                    default:
                        
                        lista.add(new Furgoneta(Double.valueOf(tokens[6]),Double.valueOf(tokens[7]),Long.valueOf(tokens[0]), tokens[1],tokens[2],tokens[3],tokens[4],Double.valueOf(tokens[5])));
                        
                        break;
                }
                
                

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Comparator<Vehiculo> ordenaPorMarca = (v1, v2) -> v1.getMarca().compareTo(v2.getMarca());
        Collections.sort(lista, ordenaPorMarca);
        
        System.out.println(lista);
        
        
    }

}

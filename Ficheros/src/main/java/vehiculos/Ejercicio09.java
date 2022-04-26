package vehiculos;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author javiakasino
 */
public class Ejercicio09 {

    public static void main(String[] args) {

        /*9.- Realiza una modificación sobre el programa del ejercicio 7 para 
        que divida la única lista de objetos Vehiculo en tres listas específicas
        de objetos Turismo, Deportivo y Furgoneta. */

        
        ArrayList<Turismo> listaTurismos = new ArrayList<>();
        ArrayList<Deportivo> listaDeportivos = new ArrayList<>();
        ArrayList<Furgoneta> listaFurgonetas = new ArrayList<>();
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
                
                tokens = linea.substring(4).split(":"); //Teniendo en cuenta el separador quitando los 4 primeros caracteres
                
               
                
                switch (linea.charAt(0)) {
                //Es un Turismo (8 atributos)
                    case '0':
                        
                        listaTurismos.add(new Turismo(Integer.valueOf(tokens[6]),Boolean.valueOf(tokens[7]),Long.valueOf(tokens[0]), tokens[1],tokens[2],tokens[3],tokens[4],Double.valueOf(tokens[5])));
                        
                        break;
                //Es un Deportivo (7 atributos)
                    case '1':
                        
                        listaDeportivos.add(new Deportivo(Integer.valueOf(tokens[6]),Long.valueOf(tokens[0]), tokens[1],tokens[2],tokens[3],tokens[4],Double.valueOf(tokens[5])));
                        
                        break;
                //Es una furgoneta (8 atributos)
                    default:
                        
                        listaFurgonetas.add(new Furgoneta(Double.valueOf(tokens[6]),Double.valueOf(tokens[7]),Long.valueOf(tokens[0]), tokens[1],tokens[2],tokens[3],tokens[4],Double.valueOf(tokens[5])));
                        
                        break;
                }
                
                

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Comparator<Vehiculo> ordenaPorMarca = (v1, v2) -> v1.getMarca().compareTo(v2.getMarca());
        
        Collections.sort(listaTurismos, ordenaPorMarca);
        
        System.out.println(listaTurismos);

        
        Collections.sort(listaDeportivos, ordenaPorMarca);
        
        System.out.println(listaDeportivos);
        
        
        Collections.sort(listaFurgonetas, ordenaPorMarca);
        
        System.out.println(listaFurgonetas);
        
        
        /*Una vez generadas las tres listas, guarda en tres ficheros CSV (*.csv) 
        los vehículos correspondientes a cada lista, separando cada campo usando
        el carácter delimitador punto y coma (;). Abre los ficheros CSV usando
        un programa de hoja de cálculo, indicando que la separación de campos se 
        realiza usando ;, y comprueba que cada campo se encuentra en una columna 
        diferente.*/
        
        String idFicheroT = "turismos.csv";
        String idFicheroD = "deportivos.csv";
        String idFicheroF = "furgonetas.csv";
        
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFicheroT))) {

            for (Turismo t : listaTurismos){

                flujo.write(t.toString());
                
                flujo.newLine();
            }

            // Metodo flush() guarda cambios en disco 
            flujo.flush();

        } catch (IOException ioe) {

            System.out.println(ioe.getMessage());
        }
        
        
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFicheroD))) {

            for (Deportivo d : listaDeportivos){

                flujo.write(d.toString());
                
                flujo.newLine();
            }

            // Metodo flush() guarda cambios en disco 
            flujo.flush();

        } catch (IOException ioe) {

            System.out.println(ioe.getMessage());
        }
        
        
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFicheroF))) {

            for (Furgoneta f : listaFurgonetas){

                flujo.write(f.toString());
                
                flujo.newLine();
            }

            // Metodo flush() guarda cambios en disco 
            flujo.flush();

        } catch (IOException ioe) {

            System.out.println(ioe.getMessage());
        }
        
        
    }

    
    
    
}

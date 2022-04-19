package vehiculos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author javiakasino
 */
public class Ejercicio04 {

    public static void main(String[] args) {

/*4.- Usando la clase Vehículo, implementa un programa que realice lo 
siguiente:
        
    Crea 30 vehículos (10 Turismos, 10 Deportivos y 10 Furgonetas) con valores 
        de tu elección y guárdalos en una lista de objetos tipo Vehiculo.*/


        ArrayList<Vehiculo> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            
            lista.add(new Turismo());
        }

        for (int i = 0; i < 10; i++) {
            
            lista.add(new Deportivo());
        }
        
        for (int i = 0; i < 10; i++) {
            
            lista.add(new Furgoneta());
        }

        
    /*Guarda los vehículos en un fichero de texto llamado “vehículos.txt”, haciendo 
        uso del método polimórfico toString(), teniendo en cuenta que el string 
        devuelto lleve separados los campos del objeto por el carácter dos 
        puntos (:).*/
        
        String idFichero = "vehiculos.txt";
        
        
         try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {

            for (Vehiculo v : lista){
                
                
                if (v instanceof Turismo){
                    
                    flujo.write("0");
                    
                } else if (v instanceof Deportivo){
                    
                    flujo.write("1");
                    
                } else if (v instanceof Furgoneta){
                    
                    flujo.write("2");
                    
                }
                
                flujo.write(" - " + v);
                
                flujo.newLine();
            }

            // Metodo flush() guarda cambios en disco 
            flujo.flush();

        } catch (IOException ioe) {

            System.out.println(ioe.getMessage());
        }
        
    /*Cada línea del fichero estará compuesta por un número, un espacio, un guión,
        un espacio y los datos del vehículo en cuestión. El número de cada línea
        será 0, 1 o 2 si el objeto es un Turismo, un Deportivo o una Furgoneta, 
        respectivamente. */
        
    /*Cada vehículo irá en una línea distinta del fichero.
    Ejemplos de líneas, los campos no tienen porqué coincidir con los de tus clases:
 
        0 – 4534JTK:Seat:Ibiza:Blanco:… (Este vehículo sería un Turismo)
        1 – 3322FFF:Ford:Kuga:Rojo:… (Este vehículo sería un Deportivo)*/



    }

}

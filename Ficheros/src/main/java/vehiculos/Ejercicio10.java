package vehiculos;

import java.io.IOException;
import java.util.ArrayList;
import metodos.Lectura;

/**
 *
 * @author JaviA
 */
public class Ejercicio10 {

    public static void main(String[] args) throws IOException {

        /*10.- Implementa un programa para leer los ficheros de texto del 
        ejercicio anterior, de forma que se guarden en una única lista de 
        Vehículos los objetos leídos de cada fichero. El programa debe realizar 
        lo siguiente:*/
        
        
        
        //Copiar los tres ficheros *.csv a un directorio previamente creado en “./copias”.

        metodos.Directorios.crearDirectorio("./copias");
        
        metodos.Directorios.copiarArchivos("turismos.csv", "./copias/turismos.csv");
        metodos.Directorios.copiarArchivos("deportivos.csv", "./copias/deportivos.csv");
        metodos.Directorios.copiarArchivos("furgonetas.csv", "./copias/furgonetas.csv");
        
        //Mostrar los ficheros contenidos en “copias”.
        
        metodos.Directorios.mostrarFicheros("./copias");
        
        //Leer los ficheros de la carpeta “copias” e ir guardando los objetos en una lista de vehículos.
        
        ArrayList<String> aux = metodos.Lectura.leerFicherosCarpeta("./copias");
        
        
        //Imprimir la lista por pantalla.


        Lectura.leerFicheroTurismos("./copias/turismos.csv");
        
        //Ordena la lista por bastidor.
        
        
        
        //Imprimir la lista ordenada.
        
        
        
        //Borrar los ficheros *.csv originales.
        
        
        
        //Mostrar el contenido de la carpeta donde estaban los *.csv originales.
        
        metodos.Directorios.mostrarFicheros("./");
        



    }
    
}

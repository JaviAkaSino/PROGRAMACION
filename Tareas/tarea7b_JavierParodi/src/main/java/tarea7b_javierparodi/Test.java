package tarea7b_javierparodi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author javiakasino
 */
public class Test {

    public static void main(String[] args) {
        
    //En el método main() de una clase de prueba realiza lo siguiente:
    
    /*Crea 50 aplicaciones usando el constructor por defecto, guárdalas en una 
    lista y muéstralas por pantalla
    .*/ 
    ArrayList<App> lista = new ArrayList<>();
    
        for (int i = 0; i < 50; i++) {
            
            lista.add(new App());
            
        }
        
        for (App a : lista) {
            
            System.out.println(a);
        }
    
    /*Guarda los datos de todas las App de la lista, en un fichero de texto 
    llamado aplicacionestxt.txt, dentro del directorio “./appstxt”.*/
    
        metodos.Directorios.crearDirectorio("./appstxt");

        metodos.Escritura.escribirListaTxt(lista, "./appstxt/aplicacionestxt.txt");
    
    /*Guarda los datos de todas las App de la lista, en un fichero XML llamado 
    aplicacionesxml.xml, dentro del directorio “./appsxml”.*/
    
    
    
    /*Guarda los datos de todas las App de la lista, en un fichero JSON llamado 
    aplicacionesxml.json, dentro del directorio “./appsjson”.*/
    
    
    
    /*Crea una carpeta “./copias” y realiza una copia de los ficheros anteriores 
    dentro de ella.*/
    
    
    
    /*En una carpeta “./aplicaciones” crea un archivo de texto por cada aplicación
    que haya en la lista. El archivo se llamará igual que la app y contendrá 
    los datos de la aplicación, separando los campos por el carácter (;).*/
    
    
    
        
    }
}

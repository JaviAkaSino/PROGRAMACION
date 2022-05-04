/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import tarea7b_javierparodi.App;

/**
 *
 * @author JaviA
 */
public class Escritura {

    //Escribe un txt con los toString de una lista de App dada en la ruta indicada
    public static void escribirListaTxt(ArrayList<App> lista, String idFichero){
        
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {

            for (App a : lista) { //Recorre toda la lista
                
                flujo.write(a.toString()); //Y escribe los datos de los objetos
                
                flujo.newLine();        
                
            }
            
            flujo.flush(); //Guarda cambios en disco

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    
        
    }
    
    
    
}

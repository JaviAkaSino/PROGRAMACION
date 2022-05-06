/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea7c_javierparodi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author JaviA
 */
public class Escritura {
    
    //Guarda los objetos de la lista en un archivo Json
    public static void escribirJson(List lista, String nombreArchivo) throws IOException{
        
        ObjectMapper mapeador = new ObjectMapper();

        // Formato JSON bien formateado. Si se comenta, el fichero queda minificado
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        // Escribe en un fichero JSON la lista
        mapeador.writeValue(new File(nombreArchivo), lista);
    }
    
    
    public static void escribirListaCsv(List lista, String nombreArchivo) {

        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(nombreArchivo))) {

            for (Object a : lista) { //Recorre toda la lista

                flujo.write(a.toString()); //Y escribe los datos de los objetos

                flujo.newLine();

            }

            flujo.flush(); //Guarda cambios en disco

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    
    }   
}

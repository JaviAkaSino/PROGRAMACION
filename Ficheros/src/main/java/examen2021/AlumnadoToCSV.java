/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2021;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

/**
 *
 * @author JaviA
 */
public class AlumnadoToCSV {
    
    public static void alumnoTSV(Alumnado a, Map<String, String> m){
        
        crearDirectorio("./alumnado");
        
        String ruta = "./alumnado/" + a.getNombre().replace(" ", "") + ".tsv";
        
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(ruta))) {

            
            
            for (String s1 : a.getModulos().keySet()) { //Recorre toda la lista

                for (String s2 : m.keySet()) {
                    
                    if (s1.equals(s2)){
                        
                        flujo.write(m.get(s2) + "\t" + a.getModulos().get(s1));
                    }
                    
                }

                flujo.newLine();

            }

            flujo.flush(); //Guarda cambios en disco

            System.out.println("Archivo creado correctamente");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
        public static void crearDirectorio(String ruta) {

        Path directorio = Paths.get(ruta);

        try {
            if (!Files.exists(directorio)) {
                Files.createDirectory(directorio);
                System.out.println("Se ha creado el directorio");
            }
        } catch (AccessDeniedException ade) {
            System.out.println("Acceso denegado");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}

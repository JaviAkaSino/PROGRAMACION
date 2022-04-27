/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.io.File;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author JaviA
 */
public class Directorios {

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

    public static void copiarArchivos(String origen, String destino) {

        Path origenPath = Paths.get(origen);
        Path destinoPath = Paths.get(destino);

        try {
            Files.copy(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Se han copiado los archivos");
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void mostrarFicheros(String directorio) {

        System.out.println("Ficheros contenidos en \"" + directorio + "\"");

        try {

            File carpeta = new File(directorio);

            for (String s : carpeta.list()) {

                System.out.println(s);
            }
            
        } catch (NullPointerException npe) {

            System.out.println(npe.getMessage());
        }

    }
    
    
    public static void borrarFichero(String ruta){
        Path fichero = Paths.get(ruta);

        if(Files.exists(fichero)){
            
            try {
                Files.delete(fichero);
                System.out.println("Se ha borrado el fichero " + ruta);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    
    
}

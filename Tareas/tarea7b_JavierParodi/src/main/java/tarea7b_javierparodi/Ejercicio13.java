/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea7b_javierparodi;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author JaviA
 */
public class Ejercicio13 {


    public static void main(String[] args)
    {

        /* En un programa Java, procede a leer el fichero JSON generado en el 
        ejercicio 11 y muestra el resultado por pantalla.*/
        
        ArrayList<App> apps = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();

        try {
            apps.addAll(mapeador.readValue(new File("./appsjson/aplicacionesjson.json"),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, App.class)));
            
            for (App app : apps) {
                System.out.println(app);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

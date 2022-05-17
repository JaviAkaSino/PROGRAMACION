/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author JaviA
 */
public class LecturaJSON {


    public static void main(String[] args)
    {

        /* En un programa Java, procede a leer el fichero JSON generado en el 
        ejercicio 11 y muestra el resultado por pantalla.*/

        
        ArrayList<Registro> registros = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();
         mapeador.registerModule(new JavaTimeModule());

        try {
            registros.addAll(mapeador.readValue(new File("precipitacionesBadajoz.json"),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, Registro.class)));
            
            for (Registro r : registros) {
                System.out.println(r);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}

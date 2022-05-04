/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea7b_javierparodi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author JaviA
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     * @throws javax.xml.bind.JAXBException
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws JAXBException,
            FileNotFoundException {

        /*En un programa Java, procede a leer el fichero XML generado en el 
        ejercicio anterior y muestra el resultado por pantalla. */
        
        
        // Crea el contexto JAXB 
        JAXBContext contexto = JAXBContext.newInstance(ListaApps.class);
        // Crea el objeto Unmarshaller
        Unmarshaller um = contexto.createUnmarshaller();

        // Llama al método de unmarshalling
        ListaApps aplicaciones = (ListaApps) um.unmarshal(new File("./appsxml/aplicacionesxml.xml"));

        ArrayList<App> lista_aplicaciones = aplicaciones.getListaAplicaciones();

        lista_aplicaciones.forEach(System.out::println);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author javiakasino
 */
public class LecturaCSV {
    
    public static List<Estadistica> lectura(String ruta){
        List<Estadistica> lista = new ArrayList<>();
        
        // Variables para guardar los datos que se van leyendo
        String linea;
        String[] tokens;

        try (Scanner datosFichero = new Scanner(new FileReader(ruta))) {

            datosFichero.nextLine(); //Se salta la cabecera
            
            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {

                //Lee linea sustituyendo las comas por puntos para los double
                linea = datosFichero.nextLine().replaceAll(",", "."); //Se lee la línea

                tokens = linea.split(";"); //Crea el tokens
                
                lista.add(crearEstadistica(tokens)); //Añade el objeto
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        return lista;
        
    }

    private static Estadistica crearEstadistica(String[] tokens) {
        
        Estadistica e = new Estadistica();
        
        e.setCodigoPostal(tokens[0]);
        e.setMunicipio(tokens[1]);
        e.setP2016(Double.parseDouble(tokens[2]));
        e.setP2015(Double.parseDouble(tokens[3]));
        e.setP2014(Double.parseDouble(tokens[4]));
        e.setP2013(Double.parseDouble(tokens[5]));
        e.setP2011(Double.parseDouble(tokens[6]));
        e.setP2010(Double.parseDouble(tokens[7]));
        e.setP2006(Double.parseDouble(tokens[8]));
        e.setP2001(Double.parseDouble(tokens[9]));
        e.setP1996(Double.parseDouble(tokens[10]));
        
        
        return e;
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import ejercicio2.Estadistica;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author javiakasino
 */
public class Lectura {
    
    public static String[][] lectura(String ruta){
        List<Estadistica> lista = new ArrayList<>();
        
        // Variables para guardar los datos que se van leyendo
        String linea;
        String[] tokens;
        String[][] matriz = new String[5][5];
        int i = 0;

        try (Scanner datosFichero = new Scanner(new FileReader(ruta))) {

            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {

                //Lee linea sustituyendo las comas por puntos para los double
                linea = datosFichero.nextLine();

                tokens = linea.split(" "); //Crea el tokens
                
                matriz[i] = tokens; //Añade la linea a la matriz
                
                i++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        return matriz;
        
    }
    
}

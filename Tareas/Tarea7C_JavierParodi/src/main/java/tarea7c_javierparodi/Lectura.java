/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea7c_javierparodi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JaviA
 */
public class Lectura {


    public static ArrayList<HoraClase> listarFicheroHorario(String ruta) {

        ArrayList<HoraClase> lista = new ArrayList<>();
        String[] tokens;

        // Variables para guardar los datos que se van leyendo
        String linea;

        try (Scanner datosFichero = new Scanner(new FileReader(ruta))) {

            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine().replace("\"", "").replace(" ", "");

                tokens = linea.split(";"); //Crea el tokens

                lista.add(crearHoraClase(tokens)); //Crea el Turismo y lo añade

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public static HoraClase crearHoraClase(String[] tokens) {

        HoraClase hc = new HoraClase();

        //El tokens[0] se ignora ya que es el numero de linea
        hc.setCurso(tokens[1]);
        hc.setInicialesProfesor(tokens[2]);
        hc.setAsignatura(tokens[3]);
        hc.setAula(tokens[4]);
        hc.setDiaSemana(Integer.valueOf(tokens[5]));
        hc.setHoraDia(Integer.valueOf(tokens[6]));

        return hc;
    }

}

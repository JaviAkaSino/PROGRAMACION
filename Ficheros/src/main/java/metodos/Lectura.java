/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import vehiculos.Turismo;

/**
 *
 * @author JaviA
 */
public class Lectura {

    public static ArrayList<String> leerFichero(String ruta) {

        ArrayList<String> lista = new ArrayList<>();

        // Variables para guardar los datos que se van leyendo
        String linea;

        try (Scanner datosFichero = new Scanner(new FileReader(ruta))) {

            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine(); //Se lee la línea

                lista.add(linea);
                
                System.out.println(linea);

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);

        }
        
        return lista;
    }
    
    
    public static ArrayList<Turismo> leerFicheroTurismos(String ruta) {

        ArrayList<Turismo> lista = new ArrayList<>();
        String[] tokens;

        // Variables para guardar los datos que se van leyendo
        String linea;

        try (Scanner datosFichero = new Scanner(new FileReader(ruta))) {

            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                
                linea = datosFichero.nextLine();
                
                tokens = linea.split(";"); //Crea el tokens
                
                lista.add(crearTurismo(tokens)); //Crea el Turismo y lo añade
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }
    
    public static Turismo crearTurismo(String[] tokens){
       
        Turismo t = new Turismo();
        
        t.setBastidor(Long.valueOf(tokens[0]));
        t.setMatricula(tokens[1]);
        t.setMarca(tokens[2]);
        t.setModelo(tokens[3]);
        t.setColor(tokens[4]);
        t.setTarifa(Double.valueOf(tokens[5]));
        t.setNumeroPuertas(Integer.valueOf(tokens[6]));
        t.setMarchaAutomatica(Boolean.valueOf(tokens[7]));
        
        return t;
    }
    
    
    
     public static ArrayList<String[]> listaFichero(String ruta, String separador) {

        ArrayList<String[]> lista = new ArrayList<>();

        // Variables para guardar los datos que se van leyendo
        String linea;

        try (Scanner datosFichero = new Scanner(new FileReader(ruta))) {

            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine(); //Se lee la línea
                
                lista.add(linea.split(separador));
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        return lista;
    }

     
     
     
     
    public static ArrayList<String> leerFicherosCarpeta(String directorio) {

        ArrayList<String> lista = new ArrayList<>();
        String[] tokens;
        System.out.println("Ficheros contenidos en \"" + directorio + "\"\n");

        try {

            File carpeta = new File(directorio);

            for (File f : carpeta.listFiles()) { //Recorre los archivos

                System.out.println("\n" + f.getName() + ": "); //imprime su nombre

                ArrayList<String> aux = leerFichero(f.getAbsolutePath()); //Saca la lista de lineas
                
                for (String s : aux) { //Añade los elementos de cada lista
                    
                    tokens = s.split(";");
                    
                    lista.add(s); //A la lista final
                }
            }

        } catch (NullPointerException npe) {

            System.out.println(npe.getMessage());
        }

        return lista;
    }

    
    
    
    
    
    
    
    
    public static void leerFicheroListar(String ruta, String separador) throws IOException {

      
        Turismo v;

        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(ruta))){

            while(entrada.available() > 1){
               v = (Turismo) entrada.readObject(); 
                System.out.println(v);
            }
            

            
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getException());
        } 
        
        
//        ArrayList<Object> lista = new ArrayList<>();
//
//        // Variables para guardar los datos que se van leyendo
//        String[] tokens;
//        String linea;
//
//        try (Scanner datosFichero = new Scanner(new FileReader(ruta))) {
//
//            // Mientras haya líneas por leer
//            while (datosFichero.hasNextLine()) {
//
//                linea = datosFichero.nextLine(); //Se lee la línea
//
//                tokens = linea.split(separador); //Teniendo en cuenta el separador 
//
//                Object aux = ois.readObject();
//
//                lista.add(aux);
//
//                System.out.println(aux);
//
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
//
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author javiakasino
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Estadistica> lista = LecturaCSV.lectura("indicator.csv"); 
        
        for (Estadistica e : lista) {
            
            System.out.println(e);
            
        }
        
        //Filtra
        List<Estadistica> lista2 = lista.stream()
                .filter(e-> e.getPromedio()>50) //Mayores de 50%
                .collect(Collectors.toList());
        
        //Genera el csv
        generarCSV(lista2);

        //Crea carpeta municipios
        crearDirectorio("municipios");
        
        
        //Lista de nombres que empiezan por b
        List<String> listaNombres = lista.stream()
                .map(e->e.getMunicipio())
                .filter(s->s.startsWith("B"))
                .collect(Collectors.toList());
        
        carpetasMunicipios(listaNombres); //Llama al método
        
        
        //Lista de estadisticas que empiezan por b
        List<Estadistica> lista45 = lista.stream()
                .filter(s->s.getMunicipio().startsWith("B"))
                .collect(Collectors.toList());

    }
    
    
    public static void generarCSV(List<Estadistica> lista){
        
        
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter("superior50.csv"))) {

            flujo.write("Municipio;1996;2001;2006;2010;2011;2013;2014;2015;2016;Promedio)");
            flujo.newLine(); //Cabecera
            
            for (Object a : lista) { //Recorre toda la lista

                flujo.write(a.toString()); //Y escribe los datos de los objetos

                flujo.newLine();

            }

            flujo.flush(); //Guarda cambios en disco

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void mayorPorcentaje(List<Estadistica> lista){
        
        lista.stream()
                .max((e1,e2)->Double.compare(e1.getP1996(),e1.getP1996()));
        
        
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
    
    public static void carpetasMunicipios(List<String> lista){
        
        for (String string : lista) {
            
            crearDirectorio("municipios/"+ string);
            
        }
    }
    
    public static void archivoAniosMas45(List<Estadistica> lista){
        
        
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter("superior50.csv"))) {

            flujo.write("Municipio;1996;2001;2006;2010;2011;2013;2014;2015;2016;Promedio)");
            flujo.newLine(); //Cabecera
            
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

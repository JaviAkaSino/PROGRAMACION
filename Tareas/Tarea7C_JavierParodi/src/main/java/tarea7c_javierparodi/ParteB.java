/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea7c_javierparodi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author JaviA
 */
public class ParteB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        /*Además, en otra clase que contenga otro método main y aplicando API 
        Stream, realiza las siguientes acciones sobre la lista de objetos leídos
        desde el fichero:*/
        
         //Leer CSV
        String ruta = "hor_curso_1920_final.csv";
        
        //Crea la lista de HoraClase
        ArrayList<HoraClase> lista = Lectura.listarFicheroHorario(ruta);
 
        //Ordena por dia y hora
        lista.stream()
                .sorted((h1,h2)->Integer.compare(h1.getDiaSemana(), h2.getDiaSemana()))
                .sorted((h1,h2)->Integer.compare(h1.getHoraDia(), h2.getHoraDia()));

        //lista.forEach(System.out::println);
        
        
        /*a) Obtener todos los registros de 1ESOA que no son de la asignatura MUS.*/
    
        List<HoraClase> sinMUS1ESOA = lista.stream()
                .filter(h->h.getCurso().equals("1ESOA"))
                .filter(h->!h.getAsignatura().equals("MUS"))
                .collect(Collectors.toList());
        
        System.out.println("Registros de 1ESO sin MUS");
        sinMUS1ESOA.forEach(System.out::println);
    
        /*b) Contar las horas que se imparten de la asignatura PROGR*/
    
        long horasPROGR = lista.stream()
                .filter(h->h.getAsignatura().equals("PROGR"))
                .count();
    
        System.out.println("\nHoras que se imparten de PROGR");
        System.out.println(horasPROGR);
        
        /*c) Obtener una lista con las iniciales del profesorado que imparte la 
        asignatura REL, ordenadas en orden inverso al orden alfabético.*/
    
        List profesREL = lista.stream()
                .filter(h->h.getAsignatura().equals("REL"))
                .map(h->h.getInicialesProfesor())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
                
        System.out.println("\nProfesores que imparten REL");
        System.out.println(profesREL);
        
        /*d) Obtener en una lista las aulas donde imparte clase el profesor "JFV"*/
    
        List aulasJFV = lista.stream()
                .filter(h->h.getInicialesProfesor().equals("JFV"))
                .map(h->h.getAula())
                .distinct()
                .collect(Collectors.toList());
    
        System.out.println("\nAulas donde imparte el profesor JFV");
        System.out.println(aulasJFV);
        
        /*e) Contar el número de asignaturas distintas que hay*/ 
       
        long asignaturasDistintas = lista.stream()
                .map(h->h.getAsignatura())
                .distinct()
                .count();
        
        System.out.println("\nNúmero de asignaturas distintas");
        System.out.println(asignaturasDistintas);
    
        /*f) Contar el total de horas que se imparten a última hora de la mañana.*/
    
        long horasAUltima = lista.stream()
                .filter(h->h.getHoraDia()==7)
                .count();
                
        System.out.println("\nHoras que se imparten a última hora");
        System.out.println(horasAUltima);
    
        /*g) Mostrar por consola los profesores que tienen clase a primera hora de 
            la mañana.*/
        
        System.out.println("\nProfesores con clase a última hora");
    
        lista.stream()
                .filter(h->h.getHoraDia()==1)
                .map(h->h.getInicialesProfesor())
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
                
        
       
   


    }
    
}

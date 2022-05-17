/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javierparodipinero;

import java.sql.SQLException;
import java.util.*;


public class Programa {

    public static void main(String[] args) {
        
        
    	PreguntaDAO daoPregunta = new PreguntaDAO();
        List<PreguntaVO> listaPreguntas = new ArrayList<>();
        listaPreguntas.add(new PreguntaVO(15,1,"Texto ejemplo práctica 8.1 Javier Parodi",100));
        listaPreguntas.add(new PreguntaVO(20,3,"Texto ejemplo 2",80));
        
        try {
            
            System.out.println("Nº preguntas insertadas " + daoPregunta.insertPregunta(listaPreguntas));
            
            
            System.out.println("-----------------------------------------");   
            
            
            System.out.println("Comprobamos en una nueva lista que se recogen los datos desde la tabla.");
            List<PreguntaVO> nuevaLista = daoPregunta.getAll();
            System.out.println("-------- Lista con datos recogidos desde la BD -------------");
            nuevaLista.forEach(System.out::println);
            
          
            System.out.println("-----------------------------------------");
            
            
            System.out.println("Persona con primary key 1: ");
            System.out.println(daoPregunta.findByPk(1));
            
            
            System.out.println("-----------------------------------------");
            
            
            System.out.println("Se va a borrar la pregunta con pk 4");
            PreguntaVO preg = new PreguntaVO();
            preg.setCodpregunta(4);
            System.out.println("Nº personas borradas " + 
            		daoPregunta.deletePregunta(preg));
    
            System.out.println("-----------------------------------------");

            nuevaLista = daoPregunta.getAll();
            System.out.println("-------- Lista con datos recogidos desde la BD despues de borrar una pregunta -------------");
            nuevaLista.forEach(System.out::println);
            
            
            System.out.println("-----------------------------------------");
            
            
            System.out.println("Modificación de la pregunta con pk 2");
            System.out.println("Nº Personas modificadas " + 
            		daoPregunta.updatePregunta(2, new PreguntaVO(20,2,"Texto modificado p81",100)));
            
            System.out.println("-----------------------------------------");
            
            nuevaLista = daoPregunta.getAll();
            System.out.println("-------- Lista con datos recogidos desde la BD despues de modificar una pregunta -------------");
            nuevaLista.forEach(System.out::println);
            
            
        } catch (SQLException sqle) {
            System.out.println("No se ha podido realizar la operación:");
            System.out.println(sqle.getMessage());
        }

    }

}

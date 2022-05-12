/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import ejercicio2.Lectura;
import ejercicio2.Ronda;
import java.util.ArrayList;

/**
 *
 * @author javiakasino
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        String fichero = "escaleraColor.txt";
        
        ArrayList<Ronda> listaRondas = Lectura.lecturaRondas(fichero);

        System.out.println(listaRondas);
        
        
    }
    
    
    
    
}

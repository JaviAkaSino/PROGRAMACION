/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea7b_javierparodi;

import java.util.Random;

/**
 *
 * @author javiakasino
 */
public class App {

    /*11.- Crea la clase App, con los siguientes atributos: código único (int), 
    nombre (String), descripción (String), tamaño en Kb (double) y número de 
    descargas (int). Crea un constructor por defecto y otro parametrizado para 
    la clase. El constructor por defecto inicializa los atributos de la app de 
    forma aleatoria, siguiendo los siguientes criterios:*/
    
    private int codigo;
    private String nombre;
    private String descripcion;
    private double tamanioKb;
    private int descargas;
    
    private static int contador = 0;
    
    public App(int codigo, String nombre, String descripcion, double tamanioKb, int descargas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tamanioKb = tamanioKb;
        this.descargas = descargas;
    }
    
    public App() {
        this.codigo = codigoDefault();
        this.nombre = nombreDefault();
        this.descripcion = descripcionDefault();
        this.tamanioKb = tamanioKbDefault();
        this.descargas = descargasDefault();
    }
           
    
    
    /*El código único se implementará con un contador de instancias.*/
    
    private int codigoDefault(){
        
        return contador++;
    }
    
    /*El nombre será un String con el formato: “app+codigo único+letra aleatoria
    (a-z)”. Por ejemplo: app1x, app2y, app3a, etc.*/
    
    private String nombreDefault(){
        
        return "app" + this.codigo + letraMinusAleatoria();
    }
    
    private char letraMinusAleatoria(){
        
        //Devuelve un char entre 97 y 122 (a - z en ASCII)
        
       return (char)enteroAleatorioEntre(97,122);
        
    }
    
    public static int enteroAleatorioEntre(int valorMin, int valorMax) {

        Random numeroAleatorio = new Random();
        int aleatorio;

        try {

            aleatorio = numeroAleatorio.nextInt(valorMax - valorMin + 1) + valorMin;

        } catch (IllegalArgumentException iae) {

            aleatorio = numeroAleatorio.nextInt(valorMin - valorMax + 1) + valorMax;

        }

        return aleatorio;

    }
    
    /*La descripción será un String aleatorio de un conjunto de 10 descripciones
    que tú decidas.*/
    
    private String descripcionDefault(){
        
       String[] listaDescripciones= {"",
           "",
           "",
           "",
           "",
           "",
           "",
           "",
           "",
           ""}; 
        
       //Devuelve una posición aleatoria del array de descripciones
       return listaDescripciones[enteroAleatorioEntre(0,9)];
    }
    
    /*El tamaño de las aplicaciones estará entre 100.0 kb y 1024.0 kb. Para 
    asignar el tamaño a cada aplicación debes generar un DoubleStream de tamaño 
    1 usando el método doubles(int tamañoStream, double valorInicial, double 
    valorFinal) de la clase Random.*/
    
    
    
    /*Para el número de descargas se debe operar igual que para las descargas, 
    usando un IntStream de tamaño 1, con valor inicial 0 y valor final 50000.*/
    
    

    /*Además, incluye getters,  setters y el método toString(), de forma que devuelva los atributos de la aplicación separados por el carácter (;).*/

    
}

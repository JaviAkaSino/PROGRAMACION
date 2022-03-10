/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parodi;

/**
 * Comentario JavaDoc
 * @author javiakasino
 */
//Aquí estarían los import
//Comentarios de línea
//Declaración de la clase, entre las dos llaves
public class Perimetro1 {
    
    /*
    Comentario de varias líneas
    Package - Imports- Clase - Main ¿?
    En esta sección van los atributos y métodos
    El método main es el que busca el JRE para iniciar la ejecución
    de cualquier programa. Todos los programas lo necesitan.
    */
    //psvm + tab es atajo de public...
    public static void main(String[] args) {
        
        //Instrucción básica para imprimir por consola. Texto=objeto
        System.out.println("Programa para calcular perímetro de"
                + " una circunferencia");
        
        // perímetro = 2 * PI * r
        
        //Declaración e inicialización de una variable
        //primitiva de tipo int (entero?) que se llama
        //Radio y vale 23. Declara e inicializa
        int radio = 23;
        //double es para números reales
        //Declara y después inicializa
        double pi;
        pi = Math.PI;
        
        //sout es atajo de System.out.println("")
        System.out.println("El radio vale: " + radio);
        double perímetro;
        perímetro = 2 * pi * radio;
        
        System.out.println("El perímetro es: " + perímetro);
        
        
            
    }   
       
}

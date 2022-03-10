
package tema3seleccion;

import java.util.Scanner;

public class Ej02_A {

 
    
    public static void main(String[] args) {

        
        /*Si el número “x” es mayor o igual que 135 se devolverá “mayor”, si es menor 
        se devolverá “menor”. Las cadenas que se devuelven se guardarán en una 
        variable llamada resultado.*/    

        double x;
        String resultado;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("¿Cuál es el valor de 'x'?");
        
        x = teclado.nextDouble();
        
        resultado = (x >= 135) ? "Mayor" : "Menor" ;
        
        System.out.println(resultado);
        
                
        /*Si el número “x” es menor o igual que cero se imprimirá en pantalla 
        “Menor que cero”, si no se imprimirá “Mayor que cero”.
        Guardar el valor absoluto de un número entero en una variable entera 
        (sin usar la función Math.abs())*/  
        
        
                
    }
    
}

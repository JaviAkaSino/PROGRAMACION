
package tema3seleccion;

import java.util.Scanner;

public class Ej02_B {

 
    
    public static void main(String[] args) {
          
        /*Si el número “x” es menor o igual que cero se imprimirá en pantalla 
        “Menor que cero”, si no se imprimirá “Mayor que cero”.*/
  
        
        Scanner teclado = new Scanner(System.in);
        double x;
        String resultado;
        
        System.out.println("¿Cuál es el valor de 'x'?");
        
        x = teclado.nextDouble();
        
        resultado = x <= 0 ? "Menor que cero" : "Mayor que cero";
        
        System.out.println(resultado);
                
    }
    
}

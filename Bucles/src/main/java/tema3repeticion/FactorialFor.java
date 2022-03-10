
package tema3repeticion;

import java.util.Scanner;

public class FactorialFor {

    public static void main(String[] args) {
        
        int numero, factorial, n;
        factorial = 1;
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número a obtener el factorial.");
        
        numero = teclado.nextInt();
        
        for (n = 1; n <= numero; n++){
            
            factorial = factorial * n;
            
        }
        
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
    
}

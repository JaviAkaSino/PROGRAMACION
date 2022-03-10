
package tema3repeticion;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
       
        
        Scanner teclado = new Scanner(System.in);
        int x, n;
        System.out.println("Ingrese el valor final");
        n = teclado.nextInt();
        x = 1;
        
        do { 
            System.out.print(x++);
            System.out.print(" - ");            
        }
        
        while (x <= n);
        
    }
    
}

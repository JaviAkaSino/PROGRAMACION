
package tema3repeticion;

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el valor máximo");
        n = teclado.nextInt();
        for (int x = 1; x <= n; x++)     
        {
            System.out.print(x);
            System.out.print(" - ");
        }
            
        
        
    }
    
}


package T2;

import java.util.Scanner;

public class Algo01 {

   
    public static void main(String[] args) {
        
        Scanner teclado;
        double euros;
        
        teclado = new Scanner(System.in);
        
        System.out.println("Indica la cantidad de euros a pasar a rupias");
        
        euros = teclado.nextDouble();
        
        final double EURO_RUPIAS = 86.48;
        
        double rupias = euros * EURO_RUPIAS;
        
        System.out.println(euros + " euros son " + rupias + " rupias");
        
       
        
                
                
                
        
        
        
        
    }
    
}

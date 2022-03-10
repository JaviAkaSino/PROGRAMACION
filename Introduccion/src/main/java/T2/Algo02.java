
package T2;

import java.util.Scanner;

public class Algo02 {

 
    public static void main(String[] args) {
        
        Scanner teclado;
        double radio;
                
        teclado = new Scanner(System.in);
                
            System.out.println("¿Cuál es el radio del círculo en centímetros?");        
        
        radio = teclado.nextDouble();
        
        //Para elevar, Math.pow(a,b)
        
        double area = Math.PI * Math.pow(radio, 2);
        
        System.out.println("El área del círculo es de " + area 
                + " centímetros cuadrados"); 
        
        
                    
        
    }
    
}

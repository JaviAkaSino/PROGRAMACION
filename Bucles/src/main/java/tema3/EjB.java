
package tema3;

import java.util.Scanner;

public class EjB {

    public static void main(String[] args) {

/*B. Saber si un carácter es un dígito, una letra mayúscula o una letra minúscula
	UNICODE:
		dígito: 48 – 57
		letra mayúscula: 65 – 90
		letra minúscula: 97 – 122*/

    Scanner teclado = new Scanner(System.in);
    
        System.out.println("Introduce una letra");
        
        char letra = teclado.nextLine().charAt(0); 
        
        
        if (48 <= letra && letra <= 57) { 
            System.out.println("Es un dígito");
        } else if (65 <= letra && letra <= 90) {
            System.out.println("Es una letra mayúscula");
        } else if (97 <= letra && letra <= 122) {
            System.out.println("Es una letra minúscula");
            
        }
        
        
        
        
        
        

    }
    
}

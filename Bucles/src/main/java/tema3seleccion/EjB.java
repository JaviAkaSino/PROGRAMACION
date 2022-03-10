package tema3seleccion;

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
        
        //Recogemos como String
        String letra = teclado.next();
        /*Y usamos .charAt(0) la primera letra (posición 0)
        Obtenemos un char del String que llama al método
        Directamente: char letra = teclado.nextLine().charAt(0);
        */
        char caracter = letra.charAt(0);

        if (48 <= caracter && caracter <= 57) {
            System.out.println("Es un dígito");
        } else if (65 <= caracter && caracter <= 90) {
            System.out.println("Es una letra mayúscula");
        } else if (97 <= caracter && caracter <= 122) {
            System.out.println("Es una letra minúscula");   
        } else { 
            System.out.println("Error. Carácter no admitido");
        }
        
    }

}

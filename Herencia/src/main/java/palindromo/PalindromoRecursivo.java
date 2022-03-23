package palindromo;

import java.util.Scanner;

/**
 *
 * @author javiakasino
 */
public class PalindromoRecursivo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palabra;

        System.out.println("Introduce la palabra");

        palabra = sc.nextLine();

        if (esPalindromoRecursividad(palabra, 0)) {

            System.out.println("Es un palíndromo");
        } else {

            System.out.println("No es un palíndromo");
        }

    }

    public static boolean esPalindromoRecursividad(String palabra, int i) {

        if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {

            return false;
        } else if (palabra.length()/2 <= i){
            
            return true;      
        }

        return esPalindromoRecursividad(palabra, ++i);
    }

}

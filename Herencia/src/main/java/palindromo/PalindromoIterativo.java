package palindromo;

import java.util.Scanner;

/**
 *
 * @author javiakasino
 */
public class PalindromoIterativo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palabra;

        System.out.println("Introduce la palabra");

        palabra = sc.toString();

        if (esPalindromo(palabra)) {
            System.out.println("Es un palíndromo");
        } else {

            System.out.println("No es un palíndromo");
        }

    }

    public static boolean esPalindromo(String palabra) {
        boolean palindromo = true;

        for (int i = 0; i < palabra.length() / 2; i++) {

            if (palabra.charAt(i) != palabra.charAt(palabra.length() - i)) {

                palindromo = false;
            }

        }

        return palindromo;
    }

}

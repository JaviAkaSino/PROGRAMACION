/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package recursividad;

/**
 *
 * @author javiakasino
 */
public class FactorialRecursivo {

    public static void main(String[] args) {

        System.out.println(factorial(5));
        
    }

    public static int factorial(int numero) {

        if (numero == 0 || numero == 1) {

            return 1;
        } else {

            return numero * factorial(--numero);
        }

    }

}

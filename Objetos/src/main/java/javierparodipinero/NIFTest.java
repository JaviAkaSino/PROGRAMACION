package javierparodipinero;

import java.util.Scanner;

/**
 *
 * @author javiakasino
 */
public class NIFTest {

    /*Incluye una clase con el método main() y prueba la clase NIF, de forma que se 
    generen correctamente las letras en función del número de DNI. Además prueba 
    el contador de instancias.*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String numeroDNI;

        do {

            System.out.println("Introduce los 8 dígitos del DNI");

            numeroDNI = sc.nextLine();

            NIF nif1 = new NIF(numeroDNI);

            System.out.println(nif1);

            System.out.println("Introduce otro DNI, o pulsa 0 para salir");

        } while (!"0".equals(numeroDNI));

        System.out.println("Se ha calculado la letra de " + NIF.getContador() + " NIFs");

    }

}

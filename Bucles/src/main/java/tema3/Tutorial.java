package tema3;

import java.util.Scanner;

public class Tutorial {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escanear edad");

        int edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        System.out.println("Mostrar la edad: " + edad);

    }

}

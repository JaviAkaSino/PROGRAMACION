package tema3seleccion;

import java.util.Scanner;

public class EjA {

    public static void main(String[] args) {

        //A. Saber si un número es positivo, negativo, o cero  
        //Construimos el Scanner
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indroduce el número");

        double numero = teclado.nextDouble();

        if (numero < 0) {
            System.out.println("El número es negativo");
        } else if (numero == 0) {
            System.out.println("El número es 0");
        } else {
            System.out.println("El número es positivo");
        }
    }

}

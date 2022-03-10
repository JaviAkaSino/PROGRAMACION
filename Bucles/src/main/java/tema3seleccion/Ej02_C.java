package tema3seleccion;

import java.util.Scanner;

public class Ej02_C {

    public static void main(String[] args) {

        /*Guardar el valor absoluto de un número entero en una variable entera 
        (sin usar la función Math.abs())*/
        Scanner teclado = new Scanner(System.in);
        int x;
        int valorAbsoluto;

        System.out.println("¿Cuál es el valor de 'x'?");

        x = teclado.nextInt();

        /*Para conocer el valor absoluto, debemos dejar el número tal cual
        si es positivo, y si es negativo, multiplicarlo por -1*/
        valorAbsoluto = x >= 0 ? x : x * (-1);

        System.out.println("El valor absoluto de " + x + " es " + valorAbsoluto);

    }

}


package tema3repeticion;

import java.util.Random;
import java.util.Scanner;

public class Random2 {

    public static void main(String[] args) {

        /*1º- Dar la opción al usuario de introducir un nº positivo por teclado
        o que se genere aleatoriamente. "N" Rango 2 y 6.000.000*/
        Random numAle = new Random();
        Scanner teclado = new Scanner(System.in);
        int n, mitadN, opcion, impar;
        boolean parNoDos;

        do {
            System.out.println("");
            System.out.println("Seleccione una opción:");
            System.out.println("1 - Introducir un número positivo.");
            System.out.println("2 - Generar número automáticamente.");
            System.out.println("3 - Finalizar el programa.");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("Introduzca un número positivo:");
                    n = teclado.nextInt();
                    mitadN = n / 2;

                    /*2º- Algoritmo de fureza bruta
            Si el número es par y no es dos, no es primo
            Si no, recorrer todo el rango de impares desde 3 hasta N/2
            Y ver si divide a N*/
                    parNoDos = (n % 2 == 0 && n != 2);

                    if (parNoDos == true) {

                        System.out.println(n + " no es primo, ya que es par y no es 2.");

                    } else {

                        impar = 3;

                        while (impar <= mitadN) {

                            if (n % impar == 0) {

                                System.out.println("El número " + n + " no es primo, "
                                        + "es divisible entre " + impar);

                                /*Para frenar, también es posible impar = mitadN + 1;
                    ya que no se cumpliría la condición del while*/
                                break;

                            } else {

                                impar = impar + 2;
                            }

                        }

                        if (impar == (mitadN + 1) || impar == (mitadN + 2)) {

                            System.out.println("El número " + n + " es primo.");

                        }

                    }
                    break;

                case 2:

                    n = numAle.nextInt(5_999_999) + 2;
                    mitadN = n / 2;

                    /*2º- Algoritmo de fureza bruta
            Si el número es par y no es dos, no es primo
            Si no, recorrer todo el rango de impares desde 3 hasta N/2
            Y ver si divide a N*/
                    parNoDos = (n % 2 == 0 && n != 2);

                    if (parNoDos == true) {

                        System.out.println(n + " no es primo, ya que es par y no es 2.");

                    } else {

                        impar = 3;

                        while (impar <= mitadN) {

                            if (n % impar == 0) {

                                System.out.println("El número " + n + " no es primo, "
                                        + "es divisible entre " + impar);

                                /*Para frenar, también es posible impar = mitadN + 1;
                    ya que no se cumpliría la condición del while*/
                                break;

                            } else {

                                impar = impar + 2;
                            }

                        }

                        if (impar == (mitadN + 1) || impar == (mitadN + 2)) {

                            System.out.println("El número " + n + " es primo.");

                        }
                    }
                    break;

                case 3:

                    System.out.println("Ha seleccioando finalizar el programa.");

                    break;

                default:
                    System.out.println("Lo sentimos, " + opcion + " no es una opción válida.");
                    break;
            }

        } while (opcion != 3);

    }

}

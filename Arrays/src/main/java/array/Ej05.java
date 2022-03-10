package array;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author javiakasino
 */
public class Ej05 {

    public static void main(String[] args) {

        /*Implementa un programa que guarde en un array 10 números enteros que 
        se leen por teclado. A continuación se recorre el array y calcula el 
        número total de positivos, de negativos y de ceros. Calcula y muestra 
        la media aritmética de los valores positivos y la de los valores negativos 
        del array. Implementar métodos para:*/
        int numeros[] = new int[10];

        guardarDatosArray(numeros);

        System.out.println("Número de positivos: " + numeroPositivos(numeros));

        System.out.println("Número de negativos: " + numeroNegativos(numeros));

        System.out.println("Número de ceros: " + numeroCeros(numeros));

        mostrarArray(numeros);

        mediaPositivosArray(numeros);

        mediaNegativosArray(numeros);

    }

    /*a) Leer valores por teclado y almacenarlos en el array. Se le pasará el array como 
        parámetro y no devolverá nada.*/
    //Se pasa por referencia, por lo que cambia fuera del método
    private static void guardarDatosArray(int array[]) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            System.out.println("Introduce el valor número " + (i + 1));

            array[i] = Utilidades.escanearInt();

        }

    }

    /*b) Contar positivos, se le pasará el array como parámetro y devolverá el número de 
        positivos almacenados en el array. */
    private static int numeroPositivos(int array[]) {

        int numeroPositivos = 0;

        for (int i = 0; i < array.length; i++) {

            if (0 < array[i]) {

                numeroPositivos++;
            }
        }

        return numeroPositivos;
    }

    /*c) Contar negativos, se le pasará el array como parámetro y devolverá el número de 
        negativos almacenados en el array. */
    private static int numeroNegativos(int array[]) {

        int numeroNegativos = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {

                numeroNegativos++;
            }
        }

        return numeroNegativos;
    }

    /*d) Contar ceros, se le pasará el array como parámetro y devolverá el número de 
        ceros almacenados en el array. */
    private static int numeroCeros(int array[]) {

        int numeroCeros = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {

                numeroCeros++;
            }
        }

        return numeroCeros;
    }

    /*e) Mostrar array, se le pasará el array como parámetro y no devolverá nada, sólo 
        imprimirá por pantalla el array.*/
    private static void mostrarArray(int array[]) {

        for (int i = 0; i < array.length; i++) {

            System.out.println("Número " + (i + 1) + ": " + array[i]);
        }

    }

    /*f) Calcular media positivos, se le pasará el array como parámetro y no devolverá 
        nada, sólo imprimirá por pantalla la media aritmética de los positivos.*/
    private static void mediaPositivosArray(int array[]) {

        int sumaPositivos = 0, mediaPositivos;

        for (int i = 0; i < array.length; i++) {

            if (0 < array[i]) {

                sumaPositivos += array[i];
            }

        }

        mediaPositivos = sumaPositivos / numeroPositivos(array);

        System.out.println("La media de los positivos es de " + mediaPositivos);
    }

    /*g) Calcular media negativos, se le pasará el array como parámetro y no devolverá 
        nada, sólo imprimirá por pantalla la media aritmética de los negativos.
     */
    private static void mediaNegativosArray(int array[]) {

        int sumaNegativos = 0, mediaNegativos;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {

                sumaNegativos += array[i];
            }

        }

        mediaNegativos = sumaNegativos / numeroNegativos(array);

        System.out.println("La media de los negativos es de " + mediaNegativos);
    }
}

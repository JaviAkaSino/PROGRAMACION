package array;

import java.util.Arrays;

/**
 *
 * @author javiakasino
 */
public class Ej04 {

    public static void main(String[] args) {
        /*Escribe un programa que, dado un array de enteros de cualquier tamaño, 
        busque si un número obtenido por teclado se encuentra en el array e 
        imprima la primera posición en la que se encuentra el número. Realiza 
        la búsqueda de un elemento:*/

        System.out.println("Indica tamaño de array");

        int tamanio = Utilidades.escanearInt();

        int[] array = new int[tamanio];

        Utilidades.guardarDatosArrayRandom(array, 0, 9);

        Utilidades.mostrarArrayLineal(array);

        System.out.println("Indica el número a buscar");

        int buscado = Utilidades.escanearInt();

        int posicion = busquedaSecuencial(array, buscado);

        if (busquedaSecuencial(array, buscado) > 0) {
            System.out.println("La posición en la que se encuentra es " + posicion);
        } else {
            System.out.println("No se encuentra en ninguna posición");
        }

        int posicion2 = busquedaBinaria(array, buscado);

        if (busquedaSecuencial(array, buscado) > 0) {
            System.out.println("La posición en la que se encuentra es " + posicion2);
        } else {
            System.out.println("No se encuentra en ninguna posición");
        }
    }

    //Implementando el método de búsqueda secuencial.
    public static int busquedaSecuencial(int[] array, int buscado) {

        int valor = -1;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == buscado) {

                valor = i;
            }
        }

        return valor;
    }

    //Usando el método de búsqueda binaria de la clase Arrays
    public static int busquedaBinaria(int[] array, int buscado) {

        //Ordenamos la array
        Arrays.sort(array);

        //Buscamos valor en la array y devuelve posición en la array
        int valor = Arrays.binarySearch(array, buscado);

        return valor;
    }

    /*Ej 09. En el programa del ejercicio 4, incluir un método llamado 
        ordenarBubble(int[] arrayOrdenar) para ordenar el array que se le pase, 
        usando el método bubble sort que hay en los apuntes. */
    public static void ordenarBubble(int[] arrayOrdenar) {

        int aux;
        for (int i = 0; i < arrayOrdenar.length - 1; i++) {
            for (int j = i + 1; j < arrayOrdenar.length; j++) {
                if (arrayOrdenar[i] > arrayOrdenar[j]) {

                    aux = arrayOrdenar[i];
                    arrayOrdenar[i] = arrayOrdenar[j];
                    arrayOrdenar[j] = aux;
                    
                }
            }
        }

    }

}

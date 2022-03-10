package array;

import java.util.Scanner;

/**
 *
 * @author JaviA
 */
public class Ej07 {

    public static void main(String[] args) {

        /*Escribir un programa que lea del teclado el tamaño de dos arrays de 
        enteros (el mismo tamaño para los dos arrays). El programa inicializará
        los arrays con números aleatorios entre 1 y 100. Existirá un método 
        llamado multiplicar que recibirá los dos arrays e irá multiplicando los
        elementos dos a dos, empezando por los elementos que ocupan la posición 
        cero, luego la uno, etc, guardando el resultado en otro array, que será 
        devuelto por el método. Además existirá un método para imprimir por 
        pantalla los valores de los arrays.*/
        System.out.println("Tamaño de las array:");

        int tamanio = Utilidades.escanearInt();

        int factor1[] = new int[tamanio];
        int factor2[] = new int[tamanio];
        int producto[];
        
        guardarDatosAleArray(factor1);
        guardarDatosAleArray(factor2);

        producto = multiplicarArray(factor1, factor2);
        
        System.out.println("Primera array:");
        System.out.println("");
        imprimirArray(factor1);
        System.out.println("---------------");
        
        
        System.out.println("Segunda array:");
        System.out.println("");
        imprimirArray(factor2);
        System.out.println("---------------");
        
        System.out.println("Array resultante");
        imprimirArray(producto);
        System.out.println("");
        System.out.println("---------------");
        
        

    }

    private static void guardarDatosAleArray(int array[]) {

        for (int i = 0; i < array.length; i++) {

            array[i] = Utilidades.numeroAleatorioEntre(1, 100);

        }

    }

    private static int[] multiplicarArray(int array1[], int array2[]) {

        int productoArray[] = new int[array1.length];

        for (int i = 0; i < productoArray.length; i++) {

            productoArray[i] = array1[i] * array2[i];

        }

        return productoArray;
    }
    
    private static void imprimirArray(int array[]){
        
        for (int i = 0; i <  array.length ; i++) {
            
            System.out.println("Número " + (i+1) + ":" + array[i]);
            
        }
    }

}

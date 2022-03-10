package array;

/**
 *
 * @author JaviA
 */
public class Ej01 {

    public static void main(String[] args) {


        /*Escribe un programa que muestre cada elemento de un array de enteros 
        y sume todos sus elementos. Instancia e inicializa el array en el programa, 
        sin leer nada por teclado, con los siguientes valores {1, 2, 3, 4, 5, 6}.*/
        int numeros[] = {1, 2, 3, 4, 5, 6};
        int suma = 0;
        for (int i = 0; i < 6; i++) {

            System.out.println("Número " + (i+1) + ": " + numeros[i]);
        }

        for (int i = 0; i < 6; i++) {

            suma += numeros[i];
        }
        
        System.out.println("Suma: " + suma);
    }

}

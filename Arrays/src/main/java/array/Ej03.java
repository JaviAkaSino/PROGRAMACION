package array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author javiakasino
 */
public class Ej03 {

    public static void main(String[] args) {

        //Crea un array de doubles de tamaño 20. Usando los métodos de la clase Arrays:

        double[] decimales = new double[20];

        //Rellena el array con el valor 7.5 en todas sus posiciones.
        Arrays.fill(decimales, 7.5);

        //Realiza una copia del array anterior en un nuevo array.
        double[] copia = Arrays.copyOf(decimales, 20);

        //Imprime ambos arrays.
        System.out.println(Arrays.toString(decimales));
        System.out.println(Arrays.toString(copia));

        //Compara ambos arrays, mostrando si son iguales.
        if (Arrays.compare(decimales, copia) == 0) {
            System.out.println("Es igual");

        } else {
            System.out.println("Son distintas");
        }
        
        //Introduce el valor 6.3 en una posición aleatoria válida de uno de los arrays.
        Array.setDouble(decimales, Utilidades.numeroAleatorioEntre(0, 19), 6.3);
        
        //Imprime ambos arrays.
        System.out.println(Arrays.toString(decimales));
        System.out.println(Arrays.toString(copia));
        
        //Vuelve a compararlos, indicando si son iguales o no.
        if (Arrays.compare(decimales, copia) == 0) {
            System.out.println("Es igual");

        } else {
            System.out.println("Son distintas");
        }


    }

}

package array;

import java.util.Arrays;

/**
 *
 * @author JaviA
 */
public class Ej13 {

    public static void main(String[] args) {


        /*Escribir un programa que lea números enteros entre 1 y 20 desde teclado. 
        Se debe generar un histograma con las frecuencias de cada entero en la 
        secuencia.  Para representar las barras del histograma hay que utilizar 
        secuencias del carácter ‘*’. El programa finaliza al introducir un cero. 
        Por ejemplo, la secuencia: 1, 1, 20, 1, 2, 20, 3, 3, 3, 4, 4, 4, 5, 3 
        generaría la siguiente salida:
        1: ***
        2: *
        3: ****
        4: ***
        5:
        6:
        7:
        …
        20:**
         */
        int numero = 1;
        String[] salida = new String[20];

        for (int i = 0; i < salida.length; i++) {
            salida[i] = "";
        }

        System.out.println("Introduce un número del 1 al 20");

        do {

            numero = Utilidades.escanearInt();//Controla try catch          

            if (0 < numero && numero <= 20) {//Controla que no sea 0 ni menor, ni mayor que 20

                salida[numero - 1] += "*";
            }

        } while (numero != 0);

        Utilidades.mostrarArrayString(salida);

    }

}

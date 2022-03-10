package array;

import java.util.Arrays;

/**
 *
 * @author javiakasino
 */
public class Joker {

    public static void main(String[] args) {

        /*Juego del Joker, son 7 números y hay dos posibles premios, que coinciden
        todos los números y su orden (Premio: Joker bueno) o que concidan los números 
        pero no las posiciones (Premio: Joker malo). El premiado es aleatorio*/
        int[] premiado = new int[7];
        int[] comprado = new int[7];
        int min = 0;
        int max = 9;

        Utilidades.guardarDatosArrayRandom(premiado, min, max);

        System.out.println("¿Qué combinación de números quieres comprar");

        Utilidades.mostrarArray(premiado);

        Utilidades.guardarDatosArray(comprado);

        System.out.print("Tu combinación es: ");
        Utilidades.mostrarArrayLineal(comprado);
        System.out.println("");
        System.out.println("-------------");

        System.out.print("La secuencia ganadora ha sido:");
        Utilidades.mostrarArrayLineal(premiado);
        System.out.println("");
        System.out.println("-------------");

        if (Arrays.equals(comprado, premiado)) {

            System.out.println("¡ENHORABUENA!, HAS GANADO EL JOKER BUENO");

        } else {

            Arrays.sort(comprado);
            Arrays.sort(premiado);

            if (Arrays.equals(comprado, premiado)) {

                System.out.println("¡Enhorabuena! has resultado premiado: JOKER MALO");

            } else {

                System.out.println("Lo sentimos, tu boleto no ha sido premiado");

            }
        }
    }
    
}

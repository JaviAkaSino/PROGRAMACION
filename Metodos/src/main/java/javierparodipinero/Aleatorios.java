package javierparodipinero;

import java.util.Random;

/**
 *
 * @author JaviA
 */
public class Aleatorios {

    public static void main(String[] args) {

    }

    public static int enteroAleatorio() {

        Random rd = new Random();

        int aleatorio = rd.nextInt(Integer.MAX_VALUE - Integer.MIN_VALUE) + 1;

        return aleatorio;

    }

    public static int enteroRango(int min, int max) {

        Random rd = new Random();

        int aleatorio = rd.nextInt(max - min + 1) + 1;

        return aleatorio;

    }

    public static char letraMinuscula() {

        Random rd = new Random();

        char letra = (char) (rd.nextInt(122 - 97 + 1) + 1);

        return letra;
    }

    public static char letraMayuscula() {

        Random rd = new Random();

        char letra = (char) (rd.nextInt(90 - 65 + 1) + 1);

        return letra;
    }

}

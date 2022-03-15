package pokino.javierparodipinero;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author JaviA
 */
public class Juego {

    public static void main(String[] args) {

        Baraja b1 = new Baraja();

        b1.llenarBaraja();

        //System.out.println(b1);
        ArrayList<Carta> baraja = b1.barajaLista();

        System.out.println(baraja.size());

        //Saca cartas  hasta que se acaben
        while (baraja.size() > 0) {
            System.out.println(Baraja.cartaAleatoria(baraja));
        }

        System.out.println(baraja.size());

        System.out.println(baraja);

    }

}

package pokino.javierparodipinero;

/**
 *
 * @author JaviA
 */
public class Juego {

    public static void main(String[] args) {

        Baraja b1 = new Baraja();

        b1.llenarBaraja();

        System.out.println(b1.getBaraja());

        //Saca cartas  hasta que se acaben
        while (b1.getBaraja().size() > 0) {
            System.out.println(b1.cartaAleatoria());
        }

        System.out.println(b1.getBaraja().size());

        System.out.println(b1.barajaLista());

    }

}

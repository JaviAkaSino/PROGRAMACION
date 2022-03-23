package legisladores;

import java.util.ArrayList;

/**
 *
 * @author javiakasino
 */
public class PruebaLegislador {

    public static void main(String[] args) {

        Legislador l1 = new Diputado();
        Legislador l2 = new Diputado();
        Legislador l3 = new Senador();
        Legislador l4 = new Senador();
        Legislador l5 = new Diputado();
        Legislador l6 = new Senador();

        ArrayList<Legislador> lista = new ArrayList<>();

        lista.add(l1);
        lista.add(l2);
        lista.add(l3);
        lista.add(l4);
        lista.add(l5);
        lista.add(l6);

        System.out.println(lista);

        for (Legislador l : lista) {

            System.out.println(l.getCamara()); 

            if (l instanceof Diputado) {

                System.out.println("DIPUTADO");

            } else if (l instanceof Senador) {

                System.out.println("SENADOR");
            }

        }

    }

}

package robots;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author javiakasino
 */
public class Test {

    public static void main(String[] args) {

        ArrayList<Robot> lista = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            lista.add(new Robot());

        }

        System.out.println("Lista\n");
        imprimirLista(lista);

        Collections.sort(lista); //Ordena por vida, el comparable va por vida

        System.out.println("\n\nLista por vida\n");
        imprimirLista(lista);

        //Imprimir la cantidad de robots que tienen más del 50% de vida.
        System.out.println("\n\n+50% VIDA\n");
        for (Robot r : lista) {

            if (r.getVida() > 50) {

                System.out.println(r);
            }
        }

        //Imprimir el número de serie de los TRES robots que tienen mayor porcentaje de vida. 
        System.out.println("\n\n3 con más VIDA\n");

        Collections.sort(lista);

        for (int i = 0; i < 3; i++) {

            System.out.println(lista.get(lista.size() - 1 - i));
        }

        //Además, debe ser posible ordenar los robots por número de serie.
        
        System.out.println("\n\nOrdenar por numero de serie\n");
        //Inferencia de tipos
        Comparator<Robot> porSerie = (r1, r2) -> Integer.compare(r1.getNumeroSerie(), r2.getNumeroSerie());

        
        /*Una vez ordenada la lista por número de serie, realizar búsqueda 
            binaria de algún robot dentro de la lista.*/
        Collections.sort(lista, porSerie);

        imprimirLista(lista);

        if (buscarNS(lista, 10200) >= 0) {

            System.out.println("\n\nNS 10200: " + lista.get(buscarNS(lista, 10200)));
        }

        Collections.sort(lista);
        if (buscarVida(lista, 100) >= 0) {

            System.out.println("\n\nVida 100% " + lista.get(buscarVida(lista, 100)));
        }

    }

    public static void imprimirLista(ArrayList<Robot> lista) {

        for (Robot t : lista) {

            System.out.println(t);

        }
    }

    public static int buscarNS(ArrayList<Robot> lista, int numSerie) {

        Robot r = new Robot(numSerie, 0);

        return Collections.binarySearch(lista, r, (Robot r1, Robot r2) -> Integer.compare(r1.getNumeroSerie(), r2.getNumeroSerie()));

    }

    public static int buscarVida(ArrayList<Robot> lista, int vida) {

        Robot r = new Robot(0, vida);

        return Collections.binarySearch(lista, r);

    }
}

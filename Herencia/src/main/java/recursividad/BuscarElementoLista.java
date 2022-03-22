package recursividad;

import java.util.ArrayList;
import listas.Cancion;
import listas.ListaReproduccion;

/**
 *
 * @author javiakasino
 */
public class BuscarElementoLista {

    public static void main(String[] args) {

        ListaReproduccion lista = new ListaReproduccion();

        lista.grabarCancion(new Cancion("Zapatillas", "ECDL", 2002));
        lista.grabarCancion(new Cancion("Manifiesto", "Nach", 2008));
        lista.grabarCancion(new Cancion("Lo que me gusta de ti", "Little Pepe", 2020));
        lista.grabarCancion(new Cancion("Victory", "Two Steps From Hell", 2016));
        lista.grabarCancion(new Cancion("A contracorriente", "ECDL", 2000));
        lista.grabarCancion(new Cancion("Viviendo", "Nach", 2017));
        lista.grabarCancion(new Cancion("Bumaye", "ToteKing", 2022));

        lista.imprimirLista();

        System.out.println("Busca Victory");

        System.out.println(buscarCancionRecursividad(lista, "Victory", lista.listaCanciones().size()-1));

    }

    public static int buscarCancionRecursividad(ListaReproduccion lista, String titulo, int i) {

        if (i == -1) {

            return i;

        } else if (titulo.equalsIgnoreCase(lista.listaCanciones().get(i).getTitulo())) { //Si el título es el dado

            return i; //Devuelve su índice (lista.indexOf(new Cancion(titulo, "", 0)))

        } else {

            i--;

            return buscarCancionRecursividad(lista, titulo, i); //Llamada recursiva -- array[tamanio - 1] + sumarElementosArray(array, tamanio - 1);
        }
    }

}

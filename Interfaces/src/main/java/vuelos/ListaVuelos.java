package vuelos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author JaviA
 */
public class ListaVuelos {

    public static void main(String[] args) {

        ArrayList<Vuelo> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            lista.add(new Vuelo());

        }

        for (Object o : lista) {

            System.out.println(o);

        }

        System.out.println(vuelosPorDestino(lista));

    }

    /*Método estatico que devuelve un MAP que va a contener para cada destino 
        el nº de pasajeros que llegan en total*/
    public static Map<String, Integer> vuelosPorDestino(ArrayList<Vuelo> listaVuelos) {

        Map<String, Integer> vuelosDestino = new HashMap<>();

        for (Vuelo v : listaVuelos) {

            int n = v.getPasajeros().size();

            for (Vuelo b : listaVuelos) {

                if (v.getDestino().equals(b.getDestino())) {

                    n += b.getPasajeros().size();
                }
            }

            vuelosDestino.put(v.getDestino().toString(), n);

        }

        return vuelosDestino;
    }

}

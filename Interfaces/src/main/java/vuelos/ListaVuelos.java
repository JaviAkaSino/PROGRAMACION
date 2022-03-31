package vuelos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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

        System.out.println("Pasajeros por destino:");
        System.out.println(pasajerosPorDestino(lista));

        System.out.println("Pasajeros por destino en orden alfabético:");
        System.out.println(pasajerosPorDestinoOrden(lista));
        
             
        System.out.println(pasajerosVuelo(lista, "5415541544"));

    }

    /*Método estatico que devuelve un MAP que va a contener para cada destino 
        el nº de pasajeros que llegan en total*/
    public static Map<String, Integer> pasajerosPorDestino(ArrayList<Vuelo> listaVuelos) {

        Map<String, Integer> vuelosDestino = new HashMap<>();

        for (Vuelo v : listaVuelos) {

            int n = v.getPasajeros().size();

            for (Vuelo b : listaVuelos) {

                if (v != b && v.getDestino().equals(b.getDestino())) {

                    n += b.getPasajeros().size();
                }
            }

            vuelosDestino.put(v.getDestino().toString(), n);

        }

        return vuelosDestino;
    }

    //Repetir metodo pero map ordenado por destinos
    public static Map<String, Integer> pasajerosPorDestinoOrden(ArrayList<Vuelo> listaVuelos) {

        Map<String, Integer> vuelosDestino = new TreeMap<>();

        for (Vuelo v : listaVuelos) {

            int n = v.getPasajeros().size();

            for (Vuelo b : listaVuelos) {

                if (v != b && v.getDestino().equals(b.getDestino())) {

                    n += b.getPasajeros().size();
                }
            }

            vuelosDestino.put(v.getDestino().toString(), n);

        }

        return vuelosDestino;
    }

    /*Método me permita saber por codigo de vuelo los pasajeros (lista) que hay 
        en ese vuelo*/
    public static ArrayList<Persona> pasajerosVuelo(ArrayList<Vuelo> lista, String codigoVuelo) {

        ArrayList<Persona> pasajeros = new ArrayList<>();

        for (Vuelo v : lista) {

            if (v.getCodigo().equals(codigoVuelo)) {

                return v.getPasajeros();
            }

        }

        return pasajeros;
    }
}

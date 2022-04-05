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

        final int NUMERO_VUELOS = 10; //Elegimos el número de vuelos random
        ArrayList<Vuelo> lista = new ArrayList<>();

        for (int i = 0; i < NUMERO_VUELOS; i++) { //Se crean y añaden a la lista

            lista.add(new Vuelo());

        }

        lista.add(new Vuelo("123456")); //Añade uno con el código para poder buscarlo

        for (Object o : lista) { //Imprime lista

            System.out.println(o);

        }

        System.out.println("\n\nPasajeros por destino:");
        System.out.println(pasajerosPorDestino(lista));

        System.out.println("\n\nPasajeros por destino en orden alfabético:");
        System.out.println(pasajerosPorDestinoOrden(lista));

        System.out.println("\n\nPasajeros de cada vuelo:");
        System.out.println(pasajerosPorCodigo(lista));
        
        System.out.println("\n\nPasajeros del vuelo 123456: ");
        System.out.println(pasajerosPorVuelo(lista, "123456"));

    }

    /*Método estatico que devuelve un MAP que va a contener para cada destino 
        el nº de pasajeros que llegan en total*/
    public static Map<String, Integer> pasajerosPorDestino(ArrayList<Vuelo> listaVuelos) {

        Map<String, Integer> vuelosDestino = new HashMap<>(); //Crea el map vacio

        for (Vuelo v : listaVuelos) { //Recorre todos los vuelos

            int n = v.getPasajeros().size(); //Guarda el número de pasajeros

            for (Vuelo b : listaVuelos) { //Recorre en busca de más viajes de i gual destino

                if (v != b && v.getDestino().equals(b.getDestino())) { //Si no es el mismo pero igual destino

                    n += b.getPasajeros().size(); //Se añade la cantidad de pasajeros
                }
            }

            vuelosDestino.put(v.getDestino().toString(), n); //Añade elemento al map con (CIUDAD, pasajeros)

        }

        return vuelosDestino;
    }

    //Repetir metodo pero map ordenado por destinos. Funciona como el anterior
    public static Map<String, Integer> pasajerosPorDestinoOrden(ArrayList<Vuelo> listaVuelos) {

        Map<String, Integer> vuelosDestino = new TreeMap<>(); //Pero TreeMap en vez de HashMap

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

    /*Método que me permita saber por codigo de vuelo los pasajeros (lista) que hay 
        en ese vuelo*/
    public static Map<String, ArrayList<Persona>> pasajerosPorCodigo(ArrayList<Vuelo> lista){
        
        Map<String, ArrayList<Persona>> codigoPasajeros = new HashMap<>();

        for (Vuelo v : lista) { //Recorre todos los vuelos

            codigoPasajeros.put("\n\nCÓDIGO DE VUELO: " + v.getCodigo() +"\n", v.getPasajeros());
            }

            return codigoPasajeros;
        }

    
    public static ArrayList<Persona> pasajerosPorVuelo(ArrayList<Vuelo> lista, String codigoVuelo) {

        ArrayList<Persona> pasajeros = new ArrayList<>();

        for (Vuelo v : lista) { //Recorre todos los vuelos

            if (v.getCodigo().equals(codigoVuelo)) { //Para el vuelo con el código indicado

                return v.getPasajeros(); //Devuelve la lista de pasajeros
            }

        }

        return pasajeros; //Si no está el vuelo, devuelve una lista vacía (no vuelo, no pasajeros)
    }
}

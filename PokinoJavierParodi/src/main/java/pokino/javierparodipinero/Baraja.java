package pokino.javierparodipinero;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import pokino.javierparodipinero.Carta.Palo;
import pokino.javierparodipinero.Carta.Valor;

/**
 *
 * @author JaviA
 */
public class Baraja {

    //Cada baraja contiene las 48 cartas diferentes
    private final Set<Carta> baraja;

    //Constructor por defecto, crea el Set vacío
    public Baraja() {
        this.baraja = new TreeSet<>();

    }

    //Llena la baraja con todas las cartas
    public void llenarBaraja() {

        for (int i = 0; i < 4; i++) { //Número de palos
            for (int j = 0; j < 12; j++) { //Número de valores

                this.baraja.add(new Carta(Valor.values()[j], Palo.values()[i]));

            }
        }
    }

    public ArrayList<Carta> barajaLista() {

        return new ArrayList<>(this.baraja);
    }

    //Devuelve una carta de la baraja en lista y la elimina de ella
    public static Carta cartaAleatoria(ArrayList<Carta> listaBaraja) {

        int posicion = Utilidades.numeroAleatorioEntre(0, (listaBaraja.size() - 1));
        
        //Copia la carta de la baraja
        Carta carta = listaBaraja.get(posicion);

        //Borra la carta de la lista
        listaBaraja.remove(posicion);

        return carta; //Devuelve la carta copiada

    }

    //Devuelve un array con las 48 cartas dispeustas aleatoriamente
    public Carta[] barajaBarajada() {

        ArrayList<Carta> lista = new ArrayList<>(this.baraja); //Crea una lista de la baraja
        Carta[] barajaArray = new Carta[48]; //Un array vacío para la baraja
        int posicion;

        for (int i = 0; i < 48; i++) {

            posicion = Utilidades.numeroAleatorioEntre(0, lista.size() - 1);

            barajaArray[i] = lista.get(posicion); //Se llena en orden aleatorio
        }

        return barajaArray;
    }

    @Override
    public String toString() {
        return "Baraja: " + baraja;
    }

}

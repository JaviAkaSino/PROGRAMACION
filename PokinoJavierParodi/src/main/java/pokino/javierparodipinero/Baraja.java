package pokino.javierparodipinero;

import java.util.ArrayList;
import java.util.Collections;
import pokino.javierparodipinero.Carta.Palo;
import pokino.javierparodipinero.Carta.Valor;

/**
 *
 * @author JaviA
 */
public final class Baraja {

    //Cada baraja contiene las 48 cartas diferentes
    private final ArrayList<Carta> baraja;

    //Constructor por defecto, crea la baraja completa y ordenada
    public Baraja() {
        this.baraja = new ArrayList<>();

        this.llenarBaraja(); 
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    
    
    //Llena la baraja con todas las cartas en orden
    public void llenarBaraja() {

        for (int i = 0; i < 4; i++) { //Número de palos
            for (int j = 0; j < 12; j++) { //Número de valores

                this.baraja.add(new Carta(Valor.values()[j], Palo.values()[i]));
            }
        }
    }

    //Baraja las cartas. Coge una posición aleatoria y la manda al final 'VECES' veces
    public void barajar() {

        final int VECES = 100;

        for (int i = 0; i < VECES; i++) {

            this.baraja.add(this.cartaAleatoria());
        }
    }

    public Carta primeraCarta() {

        Carta carta = this.baraja.get(0); //Copia la primera carta de la baraja

        this.baraja.remove(0); //Borra la carta de la lista

        return carta; //Devuelve la carta copiada
    }

    public Carta cartaPorNumero(int numero) {

        for (Carta carta : this.baraja) { //Recorre la baraja

            if (carta.getValor().equals(Valor.values()[numero - 1])) { //Si la carta tiene el valor dado

                Carta aux = new Carta(carta.getValor(), carta.getPalo()); //Se hace una copia de ella en aux

                this.baraja.remove(carta); //Se saca de la baraja

                return aux; //Se devuelve
            }
        }
        return null;
    }

    //Indica el numero de cartas que queda en la baraja (tamaño de la lista)
    public int numeroCartas() {

        return this.baraja.size();
    }

    @Override
    public String toString() {
        return "Baraja: " + baraja;
    }

    //Devuelve una carta de la baraja en lista y la elimina de ella
    public Carta cartaAleatoria() {

        int posicion = Utilidades.numeroAleatorioEntre(0, (this.baraja.size() - 1));

        Carta carta = this.baraja.get(posicion); //Copia la carta de la baraja

        this.baraja.remove(posicion); //Borra la carta de la lista

        return carta; //Devuelve la carta copiada
    }

    //Coge una baraja y dice si la carta esta en ella aun
    public boolean cartaEnBaraja(Baraja b, Carta c){
        
        return b.baraja.contains(c);
    }
    
}

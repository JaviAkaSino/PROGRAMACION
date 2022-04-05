package pokino.javierparodipinero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import pokino.javierparodipinero.Vaso.NombrePremio;

/**
 *
 * @author JaviA
 */
public class Pokino {

    /*El objeto Pokino está compuesto por los 12 cartones diferentes posibles
    que hay en una partida, limitado por su primera fila (Póker). Cada uno lleva
    un número identificador*/
    private Map<Integer, Carton> cartones;
    private ArrayList<Vaso> premios;

    public Pokino(int jugadores) {

        this.cartones = new HashMap(); //Crea el Map vacío

        crearCartones(jugadores);

        this.premios = new ArrayList<>(); //Crea la lista

        for (int i = 0; i < 6; i++) {

            this.premios.add(new Vaso(NombrePremio.values()[i]));
        }

    }

    public Map<Integer, Carton> getCartones() {
        return cartones;
    }
    
    

    public ArrayList<Vaso> getPremios() {
        return premios;
    }

    @Override
    public String toString() {
        return "Pokino: " + cartones;

    }

    private void crearCartones(int jugadores) {

        ArrayList<Carton> todosLosCartones = new ArrayList<>();

        for (int i = 0; i < 12; i++) { //Crea lista con los 12 cartones

            todosLosCartones.add(new Carton());
        }

        for (int i = 0; i < jugadores; i++) { //Para cada jugador

            int cartonRandom = Utilidades.numeroAleatorioEntre(0, todosLosCartones.size()-1);
            //Se le da un cartón aleatorio
            this.cartones.put(i+1, todosLosCartones.get(cartonRandom));
            //Se elimina de la lista para no repetirlo
            todosLosCartones.remove(cartonRandom);
        }
    }

    public void imprimirPokino() {

        imprimirCartones();
        imprimirPremios();
        System.out.println("\n\n");
    }

    public void imprimirCartones() {

        for (Map.Entry<Integer, Carton> aux : this.cartones.entrySet()) {

            System.out.println("\n----------------------------------------------"
                    + "---  Jugador " + aux.getKey() + "  ----------------------"
                    + "---------------------------\n");
            aux.getValue().imprimirCarton();

        }
    }

    public void imprimirPremios() {
        System.out.println("\n----------------------------------------------"
                + "---  PREMIOS  ----------------------"
                + "---------------------------\n");
        for (int i = 0; i < this.premios.size(); i++) {

            System.out.println(this.premios.get(i));

        }
    }

}

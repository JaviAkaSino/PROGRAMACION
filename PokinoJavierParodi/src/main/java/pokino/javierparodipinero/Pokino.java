
package pokino.javierparodipinero;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author JaviA
 */
public class Pokino {
    
    /*El objeto Pokino está compuesto por los 12 cartones diferentes posibles
    que hay en una partida, limitado por su primera fila (Póker). Cada uno lleva
    un número identificador*/

    private Map<Integer, Carton> pokino;
    
    private static int contador = 1;

    public Pokino() {
        
        this.pokino = new HashMap(); //Crea el Map
        
        for (int i = 0; i < 12; i++) { //Le añade los 12 cartones
            
            this.pokino.put(contador++, new Carton());
        }
    }

  
    
    
    @Override
    public String toString() {
        return "Pokino: "+ pokino;
        
    }
    
    
    public void imprimirPokino() {

        for (Map.Entry<Integer, Carton> aux : this.pokino.entrySet()) {

            System.out.println("Cartón " + aux.getKey() + "\n\n" + aux.getValue() + "\n\n");
        }
    }
    
    
    
    
    
}


package ejercicio2;

import ejercicio1.Carta;
import java.util.ArrayList;

/**
 *
 * @author javiakasino
 */
public class Ronda {
    
    private ArrayList<Carta> ronda;

    public Ronda() {
        ronda = new ArrayList<>();
    }

    public ArrayList<Carta> getRonda() {
        return ronda;
    }

    public void setRonda(ArrayList<Carta> ronda) {
        this.ronda = ronda;
    }

    @Override
    public String toString() {
        return "Ronda{" + "ronda=" + ronda + '\n';
    }
    
    
    
}

package pokino.javierparodipinero;

import java.awt.font.TextAttribute;
import java.text.AttributedString;
import java.util.Objects;

/**
 *
 * @author JaviA
 */
public class Carta implements Comparable<Carta> {

    //No procede constructor por defecto por no tener más posibles atributos
    //Tampoco setters, ya que el valor de una carta no debe ser modificado
    //Motivo por el cual sus atributos son final
    private final Valor valor;
    private final Palo palo;
    private boolean cantada;

    //Constructor parametrizado
    public Carta(Valor valor, Palo palo) {
        this.valor = valor;
        this.palo = palo;
        this.cantada = false;
    }

    public Valor getValor() {
        return valor;
    }

    public Palo getPalo() {
        return palo;
    }

    public boolean isCantada() {
        return cantada;
    }

    public void setCantada(boolean cantada) {
        this.cantada = cantada;
    }
    
    

    @Override
    public String toString() {

        if (cantada) {
            
            return "[X] "+valor + " DE " + palo;
        }
        
        return "[ ] " + valor + " DE " + palo;

    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.valor);
        hash = 83 * hash + Objects.hashCode(this.palo);
        return hash;
    }

    //Dos cartas son iguales si coinciden su valor y su palo
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (this.valor != other.valor) {
            return false;
        }
        if (this.palo != other.palo) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Carta o) {

        int aux = this.palo.compareTo(o.palo);

        if (aux == 0) {

            aux = this.valor.compareTo(o.valor);
        }
        return aux;
    }

    //Enum de los valores
    public enum Valor {

        AS, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, OCHO, NUEVE, SOTA, CABALLO, REY
    }

    //Enum de los palos
    public enum Palo {

        OROS, COPAS, ESPADAS, BASTOS
    }
}

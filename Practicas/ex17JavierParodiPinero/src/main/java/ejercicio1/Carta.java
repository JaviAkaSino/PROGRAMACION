package ejercicio1;

import java.util.Objects;

/**
 *
 * @author JaviA
 */
public class Carta implements Comparable<Carta> {

    //No procede constructor por defecto por no tener más posibles atributos
    //Tampoco setters, ya que el valor de una carta no debe ser modificado
    //Motivo por el cual sus atributos son final
    private Valores valor;
    private Palos palo;

    //Constructor parametrizado
    public Carta(Valores valor, Palos palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public Carta() {
    }
    
    

    public Valores getValor() {
        return valor;
    }

    public Palos getPalo() {
        return palo;
    }

    public void setValor(Valores valor) {
        this.valor = valor;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }
    
    //Da el valor a la carte en funcion al 
    public void darValorCarta(String valor) {

        
        switch(valor){
            
            case "2":
                this.setValor(Valores.DOS);
                break;
                
            case "3":
                this.setValor(Valores.TRES);
                break;
        
            case "4":
                this.setValor(Valores.CUATRO);            
                break;
                
            case "5":
                this.setValor(Valores.CINCO);            
                break;
                
            case "6":  
                this.setValor(Valores.SEIS);
                break;        
                
            case "7":
                this.setValor(Valores.SIETE);    
                break;
                
            case "8":
                this.setValor(Valores.OCHO);            
                break;
                
            case "9":
                this.setValor(Valores.NUEVE);            
                break;
                
            case "10":
                this.setValor(Valores.DIEZ);            
                break;
                
            case "J":
                this.setValor(Valores.JACK);
                break;
              
            case "Q":
                this.setValor(Valores.QUEEN);            
                break;
                
            case "K":
                this.setValor(Valores.KING);           
                break;
            case "A":
                this.setValor(Valores.AS);            
                break;
                        
        }
        
    }
    
    public  void darPaloCarta(String palo){
        
        switch(palo){
            
            case "P":
                this.setPalo(Palos.P);
                break;
                
            case "D":
                this.setPalo(Palos.D);
                break;
        
            case "T":
                this.setPalo(Palos.T);            
                break;
                
            case "C":
                this.setPalo(Palos.C);            
                break;
           
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.valor);
        hash = 89 * hash + Objects.hashCode(this.palo);
        return hash;
    }

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
        return this.palo == other.palo;
    }

    @Override
    public String toString() {
        return valor + " de " + palo.getPalo();
    }

    @Override
    public int compareTo(Carta t) {
        
        int aux = this.palo.compareTo(t.palo);

        if (aux == 0) {

            aux = this.valor.compareTo(t.valor);
        }
        return aux;

    }


    
  


}

package robots;

import java.util.Random;

/**
 *
 * @author javiakasino
 */
public class Robot implements Comparable<Robot> {

    private int numeroSerie;
    private int vida;

    public Robot() {

        this.numeroSerie = numeroRandomEntre(10000, 99999);
        this.vida = numeroRandomEntre(0, 100);
    }

    public Robot(int numeroSerie, int vida) {
        this.numeroSerie = numeroSerie;
        this.vida = vida;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Robot Nº: " + numeroSerie + " - Vida: " + vida + "%";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.numeroSerie;
        hash = 29 * hash + this.vida;
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
        final Robot other = (Robot) obj;

        return this.numeroSerie == other.numeroSerie;
    }

    @Override
    public int compareTo(Robot t) {

        return this.vida - t.vida;

    }

    //Da un entero aleatorio dado el intervalo
    public static int numeroRandomEntre(int valorMin, int valorMax) {

        Random numeroAleatorio = new Random();
        int aleatorio;

        try {

            aleatorio = numeroAleatorio.nextInt(valorMax - valorMin + 1) + valorMin;

        } catch (IllegalArgumentException iae) {

            aleatorio = numeroAleatorio.nextInt(valorMin - valorMax + 1) + valorMax;

        }

        return aleatorio;

    }
    
    
    
}

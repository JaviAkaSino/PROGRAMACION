package javierparodipinero.newpackage;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author javiakasino
 */
public class Calcetin2 {

    private Color color;
    private int talla;

    private static final int TALLA_MIN = 40, TALLA_MAX = 43;
    private static int contador = 1;

    //Constructor por defecto (Random)
    public Calcetin2() {

        this.color = colorRandom();
        this.talla = numeroAleatorioEntre(TALLA_MIN, TALLA_MAX);
        
        contador++;
    }

    //Constructor parametrizado, se elige posición del color y talla
    public Calcetin2(Color color, int talla) {
        this.color = color;
        this.talla = talla;
        
        contador++;
    }

    //Enum con los colores posibles
    public enum Color {
        NEGRO, GRIS_CLARO, GRIS_OSCURO
    }

    //Crea un color aleatorio
    private Color colorRandom() {

        int posicion = numeroAleatorioEntre(0, (Color.values().length - 1));

        return Color.values()[posicion];
    }


    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Calcetín: Color: " + color + ", talla: " + talla;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.color);
        hash = 67 * hash + this.talla;
        return hash;
    }
    
    //Dos calcetines serán iguales cuando tengan el mismo color y talla
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
        final Calcetin2 other = (Calcetin2) obj;
        if (this.talla != other.talla) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }

    //Crea un número aleatorio
    //Lo iba a incluir en una clase Utilidades, pero al no haber más métodos
    //necesarios, vi mejor incluirlo aquí directamente
    public static int numeroAleatorioEntre(int valorMin, int valorMax) {

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

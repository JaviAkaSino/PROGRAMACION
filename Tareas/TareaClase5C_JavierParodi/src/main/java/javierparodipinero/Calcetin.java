package javierparodipinero;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author javiakasino
 */
public class Calcetin {

    private String color;
    private int talla;

    private static final int TALLA_MIN = 40, TALLA_MAX = 43;
    private static int contador = 1;

    //Constructor por defecto (Random)
    public Calcetin() {

        this.color = String.valueOf(colorRandom());
        this.talla = numeroAleatorioEntre(TALLA_MIN, TALLA_MAX);
        
        contador++;
    }

    //Constructor parametrizado, se elige posición del color y talla
    public Calcetin(int numeroColor, int talla) {
        this.color = String.valueOf(Colores.values()[numeroColor]);
        this.talla = talla;
        
        contador++;
    }

    //Enum con los colores posibles
    private enum Colores {
        negro, grisClaro, grisOscuro
    }

    //Crea un color aleatorio
    private Colores colorRandom() {

        int posicion = numeroAleatorioEntre(0, (Colores.values().length - 1));

        return Colores.values()[posicion];
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        final Calcetin other = (Calcetin) obj;
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

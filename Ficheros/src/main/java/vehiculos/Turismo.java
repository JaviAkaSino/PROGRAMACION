package vehiculos;

import java.util.Random;

/**
 *
 * @author javiakasino
 */
public class Turismo extends Vehiculo {

    private int numeroPuertas;
    private boolean marchaAutomatica;

    public Turismo(int numeroPuertas, boolean marchaAutomatica, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa) {
        super(bastidor, matricula, marca, modelo, color, tarifa);
        this.numeroPuertas = numeroPuertas;
        this.marchaAutomatica = marchaAutomatica;
    }

    public Turismo() {
        Random rnd = new Random();
        this.numeroPuertas = 5;
        this.marchaAutomatica = rnd.nextBoolean();
    }
    
    
    

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public boolean getMarchas() {
        return marchaAutomatica;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void setMarchaAutomatica(boolean marchaAutomatica) {
        this.marchaAutomatica = marchaAutomatica;
    }
    
    
    @Override
    public String toString() {

        return super.toString() + ";" + numeroPuertas + ";" + marchaAutomatica;

    }

}

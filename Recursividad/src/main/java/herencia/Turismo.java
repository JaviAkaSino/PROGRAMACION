package herencia;

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
    public String getAtributos() {

        return super.getAtributos() + ", puertas: " + numeroPuertas + ", marcha automática: " + marchaAutomatica;

    }

}

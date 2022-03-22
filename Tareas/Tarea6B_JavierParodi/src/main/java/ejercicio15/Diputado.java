package ejercicio15;

/**
 *
 * @author javiakasino
 */
public class Diputado extends Legislador {

    private int numeroAsiento;

    public Diputado(int numeroAsiento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.numeroAsiento = numeroAsiento;
    }

    public Diputado(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public Diputado() {
        this.numeroAsiento = 0;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    @Override
    public String toString() {
        return "Diputado{" + super.toString() + "numeroAsiento=" + numeroAsiento + '}';
    }

    @Override
    public String getCamara() {

        return "Es Senador";
    }

}

package herencia;

/**
 *
 * @author javiakasino
 */
public class CelulaAnimal extends Celula {

    protected Forma forma; //Forma de la célula, enum descrito al final
    protected int numeroLisosomas; //Número de lisosomas
    protected int numeroCentriolos; //Número de centriolos

    //Parametrizado completo
    public CelulaAnimal(Forma forma, int numeroLisosomas, int numeroCentriolos, double tamanioMicras, boolean pluricelular, int numeroMitocondrias, boolean viva) {
        super(tamanioMicras, pluricelular, numeroMitocondrias, viva);
        this.forma = forma;
        this.numeroLisosomas = numeroLisosomas;
        this.numeroCentriolos = numeroCentriolos;
    }

    //Defecto célula pero parámetros animal
    public CelulaAnimal(Forma forma, int numeroLisosomas, int numeroCentriolos) {
        this.forma = forma;
        this.numeroLisosomas = numeroLisosomas;
        this.numeroCentriolos = numeroCentriolos;
    }

    //Por defecto
    public CelulaAnimal() {
    }

    public Forma getForma() {
        return forma;
    }

    public void setForma(Forma forma) {
        this.forma = forma;
    }

    public int getNumeroLisosomas() {
        return numeroLisosomas;
    }

    public void setNumeroLisosomas(int numeroLisosomas) {
        this.numeroLisosomas = numeroLisosomas;
    }

    public int getNumeroCentriolos() {
        return numeroCentriolos;
    }

    public void setNumeroCentriolos(int numeroCentriolos) {
        this.numeroCentriolos = numeroCentriolos;
    }

    @Override
    public String toString() {
        return "CelulaAnimal{" + super.toString() + "forma=" + forma + ", numeroLisosomas=" + numeroLisosomas + ", numeroCentriolos=" + numeroCentriolos + '}';
    }

    public void lisosomasCentriolos() { //Imprime en consola la comparación entre centriolos y lisosomas

        if (this.numeroCentriolos > this.numeroLisosomas) {

            System.out.println("La célula tiene más centriolos que lisosomas");
        } else if (this.numeroCentriolos < this.numeroLisosomas) {

            System.out.println("La célula tiene más lisosomas que centriolos");

        } else {
            System.out.println("Tiene el mismo número de centriolos que de lisosomas");

        }

    }

    @Override //Método abstracto sobreescrito de Celula y que sobreescribirá CelulaNerviosa
    public String tipoCelula() { //String que define el tipo de célula

        return "Es una célula animal";
    }

    public String caracteristicaPrincipal() {

        return ("Su forma es " + this.forma);
    }

    @Override
    public int compareTo(Celula o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public enum Forma {

        PIRAMIDAL, ESFERICA, CUBICA, ESTRELLADA, PLANA
    }
}

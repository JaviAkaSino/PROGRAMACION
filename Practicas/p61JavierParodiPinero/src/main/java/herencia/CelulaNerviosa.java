package herencia;

/**
 *
 * @author javiakasino
 */
public class CelulaNerviosa extends CelulaAnimal {

    private double longitudDentritas; //Longitud de las dentritas en miras
    private boolean unipolar; //Si la célula es unipolar, true; si es bipolar, false
    private String nombre; //Nombre de la célula (neurona, etc)

    public CelulaNerviosa(double longitudDentritas, boolean unipolar, String nombre, Forma forma, int numeroLisosomas, int numeroCentriolos, double tamanioMicras, boolean pluricelular, int numeroMitocondrias, boolean viva) {
        super(forma, numeroLisosomas, numeroCentriolos, tamanioMicras, pluricelular, numeroMitocondrias, viva);
        this.longitudDentritas = longitudDentritas;
        this.unipolar = unipolar;
        this.nombre = nombre;
    }

    public CelulaNerviosa(double longitudDentritas, boolean unipolar, String nombre, Forma forma, int numeroLisosomas, int numeroCentriolos) {
        super(forma, numeroLisosomas, numeroCentriolos);
        this.longitudDentritas = longitudDentritas;
        this.unipolar = unipolar;
        this.nombre = nombre;
    }

    public CelulaNerviosa(double longitudDentritas, boolean unipolar, String nombre) {
        this.longitudDentritas = longitudDentritas;
        this.unipolar = unipolar;
        this.nombre = nombre;
    }

    public CelulaNerviosa() {
    }

    public double getLongitudDentritas() {
        return longitudDentritas;
    }

    public void setLongitudDentritas(double longitudDentritas) {
        this.longitudDentritas = longitudDentritas;
    }

    public boolean isUnipolar() {
        return unipolar;
    }

    public void setUnipolar(boolean unipolar) {
        this.unipolar = unipolar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "CelulaNerviosa{" + super.toString() + "longitudDentritas=" + longitudDentritas + ", unipolar=" + unipolar + ", nombre=" + nombre + '}';
    }

    @Override //Método abstracto sobreescrito de Celula 
    public String tipoCelula() { //String que define el tipo de célula

        return "Es una célula nerviosa llamada " + this.nombre;
    }

    @Override //Sobreescrito de CelulaAnimal
    public String caracteristicaPrincipal() {

        return ("Su nombre es " + this.nombre);
    }

    public void numeroDentritas() {

        System.out.println("Las dentritas de una " + nombre + " miden " + this.longitudDentritas + " micras");
    }
}

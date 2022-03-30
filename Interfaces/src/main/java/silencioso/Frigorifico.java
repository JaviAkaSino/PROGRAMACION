package silencioso;

/**
 *
 * @author javiakasino
 */
public class Frigorifico extends Electrodomestico implements Silencioso, Comparable<Frigorifico> {

    private double capacidad;

    public Frigorifico(double capacidad, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidad = capacidad;
    }

    public Frigorifico() {
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Frigorifico{" + super.toString() + "capacidad=" + capacidad + '}';
    }

    @Override
    public void silencio() {
        System.out.println("El frigorífico de modelo " + this.getModelo() + " emite 50dB");
    }

    @Override
    public int compareTo(Frigorifico t) {

        return this.compareTo(t);

    }

}

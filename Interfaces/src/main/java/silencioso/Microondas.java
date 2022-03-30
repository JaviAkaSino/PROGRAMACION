package silencioso;

/**
 *
 * @author javiakasino
 */
public class Microondas extends Electrodomestico implements Silencioso, Comparable<Microondas> {

    private double potencia;

    public Microondas(int potencia, double consumo, String modelo) {
        super(consumo, modelo);
        this.potencia = potencia;
    }

    public Microondas() {
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Microondas{" + super.toString() + "potencia=" + potencia + '}';
    }

    @Override
    public void silencio() {

        System.out.println("El microondas de consumo " + this.getConsumo() + " emite 40 dB");

    }

    @Override
    public int compareTo(Microondas t) {

        return (int) (this.potencia - t.potencia);
        //return  (new Double(this.potencia)).compareTo(new Double t.potencia);

    }

}

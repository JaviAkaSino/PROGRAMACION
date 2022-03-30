package silencioso;

/**
 *
 * @author javiakasino
 */
public class CampanaExtractora extends Electrodomestico {

    private double decibelios; //No menos de 50dB

    public CampanaExtractora() {
    }

    public CampanaExtractora(double decibelios, double consumo, String modelo) {
        super(consumo, modelo);
        this.decibelios = decibelios;
        if (decibelios < 50) {
            this.decibelios = 50;
        }

    }

    public double getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(double decibelios) {
        this.decibelios = decibelios;
        if (decibelios < 50) {
            this.decibelios = 50;
        }

    }

    @Override
    public String toString() {
        return "CampanaExtractora{" + "decibelios=" + decibelios + '}';
    }

}

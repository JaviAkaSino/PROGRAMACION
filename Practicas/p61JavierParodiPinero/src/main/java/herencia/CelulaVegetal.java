package herencia;

/**
 *
 * @author javiakasino
 */
public class CelulaVegetal extends Celula {

    private int numeroCloroplastos;
    private double grosorPared;

    public CelulaVegetal(int numeroCloroplastos, double grosorPared, double tamanioMicras, boolean pluricelular, int numeroMitocondrias, boolean viva) {
        super(tamanioMicras, pluricelular, numeroMitocondrias, viva);
        this.numeroCloroplastos = numeroCloroplastos;
        this.grosorPared = grosorPared;
    }

    public CelulaVegetal(int numeroCloroplastos, double grosorPared) {
        this.numeroCloroplastos = numeroCloroplastos;
        this.grosorPared = grosorPared;
    }

    public CelulaVegetal() {
    }

    public int getNumeroCloroplastos() {
        return numeroCloroplastos;
    }

    public void setNumeroCloroplastos(int numeroCloroplastos) {
        this.numeroCloroplastos = numeroCloroplastos;
    }

    public double getGrosorPared() {
        return grosorPared;
    }

    public void setGrosorPared(double grosorPared) {
        this.grosorPared = grosorPared;
    }

    @Override
    public String toString() {
        return "CelulaVegetal{" + super.toString() + "numeroCloroplastos=" + numeroCloroplastos + ", grosorPared=" + grosorPared + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.numeroCloroplastos;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.grosorPared) ^ (Double.doubleToLongBits(this.grosorPared) >>> 32));
        return hash;
    }

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
        final CelulaVegetal other = (CelulaVegetal) obj;
        if (this.numeroCloroplastos != other.numeroCloroplastos) {
            return false;
        }
        return Double.doubleToLongBits(this.grosorPared) == Double.doubleToLongBits(other.grosorPared);
    }

    @Override //Método abstracto sobreescrito de Celula 
    public String tipoCelula() {

        return "Es una célula vegetal";
    }

    @Override
    public int compareTo(Celula o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

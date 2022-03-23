package herencia;

/**
 *
 * @author javiakasino
 */
public abstract class Celula implements Comparable<Celula>{

    protected double tamanioMicras; //Tamaño en micras de la célula
    protected boolean pluricelular; //Si dan lugar a un organismo pluricelular, true
    protected int numeroMitocondrias; //Media de mitocondrias / célula
    protected boolean viva; //Si está viva, true; false si muerta

    public Celula(double tamanioMicras, boolean pluricelular, int numeroMitocondrias, boolean viva) {
        this.tamanioMicras = tamanioMicras;
        this.pluricelular = pluricelular;
        this.numeroMitocondrias = numeroMitocondrias;
        this.viva = viva;
    }

    public Celula() {
        this.tamanioMicras = 100;
        this.pluricelular = true;
        this.numeroMitocondrias = 50;
        this.viva = true;
    }

    public double getTamanioMicras() {
        return tamanioMicras;
    }

    public void setTamanioMicras(double tamanioMicras) {
        this.tamanioMicras = tamanioMicras;
    }

    public boolean isPluricelular() {
        return pluricelular;
    }

    public void setPluricelular(boolean pluricelular) {
        this.pluricelular = pluricelular;
    }

    public int getNumeroMitocondrias() {
        return numeroMitocondrias;
    }

    public void setNumeroMitocondrias(int numeroMitocondrias) {
        this.numeroMitocondrias = numeroMitocondrias;
    }

    public boolean isViva() {
        return viva;
    }

    public void setViva(boolean viva) {
        this.viva = viva;
    }

    @Override
    public String toString() {
        return "Celula{" + "tamanioMicras=" + tamanioMicras + ", pluricelular=" + pluricelular + ", numeroMitocondrias=" + numeroMitocondrias + ", viva=" + viva + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.tamanioMicras) ^ (Double.doubleToLongBits(this.tamanioMicras) >>> 32));
        hash = 67 * hash + (this.pluricelular ? 1 : 0);
        hash = 67 * hash + this.numeroMitocondrias;
        hash = 67 * hash + (this.viva ? 1 : 0);
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
        final Celula other = (Celula) obj;
        if (Double.doubleToLongBits(this.tamanioMicras) != Double.doubleToLongBits(other.tamanioMicras)) {
            return false;
        }
        if (this.pluricelular != other.pluricelular) {
            return false;
        }
        if (this.numeroMitocondrias != other.numeroMitocondrias) {
            return false;
        }
        return this.viva == other.viva;
    }

    public abstract String tipoCelula(); //Método abstracto

    @Override
    public abstract int compareTo(Celula o);

}

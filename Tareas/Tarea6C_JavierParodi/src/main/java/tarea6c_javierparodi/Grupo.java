package tarea6c_javierparodi;

/**
 *
 * @author javiakasino
 */
public enum Grupo {

    C(17.5), D(18), E(18.5);

    
    private double irpf;

    private Grupo(double irpf) {
        this.irpf = irpf;
    }

    private Grupo() {
    }

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }

    @Override
    public String toString() {
        return "\nGrupo " + this.name() + ": IRPF " + irpf + "%";
    }
    
    
    
}

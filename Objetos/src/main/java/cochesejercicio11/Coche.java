
package cochesejercicio11;

/**
 *
 * @author javiakasino
 */
public class Coche {
    
    private Motor motor;
    private Puerta puertaPiloto, puertaCopiloto;
    private Rueda ruedaDelanteraIzq, ruedaDelanteraDer, ruedaTraseraIzq, 
            ruedaTraseraDer;

    public Coche(Motor motor, Puerta puertaPiloto, Puerta puertaCopiloto, Rueda 
            ruedaDelanteraIzq, Rueda ruedaDelanteraDer, Rueda ruedaTraseraIzq, 
            Rueda ruedaTraseraDer) {
        
        this.motor = motor;
        this.puertaPiloto = puertaPiloto;
        this.puertaCopiloto = puertaCopiloto;
        this.ruedaDelanteraIzq = ruedaDelanteraIzq;
        this.ruedaDelanteraDer = ruedaDelanteraDer;
        this.ruedaTraseraIzq = ruedaTraseraIzq;
        this.ruedaTraseraDer = ruedaTraseraDer;
        
    }

    public Coche() {
        
        
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Puerta getPuertaPiloto() {
        return puertaPiloto;
    }

    public void setPuertaPiloto(Puerta puertaPiloto) {
        this.puertaPiloto = puertaPiloto;
    }

    public Puerta getPuertaCopiloto() {
        return puertaCopiloto;
    }

    public void setPuertaCopiloto(Puerta puertaCopiloto) {
        this.puertaCopiloto = puertaCopiloto;
    }

    public Rueda getRuedaDelanteraIzq() {
        return ruedaDelanteraIzq;
    }

    public void setRuedaDelanteraIzq(Rueda ruedaDelanteraIzq) {
        this.ruedaDelanteraIzq = ruedaDelanteraIzq;
    }

    public Rueda getRuedaDelanteraDer() {
        return ruedaDelanteraDer;
    }

    public void setRuedaDelanteraDer(Rueda ruedaDelanteraDer) {
        this.ruedaDelanteraDer = ruedaDelanteraDer;
    }

    public Rueda getRuedaTraseraIzq() {
        return ruedaTraseraIzq;
    }

    public void setRuedaTraseraIzq(Rueda ruedaTraseraIzq) {
        this.ruedaTraseraIzq = ruedaTraseraIzq;
    }

    public Rueda getRuedaTraseraDer() {
        return ruedaTraseraDer;
    }

    public void setRuedaTraseraDer(Rueda ruedaTraseraDer) {
        this.ruedaTraseraDer = ruedaTraseraDer;
    }

    @Override
    public String toString() {
        return "Coche{" + "motor=" + motor + ", puertaPiloto=" + puertaPiloto + 
                ", puertaCopiloto=" + puertaCopiloto + ", ruedaDelanteraIzq=" + 
                ruedaDelanteraIzq + ", ruedaDelanteraDer=" + ruedaDelanteraDer + 
                ", ruedaTraseraIzq=" + ruedaTraseraIzq + ", ruedaTraseraDer=" + 
                ruedaTraseraDer + '}';
    }
   
    
}

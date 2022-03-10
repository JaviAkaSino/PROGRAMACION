
package cochesejercicio11;

/**
 *
 * @author javiakasino
 */
public class Motor {
    
    private double cilindrada;
    private boolean estado;
    
    public Motor (double cilindrada, boolean estado){
        
        this.cilindrada=cilindrada;
        this.estado = estado;
        
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void arrancar() {
        this.estado = true;
    }
    
    public void apagar() {
        this.estado = false;
    }

    @Override
    public String toString() {
        return "Motor{" + "cilindrada=" + cilindrada + ", estado=" + estado + '}';
    }
    
    
}

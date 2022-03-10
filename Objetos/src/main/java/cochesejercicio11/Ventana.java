package cochesejercicio11;

/**
 *
 * @author javiakasino
 */
public class Ventana {

    private boolean tintada; //true tintada
    private boolean estado; //true abierta

    public Ventana(boolean tintada, boolean estado) {
        
        this.tintada = tintada;
        this.estado = estado;
    }

    public boolean isTintada() {
        return tintada;
    }
    
    //MIIIIIIIIIIIAAAAAAAAAAAAAAAAAAAAAAAAUUUUUUUUUUUUUUU
    
    public String isTintadaString() {
        String txt = tintada?"tintada":"no tintada";
        return txt;
    }

    public void setTintada(boolean tintada) {
        this.tintada = tintada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void bajar() {
        this.estado = true;
    }

    public void subir() {
        this.estado = false;
    }

    @Override
    public String toString() {
        return "Ventana{" + "tintada=" + tintada + ", estado=" + estado + '}';
    }

}

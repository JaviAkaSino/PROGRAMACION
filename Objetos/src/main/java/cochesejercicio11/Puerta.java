
package cochesejercicio11;

/**
 *
 * @author javiakasino
 */
public class Puerta {
    
    private boolean estado; //true abierta
    private Ventana ventana;

    public Puerta(boolean estado, Ventana ventana) {
        this.estado = estado;
        this.ventana = ventana;
    }

    public boolean isEstado() {
        return estado;
    }

    public void abrir() {
        this.estado = true;
    }
    
    public void cerrar() {
        this.estado = false;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    
    //RECORDATORIO: Si ventana no tiene toString(), obtendremos la dirección
    
    @Override
    public String toString() {
        return "Puerta{" + "estado=" + estado + ", ventana=" + ventana + '}';
    }
    
    
    
}

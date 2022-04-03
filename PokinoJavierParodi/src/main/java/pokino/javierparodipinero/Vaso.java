
package pokino.javierparodipinero;

/**
 *
 * @author JaviA
 */
public class Vaso {
    
    private final NombrePremio nombre;
    private double premio;
    private boolean disponible;

    public Vaso(NombrePremio nombre) {
        this.nombre = nombre;
        this.premio = 0;
        this.disponible = true;
    }

    public NombrePremio getNombre() {
        return nombre;
    }

    public double getPremio() {
        return premio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        
        if (this.disponible){
            
            return "[ ]" + nombre + " \tBote: " + premio + " €";
        }
        return "[X]" + nombre + " \tBote: " + premio + " €";
    }
    
    
    
    public enum NombrePremio {
        
        CENTRO, ESQUINA, ESTAMPA, POKER, FULL, POKINO
    }
    
}

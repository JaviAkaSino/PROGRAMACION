package arraylist;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author javiakasino
 */
public class Propuesta {

    private int numeroPropuesta;
    private int numeroPersona;
    private String nombrePersona;  
    private String sitio;
    private LocalDate fecha;
    
    private static int contador;

    //Constructor por defecto para que se creen sólos con un número único
    public Propuesta(int numeroPersona, String nombrePersona, String sitio, LocalDate fecha) {
        this.numeroPropuesta = contador;
        this.numeroPersona = numeroPersona;
        this.nombrePersona = nombrePersona;
        this.sitio = sitio;
        this.fecha = fecha;
        
        contador++;
    }

    //Constructor para poder crear un objeto con el número que se quiera, para buscarlo 
    public Propuesta(int numeroPropuesta) {
        this.numeroPropuesta = numeroPropuesta;
        

    }
    
    //Constructor para poder crear un objeto sin fecha 
    public Propuesta(int numeroPersona, String nombrePersona, String sitio) {
        this.numeroPropuesta = 0;
        this.numeroPersona = numeroPersona;
        this.nombrePersona = nombrePersona;
        this.sitio = sitio;
        this.fecha = null;

    }
    
    //Constructor para ver los iguales
    public Propuesta(int numeroPersona, String sitio, LocalDate fecha) {
        this.numeroPropuesta = 0;
        this.numeroPersona = numeroPersona;
        this.nombrePersona = "";
        this.sitio = sitio;
        this.fecha = fecha;

    }
    
    
    
    public int getNumeroPropuesta() {
        return numeroPropuesta;
    }

    public void setNumeroPropuesta(int numeroPropuesta) {
        this.numeroPropuesta = numeroPropuesta;
    }

    public int getNumeroPersona() {
        return numeroPersona;
    }

    public void setNumeroPersona(int numeroPersona) {
        this.numeroPersona = numeroPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getSitio() {
        return sitio;
    }

    public void setSitio(String sitio) {
        this.sitio = sitio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Propuesta " + numeroPropuesta + ": -Persona " + numeroPersona + ": " + 
                nombrePersona + " -Sitio: " + sitio + " -Fecha:" + fecha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.numeroPersona;
        hash = 59 * hash + Objects.hashCode(this.sitio);
        hash = 59 * hash + Objects.hashCode(this.fecha);
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
        final Propuesta other = (Propuesta) obj;
        if (this.numeroPersona != other.numeroPersona) {
            return false;
        }
        if (!Objects.equals(this.sitio, other.sitio)) {
            return false;
        }
        return Objects.equals(this.fecha, other.fecha);
    }

    
    
    
    
}
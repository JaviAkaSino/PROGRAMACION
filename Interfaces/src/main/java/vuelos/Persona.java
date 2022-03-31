package vuelos;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author javiakasino
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private NIF nif;

    private static int contador = 0;

    public Persona(String nombre, String apellidos, NIF nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
    }

    public Persona() {
        this.nombre = nombreDefault();
        this.apellidos = apellidoDefault();
        this.nif = new NIF();

        contador++;
    }

    private String nombreDefault() {

        String[] lista = {"Juan", "Carlos", "Antonio", "Gabriel",
            "Eduardo", "Imad", "Javier", "Nacho", "Victoria", "Alvaro"};
        
        return lista[numeroRandomEntre(0, lista.length-1)];
    }

    private String apellidoDefault() {

        String[] lista = {"García", "Sánchez", "Ruiz", "Pérez",
            "Martínez", "Martín", "González", "Camacho", "Piña", "Fernández"};  
        
        return lista[numeroRandomEntre(0, lista.length-1)];
    }

    public void renovarNIF(LocalDate fechaSolicitud) {

        this.nif.renovar(fechaSolicitud);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public NIF getNif() {
        return nif;
    }

    public void setNif(NIF nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + "\t" + nif + "\n";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nif);
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
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nif, other.nif)) {
            return false;
        }
        return true;
    }

    //Da un entero aleatorio dado el intervalo
    public static int numeroRandomEntre(int valorMin, int valorMax) {

        Random numeroAleatorio = new Random();
        int aleatorio;

        try {

            aleatorio = numeroAleatorio.nextInt(valorMax - valorMin + 1) + valorMin;

        } catch (IllegalArgumentException iae) {

            aleatorio = numeroAleatorio.nextInt(valorMin - valorMax + 1) + valorMax;

        }

        return aleatorio;

    }
    
    
}

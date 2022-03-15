package personas;

/**
 *
 * @author javiakasino
 */
public class Persona {
    
    private String nombre, nif;
    private int edad;

    
    //Constructor defecto
    public Persona() {
        this.nombre = "Nombre Apellido";
        this.nif = "00000000A";
        this.edad = 18;
        
    }

    
    //Constructor parametrizado
    public Persona(String nombre, String nif, int edad) {
        this.nombre = nombre;
        this.nif = nif;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public String toString() {
        return "Nombre: " + nombre + ", NIF: " + nif + ", edad: " + edad;
    }
    
    
    
    
}

package trabajadores;

/**
 *
 * @author javiakasino
 */
public class Trabajador {

    private String nombre;
    private String apellido1;
    protected String NIF;

    public Trabajador(String nombre, String apellido1, String NIF) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.NIF = NIF;
    }

    public Trabajador() {
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", NIF=" + NIF + '}';
    }
    
    

    public void cotizar() {
        System.out.println("Cotizando como trabajador");
    }

}

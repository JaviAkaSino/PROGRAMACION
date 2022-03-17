package trabajadores;

/**
 *
 * @author javiakasino
 */

/*4.- ¿Qué diferencia existe entre sobrecargar y sobrescribir un método?*/

/*Sobrecargar un método consiste en crear varias versiones de un mismo método, 
es decir, definir nuevos métodos. Sobreescribir consiste en la ocultación de 
un método con una nueva definición de ese método.

+SOBRECARGA:
    - Firma del método cambia (parámetros)
    - Propia clase

+SOBREESCRITURA:
    - La firma del método no cambia
    - Jerarquía de clases
*/

public abstract class Trabajador {

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
    
    
    public abstract void cotizar();

}

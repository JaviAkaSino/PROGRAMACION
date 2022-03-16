package trabajadores;

/**
 *
 * @author javiakasino
 */
public class Camarero extends Trabajador {

    private String rango;

    public Camarero(String rango, String nombre, String apellido1, String NIF) {
        super(nombre, apellido1, NIF);
        this.rango = rango;
    }

    public Camarero() {
        super(); //Va implícito, no necesario

    }

    public Camarero(String rango) {
        super();
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }


    @Override
    public String toString() {
        return super.toString() + "\nCamarero{" + "rango=" + rango + '}';
    }

    @Override
    public void cotizar() {
        System.out.println("Cotizando como camarero");
    }

    
    public void servirMesa(String id) {
        System.out.println("Camarero sirviendo la mesa " + id);
    }
}

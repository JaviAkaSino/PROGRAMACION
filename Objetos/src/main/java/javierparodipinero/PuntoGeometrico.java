package javierparodipinero;

/**
 *
 * @author javiakasino
 */
public class PuntoGeometrico {

    /*4. Crea la clase PuntoGeometrico que permita gestionar coordenadas (x,y) 
    en un plano de dos dimensiones. Esas coordenadas serán números reales. 
    Incluye los siguientes métodos: constructores (por defecto y parametrizado) 
    y métodos get y set. En una clase de prueba, con el método main(), crea un 
    par de objetos y prueba los métodos get y set.*/
    
    //Atributos
    private double x, y;

    //Constructor por defecto
    public PuntoGeometrico() {
        this.x = 0;
        this.y = 0;
    }

    //Constructor parametrizado
    public PuntoGeometrico(double x, double y) {
        this.x = x;
        this.y = y;
    }

    
    //Getter and setter
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "PuntoGeometrico{" + "x=" + x + ", y=" + y + '}';
    }

    
    
}

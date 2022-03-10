package javierparodipinero;

/**
 *
 * @author javiakasino
 */
//Partes de una clase
//Definición
//Atributos encapsulados, campos, propiedades
//Métodos
//Constructores
//Getters y Setters
//toString
//Implicación utilidad public y private, en los miembros de  una clase (atrib y met)
//Encapsulamiento
public class Cafetera {

    /*8.  Desarrolla una clase Cafetera con atributos capacidadMaxima (la cantidad 
    máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual 
    de café que hay dentro de la cafetera). Implementa, al menos, los siguientes métodos:*/
    private double capacidadMaxima, cantidadActual;

    /*Constructor predeterminado, sin parámetros: establece la capacidad máxima en 1000 (c.c.) y 
    la cantidad actual en cero (cafetera vacía).*/
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;

    }

    /*Constructor, que recibe sólo la capacidad máxima de la cafetera; inicializa la cantidad actual
    de café igual a la capacidad máxima (cafetera llena).*/
    public Cafetera(double capacidadMaxima) {

        this.capacidadMaxima = capacidadMaxima;

        if (capacidadMaxima < 0) {

            this.capacidadMaxima = 0;
        }
        this.cantidadActual = this.capacidadMaxima;

    }

    /*Constructor, que recibe la capacidad máxima y la cantidad actual. Si la cantidad actual que 
    se pasa es mayor que la capacidad máxima de la cafetera, se ajustará la cantidad actual 
    a la capacidad máxima.*/
    public Cafetera(double capacidadMaxima, double cantidadActual) {

        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;

        if (capacidadMaxima < 0) {

            this.capacidadMaxima = 0;
        }

        if (cantidadActual < 0) {

            this.cantidadActual = 0;
        } 
        
        if (this.capacidadMaxima < this.cantidadActual) {

            this.cantidadActual = this.capacidadMaxima;

        }

    }

    /*llenarCafetera(): hace que la cantidad actual sea igual a la capacidad.*/
    public void llenarCafetera() {

        this.cantidadActual = this.capacidadMaxima;

    }

    /*servirTaza(double cantidadAServir): simula la acción de servir una taza con la capacidad 
    indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.*/
    public void servirTaza(double cantidadAServir) {

        this.cantidadActual -= Math.abs(cantidadAServir);

        if (this.cantidadActual < 0) {

            this.cantidadActual = 0;
        }

    }

    /*vaciarCafetera(): pone la cantidad de café actual en cero.*/
    public void vaciarCafetera() {

        this.cantidadActual = 0;

    }

    /*agregarCafe(double cantidadAgregar): añade a la cafetera la cantidad de café indicada, 
     teniendo en cuenta que la cafetera no puede rebosar.*/
    public void agregarCafe(double cantidadAgregar) {

        this.cantidadActual += cantidadAgregar;

        if (this.cantidadActual > this.capacidadMaxima) {

            this.cantidadActual = this.capacidadMaxima;

        }

    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

}

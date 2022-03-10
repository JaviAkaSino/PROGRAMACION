package javierparodipinero;

/**
 *
 * @author javiakasino
 */
public class Linea {

    /*6. Define una clase Linea con dos atributos de la clase PuntoGeométrico: 
    puntoA y puntoB. Estos puntos representarán el inicio y el fin de la línea 
    en un plano. La clase dispondrá de los siguientes métodos:*/
    private PuntoGeometrico puntoA, puntoB;

//Linea() - Constructor por defecto
//Constructor predeterminado que crea una línea con sus dos puntos como (0,0) y (1,1).
    public Linea() {

        this.puntoA = new PuntoGeometrico(0, 0);

        this.puntoB = new PuntoGeometrico(1, 1);

    }

//Linea(Punto A, Punto B) - Constructor parametrizado
//Constructor que recibe como parámetros dos objetos de la clase PuntoGeométrico, 
//que son utilizados para inicializar los atributos.
//
    public Linea(PuntoGeometrico puntoA, PuntoGeometrico puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

//mueveDerecha(double x)
//Desplaza la línea a la derecha a la distancia que se indique.
//
    public void mueveDerecha(double x) {

        this.puntoA.setX(this.puntoA.getX() + x);

        this.puntoB.setX(this.puntoB.getX() + x);

    }

//mueveIzquierda(double x)
//Desplaza la línea a la izquierda a la distancia que se indique.
    public void mueveIquierda(double x) {

        this.puntoA.setX(this.puntoA.getX() - x);
        
        this.puntoB.setX(this.puntoB.getX() - x);

    }

//mueveArriba(double y)
//Desplaza la línea hacia arriba a la distancia que se indique.
    
    public void mueveArriba(double y) {

        this.puntoA.setY(this.puntoA.getY() + y);

        this.puntoB.setY(this.puntoB.getY() + y);

    }
//
//mueveAbajo(double y)
//Desplaza la línea hacia abajo a la distancia que se indique.

    public void mueveAbajo(double y) {

        this.puntoA.setY(this.puntoA.getY() - y);

        this.puntoB.setY(this.puntoB.getY() - y);

    }
    
//Métodos get y set.
    public PuntoGeometrico getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(PuntoGeometrico puntoA) {
        this.puntoA = puntoA;
    }

    public PuntoGeometrico getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(PuntoGeometrico puntoB) {
        this.puntoB = puntoB;
    }

    //MostrarLinea()
//Permite mostrar información de la línea de la siguiente forma:
//[(puntoA),(puntoB)]. Por ejemplo: [(1.2),(1.5) , (2.2),(2.5)].
    public void MostrarLinea(){
        
        System.out.println("[ (" + this.puntoA.getX() + "," + this.puntoB.getY()+ ") "
                + ", (" + this.puntoB.getX() + "," + this.puntoB.getY() + ") ]" );

    }
    
    @Override
    public String toString() {
        return "Linea{" + "puntoA=" + puntoA + ", puntoB=" + puntoB + '}';
    }

}

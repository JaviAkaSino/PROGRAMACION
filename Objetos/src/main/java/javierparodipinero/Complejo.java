package javierparodipinero;

/**
 *
 * @author javiakasino
 */
public class Complejo {

    /*1.Crea una clase Complejo que permita trabajar con números complejos
    (parte real y parte imaginaria). Se define cada número complejo z como un 
    par ordenado de números reales: z = (a, b). A su vez el primer elemento a 
    se define como parte real de z, se denota a=Re(z); el segundo elemento b se 
    define como parte imaginaria de z, se denota b=Im(z). Incluye los siguientes
    métodos: constructores (por defecto y parametrizado) y métodos get, set y 
    toString.*/
    //Atributos
    private double a, b;
    private static int contador = 0;

    //Constructor por defecto
    public Complejo() {

        this.a = 0;

        this.b = 0;

        contador++;

    }

    //Constructor parametrizado
    public Complejo(double a, double b) {

        this.a = a;

        this.b = b;

        contador++;

    }
    
    //Constructor copia
    
    public Complejo(Complejo h){
        
        this.a = h.a;
        
        this.b = h.b;
        
        contador++;
        
    }

    //Getter, setter y toString
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public String toString() {
        return "Complejo: " + "z = (" + a + ", " + b + ")";
    }

    /*2. Incluye en la clase Complejo los métodos de clase: suma, resta, 
    multiplicación, división e igualdad. Echa un vistazo en Wikipedia. 
    Incluye un contador de instancias para la clase. En una nueva clase, 
    que incluya el método main(), crea un par de objetos de tipo Complejo.
    muestra sus datos por consola, comprueba que el contador de instancias
    muestra los datos correctamente y ejecuta las operaciones definidas en 
    la clase (suma, resta, …).*/
    public static Complejo suma(Complejo x, Complejo y) {

        double m = x.a + y.a;

        double n = x.b + y.b;

        return new Complejo(m, n);
    }

    public static Complejo resta(Complejo x, Complejo y) {

        double m = x.a - y.a;

        double n = x.b - y.b;

        Complejo resultadoResta = new Complejo(m, n);

        return resultadoResta;
    }

    public static Complejo multiplicacion(Complejo x, Complejo y) {

        double m = x.a * y.a - x.b * y.b;

        double n = x.a * y.b + x.b * y.a;

        Complejo producto = new Complejo(m, n);

        return producto;
    }

    public static Complejo division(Complejo x, Complejo y) {

        double m = (x.a * y.a + x.b * y.b) / 
                (Math.pow(y.a, 2) + Math.pow(y.b, 2));

        double n = (x.b * y.a - x.a * y.b) / 
                (Math.pow(y.a, 2) + Math.pow(y.b, 2));

        return new Complejo(m, n);
    }

    public static boolean igualdad(Complejo x, Complejo y) {

        double m = x.a - y.a;

        double n = x.b - y.b;

        return (m == 0 && n == 0);

    }

  
    
}

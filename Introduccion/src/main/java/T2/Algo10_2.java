
package T2;

//Imports
import java.util.Scanner;
        
public class Algo10_2 {

    public static void main(String[] args) {
        /*
        Realiza otro programa para calcular el espacio recorrido del 
        cuerpo en función de su velocidad y tiempo de movimiento.
        */
        
        //Declaramos variables, constantes y Scanner
        
        Scanner teclado = new Scanner(System.in);
        double velKmH;
        double velMMin;
        double timeMin;
        double distancia;
        final double KMH_MMIN = 1000.0 / 60;
        
        //Lanzamos preguntas y recogemos datos
        
        System.out.println("¿A qué velocidad va el cuerpo?");
        
        velKmH = teclado.nextDouble();
        
        System.out.println("¿Durante cuántos minutos?");
        
        timeMin = teclado.nextDouble();
        
        //Calculamos distancia pasando de Km/h a m/min y multiplicando.
        velMMin = velKmH * KMH_MMIN;
        
        distancia = velMMin * timeMin;
        
        System.out.println("La distancia recorrida por el cuerpo es de " + 
                distancia + " metros.");
        
    }
    
}

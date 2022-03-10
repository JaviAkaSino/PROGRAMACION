//Nombre del paquete
package T2;

//Imports
import java.util.Scanner;

public class Algo09 {

    //Método main
    public static void main(String[] args) {

        /*Una empresa de juguetes se dedica a realizar cometas como las 
que figuran en la imagen de la derecha. Necesitan saber el área de tela a 
emplear según las medidas de las diagonales que hay entre los puntos A y C, 
y entre B y D.*/
        //Declaramos y construimos Scanner, declaramos variables.
        Scanner teclado = new Scanner(System.in);

        double diagonalAC;
        double diagonalBD;

        double area;

        //Lanzamos pregunta y recogemos respuseta
        System.out.println("¿Cuántos centímetros mide la diagonal que va"
                + " entre A y C?");

        diagonalAC = teclado.nextDouble();

        System.out.println("¿Y la diagonal BD?");

        diagonalBD = teclado.nextDouble();

        //Calculamos área con la fórmula del rombo d*D/2 y lanzamos result.
        area = diagonalAC * diagonalBD / 2;

        System.out.println("El área de la tela de la cometa es de " + area
                + " centímetros cuadrados");

    }

}

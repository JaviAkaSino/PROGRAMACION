package figuras;

import java.util.ArrayList;

/**
 *
 * @author javiakasino
 */
public class Jerarquia {

    public static void main(String[] args) {

        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Rectangulo(10, 12)); // Base=10 Altura=12
        figuras.add(new Triangulo(10, 5)); // Base=10 Altura=5
        figuras.add(new Romboide(15, 5)); // Base=15, Altura=5 

        //De las clases abstractas no se puede instanciar, sí de sus hijas
        //Figura f = new Figura();
        //Pero sí referencias
        //Figura f = new Triangulo(2,2);
        //Se tienen que implementar TODOS los métodos abstract en todas las hijas
        //-----------------------//
        for (Figura f : figuras) {
            System.out.println("Área: " + f.calcularArea());
        }
    }
}

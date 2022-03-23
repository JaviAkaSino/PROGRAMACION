package programa;

import herencia.Celula;
import herencia.CelulaAnimal;
import herencia.CelulaNerviosa;
import herencia.CelulaVegetal;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author javiakasino
 */
public class Prueba {

    public static void main(String[] args) {

        Celula a1 = new CelulaAnimal(CelulaAnimal.Forma.PLANA, 100, 100);
        Celula a2 = new CelulaAnimal(CelulaAnimal.Forma.ESFERICA, 50, 150);

        Celula v1 = new CelulaVegetal(50, 3);
        Celula v2 = new CelulaVegetal(200, 5);

        Celula n1 = new CelulaNerviosa(200, true, "Célula Glial");
        Celula n2 = new CelulaNerviosa(100, false, "Neurona");

        ArrayList<Celula> celulas = new ArrayList<>(); //Creamos una lista de células y la llenamos
//Aquí se realizan conversiones implícitas
        celulas.add(a1);
        celulas.add(a2);
        celulas.add(v1);
        celulas.add(v2);
        celulas.add(n1);
        celulas.add(n2);

        //Ordenamos la lista por tamaño
        //Collections.sort(this.celulas, (Celula c1, Celula c2) -> c1.getTamanioMicras().compareTo(c2.getTamanioMicras());

        //Imprimimos el tipo de cada celula con su metodo abstracto sobreescrito en todas las subclases
        for (Celula c : celulas) {

            System.out.println(c);
            System.out.println("Tipo: " + c.tipoCelula());

        }

    }

}

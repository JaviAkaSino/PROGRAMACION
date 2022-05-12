package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author javiakasino
 */
public class Prueba {

    public static void main(String[] args) {

        String fichero = "escaleraColor.txt";
        
        ArrayList<Ronda> listaRondas = Lectura.lecturaRondas(fichero);

        System.out.println(listaRondas);

    }
    
}

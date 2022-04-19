package matriznumeros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author javiakasino
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String fichero = "matriz.txt";

        /*Números que empiecen el el 100, al avanzar una posición en la
        fila, sume x; y al avanzar una posición en la columna, sume y.*/
        final int NUMERO_PARTIDA = 100;
        final int INCREMENTO_FILA = 1;
        final int INCREMENTO_COLUMNA = 100;
        final int NUMERO_FILAS = 4;
        final int NUMERO_COLUMNAS = 4;

        int variable = NUMERO_PARTIDA;

        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(fichero))) {

            for (int i = 0; i < NUMERO_FILAS; i++) { //Para el numero de filas

                variable += INCREMENTO_COLUMNA * i; //Se le suma el número de filas avanzadas por el valor

                for (int j = 0; j < NUMERO_COLUMNAS; j++) { //Para el numero de columnas

                    //Se le suma el número de columnas avanzadas por el valor
                    flujo.write(variable + INCREMENTO_FILA * j + "\t"); //Y tabula

                }

                flujo.write("\n"); //Salto de línea
                variable = NUMERO_PARTIDA; //Se resetea a 100
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

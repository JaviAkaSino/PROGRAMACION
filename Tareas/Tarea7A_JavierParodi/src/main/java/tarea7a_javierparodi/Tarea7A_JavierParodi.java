package tarea7a_javierparodi;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.WeekFields.ISO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author javiakasino
 */
public class Tarea7A_JavierParodi {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        // Fichero a leer
        String idFichero = "RelPerCen.csv";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        ArrayList<Empleado> lista = new ArrayList<>();

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( BufferedReader datosFichero = new BufferedReader(new InputStreamReader(new FileInputStream(idFichero)))) {

            datosFichero.(); //Salta la primera linea
            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine(); //Se lee la línea
                System.out.println(linea); // Se imprime en pantalla

                tokens = linea.split(",");

                System.out.println(Arrays.toString(tokens));

                Empleado e = new Empleado();

                e.setNombre(tokens[0]);
                e.setId(tokens[1]);
                e.setPuesto(tokens[2]);
                e.setFechaToma(LocalDate.parse(tokens[3], DateTimeFormatter.ISO_LOCAL_DATE));
                e.setFechaCese(LocalDate.parse(tokens[4], DateTimeFormatter.ISO_LOCAL_DATE));
                e.setTelefono(tokens[5]);

                e.setEvaluador(tokens[6]);
                e.setCoordinador(tokens[7]);

                lista.add();

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public boolean siNoBoolean(String respuesta) {

        if (respuesta.equalsIgnoreCase("SI") || respuesta.equalsIgnoreCase("SÍ")) {

            return true;
        }

        return false;

    }

}

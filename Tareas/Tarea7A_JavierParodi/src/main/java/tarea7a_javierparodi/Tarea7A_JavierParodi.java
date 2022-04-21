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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( BufferedReader datosFichero = new BufferedReader(new InputStreamReader(new FileInputStream(idFichero), "UTF-8"))) {

            
            // Mientras haya líneas por leer
            while ((linea = datosFichero.readLine())!=null) { //Se lee la línea si la hay

                 
                //System.out.println(linea); // Se imprime en pantalla

                tokens = linea.split(",");

                //System.out.println(Arrays.toString(tokens));

                Empleado e = new Empleado();

                e.setNombre(tokens[0] + tokens[1]);
                e.setId(tokens[2]);
                e.setPuesto(tokens[3]);
                e.setFechaToma(LocalDate.parse(tokens[4], formatter));
                e.setFechaCese(LocalDate.parse(tokens[5], formatter));
                
                e.setTelefono(tokens[6]);

                e.setEvaluador(siNoBoolean(tokens[7]));
                e.setCoordinador(siNoBoolean(tokens[0]));

                lista.add(e);

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }         
        
        System.out.println(lista);

    }

    public static boolean siNoBoolean(String respuesta) {

        if (respuesta.equalsIgnoreCase("SI") || respuesta.equalsIgnoreCase("SÍ")) {

            return true;
        }

        return false;

    }

}

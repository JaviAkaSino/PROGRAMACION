package tarea7a_javierparodi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author javiakasino
 */
public class Tarea7A_JavierParodi {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //LECTURA DEL FICHERO RelPerCen.csv
        // Fichero a leer
        String idFichero = "RelPerCen.csv";

        // Variables para guardar los datos que se van leyendo y lista
        String[] tokens;
        String linea;
        ArrayList<Empleado> lista = new ArrayList<>();

        System.out.println("LECTURA DEL FICHERO: " + idFichero + "\n");

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources para cerrar recursos una vez finalizadas las operaciones con el archivo
        try (BufferedReader datosFichero = new BufferedReader(new InputStreamReader(new FileInputStream(idFichero), "UTF-8"))) {

            linea = datosFichero.readLine();

            // Mientras haya líneas por leer
            while ((linea = datosFichero.readLine()) != null) { //Se lee la línea

                System.out.println(linea); // Se imprime en pantalla

                tokens = linea.split(","); //Se tiene en cuenta la coma como separador

                Empleado e = new Empleado(); //Se crea empleado y set atributos

                e.setNombre(tokens[0].substring(1) + ", " + tokens[1].substring(0, tokens[1].length() - 1));
                e.setId(tokens[2]);
                e.setPuesto(tokens[3]);
                e.setFechaToma(stringFecha(tokens[4]));
                e.setFechaCese(stringFecha(tokens[5]));
                e.setTelefono(tokens[6]);
                e.setEvaluador(siNoBoolean(tokens[7]));
                e.setCoordinador(siNoBoolean(tokens[0]));

                lista.add(e); //Se añade a la lista
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n\nLECTURA DE LA LISTA:\n");
        
        for (Empleado e : lista) { //Imprime la lista

            System.out.println(e);
        }

        //Y el número total de profesores
        System.out.println("\n\nNÚMERO DE PROFESORES: " + lista.size());

        /*Genera un map para almacenar cuantos profesores hay por cada 
        departamento diferente. Vuelca esta información en otro fichero CSV, 
        llamado "profesoresPorDepartamento.csv", separando los campos con un 
        tabulador.*/
        System.out.println("\n\nNÚMERO DE PROFESORES POR DEPARTAMENTO:\n");

        //Llama al método descrito al final
        Map<String, Integer> profesoresDepto = profesoresPorDepartamento(lista);

        //Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        idFichero = "profesoresPorDepartamento.csv";

        //Estructura try-with-resources. Instancia el objeto con el fichero a escribir
        //Se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {

            flujo.write("DEPARTAMENTO\tNº PROFESORES"); //Cabecera

            flujo.newLine();

            for (String depto : profesoresDepto.keySet()) { //Para cada elemento
                // Usamos metodo write() para escribir en el buffer
                flujo.write(depto + "\t" + profesoresDepto.get(depto)); //Escribe los datos

                flujo.newLine(); // Metodo newLine() añade línea en blanco  

                //Lo imprimimos para verificar
                System.out.println(depto + ": " + profesoresDepto.get(depto));
            }

            flujo.flush(); // Metodo flush() guarda cambios en disco 

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        /*Guarda en otro fichero CSV los registros de aquellos empleados que 
        hayan trabajado más de 100 días en el curso 20/21. Ten en cuenta que si 
        la fecha de cese está vacía significa que el empleado está en servicio 
        activo.*/
        System.out.println("\n\nEMPLEADOS CON MÁS DE 100 DÍAS TRABAJADOS:\n");

        //Llama al método descrito al final
        ArrayList<Empleado> empMasDe100 = empleadoMasDeDias(lista, 100l);

        //Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        idFichero = "empleadosMasDe100Dias.csv";

        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {

            //Cabecera
            flujo.write("NOMBRE\tDNI/PASAPORTE\tPUESTO\tFECHA DE TOMA\tFECHA DE CESE\tTELÉFONO\tEVALUADOR\tCOORDINADOR");

            flujo.newLine();

            for (Empleado e : empMasDe100) { //Para cada elemento

                flujo.write(e.toString());

                flujo.newLine();

                System.out.println(e); //Imprime para comprobar
            }

            flujo.flush();

        } catch (IOException ioe) {

            System.out.println(ioe.getMessage());
        }

    }

    //------------------------------- MÉTODOS -------------------------------
    //Transforma un si en true, si no, false
    public static boolean siNoBoolean(String respuesta) {

        return (respuesta.equalsIgnoreCase("SI") || respuesta.equalsIgnoreCase("SÍ"));

    }

    //Parsea fecha String en LocalDate con formato dd/MM/yyyy
    public static LocalDate stringFecha(String fecha) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        if (fecha.isEmpty()) {
            return null;
        }

        return LocalDate.parse(fecha, formatter);
    }

    //Devuelve map <Departamento, nº profesores> dada una lista de profesores
    public static Map<String, Integer> profesoresPorDepartamento(ArrayList<Empleado> listaEmpleados) {

        Map<String, Integer> profesDepto = new TreeMap<>();

        for (Empleado e : listaEmpleados) { //Dado un empleado

            int numeroProfes = 1; //Su departamento lo tiene como trabajador

            for (Empleado m : listaEmpleados) { //Se miran todos los empleados

                //Si no es el mismo empleado pero tiene el mismo puesto
                if (e != m && e.getPuesto().equals(m.getPuesto())) {

                    numeroProfes++; //El departamento/puesto suma otro trabajador
                }
            }
            //Departamento con los trabajadores totales
            profesDepto.put(e.getPuesto(), numeroProfes);

        }

        return profesDepto;
    }

    /*Dada una lista de empleados y una cantidad de días trabajados, devuelve 
    una lista de los que superan esa cantidad de días*/
    public static ArrayList<Empleado> empleadoMasDeDias(ArrayList<Empleado> lista, long dias) {

        ArrayList<Empleado> empleadosMasDeDias = new ArrayList<>();

        for (Empleado e : lista) {

            //Si el número de dáis trabajados es mayor
            if (numeroDiasTrabajados(e) > dias) {

                empleadosMasDeDias.add(e); //Lo añade a la lista que devuelve
            }
        }
        return empleadosMasDeDias;
    }

    //Dado un trabajador, devuelve el número de días que lleva trabajados
    public static long numeroDiasTrabajados(Empleado e) {

        if (e.getFechaCese() != null) { //Si tiene fecha de cese

            //Devuelve la diferencia en días de la fecha de inicio a la de cese
            return ChronoUnit.DAYS.between(e.getFechaToma(), e.getFechaCese());

        } else { //Si sigue trabajando (la fecha de cese es null)

            //Devuelve el número de días trabajados hasta hoy
            return ChronoUnit.DAYS.between(e.getFechaToma(), LocalDate.now());
        }
    }

}

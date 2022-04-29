package p71javierparodi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.reverse;
import java.util.Comparator;
import java.util.Set;

/**
 *
 * @author javiakasino
 */
public class Utils {

    /*A partir de una lista de empleados y un nombre, indique si hay algún 
    empleado con ese nombre.*/
    public static boolean existeNombre(ArrayList<Empleado> lista, String nombre) {

        for (Empleado e : lista) { //Recorre la lista entera

            //Si el nombre de algún empleado es igual al dado, devuelve true
            if (e.getNombre().equalsIgnoreCase(nombre)) {

                return true;
            }
        }

        //Si tras recorrer toda la lista no halla coincidencia, devuelve false
        return false;

    }

    /*A partir de una lista de empleados y un nombre de departamento, indique el 
    número de empleados Coordinadores de ese departamento.*/
    public static int coordinadoresDepto(ArrayList<Empleado> lista, String departamento) {

        int coordinadoresDepto = 0; //Si no hay ninguno, devolverá 0

        for (Empleado e : lista) { //Recorre la lista entera

            //Si el empleado está en el depto dado y es coordinador
            if (e.getPuesto().equalsIgnoreCase(departamento) && e.isCoordinador()) {

                coordinadoresDepto++; //Suma uno al contador
            }
        }
        return coordinadoresDepto; //Devuelve el número de coordinadores
    }

    /*A partir de una lista de empleados y una letra del NIF (char), obtener una 
    nueva lista ordenada alfabéticamente SOLO con los apellidos de los empleados
    cuyo NIF contenga esa letra*/
    public static ArrayList<String> apellidosLetraNif(ArrayList<Empleado> lista, char letra) {

        ArrayList<String> listaApellidos = new ArrayList<>();

        for (Empleado e : lista) { //Recorre la lista entera

            //Compara la letra dada con el último caracter del DNI (longitud-1)
            if (e.getId().charAt(e.getId().length() - 1) == letra) {

                listaApellidos.add(e.getNombre());//GetNombre por ir junto con los apellidos
            }
        }

        return listaApellidos; //Devuelve la lista

    }

    /*A partir de una lista de empleados y una fecha, obtener una nueva lista con 
    los NIF (ordenados de forma inversa) de todos los empleados cuya toma de 
    posesión coincida con esa fecha.*/
    public static ArrayList<String> nifsFechaToma(ArrayList<Empleado> lista, LocalDate fecha) {

        ArrayList<String> listaNifs = new ArrayList<>();

        for (Empleado e : lista) { //Recorre la lista entera

            if (e.getFechaToma().isEqual(fecha)) { //Compara las fechas y si es la misma

                listaNifs.add(e.getId()); //Añade el nif a la lista          
            }
        }

        //El orden natural de los String es el alfabético
        Collections.sort(listaNifs);
        Collections.reverse(listaNifs);
        //Collections.sort(lista, Comparator.reverseOrder());reverse(listaNifs); //Ordena en orden alfabético inverso

        return listaNifs; //Devuelve la lista
    }

}

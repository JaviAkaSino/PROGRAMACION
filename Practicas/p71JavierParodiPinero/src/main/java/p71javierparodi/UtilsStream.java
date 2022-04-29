package p71javierparodi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author javiakasino
 */
public class UtilsStream {

    /*A partir de una lista de empleados y un nombre, indique si hay algún 
    empleado con ese nombre.*/
    public static boolean existeNombre(ArrayList<Empleado> lista, String nombre) {

        boolean existeNombre = lista.stream()
                .anyMatch(e -> e.getNombre().equalsIgnoreCase(nombre));

        return existeNombre;
    }

    /*A partir de una lista de empleados y un nombre de departamento, indique el 
    número de empleados Coordinadores de ese departamento.*/
    public static long coordinadoresDepto(ArrayList<Empleado> lista, String departamento) {

        long numeroCoordinadores = lista.stream()
                .filter(e -> e.getPuesto().equalsIgnoreCase(departamento))
                .filter(e -> e.isCoordinador())
                .count();

        return numeroCoordinadores;

    }

    /*A partir de una lista de empleados y una letra del NIF (char), obtener una 
    nueva lista ordenada alfabéticamente SOLO con los apellidos de los empleados
    cuyo NIF contenga esa letra*/
    public static List<String> apellidosLetraNif(ArrayList<Empleado> lista, char letra) {

        List<String> listaApellidos = lista.stream()
            .filter(e -> e.getId().charAt(e.getId().length() - 1) == letra)
            .map(e -> e.getNombre())
            .sorted()
            .collect(Collectors.toList());

        return listaApellidos; //Devuelve la lista

    }

    /*A partir de una lista de empleados y una fecha, obtener una nueva lista con 
    los NIF (ordenados de forma inversa) de todos los empleados cuya toma de 
    posesión coincida con esa fecha.*/
    public static List<String> nifsFechaToma(ArrayList<Empleado> lista, LocalDate fecha) {

        List<String> listaNifs = lista.stream()
                .filter(e->e.getFechaToma().equals(fecha))
                .map(e->e.getId())
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
      

        return listaNifs; //Devuelve la lista
    }

}

package tarea7c_javierparodi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.*;

/**
 *
 * @author JaviA
 */
public class ParteA {

    public static void main(String[] args) throws IOException {

        /*Todos los registros se guardarán en una lista de objetos POJO, cuya 
        clase se ha de crear para tal efecto. El nombre de la clase lo decides 
        tú, pero debe ser significativo. Una vez guardados los objetos en la 
        lista, ésta debe quedar ordenada primero por día y luego por hora.*/
        //Leer CSV
        String ruta = "hor_curso_1920_final.csv";

        //Crea la lista de HoraClase
        ArrayList<HoraClase> lista = Lectura.listarFicheroHorario(ruta);

        //Ordena por dia y hora
                Comparator<HoraClase> ordenDia = (h1, h2) -> Integer.compare(h1.getDiaSemana(), h2.getDiaSemana());
                Comparator<HoraClase> ordenHora = (h1, h2) -> Integer.compare(h1.getHoraDia(), h2.getHoraDia());
                
                Collections.sort(lista, ordenDia.thenComparing(ordenHora));

        //lista.forEach(System.out::println);
        /*El conjunto de grupos y de iniciales de profesores se guardarán en dos
        estructuras SET, ya que no debe haber duplicados. Estas estructuras 
        deben estar ordenadas siguiendo el orden alfabético. */
        //Set de grupos
        Set<String> setGrupos = new TreeSet<>(lista.stream()
                .map(h1 -> h1.getCurso())
                .collect(Collectors.toSet()));

        //Set de iniciales de los profesores
        Set<String> setIniciales = new TreeSet<>(lista.stream()
                .map(h1 -> h1.getInicialesProfesor())
                .collect(Collectors.toSet()));

        //setGrupos.forEach(System.out::println);
        //setIniciales.forEach(System.out::println);
        /*Cuando toda la información esté en las estructuras de datos, la 
        aplicación proporciona dos opciones:
            a) Consultar horarios por profesor/a.
            b) Consultar horarios por grupo.*/
        String opcion = "";
        boolean valorValido = false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n\nElija una opción\n"
                    + "-------------------------------------\n"
                    + "a) Consultar horarios por profesor/a.\n"
                    + "b) Consultar horarios por grupo. \n"
                    + "c) Salir.");

            opcion = sc.nextLine();

            switch (opcion) {

                /*Si el usuario selecciona a), el programa mostrará las iniciales del 
                profesorado, para que el usuario elija una. Una vez proporcionada la 
                inicial por parte del usuario, el programa guardará en un fichero json, 
                en la raíz del proyecto, el horario seleccionado, si existe, volcando 
                el objeto POJO en el archivo. El nombre del fichero estará compuesto 
                por las iniciales del profesor en cuestión y la extensión del archivo. 
                Por ejemplo, para el profesor JCF, el archivo se llamará JCF.json. */
                case "a":
                    valorValido = false;

                    do {
                        System.out.println("Elige unas iniciales:\n");
                        System.out.println(setIniciales);
                        opcion = sc.nextLine();

                        if (setIniciales.contains(opcion)) { //Si la opcion es válida

                            final String OPCION = opcion; //filter pide final
                            String nombreArchivo = opcion + ".json";

                            //Crea una lista de las horas de ese profesor
                            List<HoraClase> horarioProfe = lista.stream()
                                    .filter(h -> h.getInicialesProfesor().equalsIgnoreCase(OPCION))
                                    .collect(Collectors.toList());

                            //La escribe en el Json
                            Escritura.escribirJson(horarioProfe, nombreArchivo);

                            System.out.println("Archivo Json " + nombreArchivo + " creado");
                            valorValido = true; //Y lo pone a true para salir del do
                        } else {

                            System.out.println("Iniciales no válidas\n\n");
                        }

                    } while (!valorValido);

                    break;

                /*Si el usuario selecciona b), el programa mostrará los grupos que hay 
                en el instituto, para que el usuario elija uno. Una vez proporcionado el
                grupo, el programa guardará en un fichero csv, en la raíz del proyecto, 
                el horario seleccionado, si existe. El nombre del fichero estará 
                compuesto por las iniciales del grupo en cuestión y la extensión del 
                archivo. Por ejemplo, para el grupo 1DAW, el archivo se llamará 1DAW.csv*/
                case "b":
                    valorValido = false;

                    do {
                        System.out.println("Elige un grupo:\n");
                        System.out.println(setGrupos);
                        opcion = sc.nextLine();

                        if (setGrupos.contains(opcion)) { //Si la opcion es válida

                            final String OPCION = opcion; //filter pide final
                            String nombreArchivo = opcion + ".csv";

                            //Crea una lista de las horas de ese grupo
                            List<HoraClase> horarioGrupo = lista.stream()
                                    .filter(h -> h.getCurso().equalsIgnoreCase(OPCION))
                                    .collect(Collectors.toList());

                            //La escribe en el CSV
                            Escritura.escribirListaCsv(horarioGrupo, nombreArchivo);

                            System.out.println("Archivo CSV " + nombreArchivo + " creado");
                            valorValido = true; //Y lo pone a true para salir del do
                        } else {

                            System.out.println("Iniciales no válidas\n\n");
                        }

                    } while (!valorValido);

                    break;

                case "c":

                    System.out.println("¡Hasta pronto!");

                    break;

                default:
                    System.out.println("Introduzca una opción válida");
                    break;

            }

        } while (!(opcion.equalsIgnoreCase("c")));

    }

}

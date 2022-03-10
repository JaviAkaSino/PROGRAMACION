package arraylist;

import java.time.LocalDate;

/**
 *
 * @author javiakasino
 */
public class PropuestasPrueba {

    public static void main(String[] args) {

        PropuestasLista comidaSemanaBlanca = new PropuestasLista();
        
        comidaSemanaBlanca.insertarPropuesta(new Propuesta (0, "Gabriel", "Paraiso", LocalDate.of(2022, 02, 25)));
        comidaSemanaBlanca.insertarPropuesta(new Propuesta (1, "Nacho", "Granainas", LocalDate.of(2022, 02, 24)));
        comidaSemanaBlanca.insertarPropuesta(new Propuesta (1, "Nacho", "McDonalds", LocalDate.of(2022, 02, 24)));
        comidaSemanaBlanca.insertarPropuesta(new Propuesta (2, "Alvaro", "Paraiso", LocalDate.of(2022, 02, 26)));
        comidaSemanaBlanca.insertarPropuesta(new Propuesta (3, "Vico", "Taberna de Miguel", LocalDate.of(2022, 02, 23)));
        comidaSemanaBlanca.insertarPropuesta(new Propuesta (4, "Vicky", "Paraiso", LocalDate.of(2022, 02, 26)));
        comidaSemanaBlanca.insertarPropuesta(new Propuesta (1, "Nacho", "Tobalo", LocalDate.of(2022, 02, 21)));
        
        System.out.println("Número de propuestas: " + comidaSemanaBlanca.getNumeroPropuestas());
        
        comidaSemanaBlanca.imprimirLista();
        
        System.out.println("Propuesta de Vico si la  hubiere: ");
        System.out.println(comidaSemanaBlanca.buscarNombrePersona("Vico") + " \n");
        
        //No he encontrado la forma de que funcionara. Preguntar en clase
//        System.out.println("Propuesta del nº 1: ");
//        System.out.println(comida.buscarPersonaBien(1));

        System.out.println("Lista de propuestas para el 26 de febrero: ");
        System.out.println(comidaSemanaBlanca.buscarPorFecha(LocalDate.of(2022, 02, 26)) + " \n");
        
        System.out.println("Lista de propuestas para Paraiso: ");
        System.out.println(comidaSemanaBlanca.buscarPorSitio("Paraiso"));
        
        boolean borrado = comidaSemanaBlanca.borrarPropuesta(new Propuesta (3,"Taberna de Miguel",LocalDate.of(2022, 02, 23)));
        
        if(borrado){
            System.out.println("borrado");
        }
        
        comidaSemanaBlanca.imprimirLista();

        System.out.println("Lista de propuestas para Paraiso");
        comidaSemanaBlanca.buscarPorSitio("Paraiso").forEach(System.out::println);
        
    }
    
}

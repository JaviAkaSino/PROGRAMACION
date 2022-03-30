package identificable;

import java.util.ArrayList;

/**
 *
 * @author JaviA
 */
public class Test {

    public static void main(String[] args) {

        /*Crea una lista de personas (con la clase ArrayList) y prueba a añadir 
        varios alumnos y varios profesores a la lista.
        
        Recorre la lista y llama al método identificate() de cada objeto. 
        
        Muestra los datos de cada objeto. 
        
        Usa el operador instanceof en cada iteración para mostrar la clase de cada 
        uno de los objetos y llamar al método getID si es un Estudiante o llamar al 
        método getEspecialidad si es un Profesor. 
        
        ¿Puedes crear objetos de la clase Persona? 
        
        No, ya que es una clase abstracta, y éstas no son instanciables.*/
        
        
        System.out.println("Con lista de Personas");
        
        ArrayList<Persona> lista = new ArrayList<>();

        lista.add(new Profesor());
        lista.add(new Estudiante());
        lista.add(new Profesor());
        lista.add(new Estudiante());
        lista.add(new Profesor());

        for (Persona p : lista) {

            p.identificate();
            System.out.println(p);

            if (p instanceof Estudiante) {

                ((Estudiante) p).getId();
                
            } else if (p instanceof Profesor) {

                ((Profesor) p).getEspecialidad();
            }

        }
        
        
        /*Repite el ejercicio pero usando una lista de objetos de tipo 
        Identificable. ¿Por qué es posible?
        
        Es posible debido a que, tanto los profesores como lo estudiantes, son 
        objetos de la clase abstracta persona y, por tanto, de la interfaz 
        Identificable (y de la clase Object)
        */
        
        
        System.out.println("Con lista de Identificables");
        
        ArrayList<Identificable> lista2 = new ArrayList<>();

        lista2.add(new Profesor());
        lista2.add(new Estudiante());
        lista2.add(new Profesor());
        lista2.add(new Estudiante());
        lista2.add(new Profesor());

        for (Identificable i : lista2) {

            i.identificate();
            System.out.println(i);

            if (i instanceof Estudiante) {

                ((Estudiante) i).getId();
                
            } else if (i instanceof Profesor) {

                ((Profesor) i).getEspecialidad();
            }

        }

    }

}

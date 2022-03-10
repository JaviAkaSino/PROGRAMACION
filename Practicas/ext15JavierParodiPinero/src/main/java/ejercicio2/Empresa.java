package ejercicio2;

import ejercicio1.Trabajador;
import ejercicio1.CategoriaEmpleado;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author javiakasino
 */
public class Empresa {

    private ArrayList<Trabajador> plantilla;
    private String nombre;
    private String cif;

    //Crea una empresa vacía
    public Empresa(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
        this.plantilla = new ArrayList<>();
    }

    public void imprimir() {

        System.out.println("Empresa: " + this.nombre + "\nCIF: " + this.cif);

        System.out.println("Empleados: ");

        this.plantilla.forEach(System.out::println);
        
        System.out.println("\n");
    }

    public void contratar(Trabajador t) {

        this.plantilla.add(t);

    }

    public boolean despedir(Trabajador t) {
      
        return this.plantilla.remove(t);      
    }
    
    
    public int[] buscarTodosNombre(String nombre){

        //Crea arraylist con los indices
        ArrayList<Integer> listaIndices = new ArrayList();

        for (Trabajador t : this.plantilla) {

            if (t.getNombre().equals(nombre)) {

                listaIndices.add(plantilla.indexOf(t));
            }
        }

        
        //Guarda sus valores en una array
        int[] indices = new int[listaIndices.size()];

        for (int i = 0; i < listaIndices.size(); i++) {

            indices[i] = listaIndices.get(i);
        }
        return indices;
    

    }
    
    
    
    public void ordenarNombre(){
        
        Collections.sort(this.plantilla, (Trabajador t1, Trabajador t2) -> t1.getNombre().compareTo(t2.getNombre()));
    }
    
    
    
    public int buscarNombre(Trabajador t){
        
        return Collections.binarySearch(this.plantilla, t, (Trabajador t1, Trabajador t2)
                -> t1.getNombre().compareTo(t2.getNombre()));
        
    }
    
}

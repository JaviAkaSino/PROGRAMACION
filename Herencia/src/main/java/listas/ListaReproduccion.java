package arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author javiakasino
 */
public class ListaReproduccion {

    private ArrayList<Cancion> canciones;

    //constructor predeterminado (creará e inicializará la lista).
    public ListaReproduccion() {
        this.canciones = new ArrayList<>();
    }

    //numeroCanciones(): devuelve el número de canciones de la lista.
    public int numeroCanciones() {

        return canciones.size();
    }

    //estaVacia(): devuelve si la lista de reproducción está vacía.
    public boolean estaVacia() {

        return canciones.isEmpty();
    }

    //escucharCancion(int): devuelve la Cancion que se encuentra en la posición indicada.
    public Cancion escucharCancion(int posicion){
        
        return canciones.get(posicion);
    }
    
    //cambiarCancion(int, Cancion): cambia la Cancion de la posición indicada por la nueva Cancion proporcionada.
    public void cambiarCancion(int posicion, Cancion cancion){
        
        canciones.set(posicion, cancion);
    }
    
    //grabarCancion(Cancion): agrega al final de la lista la Cancion proporcionada.
    public void grabarCancion(Cancion cancion){
        
        canciones.add(cancion);
    }
    
    //eliminaCancion(int): elimina la Cancion que se encuentra en la posición indicada.
    public void eliminaCancion(int posicion){
        
        canciones.remove(posicion);
    }
    
    //eliminaCancion(Cancion c), elimina el objeto c si se encuentra en la lista de reproducción. Usa el método remove(Cancion)
    public void eliminaCancion(Cancion cancion){
        
        canciones.remove(cancion);
    }
    
    //imprimirLista (ListaReproduccion tmp). Método de clase que imprime los nombres de las canciones contenidas en tmp.
    public static void imprimirLista(ListaReproduccion tmp){
        
        for (Cancion cancion : tmp.canciones) {
            System.out.println(cancion.getTitulo());
        }
    }
    
    //buscarCancion(Cancion c), busca la canción c en la lista de reproducción y devuelve la posición en la que se encuentra. Usa el método indexOf.
    public int buscarCancion(Cancion cancion){
        
        return canciones.indexOf(cancion);      
    }
    
    
    public void ordenarPorTitulo(){
         
       Collections.sort(canciones);
       
    }
    
    public int buscarPorTitulo(Cancion c){
        
        return Collections.binarySearch(canciones, c);   
    }

    
    public void ordenarPorAutor(){
        
        Collections.sort(canciones, (Cancion c1, Cancion c2) -> c1.getAutor().compareTo(c2.getAutor()));
    } 
    
    
    public int buscarPorAutor(Cancion c) {

        return Collections.binarySearch(canciones, c, (Cancion c1, Cancion c2)
                -> c1.getAutor().compareTo(c2.getAutor()));
    }
    
    public void imprimirLista() {

        System.out.println("Lista de reproducción:");

        canciones.forEach(System.out::println);

    }
    
    
}

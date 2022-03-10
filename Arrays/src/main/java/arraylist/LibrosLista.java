package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author javiakasino
 */
public class LibrosLista {

    //Atributo encapsulado de tipo lista
    private ArrayList<Libro> lista;

    /*Constructor por defecto, solo instancia la estructura
    list sin incluir ningún objeto*/
    public LibrosLista() {
        this.lista = new ArrayList<>();
    }

    //Guarda un libro al final de la lista si no es nulo
    public void insertarLibro(Libro libro) {

        if (libro != null) {

            lista.add(libro);
        }
    }

    public void imprimirLista() {

        System.out.println("Imprimiendo lista de libros...");

        lista.forEach(System.out::println);

    }

    public int getNumeroLibros() {

        return lista.size();
    }

    //Eliminar un libro
    public boolean borrarLibro(Libro libro) {
        //Lo busca y devuelve un true si está se borra
        return lista.remove(libro);
    }

    //Buscar un libro (cuenta de la vieja)
    public Libro buscarISBMVieja(String isbn) {
        Libro aux = null;
        for (int i = 0; i < lista.size(); i++) {
            aux = lista.get(i);
            if (aux.getIsbn().equals(isbn)) {
                return aux;
            }
        }
        return aux;
    }

    //Buscar un libro (bien)
    public Libro buscarISBMBien(String isbn) {

        Libro aux = new Libro(isbn, "", "", 0, 0);

        int indice = lista.indexOf(aux);

        if (0 <= indice) {

            return lista.get(indice);
        }

        return null;
    }

    public ArrayList<Libro> buscarPorPrecio(double precio) {

        ArrayList<Libro> lista = new ArrayList();

        for (Libro libro : this.lista) {

            if (libro.getPrecio() == precio) {

                lista.add(libro);
            }
        }

        return lista;
    }

    /*SIN TOCAR EL MAIN, hacer que el programa funcione con ARRAY,
    no con ArrayList, por lo que cada vez que se añada un libro, se debe
    copiar en una Array nueva, con una posición más, etc.*/
    //Ordenar por ISBN
    public void ordenarISBN() {

        Collections.sort(lista);
    }

    public int buscarISBM(Libro l) {

        return Collections.binarySearch(lista, l);
    }

    public void ordenarComparatorNombre() {

        Collections.sort(lista, (Libro l1, Libro l2) -> l1.getNombre().compareTo(l2.getNombre()));

    }

    //Busqueda binaria 
    public int buscarBinariaNombre(Libro l) {

        //La lista debe estar ordenada según el criterio que se le pasa al método
        return Collections.binarySearch(lista, l, (Libro l1, Libro l2)
                -> l1.getNombre().compareTo(l2.getNombre()));
    }

    //Si la resta de ambos es negativa, el primero será menor que el segundo, e irá antes
    //Si es 0, son iguales
    //Si el resultado es positivo, el primero será mayor que el segundo
    public void ordenarComparatorPaginas() {
        //Collections.sort(lista, (Libro l1, Libro l2) -> l1.getNumeroPags() - l2.getNumeroPags());

        //***INFERENCIA DE TIPOS***, no hay que poner 'Libro' (la lista es de objetos Libro)
        Collections.sort(lista, (l1, l2) -> Integer.compare(l1.getNumeroPags(), l2.getNumeroPags()));
    }

    //ORDENAR POR DOS CRITERIOS
    //
    //Ordenar por nombre y, después, por páginas
    public void ordenarNombrePaginas() {

        Comparator<Libro> criterioNombre = (l1, l2) -> l1.getNombre().compareTo(l2.getNombre());

        Comparator<Libro> criterioPaginas = (l1, l2) -> Integer.compare(l1.getNumeroPags(), l2.getNumeroPags());

        Comparator<Libro> criterioNombrePaginas = criterioNombre.thenComparing(criterioPaginas);

        Collections.sort(lista, criterioNombrePaginas);

    }

}

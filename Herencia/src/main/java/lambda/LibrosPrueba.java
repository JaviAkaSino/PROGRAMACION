package lambda;

/**
 *
 * @author javiakasino
 */
public class LibrosPrueba {

    public static void main(String[] args) {

        LibrosLista catalogo = new LibrosLista();
        
        catalogo.insertarLibro(new Libro ("1245", "La muerte a pellizcos", "Planeta", 1000, 0.9));
        catalogo.insertarLibro(new Libro ("2151", "La muerte a pellizcos", "Planeta", 1001, 0.9));
        catalogo.insertarLibro(new Libro ("a456", "Ma muerte a pellizcos", "Planeta", 10011, 0.9));
        catalogo.insertarLibro(new Libro ("A456", "Ma muerte a pellizcos", "Planeta", 1000, 0.9));
        
        catalogo.imprimirLista();
        
        System.out.println("Tamaño del catálogo :" + catalogo.getNumeroLibros());
        
        Libro libro = catalogo.buscarISBMVieja("1232");
        System.out.println("Libro buscado : " + libro);
        
        libro = catalogo.buscarISBMBien("1234");
        System.out.println("Libro buscado : " + libro);
        
        catalogo.borrarLibro(new Libro ("1234","", "", 0, 0));
        
        catalogo.imprimirLista();
        
        catalogo.buscarPorPrecio(0.8).forEach(System.out::println);
       
        catalogo.ordenarISBN();
        
        catalogo.imprimirLista();
        
        int posicion = catalogo.buscarISBM(new Libro ("a456", "La muerte a pellizcos", "Planeta", 10, 0.9));
        
        System.out.println("Está en la posicion " + posicion);
        
        catalogo.ordenarComparatorNombre();
        
        catalogo.imprimirLista();
        
        catalogo.ordenarNombrePaginas();
        
        catalogo.imprimirLista();
        
        int posicion2 = catalogo.buscarBinariaNombre(new Libro("", "La muerte a pellizcos", "", 0, 0));
        
        System.out.println("Está en la posición " + posicion2);
    }   
    
}

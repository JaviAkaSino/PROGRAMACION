package arraylist;

/**
 *
 * @author javiakasino
 */
public class CancionesTest {

    public static void main(String[] args) {

        ListaReproduccion lista = new ListaReproduccion();
        
        lista.grabarCancion(new Cancion("Zapatillas", "ECDL", 2002));
        lista.grabarCancion(new Cancion("Manifiesto", "Nach", 2008));
        lista.grabarCancion(new Cancion("Lo que me gusta de ti", "Little Pepe", 2020));
        lista.grabarCancion(new Cancion("Victory", "Two Steps From Hell", 2016));
        lista.grabarCancion(new Cancion("A contracorriente", "ECDL", 2000));
        lista.grabarCancion(new Cancion("Lo que me gusta de ti", "Los Rebujitos", 2021));
        lista.grabarCancion(new Cancion("Bumaye", "ToteKing", 2022));

        lista.imprimirLista();
        
        System.out.println("\nBusca Manifiesto...");
        int indice = lista.buscarCancion(new Cancion("Manifiesto", "", 0));   
        System.out.println("Es la " + (indice + 1) + "ª canción");
        
        lista.ordenarPorAutor();     
        System.out.println("\nLista ordenada por autor:");
        lista.imprimirLista();
        
        System.out.println("\nBusca canción de ToteKing...");
        indice = lista.buscarPorAutor(new Cancion("", "ToteKing", 0));
        System.out.println("Es la " + (indice + 1) + "ª canción");
        
        lista.ordenarPorTitulo();
        System.out.println("\nLista ordenada por título:");
        lista.imprimirLista();
        
        System.out.println("\nBusca Victory...");
        indice = lista.buscarPorTitulo(new Cancion("Victory", "", 0));   
        System.out.println("Es la " + (indice + 1) + "ª canción");
        
    }
    
}

package com.mycompany.p62javierparodipinero;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author javiakasino
 */
public class MiTienda {

    private ArrayList<Producto> listaProductos;
    private ArrayList<Libro> listaLibros;
    
    public static void main(String[] args) {

        /*Crea una lista de productos y añade dos objetos de cada tipo de producto distinto (de los posibles) a la misma.*/
        ArrayList<Producto> listaProductos = new ArrayList<>();
        ArrayList<Libro> listaLibros = new ArrayList<>();

        listaProductos.add(new Pantalon()); //Conversión implícita
        listaProductos.add(new Pantalon()); //Conversión implícita

        listaProductos.add(new Musica()); //Conversión implícita
        listaProductos.add(new Musica("Barón Rojo", "123456", 20, 21, "Los rockeros van al infierno")); //Conversión implícita

        Libro l1 = new LibroPapel(547, "987654");
        listaProductos.add(l1); //Conversión implícita
        listaProductos.add(new LibroPapel()); //Conversión implícita

        listaProductos.add(new LibroDigital()); //Conversión implícita
        listaProductos.add(new LibroDigital()); //Conversión implícita

        /*Muestra los datos de los productos usando un foreach y el método 
        toString(). Contesta usando un comentario en el código: ¿es toString() 
        un método polimórfico? Justifica la respuesta
        - Sí, es un método polimórfico, ya que es un método heredado de la clase
        Object, y puede ser sobreescrito por las clases que lo utilizan. Llamando
        a toString() obtendremos muchas respuestas (formas) distintas, dependiendo
        del objeto concreto desde el cual le llamemos. Véase a continuación:*/
        System.out.println("Lista de productos");

        for (Producto p : listaProductos) {

            System.out.println(p);
        }

        /*Ordena la lista de productos según el precio, haciendo uso de 
        <<Comparator>> y una expresión lambda.*/
        Collections.sort(listaProductos, (p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio()));

        /*Muestra la lista de productos ordenados por precio.*/
        System.out.println("\n\nLista de productos ordenada por precio");

        for (Producto p : listaProductos) {

            System.out.println(p);
        }

        /*Ordena la lista de productos según el código, haciendo uso de 
        <<Comparator>> y una expresión lambda.*/
        Collections.sort(listaProductos, (p1, p2) -> (p1.getCodigo().compareTo(p2.getCodigo())));

        /*Muestra la lista de productos ordenados por código.*/
        System.out.println("\n\nLista de productos ordenada por código");
        for (Producto p : listaProductos) {

            System.out.println(p);
        }

        /*Realiza la búsqueda binaria según su código de algún producto que 
        exista dentro de la lista y otro que no exista, mostrando la posición 
        que ocupa en la lista.*/
        //Código 123456 (existe)
        if (buscarCodigo(listaProductos, "123456") >= 0) { //Si la posición NO es negativa (existe el objeto)

            System.out.println("\n\nEl Producto con código 123456 está en la lista en la posición: "
                    + buscarCodigo(listaProductos, "123456"));

        } else {

            System.out.println("\n\nEl Producto con código 123456 no está en la lista");
        }

        //Código 000 (no existe)
        if (buscarCodigo(listaProductos, "000") >= 0) { //Si la posición NO es negativa (existe el objeto)

            System.out.println("\n\nEl Producto con código 000 está en la lista en la posición: "
                    + buscarCodigo(listaProductos, "000"));

        } else {

            System.out.println("\n\nEl Producto con código 000 no está en la lista");
        }

        /*Recorre la lista de productos y guarda todos los libros en una lista 
        de libros.*/
        

        for (Producto p : listaProductos) {

            if (p instanceof Libro) {

                listaLibros.add((Libro) p); //Conversión explícita
            }
        }

        /*Muestra los datos de la lista de libros usando un foreach y el método 
        toString(). */
        System.out.println("\n\nLista de libros en la lista de productos");
        for (Libro l : listaLibros) {

            System.out.println(l);
        }

        /*Ordena los libros según ISBN, haciendo uso de <<Comparable>>.*/
        Collections.sort(listaLibros);

        /*Muestra la lista de libros ordenada. */
        System.out.println("\n\nLista de libros ordenada");
        for (Libro l : listaLibros) {

            System.out.println(l);
        }

        System.out.println("\n");
        /*Recorre de nuevo la lista de libros y en cada iteración, ejecuta 
        enviar() o descargar() en función del tipo de libro.*/

        for (Libro l : listaLibros) {

            if (l instanceof LibroPapel) {

                ((LibroPapel) l).enviar("Avenida del Carmen 65");

            } else if (l instanceof LibroDigital) {

                ((LibroDigital) l).descargar();
            }

        }

        /*Utiliza el método contains(Object) sobre la lista de libros para 
        comprobar si existe un libro o no existe.*/
        if (listaLibros.contains(l1)) {

            System.out.println("El libro existe en la lista");

        } else {

            System.out.println("No lo contiene");
        }

        /*Usando la lista de productos inicial, crea una nueva lista con todos 
        los objetos del tipo <<SeEnvía>>.*/
        ArrayList<SeEnvia> listaEnvios = new ArrayList<>();

        for (Producto p : listaProductos) {

            if (p instanceof SeEnvia) {

                listaEnvios.add((SeEnvia) p);//Conversión explícita
            }
        }

        /*Recorre la lista de objetos <<SeEnvía>> y llama al método de la interfaz.*/
        for (SeEnvia s : listaEnvios) {

            s.enviar("Esta es la dirección");

        }

        /*Inventa un método abstracto en Libro que tenga comportamientos 
        diferentes en las subclases. Implementa los métodos en las clases hijas.*/
        //Método anuncio()
    }

    public static int buscarCodigo(ArrayList<Producto> lista, String codigo) {

        return Collections.binarySearch(lista, new Producto(codigo, 0, 0, "") {
        }, (p1, p2) -> (p1.getCodigo().compareTo(p2.getCodigo())));

    }

}

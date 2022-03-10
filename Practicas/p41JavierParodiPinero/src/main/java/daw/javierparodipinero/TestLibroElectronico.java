package daw.javierparodipinero;

import javax.swing.JOptionPane;

/**
 *
 * @author javiakasino
 */
public class TestLibroElectronico {

    public static void main(String[] args) {

        /*Crea dos libros con el constructor por defecto. Muestra por consola 
        los datos de estos libros usando el método toString. */
        LibroElectronico libro1 = new LibroElectronico();

        LibroElectronico libro2 = new LibroElectronico();

        System.out.println("Prueba de constructor por defecto:");
        //Cualquiera de las dos formas es válida con toString
        System.out.println(libro1.toString());

        System.out.println(libro2);

        System.out.println("-------------------------");

        /*Crea dos libros con el constructor parametrizado, con los datos que 
        tú quieras. Usando JOption y toString, muestra los datos estos objetos.*/
        LibroElectronico libro3 = new LibroElectronico("Pulgarcito", 125, 3);

        LibroElectronico libro4 = new LibroElectronico("Luces de bohemia", 243, 4.3);

        JOptionPane.showMessageDialog(null, "Prueba de constructor parametrizado en JOption:");

        JOptionPane.showMessageDialog(null, libro3);

        JOptionPane.showMessageDialog(null, libro4);

        /*Prueba a crear un nuevo libro con 12000 páginas y 12 MB. Muestra los 
        datos de este objeto usando la consola y toString.*/
        LibroElectronico libro5 = new LibroElectronico("Los Pilares de la Tierra", 12000, 12);

        System.out.println("Prueba 12000 págs y 12 MB consola:");

        System.out.println(libro5);

        System.out.println("-------------------------");

        /*Establece 13000 páginas en el primer libro creado. Muestra los datos 
        de este objeto usando la consola y toString.*/
        System.out.println("Intentamos modificar paginas a 13000, pasa a 0:");

        libro1.setPaginasTotales(13000);

        System.out.println(libro1);

        System.out.println("-------------------------");

        /*Establece como tamaño 15MB en el segundo libro creado. Muestra los 
        datos de este objeto usando la consola y toString.*/
        System.out.println("Intentamos modificar megas a 15, pasa a 0:");

        libro2.setMegas(15);

        System.out.println(libro2);

        System.out.println("-------------------------");

        /*Prueba los métodos pasarPagina(), retrocederPagina() y saltar(int) con
        cualquiera de los libros creados y muestra los datos por consola para 
        comprobar su funcionamiento.*/
        System.out.println("Páginas libro 4 antes y después de pasarPagina():");

        System.out.println(libro4.getPaginaActual());

        libro4.pasarPagina();

        System.out.println(libro4.getPaginaActual());

        System.out.println("-------------------------");

        System.out.println("Páginas libro 4 antes y después de retrocederPagina():");

        System.out.println(libro4.getPaginaActual());

        libro4.retrocederPagina();

        System.out.println(libro4.getPaginaActual());

        System.out.println("No puede retroceder a pág 0 (no existe):");

        libro4.retrocederPagina();

        System.out.println(libro4.getPaginaActual());

        System.out.println("-------------------------");

        System.out.println("Saltamos 20 págs");

        libro4.saltar(20);

        System.out.println(libro4.getPaginaActual());

        System.out.println("Intentamos saltar 300 pags (supera rango):");

        libro4.saltar(300);

        System.out.println(libro4.getPaginaActual());

        System.out.println("No se realiza la operación");

        System.out.println("Retrocedemos 3 páginas");

        libro4.saltar(-3);

        System.out.println(libro4.getPaginaActual());

        System.out.println("E intentamos retroceder 50 (se sale de rango):");

        libro4.saltar(-50);

        System.out.println(libro4.getPaginaActual());

        System.out.println("No se realiza la operación");

    }

}

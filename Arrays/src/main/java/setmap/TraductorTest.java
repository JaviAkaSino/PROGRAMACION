package setmap;

public class TraductorTest {

    public static void main(String[] args) {

        Traductor traductor = new Traductor();

        traductor.guardarEntrada("Car", "Coche");
        traductor.guardarEntrada("Bike", "Bicicleta");
        traductor.guardarEntrada("Table", "Mesa");
        traductor.guardarEntrada("Dog", "Perro");
        traductor.guardarEntrada("Turtle", "Tortuga");
        traductor.guardarEntrada("Mouse", "Ratón");
        traductor.guardarEntrada("Screen", "Pantalla");
        traductor.guardarEntrada("Keyboard", "Teclado");
        traductor.guardarEntrada("Headphones", "Auriculares");
        traductor.guardarEntrada("Speakers", "Altavoces");

        traductor.imprimirTraductor();

        System.out.println("Modificamos 'Table'");

        traductor.modificarPalabra("Table", "Tabla");

        traductor.imprimir();

        System.out.println("Borramos 'Car'");

        traductor.borrarEntrada("Car", "Coche");

        System.out.println(traductor.listaPalabrasEspaniol());

        System.out.println(traductor.listaPalabrasIngles());

        System.out.println("Ver traducción de 'Screen'");

        System.out.println(traductor.traducir("Screen"));

    }

}

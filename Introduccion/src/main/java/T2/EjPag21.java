//Nombre del paquete
package T2;

//Importamos Scanner
import java.util.Scanner;

//Declaración de clase
public class EjPag21 {

    //Método main
    public static void main(String[] args) {

        //Declaramos un objeto Scanner y otro String
        Scanner entradaDeTeclado;
        String nombre;

        //Cosntruimos el objeto Scanner
        entradaDeTeclado = new Scanner(System.in);

        //Sacamos la pregunta a consola
        System.out.println("¿Cómo te llamas?");

        /*Se guarda en la variable 'nombre' el resultado de introducir
        caracteres por teclado hasta que se pulsa enter
        una vez ejecutado al añadir entradaDeTeclado.nextLine*/
        nombre = entradaDeTeclado.nextLine();

        /*Sacamos el resto de preguntas por sout, y sus 
        respectivas variables de entrada de respuesta*/
        System.out.println("¿Qué día naciste?");
        int diaNacimiento = entradaDeTeclado.nextInt();

        System.out.println("¿En qué mes?");

        /*Como voy a leer un String después de un número
        limpio el buffer que contiene '\n' (enter)*/
        entradaDeTeclado.nextLine();
        String mesNacimiento = entradaDeTeclado.nextLine();

        System.out.println("¿En qué año?");
        int anioNacimiento = entradaDeTeclado.nextInt();

        System.out.println("Hola " + nombre + ", naciste el "
                + diaNacimiento + "/" + mesNacimiento + "/" + anioNacimiento);

    }

}

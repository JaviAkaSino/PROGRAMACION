package ismaeljerruzjavierparodi;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Utilidades {

    public static int escanearInt() {

        Scanner sc = new Scanner(System.in);
        boolean solicitarDatos = true;
        int numero = 0;
        do {

            try {

                numero = sc.nextInt();
                solicitarDatos = false;

            } catch (InputMismatchException ime) {

                System.out.println("Introduce un dato numérico");
                sc.nextLine();
            }

        } while (solicitarDatos);

        return numero;

    }

    public static int escanearIntJOption() {

        boolean solicitarDatos = true;
        int comprobado = 0;
        String numero = "";
        do {
            numero = JOptionPane.showInputDialog("");

            try {
                comprobado = Integer.parseInt(numero);
                solicitarDatos = false;

            } catch (NumberFormatException nfe) {

                JOptionPane.showMessageDialog(null, "Introduce un dato numérico");
            }
        } while (solicitarDatos);

        return comprobado;

    }

    public static int numeroAleatorioEntre(int valorMin, int valorMax) {

        Random numeroAleatorio = new Random();
        int aleatorio;

        try {

            aleatorio = numeroAleatorio.nextInt(valorMax - valorMin + 1) + valorMin;

        } catch (IllegalArgumentException iae) {

            aleatorio = numeroAleatorio.nextInt(valorMin - valorMax + 1) + valorMax;

        }

        return aleatorio;

    }

    /*Mostrar array, se le pasará el array como parámetro y no devolverá nada, sólo 
        imprimirá por pantalla el array.*/
    public static void mostrarArray(int array[]) {

        for (int i = 0; i < array.length; i++) {

            System.out.println("Número " + (i + 1) + ": " + array[i]);
        }

    }

    public static void mostrarArrayLineal(int array[]) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }

    /*a) Leer valores por teclado y almacenarlos en el array. Se le pasará el array como 
        parámetro y no devolverá nada.*/
    //Se pasa por referencia, por lo que cambia fuera del método
    public static void guardarDatosArray(int array[]) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            System.out.println("Introduce el valor número " + (i + 1));

            array[i] = Utilidades.escanearInt();

        }

    }

    public static int[] multiplicarArrays(int array1[], int array2[]) {

        int productoArray[] = new int[array1.length];

        for (int i = 0; i < productoArray.length; i++) {

            productoArray[i] = array1[i] * array2[i];

        }

        return productoArray;
    }

    public static int[] sumarArrays(int array1[], int array2[]) {

        int productoArray[] = new int[array1.length];

        for (int i = 0; i < productoArray.length; i++) {

            productoArray[i] = array1[i] + array2[i];

        }

        return productoArray;
    }

    public static int[] restarArrays(int array1[], int array2[]) {

        int productoArray[] = new int[array1.length];

        for (int i = 0; i < productoArray.length; i++) {

            productoArray[i] = array1[i] - array2[i];

        }

        return productoArray;
    }

    public static int sumatorioArray(int array[]) {

        int sumatorio = 0;

        for (int i = 0; i < array.length; i++) {

            sumatorio += array[i];

        }

        return sumatorio;
    }

    public static int cifrasDeUnNumero(int numero) {

        int cifras = 1;

        while (numero != 0) {

            numero = numero / 10;
        }

        return cifras;
    }

    public static double centimosAEuro(int centimos) {
        
        double euros = (double) centimos / 100;
        return euros;
    }

}

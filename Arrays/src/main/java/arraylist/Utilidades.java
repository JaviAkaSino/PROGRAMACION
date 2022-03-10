package arraylist;

import array.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Utilidades {

    public static int escanearInt() {

        int numero = 0;

        Scanner sc = new Scanner(System.in);
        boolean solicitarDatos = true;

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
    
    public static void guardarDatosArray(int array[]) {

        for (int i = 0; i < array.length; i++) {

            System.out.println("Introduce el valor número " + (i + 1));

            array[i] = Utilidades.escanearInt();

        }

    }
    
    public static void mostrarArray(int array[]) {

        for (int i = 0; i < array.length; i++) {

            System.out.println("Número " + (i + 1) + ": " + array[i]);
        }

    }
    
    public static void mostrarArrayLineal(int array[]) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
            
            System.out.println("");
        }

    }
    
    
        public static void mostrarArrayLinealDouble(double array[]) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
            
            System.out.println("");
        }

    }
        
        public static void mostrarArrayLinealChar(char array[]) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
            
            System.out.println("");
        }

    }
        
    
    public static void guardarDatosArrayRandom(int array[], int min, int max) {

        for (int i = 0; i < array.length; i++) {

            array[i] = Utilidades.numeroAleatorioEntre(min, max);

        }

    }
    
    
     public static void mostrarArrayString(String array[]) {

        for (int i = 0; i < array.length; i++) {

            System.out.println("Número " + (i + 1) + ": " + array[i]);
        }

    }
    

     public static void guardarDatosArrayString(String array[]) {

         Scanner sc = new Scanner(System.in);
         
        for (int i = 0; i < array.length; i++) {

            System.out.println("Introduce el valor número " + (i + 1));

            array[i] = sc.nextLine();

        }

    }
     
}

package matrices;

import array.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Utilidades {

    public static void imprimirMatrizInt(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println("");
        }
        System.out.println("");
    }

    public static void recorrerFila(int fila, int[][] matriz) {

        System.out.println("Fila " + fila + ": ");

        for (int j = 0; j < matriz[fila].length; j++) {

            System.out.print(matriz[fila][j] + "\t");

        }

        System.out.println("\n");
    }

    public static void recorrerColumna(int columna, int[][] matriz) {

        System.out.println("Columna " + columna + ": ");

        for (int i = 0; i < matriz.length; i++) {

            System.out.print(matriz[i][columna] + "\n");

        }
        System.out.println("");
    }

    public static void recorrerVecinas(int i, int j, int[][] matriz) {
        //Va de una posición antes a una después en la fila y en la columna
        for (int k = (i - 1); k <= (i + 1); k++) { 
            for (int l = (j - 1); l <= (j + 1); l++) {

                if (!(k == i && l == j)) { //Descarta el valor de la posición en sí

                    //Sólo cuenta los valores que están dentro de la matriz
                    if (0 <= k && k < matriz.length && 0 <= l && l < matriz[0].length) {

                        System.out.print(matriz[k][l] + "\t"); 
                        
                    } else {
                        
                        System.out.print("\t"); //Si está fuera, deja un espacio
                    }
                    
                } else {

                    System.out.print("X\t"); //Señaliza cuál era el valor
                }
            }

            System.out.println(""); //Salto de línea
        }
        
        System.out.println(""); //Salto de línea
    }

    
    public static void rellenarMatrizIntRandomEntre(int[][] matriz, int min, int max) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = Utilidades.numeroAleatorioEntre(min, max);
            }
        }
    }

    public static double mediaIntMatriz(int[][] matriz) {

        int total = matriz.length * matriz[0].length; //El total de números será FILAS*COLUMNAS        
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                suma += matriz[i][j];
            }
        }

        return (double) (suma / total);
    }

    public static int valorMinimoMatriz(int[][] matriz) {

        int minimo = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (minimo > matriz[i][j]) {

                    minimo = matriz[i][j];
                }
            }
        }
        return minimo;
    }

    public static int valorMaximoMatriz(int[][] matriz) {

        int maximo = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (maximo < matriz[i][j]) {

                    maximo = matriz[i][j];
                }
            }
        }
        return maximo;
    }

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
        }

    }

    public static void mostrarArrayLinealDouble(double array[]) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
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

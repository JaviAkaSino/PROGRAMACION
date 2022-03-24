package pokino.javierparodipinero;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Utilidades {

    //Pide un número por Scanner controlando que sea un entero
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

    //Da un entero aleatorio dado el intervalo
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

    //Da un entero aleatorio dado el intervalo y exceptuando un número
    public static int numeroAleatorioEntreExcepto(int min, int max, int excepcion) {

        int numero = numeroAleatorioEntre(min, max);

        if (numero == excepcion) {

            return numeroAleatorioEntreExcepto(min, max, excepcion);
        } else {

            return numero;
        }

    }

    //Da un entero aleatorio dado el intervalo y exceptuando dos números
    public static int numeroAleatorioEntreExcepto2(int min, int max, int excepcion1, int excepcion2) {

        int numero = numeroAleatorioEntre(min, max);

        if (numero == excepcion1 || numero == excepcion2) {

            return numeroAleatorioEntreExcepto2(min, max, excepcion1, excepcion2);
        } else {

            return numero;
        }

    }

    //Recorre una fila de una matriz dadas
    public static void recorrerFila(int fila, Carta[][] matriz) {

        System.out.println("Fila " + fila + ": ");

        for (int j = 0; j < matriz[fila].length; j++) {

            System.out.print(matriz[fila][j] + "\t");

        }

        System.out.println("\n");
    }

    //Recorre una columna de una matriz dadas
    public static void recorrerColumna(int columna, Carta[][] matriz) {

        System.out.println("Columna " + columna + ": ");

        for (int i = 0; i < matriz.length; i++) {

            System.out.print(matriz[i][columna] + "\n");

        }
        System.out.println("");
    }

    //Recorre las posiciones vecinas de una posicion de una matriz (de cualquier objeto) dadas
    public static void recorrerVecinas(int i, int j, Object[][] matriz) {
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

}

package javierparodipinero;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Utilidades {

    private int numero;

    public int leerEntero(int a) {

        Scanner sc = new Scanner(System.in);
        boolean solicitarDatos = true;

        do {

            try {

                a = sc.nextInt();

                solicitarDatos = false;

            } catch (InputMismatchException ime) {

                System.out.println("Se ha introducido texto en lugar de números, "
                        + "vuelva a introducir el dato");
                sc.nextLine();
            }

        } while (solicitarDatos);

        return a;

    }

    public int numeroAleatorioEntre(int valorMin, int valorMax) {

        Random numeroAleatorio = new Random();
        int aleatorio;

        try {

            aleatorio = numeroAleatorio.nextInt(valorMax - valorMin + 1) + valorMin;

        } catch (IllegalArgumentException iae) {

            aleatorio = numeroAleatorio.nextInt(valorMin - valorMax + 1) + valorMax;

        }

        return aleatorio;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}

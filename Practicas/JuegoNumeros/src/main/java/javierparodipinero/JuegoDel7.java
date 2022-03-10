package javierparodipinero;

import java.util.Random;
import java.util.Scanner;

public class JuegoDel7 {

    public static void main(String[] args) {
        /*J1 número random del 1 al 5, J2 también.
        Si la suma es menor que 7, gana J1; 
        si es mayor que 7, gana J2; si  es 7, no cuenta*/

        //Variables, constantes, Random
        Random numeroAleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        /*FRONTERA es el 7, por si se quisiera cambiar a otro número
        RONDAS_WIN el número de victorias necesarias para ganar
        Al mejor de 5 rondas, el que gane 3 gana*/
        final int FRONTERA = 7, RONDAS = 5, RONDAS_WIN = RONDAS / 2 + 1;
        int numeroJ1, numeroJ2, suma;
        
        //winJ1 y winJ2 el número de victorias que lleva cada uno
        int winJ1 = 0, winJ2 = 0, ronda = 1;
        
        //Nombre de los jugadores
        String name1, name2;
        
        //Recogemos nombres J1 y J2
        System.out.println("Jugador 1, introduce tu nombre:");
        name1 = teclado.nextLine();

        System.out.println("Jugador 2, introduce tu nombre:");
        name2 = teclado.nextLine();

        System.out.println("-----------------------------");

        do {

            System.out.println(ronda++ + "ª ronda: ");

            //Para random del 1 al 5 hacemos (5-1+1) + 1
            numeroJ1 = numeroAleatorio.nextInt(5) + 1;
            numeroJ2 = numeroAleatorio.nextInt(5) + 1;

            System.out.println("El número de " + name1 + " es " + numeroJ1);
            System.out.println("El número de " + name2 + " es " + numeroJ2);

            suma = numeroJ1 + numeroJ2;

            System.out.println("La suma de ambos es " + suma);

            if (suma < FRONTERA) {

                System.out.println(name1 + " gana la ronda");
                winJ1++;

            } else if (suma > FRONTERA) {

                System.out.println(name2 + " gana la ronda");
                winJ2++;

            } else {

                System.out.println("El resultado de la ronda es empate");

            }

            System.out.println("-----------------------------");

        } while (winJ1 < RONDAS_WIN && winJ2 < RONDAS_WIN);

        System.out.println("Resultado final: " + name1 + " " + winJ1 + " - "
                + winJ2 + " " + name2);

        if (winJ1 == 3) {

            System.out.println(name1 + " ha ganado la partida");

        } else {

            System.out.println(name2 + " ha ganado la partida");

        }

    }

}

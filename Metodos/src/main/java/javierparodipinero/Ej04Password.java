package javierparodipinero;

import java.util.Random;

public class Ej04Password {

    public static void main(String[] args) {

        /*Contraseñas:
        Tiene que tener 4 números distintos
        La suma del 1er y 4o dígito = impar
        La multiplicación del 2o y 3er dígito = par
        Tiene que tener una letra aleatoria (F-X) mayúscula*/
        
        //Variables n --> números; cond --> condiciones 
        //condiciones --> Todas las condiciones
        int n1, n2, n3, n4;
        char letra;
        boolean condiciones, cond1, cond2, cond3, cond4;
        String password;

        do {
            //Generamos los 4 dígitos al azar entre 0 y 9 y una mayus aleatoria
            n1 = numeroAleatorio();
            n2 = numeroAleatorio();
            n3 = numeroAleatorio();
            n4 = numeroAleatorio();

            letra = letraMayusAleatoria();

            //Generamos el String de la contraseña
            password = n1 + "" + n2 + "" + n3 + "" + n4 + "" + letra + "";

            //Comprobamos las condiciones con sus métodos y las agrupamos en una
            cond1 = controlDistintos(n1, n2, n3, n4);
            cond2 = controlImpar(n1, n4);
            cond3 = controlPar(n2, n3);
            cond4 = controlLetra(letra);

            condiciones = (cond1 && cond2 && cond3 && cond4);

            //Si se cumple la condición total, es una contraseña válida
            if (condiciones) {

                System.out.println("--------------------------");
                System.out.println(password + " sí es una contraseña válida.");

            } else {

                System.out.println(password + " no es una contraseña válida.");

            }
            //Mientras no se den las condiciones, sigue el bucle
        } while (!condiciones);

    }

    private static int numeroAleatorio() {

        Random numeroAleatorio = new Random();

        int aleatorio = numeroAleatorio.nextInt(10);

        return aleatorio;
    }

    private static char letraMayusAleatoria() {
        //A-Z = 65-90
        Random numeroAleatorio = new Random();

        int aleatorio = numeroAleatorio.nextInt(26) + 65;

        char letra = (char) aleatorio;

        return letra;
    }

    private static boolean controlDistintos(int n1, int n2, int n3, int n4) {
        //Tiene que tener 4 números distintos
        boolean controlDistintos = (n1 != n2 && n1 != n3 && n1 != n4
                && n2 != n3 && n2 != n4 && n3 != n4);

        return controlDistintos;
    }

    private static boolean controlImpar(int n1, int n4) {
        //La suma del 1er y 4o dígito = impar
        boolean controlImpar = (n1 + n4) % 2 != 0;

        return controlImpar;
    }

    private static boolean controlPar(int n2, int n3) {
        //La multiplicación del 2o y 3er dígito = par
        boolean controlPar = (n2 * n3) % 2 == 0;

        return controlPar;
    }

    private static boolean controlLetra(char letra) {
        //Tiene que tener una letra aleatoria (F-X) mayúscula
        //F = 70 y X = 88  
        boolean controlLetra = (70 <= letra && letra <= 88);

        return controlLetra;
    }
}

package javierparodipinero;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author javiakasino
 */
public class Elefante {

    //Método para controlar excepción
    public static int escanearInt(int a) {

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

    public static void main(String[] args) {

        int pesoTela = 0, pesoElefante = 0, pesoTotal = 0, numeroMax = 0, n = 1;

        System.out.println("Introduzca el peso que soporta la tela de araña");

        pesoTela = escanearInt(pesoTela);
        
        //Pide datos hasta que se de un peso = 0
        do {
            
            //Pide el dato hasta que se dé uno en el rango permitido
            do {
                System.out.println("Introduzca el peso (entre 0 y 109) del "
                        + "elefante número " + n);

                pesoElefante = escanearInt(pesoElefante);

            } while (0 > pesoElefante || pesoElefante > 109);

            pesoTotal += pesoElefante;
            
            //Mientras el peso total no supere el que soporta la tela, el número
            //de elefantes subidos es el número de datos dado
            if (pesoTotal <= pesoTela) {

                numeroMax = n;
            }

            n++;

        } while (pesoElefante != 0);

        System.out.println("Se pudieron balancear " + numeroMax + " elefantes "
                + "de un total de " + --n + " ya que, con el elefante número "
                + ++numeroMax + " la tela se rompió.");

    }

}

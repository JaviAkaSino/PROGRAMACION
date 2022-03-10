package array;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author JaviA
 */
public class Ej02 {

    public static void main(String[] args) {

        /*Escribe un programa para leer la altura de un número determinado de 
        personas y calcular la altura media. El número de personas se pide por 
        teclado y debe ser entero, un entero mayor que cero. Posteriormente el 
        programa irá pidiendo la altura, en cm, de cada una de las personas y 
        las guardará en una estructura de almacenamiento. Si la altura leída no 
        es positiva, el programa la pasará a número positivo. También es 
        necesario saber cuántas personas tienen una altura superior a la media 
        e inferior a la media.*/
        int cantidad = 0, altura = 0, suma = 0, media, inferiorMedia = 0, superiorMedia = 0;

        System.out.println("Introduce el número de personas");

        cantidad = escanearIntMayorQue0(cantidad);

        int listaAlturas[] = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {

            System.out.println("Introduce la estatura en cm de la persona número "
                    + (i + 1));

            listaAlturas[i] = escanearIntValorAbsoluto(altura);

        }

        for (int i = 0; i < cantidad; i++) {

            suma += listaAlturas[i];
        }

        media = suma / cantidad;

        for (int i = 0; i < cantidad; i++) {

            if (listaAlturas[i] < media) {

                inferiorMedia++;
            }

            if (listaAlturas[i] > media) {

                superiorMedia++;
            }
        }

        System.out.println("Entre un total de " + cantidad + " personas, "
                + "la estatura media es de " + media + " centímetros. \n"
                + "Hay " + inferiorMedia + " personas por debajo de "
                + "la media, y " + superiorMedia + " por encima de ella.");

    }

    private static int escanearIntMayorQue0(int numero) {

        Scanner sc = new Scanner(System.in);
        boolean solicitarDatos = true;

        do { //Controla que sea mayor que 0

            do { //Controla excepción ime

                try {

                    numero = sc.nextInt();

                    solicitarDatos = false;

                } catch (InputMismatchException ime) {

                    System.out.println("Introduce un dato numérico");
                    sc.nextLine();
                }

            } while (solicitarDatos);

            if (numero <= 0) {

                System.out.println("Introduce un entero mayor que 0");

                solicitarDatos = true;
            }

        } while (numero <= 0);

        return numero;

    }

    private static int escanearIntValorAbsoluto(int numero) {

        Scanner sc = new Scanner(System.in);
        boolean solicitarDatos = true;

        do { //Controla excepción ime

            try {

                numero = Math.abs(sc.nextInt());

                solicitarDatos = false;

            } catch (InputMismatchException ime) {

                sc.nextLine();
            }

            while(numero == 0){
                
                solicitarDatos = true;
                System.out.println("Introduce un número mayor que 0");
                break;
                
            }
            
        } while (solicitarDatos);


        return numero;

    }

}

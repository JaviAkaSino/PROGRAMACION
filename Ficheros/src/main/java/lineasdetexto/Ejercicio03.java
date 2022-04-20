package lineasdetexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author javiakasino
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        /*3.- Implementa un programa que guarde exactamente 75 líneas de texto 
        en un fichero, cuyo nombre se deja a tu elección. En cada línea se irán 
        generando letras aleatorias (entre la ‘a’ y la ‘Z’) y se irán separando 
        por punto y coma (;) hasta que la letra que se vaya a escribir sea ‘g’ 
        o ‘G’. En este caso, se escribe y se saltará a la línea siguiente. 
        Posibles ejemplos de líneas generadas:
 
	a;C;T;B;D;s;u;i;w;g
	Q;w;e;r;t;y;S;H;J;K;G
	….
         */
        //Fichero a crear
        String idFichero = "letrasRandom.txt";
        Random rnd = new Random();
        String letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letra;

        //Try-Catch with resources
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {

            for (int i = 0; i < 75; i++) {

                do {
                    letra = String.valueOf(letras.charAt(rnd.nextInt(52)));

                    flujo.write(letra + ";");

                } while (!letra.equalsIgnoreCase("g"));

                flujo.newLine();

            }

            // Metodo flush() guarda cambios en disco 
            flujo.flush();

        } catch (IOException ioe) {

            System.out.println(ioe.getMessage());
        }

    }

}

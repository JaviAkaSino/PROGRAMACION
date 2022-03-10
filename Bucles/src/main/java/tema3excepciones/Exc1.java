package tema3excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exc1 {

    public static void main(String[] args) {

        int numero1=0, numero2=0;
        Scanner teclado = new Scanner(System.in);

        try {

            System.out.println("Introduce el número 1:");
            numero1 = teclado.nextInt();

            System.out.println("Introduce el número 2:");
            numero2 = teclado.nextInt();

        } catch (InputMismatchException e) {
            
            System.out.println("Te la mamaste wey");

        }

            int division = numero1 / numero2;
        
    }

}

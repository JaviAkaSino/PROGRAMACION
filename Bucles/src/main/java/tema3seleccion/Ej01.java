package tema3seleccion;

import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escanear edad");

        int edad = teclado.nextInt();

        if (edad < 0){
            System.out.println("Error. La edad no puede ser menor que 0");
        } else {
        
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        System.out.println("Mostrar la edad: " + edad);

        
        
        }

    }

}

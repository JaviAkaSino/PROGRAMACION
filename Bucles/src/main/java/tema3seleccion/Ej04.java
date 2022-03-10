package tema3seleccion;

import java.util.Scanner;

public class Ej04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escanear edad");

        int edad = teclado.nextInt();

        String condicion = edad < 0 ? "Error, la edad no puede ser menor que 0" 
                : edad >= 18 ? "Es mayor de edad" : "Es menor de edad";
        
        System.out.println(condicion);

        
        
        }

    }



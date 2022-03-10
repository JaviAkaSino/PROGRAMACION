package tema3seleccion;

import java.util.Scanner;

public class Ej06 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");
        System.out.println("Elija una opción: ");
        opcion = teclado.nextInt();

        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado");

            System.out.println("Indique el lado del cuadrado en cm");
            double lado = teclado.nextDouble();
            double areaCuadrado = Math.pow(lado, 2);

            System.out.printf("El área del cuadrado es de %.3f", areaCuadrado,
                     " cm²");
        } else if (opcion == 2) {
            System.out.println("Ha seleccionado calcular el área de un triángulo");

            System.out.println("Indique la base del triángulo en cm");
            double bTriangulo = teclado.nextDouble();
            System.out.println("Indique la altura del triángulo en cm");
            double hTriangulo = teclado.nextDouble();

            double areaTriangulo = bTriangulo * hTriangulo / 2;

            System.out.printf("El área del triángulo es de %.3f", areaTriangulo,
                    "cm²");

        } else if (opcion == 3) {
            System.out.println("Ha seleccionado calcular el área de un círculo");

            System.out.println("Indique el radio del círculo en cm");
            double radio = teclado.nextDouble();
            double areaCirculo = Math.PI * Math.pow(radio, 2);

            System.out.printf("El área del círculo es de %.3f", areaCirculo,
                     " cm²");

        } else {
            System.out.println("Ha seleccionado terminar");

        }
    }

}

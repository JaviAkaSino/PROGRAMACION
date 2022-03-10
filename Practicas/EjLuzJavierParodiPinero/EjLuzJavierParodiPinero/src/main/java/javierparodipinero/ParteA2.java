package javierparodipinero;

import java.util.Scanner;

public class ParteA2 {

    public static void main(String[] args) {
        
        /*Esta versión no incluye mensaje entre error y segunda pregunta,
        pero es más intuitivo y sencillo.*/

        //Declaramos constantes, variables y creamos Scanner
        final int VATIOS_MIN = 1, VATIOS_MAX = 4500;
        final double PRECIO_MIN = 0.1, PRECIO_MAX = 0.45, HORAS_MIN = 0, HORAS_MAX = 24;
        int respuesta;
        double vatios, horas, precioKwh;
        Scanner teclado = new Scanner(System.in);

        /*Utilizamos do-while para que se repita el programa hasta que
         se indique lo contrario, es decir, mientras que respuesta no valga 2*/
        do {

            //Mostramos menú de eleccióne entre cálculo o salir
            System.out.println("Seleccione una opción:");
            System.out.println("1 - Realizar un cálculo de consumo.");
            System.out.println("2 - Finalizar el programa.");
            respuesta = teclado.nextInt();

            //Utilizamos switch para las diferentes opciones
            switch (respuesta) {

                //Con case 1 sigue el programa
                case 1:

                    System.out.println("Ha seleccionado realizar un "
                            + "cálculo de consumo.");
                    /*En los 3 datos, si se encuentran fuera del rango, 
                    vuelve a la pregunta con bucle do while, hasta que el 
                    usuario introduzca un valor válido.*/
                    do {
                        //Lanzamos pregunta y recogemos valores respuesta
                        System.out.println("Indique el consumo del aparato en "
                                + "vatios (valor entre 1 y 4500).");
                        vatios = teclado.nextDouble();

                    } while (VATIOS_MIN > vatios || vatios > VATIOS_MAX);

                    do {
                        System.out.println("Indique las horas que está en "
                                + "funcionamiento al día (entre 0 y 24).");
                        horas = teclado.nextDouble();

                    } while (HORAS_MIN > horas || horas > HORAS_MAX);

                    do {
                        System.out.println("Indique el precio del kWh (entre "
                                + "0,1 y 0,45).");
                        precioKwh = teclado.nextDouble();

                    } while (PRECIO_MIN > precioKwh || precioKwh > PRECIO_MAX);

                    //Pasamos vatios a kiloVatios
                    double kiloVatios = vatios / 1000;
                    //Calculamos y lanzamos respuesta
                    double consumo = kiloVatios * horas * precioKwh;

                    System.out.printf("El consumo del aparato es de %.2f", consumo);
                    System.out.println(" € al día.");
                    System.out.println("");
                    System.out.println("-------------------------");
                    System.out.println("");

                    break;

                //Con case 2 el programa finaliza    
                case 2:

                    System.out.println("Ha seleccionado finalizar el programa.");

                    break;

                //Con el resto de valores, sale mensaje de no válido y vuelve a empezar el bucle    
                default:

                    System.out.println("Indique una opción válida.");
                    System.out.println("--------------------------");

            }
            //Mientras la respuesta no sea finalizar, se repetirá.    
        } while (respuesta != 2);
    }
}

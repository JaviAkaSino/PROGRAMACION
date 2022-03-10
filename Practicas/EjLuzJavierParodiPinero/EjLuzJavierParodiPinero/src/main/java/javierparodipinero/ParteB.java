package javierparodipinero;

import java.util.Scanner;

public class ParteB {

    public static void main(String[] args) {

//Declaramos constantes, variables y creamos Scanner
        final int VATIOS_MIN = 1, VATIOS_MAX = 4500;
        final double PRECIO_MIN = 0.1, PRECIO_MAX = 0.45, HORAS_MIN = 0,
                HORAS_MAX = 24;
        int respuesta;
        double vatios, horasPunta, horasLlanas, horasValle, precioPunta,
                precioLlanas, precioValle;
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
                    /*En los 7 datos, si se encuentran fuera del rango, 
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
                                + "funcionamiento al día en horas punta (entre 0 y 24).");
                        horasPunta = teclado.nextDouble();

                    } while (HORAS_MIN > horasPunta || horasPunta > HORAS_MAX);

                    do {
                        System.out.println("Indique las horas que está en "
                                + "funcionamiento al día en horas llanas (entre 0 y 24).");
                        horasLlanas = teclado.nextDouble();

                    } while (HORAS_MIN > horasLlanas || horasLlanas > HORAS_MAX);

                    do {
                        System.out.println("Indique las horas que está en "
                                + "funcionamiento al día en horas valle (entre 0 y 24).");
                        horasValle = teclado.nextDouble();

                    } while (HORAS_MIN > horasValle || horasValle > HORAS_MAX);

                    do {
                        System.out.println("Indique el precio del kWh en horas "
                                + "punta(entre 0,1 y 0,45).");
                        precioPunta = teclado.nextDouble();

                    } while (PRECIO_MIN > precioPunta || precioPunta > PRECIO_MAX);

                    do {
                        System.out.println("Indique el precio del kWh en horas "
                                + "llanas(entre 0,1 y 0,45).");
                        precioLlanas = teclado.nextDouble();

                    } while (PRECIO_MIN > precioLlanas || precioLlanas > PRECIO_MAX);

                    do {
                        System.out.println("Indique el precio del kWh en horas "
                                + "valle (entre 0,1 y 0,45).");
                        precioValle = teclado.nextDouble();

                    } while (PRECIO_MIN > precioValle || precioValle > PRECIO_MAX);

                    //Pasamos vatios a kiloVatios
                    double kVatios = vatios / 1000;
                    //Calculamos consumo de cada tramo
                    double consumoPunta = kVatios * horasPunta * precioPunta;
                    double consumoLlanas = kVatios * horasLlanas * precioLlanas;
                    double consumoValle = kVatios * horasValle * precioValle;
                    //El consumo total es la suma de los 3 tramos
                    double consumo = consumoPunta + consumoLlanas + consumoValle;

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

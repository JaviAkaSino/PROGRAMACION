package javierparodipinero;

import java.util.Scanner;

public class ParteA {

    public static void main(String[] args) {

        /*Esta versión es bastante más liosa, pero saca el mensaje de
        dato erróneo en cada variable, volviendo a pedirlo después.*/
        
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

            /*Si la respuesta es 1, seguimos, si es 2, frenará el while;
            si se introduce otro número, se advierte y se repite el bucle*/
            if (respuesta == 1) {

                System.out.println("Ha seleccionado realizar un "
                        + "cálculo de consumo.");
                //Repite mientras el valor no esté en rango
                do {
                    //Lanzamos pregunta y recogemos valores respuesta
                    System.out.println("Indique el consumo del aparato en vatios.");
                    vatios = teclado.nextDouble();
                    //Si está dentro del rango, seguimos
                    if (VATIOS_MIN <= vatios && vatios <= VATIOS_MAX) {
                        //Repite mientras el valor no esté en rango
                        do {
                            System.out.println("Indique las horas que está en "
                                    + "funcionamiento al día.");
                            horas = teclado.nextDouble();
                            //Si está dentro del rango, seguimos
                            if (HORAS_MIN <= horas && horas <= HORAS_MAX) {
                                //Repite mientras el valor no esté en rango
                                do {
                                    System.out.println("Indique el precio del kWh.");
                                    precioKwh = teclado.nextDouble();
                                    //Si está dentro del rango, seguimos
                                    if (PRECIO_MIN <= precioKwh && precioKwh <= PRECIO_MAX) {
                                        //Calculamos consumo y lanzamos mensaje.
                                        double kiloVatios = vatios / 1000;
                                        double consumo = kiloVatios * horas * precioKwh;

                                        System.out.printf("El consumo del aparato es de %.2f", consumo);
                                        System.out.println(" € al día.");
                                        System.out.println("");
                                        System.out.println("-------------------------");
                                        System.out.println("");
                                    
                                    //Saca mensaje de dato inválido
                                    } else {
                                        System.out.println("Lo sentimos, " + precioKwh + " no es un "
                                                + "valor válido. Por favor, indique un valor entre "
                                                + PRECIO_MIN + " y " + PRECIO_MAX + ".");
                                        System.out.println("");
                                    }
                                //No repite si el valor está en el rango    
                                } while (PRECIO_MIN > precioKwh || precioKwh > PRECIO_MAX);
                                
                            //Saca mensaje de dato inválido
                            } else {
                                System.out.println("Lo sentimos, " + horas + " no es un "
                                        + "valor válido. Por favor, indique un valor entre "
                                        + HORAS_MIN + " y " + HORAS_MAX + ".");
                                System.out.println("");
                            }
                        //No repite si el valor está en el rango    
                        } while (HORAS_MIN > horas || horas > HORAS_MAX);
                    
                    //Saca mensaje de dato inválido
                    } else {

                        System.out.println("Lo sentimos, " + vatios + " no es un "
                                + "valor válido. Por favor, indique un valor entre "
                                + VATIOS_MIN + " y " + VATIOS_MAX + ".");
                        System.out.println("");
                    }
                //No repite si el valor está en el rango    
                } while (VATIOS_MIN > vatios || vatios > VATIOS_MAX);
            //Saca mensaje de dato inválido    
            } else {
                System.out.println("Indique una opción válida.");
                System.out.println("--------------------------");

            }
        //Si la opción es 2, no repite el bucle y pasa al final    
        } while (respuesta != 2);

        System.out.println("Ha seleccionado finalizar el programa.");

    }

}

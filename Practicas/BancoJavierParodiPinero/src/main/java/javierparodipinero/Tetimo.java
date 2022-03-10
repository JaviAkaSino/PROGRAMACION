package javierparodipinero;

import java.util.Scanner;

public class Tetimo {

    public static void main(String[] args) {
        
        /*NOTA:
        He declarado como double las variables prestamo, salarioMes y
        anosHipoteca porque entiendo que pueden llevar decimales.
        En caso de que el banco no permitiera números decimales, 
        utilizaríamos int, pero es una condición que no muestra el enunciado.*/

        //Construimos Scanner y constantes, en este caso el factor mult.
        Scanner teclado = new Scanner(System.in);
        final double FACTOR = 5.85;

        //Lanzamos preguntas y recogemos datos en variables
        System.out.println("Introduzca su edad");

        int edad = teclado.nextInt();
        
        //Establecemos los límites de edad con if else
        if (18 <= edad && edad <= 65) {

            //Como cumple esta condición, se lanzan las siguientes preguntas
            System.out.println("¿Cuál es su salario mensual bruto?");

            double salarioMes = teclado.nextDouble();

            System.out.println("¿Cuánto dinero necesita?");

            double prestamo = teclado.nextDouble();

            /*Comprobamos si se cumple multiplicando el sueldo mensual
            por 12 para obtener el anual y multiplicarlo por el FACTOR*/
            if (prestamo <= salarioMes * 12 * FACTOR) {

                //Al cumplirse ésta también, seguimos
                System.out.println("¿En cuántos años desea devolver la "
                        + "hipoteca?");

                double anosHipoteca = teclado.nextDouble();

                /*Al ser la última pregunta e incluir 3 condiciones negativas, 
                incluimos en if las 3 con O lógico (||) para que si alguna de 
                las condiciones se da, se deniegue la hipoteca y se acabe el 
                programa*/
                if (5 > anosHipoteca || anosHipoteca > 30
                        || (anosHipoteca + edad) > 75) {

                    System.out.println("El plazo en el que devolver"
                            + " el préstamo no es válido.");

                    /*Si no se cumple ninguna de las tres, significa que el plazo 
                en el que devolver la hipoteca entra el rango permitido.
                Como las demás condiciones ya se habían cumplido, lanzamos el
                else con el mensaje de admitido*/
                } else {
                    System.out.println("Enhorabuena, cumple las "
                            + "condiciones para solicitar la hipoteca.");
                }

                /*Aquí están los else pertenecientes a no cumplir la condición 
        del importe y de la edad, respectivamente*/
            } else {
                System.out.println("El importe deseado es superior"
                        + " al permitido");
            }

        } else {
            System.out.println("Está fuera del rango de la edad "
                    + "permitida");
        }

    }

}

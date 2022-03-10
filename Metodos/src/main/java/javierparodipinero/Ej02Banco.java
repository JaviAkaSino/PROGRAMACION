package javierparodipinero;

import java.util.Scanner;

public class Ej02Banco {

    //Método que recibe edad, devuelve boolean
    private static boolean edadValida(int edad, final int EDAD_MIN, final int EDAD_MAX) {

        return (EDAD_MIN <= edad && edad <= EDAD_MAX);

    }

    //Método que recibe prestamo, salarioMes y FACTOR, devuelve boolean
    private static boolean dineroValido(double prestamo, double salarioMes, final double FACTOR) {

        return (prestamo <= (salarioMes * 12 * FACTOR));
    }

    //Método que recibe aniosHipoteca, edad
    private static boolean periodoValido(int aniosHipoteca, int edad, final int ANIOS_MIN,
            final int ANIOS_MAX, final int SUMA_ANIOS_MAX) {

        return ((ANIOS_MIN <= aniosHipoteca && aniosHipoteca <= ANIOS_MAX)
                && ((aniosHipoteca + edad) <= SUMA_ANIOS_MAX));
    }

    public static void main(String[] args) {

        //Construimos Scanner y constantes, en este caso el factor mult.
        Scanner teclado = new Scanner(System.in);
        final double FACTOR = 5.85;
        final int EDAD_MIN = 18, EDAD_MAX = 65;
        final int ANIOS_MIN = 5, ANIOS_MAX = 30, SUMA_ANIOS_MAX = 75;

        int edad, aniosHipoteca;

        double salarioMes, prestamo;

        //Lanzamos preguntas y recogemos datos en variables
        System.out.println("Introduzca su edad");

        edad = teclado.nextInt();

        //Método filtroEdad
        if (edadValida(edad, EDAD_MIN, EDAD_MAX)) {

            //Como cumple esta condición, se lanzan las siguientes preguntas
            System.out.println("¿Cuál es su salario mensual bruto?");

            salarioMes = teclado.nextDouble();

            System.out.println("¿Cuánto dinero necesita?");

            prestamo = teclado.nextDouble();

            /*Método filtroDinero*/
            if (dineroValido(prestamo, salarioMes, FACTOR)) {

                //Al cumplirse ésta también, seguimos
                System.out.println("¿En cuántos años desea devolver la "
                        + "hipoteca?");

                aniosHipoteca = teclado.nextInt();

                if (periodoValido(aniosHipoteca, edad, ANIOS_MIN, ANIOS_MAX, SUMA_ANIOS_MAX)) {

                    System.out.println("Enhorabuena, cumple las "
                            + "condiciones para solicitar la hipoteca.");

                    /*Si no se cumple ninguna de las tres, significa que el plazo 
                en el que devolver la hipoteca entra el rango permitido.
                Como las demás condiciones ya se habían cumplido, lanzamos el
                else con el mensaje de admitido*/
                } else {
                    System.out.println("El plazo en el que devolver"
                            + " el préstamo no es válido.");
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

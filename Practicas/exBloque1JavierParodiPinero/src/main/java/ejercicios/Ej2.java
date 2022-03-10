package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier Parodi Piñero
 */
public class Ej2 {

    public static void main(String[] args) {

        //Programa para resolver ecuaciones de segundo grado
        //Donde ax² + bx + c = 0
        
        /*Controlamos excecpción NumberFormat, ya que trabajamos con JOption.
        Del mismo modo, la excepcion Arithmetic no es posible con los if--else*/
        
        /*Variables para entrada de JOption, y double para x1, x2, a, b y c; ya que
        pueden tener decimales.*/
        //boolean seguir e inicializamos a, b y c para try-catch
        String texto;
        double a = 0, b = 0, c = 0, x1, x2;
        boolean seguir;

        //Lanza preguntas, recoge respuestas en String y pasa a double
        JOptionPane.showMessageDialog(null, "Ecuación de segundo grado, donde :"
                + " ax² + bx + c = 0");

        do {

            seguir = true;

            texto = JOptionPane.showInputDialog(null, "Introduce el valor de 'a'");

            try {

                a = Double.parseDouble(texto);

                seguir = false;

            } catch (NumberFormatException nfe) {

                JOptionPane.showMessageDialog(null, "Valor no válido, introduce"
                        + " sólo números");

            }
        } while (seguir);

        do {

            seguir = true;

            texto = JOptionPane.showInputDialog(null, "Introduce el valor de 'b'");

            try {

                b = Double.parseDouble(texto);

                seguir = false;

            } catch (NumberFormatException nfe) {

                JOptionPane.showMessageDialog(null, "Valor no válido, introduce"
                        + " sólo números");

            }
        } while (seguir);

        do {

            seguir = true;

            texto = JOptionPane.showInputDialog(null, "Introduce el valor de 'c'");

            try {

                c = Double.parseDouble(texto);

                seguir = false;

            } catch (NumberFormatException nfe) {

                JOptionPane.showMessageDialog(null, "Valor no válido, introduce"
                        + " sólo números");

            }
        } while (seguir);

        //b²-4ac no puede ser negativo
        if ((Math.pow(b, 2) - 4 * a * c) < 0) {

            System.out.println("Los valores suministrados no permiten calcular"
                    + " las soluciones de la ecuación");

            //Si a y b son 0, la ecucación no tiene solución, ya que quedaría c = 0
        } else if (a == 0 && b == 0) {

            System.out.println("La ecuación no tiene solución");

            //Si a=0 y b no es 0, sólo hay una solución, ya que bx + c= 0 --> x = -c/b
        } else if (a == 0 && b != 0) {

            x1 = -c / b;

            System.out.println("La solución a la ecuación es x = " + x1);

            /*Para el resto de casos, aplicamos la fórmula de la ecuación de 2º
            grado, que ofrece dos soluciones posibles
            x1 = (-b + (b² - 4ac)^(1/2)) / 2a
            x2 = (-b - (b² - 4ac)^(1/2)) / 2a
             */
        } else {

            x1 = (-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / 2 * a;

            x2 = (-b - Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / 2 * a;

            System.out.println("Las posibles soluciones de x son:");
            System.out.println("");
            System.out.printf("x1 = %.2f", x1);
            System.out.println("");
            System.out.printf("x2 = %.2f", x2);

        }

    }
}

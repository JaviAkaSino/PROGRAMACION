package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier Parodi Piñero 1º DAW
 */
public class Ej1 {

    public static void main(String[] args) {

        //Programa para resolver ecuaciones de segundo grado
        //Donde ax² + bx + c = 0
        /*Variables para entrada de JOption, y double para x1, x2, a, b y c; ya que
        pueden tener decimales.*/
        String texto;
        double a, b, c, x1, x2;

        //Lanza preguntas, recoge respuestas en String y pasa a double
        JOptionPane.showMessageDialog(null, "Ecuación de segundo grado, donde :"
                + " ax² + bx + c = 0");

        texto = JOptionPane.showInputDialog(null, "Introduce el valor de 'a'");

        a = Double.parseDouble(texto);

        texto = JOptionPane.showInputDialog(null, "Introduce el valor de 'b'");

        b = Double.parseDouble(texto);

        texto = JOptionPane.showInputDialog(null, "Introduce el valor de 'c'");

        c = Double.parseDouble(texto);

        //b²-4ac no puede ser negativo
        if ((Math.pow(b, 2) - 4 * a * c) < 0) {

            System.out.println("Los valores suministrados no permiten calcular"
                    + " las soluciones de la ecuación");

        //Si a y b son 0, la ecucación no tiene solución, ya que quedaría c = 0
        }else if (a == 0 && b == 0) {

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

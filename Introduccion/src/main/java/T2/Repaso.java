package T2;

//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Repaso {

    public static void main(String[] args) {

        //Declaración de variables
        int var1, var2;
        //Cuidado con los nombres --> camelCase
        double estaturaPersona;
        //Inicialización de variables
        var1 = 12;
        var2 = 14;

        //Declaración e inicialización
        float pesoPersona = 67.6f;
        long millonesQueMeVaisADar = 23_000_000_000l;
        final double SUPLEMENTO = 123.45;
        //Constantes
        final boolean SIEMPRE_SI = true;
        //Al ser constante no puede cambiar su valor
        //SIEMPRE_SI = false;

        //Los valores concretos de un tipo de datos son  literales
        long mumero1 = 23; //int-->long Conversión/Casting implícita
        long numero2 = (long) 23; //Conversión explícita

        double expresion = 12 / 5;

        //Math.ceil redondea al alza
        expresion = Math.ceil(3.4);
        System.out.println(expresion);

        //Math.floor trunca
        expresion = Math.floor(4.9);
        System.out.println(expresion);

        //Math.round redondea
        expresion = Math.round(4.2);
        System.out.println(expresion);
        expresion = Math.round(4.8);
        System.out.println(expresion);
        expresion = Math.round(4.5);
        System.out.println(expresion);

        //Scanner
        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el peso");
        pesoPersona = teclado.nextFloat();
        System.out.println("Introduce la estatura");
        estaturaPersona = teclado.nextDouble();
        //Con Scanner, despues de ller números hay que limpiar la variable
        
        System.out.println("Introduce tu nombre");
        String nombre = teclado.nextLine();
        
       // System.out.println("Peso" + pesoPersona + "Estatura" + estaturaPersona);
        //IMC = peso kg / estatura persona m ²
        double indiceMasaCorporal = pesoPersona / Math.pow(estaturaPersona, 2);
        System.out.println(nombre + " tu IMC es " + indiceMasaCorporal);
        System.out.printf("%s tu IMC es: %.2f", nombre, indiceMasaCorporal);
        */

        //Lectura de datos con JOption
        String apellido = JOptionPane.showInputDialog("Introduce tu apellido");
        System.out.println(apellido);
        String dinerosTexto = JOptionPane.showInputDialog("Introduce el dinero"
                + "para sobornar al de programación");
        double dineros = Double.parseDouble(dinerosTexto);
        System.out.println("El profe va a recibir " + (12 * dineros + SUPLEMENTO)
                + " al año");
        JOptionPane.showMessageDialog(null, "El profe va a recibir "
                + (12 * dineros + SUPLEMENTO) + "al año");

    }

}

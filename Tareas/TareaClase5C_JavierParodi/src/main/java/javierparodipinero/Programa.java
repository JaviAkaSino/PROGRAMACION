package javierparodipinero;

/**
 *
 * @author javiakasino
 */
public class Programa {

    public static void main(String[] args) {

        CajonCalcetines cajon1 = new CajonCalcetines(); //Se crea el cajón

        cajon1.llenarCajon(); //Se llena

        cajon1.mostrarCajon(); //Y se muestra (comprobación)

        cajon1.doblarCalcetines(); //Dobla los calcetines con pareja

        cajon1.todosEmparejados(); //Resultado y calcetines sin pareja

    }

}

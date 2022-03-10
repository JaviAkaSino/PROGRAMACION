package javierparodipinero.newpackage;

/**
 *
 * @author javiakasino
 */
public class Programa2 {

    public static void main(String[] args) {

        CajonCalcetines2 cajon1 = new CajonCalcetines2(); //Se crea el cajón

        cajon1.llenarCajon(); //Se llena

        cajon1.mostrarCajon(); //Y se muestra (comprobación)

        cajon1.doblarCalcetines(); //Dobla los calcetines con pareja

        cajon1.todosEmparejados(); //Resultado y calcetines sin pareja

    }

}

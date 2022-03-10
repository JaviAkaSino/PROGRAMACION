package daw.javierparodipiniero;

/**
 *
 * @author javiakasino
 */
public class Test {

    public static void main(String[] args) {

        TarjetaCredito t1 = new TarjetaCredito();

        System.out.println(t1);

        TarjetaCredito t2 = new TarjetaCredito();

        System.out.println(t2);
        
        TarjetaCredito t3 = new TarjetaCredito();

        System.out.println(t3);
        
        t2.anularTarjeta();
        
        t2.pagar(50);
        
        t2.activarTarjeta();
        
        t2.pagar(5000);
        
        
        t3.activarTarjeta();
        
        t3.pagar(50);
        
        System.out.println(t3);

    }

}

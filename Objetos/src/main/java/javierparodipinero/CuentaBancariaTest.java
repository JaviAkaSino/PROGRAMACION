
package javierparodipinero;

public class CuentaBancariaTest {

    public static void main(String[] args) {

        CuentaBancaria ccc = new CuentaBancaria();
        
        ccc.ingresarIntereses();
        
        System.out.println(ccc.toString());
        
        ccc.ingresarDinero(100);
        
        System.out.println(ccc);
        
        ccc.retirarEfectivo(500);
        
        System.out.println(ccc);

    }
    
}

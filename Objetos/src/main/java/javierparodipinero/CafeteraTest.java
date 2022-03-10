
package javierparodipinero;

/**
 *
 * @author javiakasino
 */
public class CafeteraTest {

    public static void main(String[] args) {

        Cafetera c = new Cafetera(100,-50);
        
        System.out.println(c.toString());
        
        c.llenarCafetera();
        
        System.out.println(c.toString());
        
        c.servirTaza(80);
        
        System.out.println(c.toString());
        
        c.vaciarCafetera();
        
        System.out.println(c.toString());
        
        c.agregarCafe(60);
        
        System.out.println(c.toString());
        
        

    }
    
}

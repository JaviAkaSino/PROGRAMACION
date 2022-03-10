
package javierparodipinero;

/**
 *
 * @author javiakasino
 */
public class PuntoGeometricoTest {


    public static void main(String[] args) {

        PuntoGeometrico p1 = new PuntoGeometrico(5,7);
        
        PuntoGeometrico p2 = new PuntoGeometrico();
        
        p2.setX(1);
        p2.setY(-6);
        
        System.out.println(p1.getX());   
        System.out.println(p1.getY());
        
        System.out.println(p2.getX());
        System.out.println(p2.getY());
        
        

    }
    
}

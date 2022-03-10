
package javierparodipinero;

/**
 *
 * @author javiakasino
 */
public class LineaTest {

    public static void main(String[] args) {
        
        
        Linea l1 = new Linea();
        
        System.out.println(l1);

        l1.mueveDerecha(5);
        
        System.out.println(l1);
        
        l1.MostrarLinea();
        
        Linea l2 = new Linea();
        
        System.out.println(l2);
        
        //Cambiar coordenada x punta a segunda linea
       
        l2.getPuntoA().setX(4);
    }
    
}

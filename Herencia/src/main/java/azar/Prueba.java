package azar;

/**
 *
 * @author javiakasino
 */
public class Prueba {

    public static void main(String[] args) {

        Azar a1 = new Dado();
        Azar a2 = new Moneda();
        
        System.out.println("Lanzar a1 (dado)");
        System.out.println(a1.lanzar());
        
        System.out.println("Lanzar a2 (moneda)");
        System.out.println(a2.lanzar());
        
    }
    
}

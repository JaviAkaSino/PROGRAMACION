
package array;

/**
 *
 * @author JaviA
 */
public class LanzarMonedaTest {


    public static void main(String[] args) {


        LanzarMoneda lm = new LanzarMoneda();

        lm.rellenarArrayCaraCruz();
        
        lm.mostrarArray();
        
        System.out.println(lm.contarCaras());

        System.out.println(lm.contarCruces());
        
    }
    
}


package ejercicio3;

/**
 *
 * @author javiakasino
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[][] matriz = Lectura.lectura("matriz.txt");

        Utilidades.imprimirMatrizStr(matriz);
        
        Utilidades.buscarIslas(matriz);

        
        
    }
    
}

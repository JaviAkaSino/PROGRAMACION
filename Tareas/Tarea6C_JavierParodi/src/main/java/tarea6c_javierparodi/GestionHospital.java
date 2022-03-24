package tarea6c_javierparodi;

import java.time.LocalDate;

/**
 *
 * @author javiakasino
 */
public class GestionHospital {
    
    public static void main(String[] args) {
        
        NIF nif = new NIF("09079384", LocalDate.now());
        System.out.println(nif);
    }
    
}

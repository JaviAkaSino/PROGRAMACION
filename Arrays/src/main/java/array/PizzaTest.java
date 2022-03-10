package array;

import java.time.Month;

/**
 *
 * @author javiakasino
 */
public class PizzaTest {

   
    public static void main(String[] args) {

        Month marzo = Month.MARCH;
        
        Pizza bbq = Pizza.BARBACOA;
        
        switch(bbq){
            
            case BARBACOA:
                break;
            case CARBONARA:
                break;
        }
            
        Pizza.values();

    }
    
}

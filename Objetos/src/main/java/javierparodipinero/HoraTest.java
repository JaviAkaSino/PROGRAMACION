package javierparodipinero;

import java.time.LocalTime;

/**
 *
 * @author javiakasino
 */
public class HoraTest {

    public static void main(String[] args) {

        Hora h1 = new Hora(12,74,9);
        
        h1.escribirHora();
        
        h1.setHoras(9);
        
        h1.escribirHora();
        
        h1.setHoras(29);
        
        h1.escribirHora();
        
        System.out.println("Segundos desde medianoche hasta ahora");
        
        System.out.println(Hora.secMidToNow());
        
        System.out.println("Segundos desde medianoche hasta la hora");
        
        System.out.println(h1.secMidToHour());
        
        System.out.println("Segundos desde ahora hasta medianoche");
        
        System.out.println(Hora.secNowToMid());
                
                }
    
}

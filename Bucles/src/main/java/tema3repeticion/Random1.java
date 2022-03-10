
package tema3repeticion;

import java.util.Random;

public class Random1 {

public static void main(String[] args) {
        
    Random numAleatorio = new Random();
    
    //X valores aleatorios, si 10, 0-9
    
    int n = numAleatorio.nextInt(10);
    
    System.out.println("n = " + n);
    
    
    //Numero entre X e Y (Y-X+1)+X
    
    //Entre 25 y 75
    
    int m = numAleatorio.nextInt(75-25+1) + 25;
    
    System.out.println("m = " + m);
    
    
    //Con Math.random saca entre 0,0 y 1,0
    
    /*int o = (int)Math.random()*100;
    
    System.out.println("o = " + o);*/
    
    
    }
    
}

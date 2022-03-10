
package tema3repeticion;

public class Ej3 {

    public static void main(String[] args) {

        /*3.- Realizar un programa que imprima 25 términos de la serie 15 - 
        30 - 60 - 120, etc. No se introducen valores por teclado.*/
        
        //int x; 
        int n = 0;
        final int BASE = 15;
        final int TOTAL_TERMINOS = 25;
        /*while (n<25){
            x = (int)(BASE * Math.pow(2, n));
            System.out.print(x);
            System.out.print(" - ");
            n = n + 1;*/
            
            for (int x = BASE; n < TOTAL_TERMINOS; n++){
                
                x = (int)(BASE * Math.pow(2, n));
                System.out.print(x);
                System.out.print(" - ");
                
        }
        

    }
    
}


package T2;

import java.util.Scanner;

public class Algo05 {
    
    public static void main(String[] args) {
        
        //Declaramos Scanner y double, junto con constantes y variables
        
            Scanner teclado;
            final int FIJO = 150;
            final double EUROKM = 0.153; 
            double distancia;
            double presupuesto;
                
        //Construimos Scanner
            teclado = new Scanner(System.in);
                   
        System.out.println("¿De cuántos kilómetros es el recorrido?");
        
        distancia = teclado.nextDouble();
        
        //Hacemos la cuenta y lanzamos respuesta
        
            presupuesto = FIJO + distancia * EUROKM;
  
        System.out.println("El presupuesto total para una distancia de "
                + distancia + " Km es de " + presupuesto + " €");
        

        
                        
               
        
                
                
       
        
        
    }
    
}

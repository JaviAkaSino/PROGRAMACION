
package T2;

//Imports
import java.util.Scanner;

public class Algo11 {

    
    public static void main(String[] args) {
        /*Realiza un programa para calcular la distancia entre dos puntos
        en un plano cartesiano, a partir de las coordenadas de los mismos. 
        Utiliza el teorema de Pitágoras*/
        
        //P1(x1,x2); P2(y1,y2)
        //Distancia entre P1 y P2 = Raíz cuadrada de [(x2-x1)² + (y2-y1)²]
        
        //Declaramos Scanner y variables de las coordenadas
        
        Scanner teclado = new Scanner(System.in);
        double x1, x2, y1, y2;
        
        //Lanzamos pregunta de coordenadas
        
        System.out.println("Las coordendas de P1(x1,x2); P2(y1,y2) son: "
                + "+ \nx1 = ");
        
        x1 = teclado.nextDouble();
        
        System.out.println("y1 = ");
        
        y1 = teclado.nextDouble();
        
        System.out.println("x2 = ");
        
        x2 = teclado.nextDouble();
        
        System.out.println("y2 = ");
        
        y2 = teclado.nextDouble();
                
        
        double distX = (x2 - x1);
        double distY = (y2 - y1);
        double distXCuad = Math.pow(distX,2); 
        double distYCuad = Math.pow(distY,2); 
        double sumaCuadrados = distXCuad + distYCuad;  
        double distancia = Math.sqrt(sumaCuadrados);
        
                
        
        System.out.printf("La distancia entre los puntos P1(x1,x2) y "
                + "P2(y1,y2) es de %.2f", distancia);
        

        
        
        
        
                
    }
    
}

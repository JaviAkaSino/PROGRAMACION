//Nombre del paquete
package T2;

//Imports
import java.util.Scanner;
        
//Declaración de clase
public class Algo04 {
    
    //Método main
    public static void main(String[] args) {
     
        //Declaramos Scanner y double
        
        Scanner teclado;
        double gramos;
    
        //Creamos el Scanner y lanzamos pregunta
        
        teclado = new Scanner(System.in);
        
    System.out.println("Gramos a convertir en libras");
        
        gramos = teclado.nextDouble();
        
        //Dado que un gramo son 0,00220462 libras
        
        final double GRAMOS_LIBRAS = 0.00220462;
        
                double libras = gramos * GRAMOS_LIBRAS;
                
        System.out.println(gramos + " gramos son " + libras + " libras");
                
        
        
        
        
        
    
    
    
    
        
        
    }
    
}

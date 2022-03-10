//Nombre del paquete
package T2;

//Imports
import java.util.Scanner;

//Declaración de clase
public class Algo06 {

    //Método main
    public static void main(String[] args) {
        
        //Declaramos Scanner y las variables
        
        Scanner teclado;
        int a, b;        
        
        //Construimos Scanner
        
        teclado = new Scanner(System.in);
        
        //Lanzamos preguntas y recogemos la entrada de teclado
        
            System.out.println("Indique el valor de 'a'"); 
        
            a = teclado.nextInt();
        
            System.out.println("Indique el valor de 'b'");
        
            b = teclado.nextInt();
            
            
        //Decl. e inic. las variables resultado de las operaciones
        
            int x = a / b;    
            int y = a % b;    
            
        //Lanzamos el resultado de las operaciones
        
        System.out.println("El resultado de las operaciones para a = "
        + a + " y b = " + b + " es:");
        
        System.out.println("a / b = " + x + "\na mod b = " + y);
        
        
        
        
        
            
        
                
                
        
        
            }
    
}

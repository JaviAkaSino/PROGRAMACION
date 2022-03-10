//Nombre del paquete
package T2;

//Imports
import java.util.Scanner;
        
//Declaración de clase        
public class Algo08_1 {
    
    //Método main
    public static void main(String[] args) {
        /*Programa que pida el precio de un artículo y calcule 
        su valor aplicando un 16% de IVA. Realiza un programa 
        para calcular el valor de cualquier artículo aplicando 
        cualquier IVA.*/
        
        //Declaramos Scanner y variables
        
        Scanner teclado;
  
        final double IVA = 1.16;
        
        double precioSin;
        double precioCon;
        
        //Construimos el Scanner
        
        teclado = new Scanner(System.in);
        
        //Lanzamos la pregunta del precio a añadir el IVA y recogemos dato.
        
        System.out.println("¿Cuál es el precio sin IVA");
        
        precioSin = teclado.nextDouble();
        
        //Realizamos operación y lanzamos respuesta
        
        precioCon = precioSin * IVA;
        
        System.out.println("El precio final es de " + precioCon + 
                " € IVA incluido");
             
        
  
        
        
        
        

        
        
                
    }
    
}

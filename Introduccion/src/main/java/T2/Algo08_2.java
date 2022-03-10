//Nombre del paquete
package T2;

//Imports
import java.util.Scanner;

//Decl. clase
public class Algo08_2 {

    //Método main
    public static void main(String[] args) {
       
        //Declaramos y construimos Scanner, variables y constantes
        
        Scanner teclado = new Scanner(System.in);
        
        double precioSin;
        double precioCon;
        double iva;
        
        /*Lanzamos pregunta de el precio inicial y el IVA a añadir
        y recogemos las respuestas*/
        
        System.out.println("¿Cuál es el precio sin IVA?");
                
        precioSin = teclado.nextDouble();
        
        System.out.println("¿Cuál es el IVA?");
        
        iva = teclado.nextDouble();
        
        /*Calculamos el precio final multiplicando 
        el precio por (1 + iva/100)*/
             
        precioCon = precioSin * (1 + iva / 100);

        //Lanzamos respuesta
        
        System.out.println("El precio final con IVA es de " + precioCon);
               
        
    }
    
}

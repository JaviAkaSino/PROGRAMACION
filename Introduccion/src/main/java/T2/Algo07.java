//Nombre del paquete
package T2;

//Imports
import java.util.Scanner;

//Decl. clase
public class Algo07 {

    //Método main
    public static void main(String[] args) {
        
        /*Un productor de leche lleva el registro de lo que produce 
en litros, pero cuando entrega la leche en la distribuidora le pagan 
según los galones entregados (1 galón son 3,78 litros). Escribe un programa 
que ayude al productor a saber cuánto recibirá por la entrega de su producción
de un día, sabiendo que el precio del galón es 1.20€.*/
        
        /*Necesitamos convertir litros a galones (1 galón = 3.78 litros)
        y pasar los galones a euros (1 galón suponen 1.20€)*/
        
        //Declaramos Scanner, las constantes y las variables
        
        Scanner teclado;
        
        final double LITRO_GALON = 3.78;
        final double GALON_EURO = 1.20;  
        
        double litros, galones, euros;
               
        
        //Construimos Scanner
        
        teclado = new Scanner(System.in);
        
        //Lanzamos pregunta para saber los litros del día y recogemos respuesta
        
        System.out.println("¿Cuántos litros de leche se han producido hoy?");
        
        litros = teclado.nextDouble();
        
        //Realizamos la conversión de los litros a galones
        
        galones = litros * LITRO_GALON;
        
        //Y de galones a euros
        
        euros = galones * GALON_EURO;
                
        //Lanzamos la respuesta
                
        System.out.println("Para una producción de " + litros + " litros,"
                + "obtendrás " + euros + " euros por la entrega.");            
                
                
        
    }
    
}

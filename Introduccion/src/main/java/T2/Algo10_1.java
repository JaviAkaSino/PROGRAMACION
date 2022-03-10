
package T2;

//Imports

public class Algo10_1 {

    public static void main(String[] args) {
        
        /*Realiza un programa que calcule el espacio recorrido, en metros, 
        por un cuerpo que se deplaza a 200 km/h si está en movimiento 
        20 minutos.*/
       
        //Declaramos constantes, varianles
        
        final int VEL_KM_H = 200;
        final int TIEMPO_MIN = 20;
        final double KMH_MMIN = 1000.0 / 60;
        double velocidadMMin;
        double distancia;
        
                //Calculamos, pasando velocidad a metros/min
                
                velocidadMMin = VEL_KM_H * KMH_MMIN;
                
                //Calculamos la distancia y lanzamos respuesta.
                
                distancia = velocidadMMin * TIEMPO_MIN;
                
                System.out.println("El espacio recorrido por el cuerpo"
                        + " es de " + distancia + " metros");
                
                
               
        
        
        
    }
    
}

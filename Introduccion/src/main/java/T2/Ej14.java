
package T2;

import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) {
        
        /*14.- Crea una nueva clase llamada Ej14, que contenga una llamada 
al método public static void main(String[] args). El programa tendrá una 
variable entera tiempo inicializada con un valor leído por teclado, en 
segundos, y queremos conocer este tiempo pero expresado en horas, minutos y 
segundos, mostrando los resultados por pantalla.*/
        
       //Construimos el Scanner
       
       Scanner teclado = new Scanner(System.in);
       
       //Lanzamos pregunta e inicializamos tiempo con respuesta
       
        System.out.println("¿Cuántos segundos?");
        
        int tiempo = teclado.nextInt();
        
        //Operaciones  y respuestas
        
        //Pasamos los seg a horas quedandonos con la parte entera
        int tiempoHoras = tiempo / 3600;
        //Sacamos los segundos que sobran en el resto con mod 
        int segundosSobrantes =   tiempo % 3600;
        //Pasamos a minutos cogiendo la parte entera
        int tiempoMin = segundosSobrantes / 60;
        /*Si restamos los minutos en segundos a los segundos que sobran,
        obtendremos los segundos que quedan 'sueltos'*/
        int tiempoSeg = segundosSobrantes % 60;
         
        System.out.println(tiempo + " segundos son " + tiempoHoras + 
                " horas, " + tiempoMin + " minutos y " + tiempoSeg +
                " segundos.");
        
        
        
        
       
    }
    
}

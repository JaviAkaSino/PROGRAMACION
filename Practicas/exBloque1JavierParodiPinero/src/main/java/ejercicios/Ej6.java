
package ejercicios;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {

        //Variables, constantes, Scanner
        int opcion = 0;
        String respuesta;
        Scanner teclado = new Scanner(System.in);
        boolean seguir=true;
        //Jugadores para la opción 3
        final int JUGADORES = 20;
        int moneda;
        Random numeroAleatorio = new Random();
        int dado;
        
        do {

            System.out.println("");
            System.out.println("Seleccione una opción:");
            System.out.println("1) Cuenta atrás");
            System.out.println("2) Juego de dados");
            System.out.println("3) Salir");

            

            do {
                try {
                    opcion = teclado.nextInt();
                    seguir = false;

                } catch (InputMismatchException ime) {

                    System.out.println("Opción no válida, introduce solo números");
                    teclado.nextLine();
                }
            } while (seguir);
            
            switch (opcion){
                
                case 1:
                    
                    
                    
                    break;
                    
                case 2:
                    
                    for (int x = 1; x <= JUGADORES; x++){
                        
                        //0 es cara y 1 es cruz
                        moneda = numeroAleatorio.nextInt(2);
                        
                        if (moneda == 0) {
                                                   
                        } else {
                            
                            System.out.println("Lo sentimos, jugador " + x + 
                                    " le ha salido cruz");
                            
                        }
                        
                        
                        
                    }
                    
                    break;
                    
                case 3:
                    
                    teclado.nextLine();
                    System.out.println("¿Desea salir? Para salir escriba SI");
                    
                    respuesta = teclado.nextLine();
                    
                    if (!respuesta.equalsIgnoreCase("si")) {
                        
                        opcion = 0;               
                    }
                    
                    break;
                    
                default:
                        
                    System.out.println("Opción no válida, introduce un número "
                            + "del 1 al 3");
                    
                    break;
                
            }
            
            

        } while (opcion != 3);

    }

}
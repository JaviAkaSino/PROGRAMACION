
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {

        //Variables, constantes, Scanner
        int opcion = 0;
        String respuesta;
        Scanner teclado = new Scanner(System.in);
        boolean seguir=true;
        //Primer y uĺtimo valor de la cadena en opción 1
        final int PRIMER_VALOR = 1000, ULTIMO_VALOR = 100;
        
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
                    
                    //Cadena de un valor a otro descendiendo de 5 en 5
                    //En el bucle se suma uno, tras mostrarse, por lo que restamos 6
                    for (int x = PRIMER_VALOR; ULTIMO_VALOR <= x; x++) {
                        
                  
                    System.out.print(x);
                    
                    if(x!=ULTIMO_VALOR) {
                    System.out.print(" - ");
                    }
                    
                    x = x-6;
                    
                    }
                    
                    break;
                    
                case 2:
                    
                    
                    
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

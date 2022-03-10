package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {

        //Variables, constantes, Scanner
        int opcion = 0;
        String respuesta;
        Scanner teclado = new Scanner(System.in);
        boolean seguir=true;
        
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

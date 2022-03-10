
package javierparodipinero;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ej03AdivinarNumero {

    public static void main(String[] args) {
        
        //CAMBIAR PARA QUE PIDA MIN Y MAX
        //Constantes y variables
        Scanner sc = new Scanner(System.in);
        //Numero del 1 al 10 con 3 intentos
        final int VIDAS = 3;
        //opcion para menú, numero para el que dice el usuario
        int opcion = 0, numero = 0, numeroPensado, vidasRestantes;
        int valorMin = 0, valorMax = 0;
        

        System.out.println("En el siguiente juego, tendrás que adivinar" 
                + " un número entre dos que indiques. Sólo tienes " + VIDAS + " intentos.");
        
        do{
            vidasRestantes = VIDAS;
            
            System.out.println("----------------------");
            System.out.println("Seleccione una opción:");
            System.out.println("1 - Nueva partida");
            System.out.println("2 - Salir");         
            
            opcion = excepcion(opcion);
            
            switch (opcion){
                
                case 1:
                    System.out.println("Nueva partida");
                    System.out.println("-----------------------");
                    System.out.println("Introduce entre qué números estará el número a adivinar");
                    
                    System.out.println("Número 1:");
                    valorMin = excepcion(valorMin);          
                    
                    System.out.println("Número 2");   
                    valorMax = excepcion(valorMax);
 
                    numeroPensado = numeroAleatorioEntre(valorMin, valorMax);                   
                    
                    System.out.println("Intenta adivinar el número entre " + valorMin + 
                            " y " + valorMax);
                    
                    
                    //Bucle hasta que se acaben las vidas para preguntar
                    do{
                        System.out.println("Te quedan " + vidasRestantes-- + " intentos.");
                        
                        numero = excepcion(numero);
                        
                        //if si acierta, else si falla
                        if(numero == numeroPensado){
                            System.out.println("¡Enhorabuena, has acertado!");
                            
                        } else {
                            
                            System.out.println("Número incorrecto");
                            
                            //Da la pista si el número no es correcto
                            if (vidasRestantes > 0){
                                
                                //Indica si es mayor o menor que el intento
                                if(numero < numeroPensado){
                                
                                    System.out.println("El número es mayor que " + numero);
                                
                                } else {
                                
                                    System.out.println("El número es menor que " + numero);
                                
                                }
                                
                            }
                                                            
                        }
                        
                    } while (vidasRestantes > 0 && numero != numeroPensado);
                    
                    System.out.println("El número era " + numeroPensado);
                    
                    break;
                        
                case 2: 
                    System.out.println("Ha seleccionado salir.");
                       
                    break;
                
                default:
                    System.out.println("No ha seleccionado una opción válida.");
                    
                    break;
            }
                       
        } while(opcion != 2);
        
    }
     
    
    private static int excepcion(int numero){
        
        Scanner sc = new Scanner(System.in);
        boolean solicitarDatos = true;
        
        do {

            try {
                
                numero = sc.nextInt();
                
                solicitarDatos = false;

            } catch (InputMismatchException ime) {

                System.out.println("Se ha introducido texto en lugar de números, "
                    + "vuelva a introducir el dato");
                sc.nextLine();
            }

        } while (solicitarDatos);

        return numero;
        
    }
    
    private static int numeroAleatorioEntre(int valorMin, int valorMax){
        
        Random numeroAleatorio = new Random();
        int aleatorio;
        
        try {
            
            aleatorio = numeroAleatorio.nextInt(valorMax - valorMin + 1) + valorMin;
            
        } catch (IllegalArgumentException iae) {
            
            aleatorio = numeroAleatorio.nextInt(valorMin - valorMax + 1) + valorMax;
            
        }

        return aleatorio;
        
    }
  
}


//Método nº aleatorio entre dos valores que le vamos a pasar como parametros
//Le decimos al usuario que lo adivine, 3 vidas
//El programa lo va ayudando diciendo < ó >
//Las vidas se pueden cambiar fácil
//while num correcto o i = 3
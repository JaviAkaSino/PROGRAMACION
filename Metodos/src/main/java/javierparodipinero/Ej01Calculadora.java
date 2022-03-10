package javierparodipinero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej01Calculadora {

    /*Método suma. Sólo se utiliza en la calse Calculadora --> Método privado.  
    Static para poder usarlo dentro del main
    Recibe dos parámetros y devuelve un valor entero con el resultado de la
    suma de los parámetros --> int
   */
    
    private static int sumar(int a, int b){
        
        int suma = a + b;
        return suma;
  
    }
    
    private static int restar(int a, int b){
        
        int resta = a - b;
        return resta;
  
    }
    
    private static int multiplicar(int a, int b){
        
        int producto = a * b;
        return producto;
  
    }
        
    private static int dividir(int a, int b){
        
        int cociente = a / b;
        return cociente;
  
    }
        
    private static int excepcion(int a){
        
        Scanner sc = new Scanner(System.in);
        boolean solicitarDatos = true;
        
        do {

            try {
                
                a = sc.nextInt();
                
                solicitarDatos = false;

            } catch (InputMismatchException ime) {

                System.out.println("Se ha introducido texto en lugar de números, "
                    + "vuelva a introducir el dato");
                sc.nextLine();
            }

        } while (solicitarDatos);

        return a;
        
    }
        
    //No recibe parámetros y no devuelve nada --> void
    private static void mostrarMenu(){
        
        System.out.println("-------------------");
        System.out.println("Seleccione una opción:");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División");
        System.out.println("5 - Salir");
    
    }

    //Método para pedir por teclado un int con Scanner y devuelve el int
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int operando1 = 0, operando2 = 0, opcion=0;
        int resultado;
        boolean solicitarDatos, solicitarOpcion = true;
        //boolean rango = ((-100 < operando1 && operando1 < 100)
                //&& (-100 < operando2 && operando2 < 100));
                

        System.out.println("Calculadora: ");

        do {
            System.out.println("Introduce dos operandos (entre -100 y 100)");
            
            System.out.println("Primer operando:");   
            
            operando1 = excepcion(operando1);
            
            System.out.println("Segundo operando:");
    
            operando2 = excepcion(operando2);
            
            if (!((operando1 > -100 && operando1 < 100) 
                && (operando2 > -100 && operando2 < 100))){
                
                System.out.println("Número fuera de rango");
            
            }
            
        } while (!((operando1 > -100 && operando1 < 100) 
                && (operando2 > -100 && operando2 < 100)));
        
        
        do{
            do{
                
                try {
           
                    mostrarMenu();
        
                    opcion=sc.nextInt();
        
                    switch (opcion){
            
                        case 1:
                            System.out.println("Ha seleccionado sumar");
                            resultado = sumar(operando1, operando2);
                            System.out.println(operando1 + " + " + operando2 + " = " + resultado);
                            break;
                
                        case 2:
                            System.out.println("Ha seleccionado restar");
                            resultado = restar(operando1, operando2);
                            System.out.println(operando1 + " - " + operando2 + " = " + resultado);
                            break;
                
                        case 3:
                            System.out.println("Ha seleccionado multiplicar");
                            resultado = multiplicar(operando1, operando2);
                            System.out.println(operando1 + " * " + operando2 + " = " + resultado);
                            break;
                        
                        case 4:
                            System.out.println("Ha seleccionado dividir");
                            resultado = dividir(operando1, operando2);
                            System.out.println(operando1 + " / " + operando2 + " = " + resultado);
                            break;
                            
                        case 5:
                            System.out.println("Ha seleccionado salir");
                            break;
                
                        default:
                
                            System.out.println("Seleccione una opción correcta");
                
                            break;
                    
                    }
                        solicitarOpcion = false;
        
                } catch(InputMismatchException ime) {
                
                System.out.println("Valor no válido");
                sc.nextLine();           
                }
            
            } while (opcion != 5);
            
        } while (solicitarOpcion);
        
        //Mostrar menú de opciones
        //Filtramos las entradas del usuario
        //Controlar las excepciones por si el usuario se equivoca
        //Cuatro opciones: sumar, restar, multiplicar y dividir
    }

}

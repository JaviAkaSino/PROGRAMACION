package javierparodipinero;

import java.util.Scanner;

public class BancoBucle {

    public static void main(String[] args) {
        
        /*NOTA:
        He declarado como double las variables prestamo, salarioMes y
        anosHipoteca porque entiendo que pueden llevar decimales.
        En caso de que el banco no permitiera números decimales, 
        utilizaríamos int, pero es una condición que no muestra el enunciado.*/

        //Construimos Scanner y constantes, en este caso el factor mult.
       
        final double FACTOR = 5.85;
        
        final int EDAD_MIN=0, EDAD_MAX=100, EDAD_VAL_MIN=18, EDAD_VAL_MAX=65,
                SALARIO_MIN=0, SALARIO_MAX=10000, PRESTAMO_MIN=0,
                PRESTAMO_MAX=1000000, ANIOS_MIN=0, ANIOS_MAX=75,
                ANIOS_VAL_MIN=5, ANIOS_VAL_MAX=30, SUMA_ANIOS_MAX=75;
        
        int opcion, edad;
        
        double salarioMes, prestamo, aniosHipoteca;
        
        do {
            System.out.println("");
            System.out.println("Seleccione una opción:");
            System.out.println("1 - Realizar un estudio de viabilidad hipotecaria.");
            System.out.println("2 - Finalizar el programa.");
            Scanner teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
            
            if(opcion == 1 || opcion == 2) {
            
            switch(opcion){
                
                case 1: 
                   
                    do{    
                        System.out.println("Introduzca su edad entre 0 y 100 años.");
                        
                        edad = teclado.nextInt(); 
                        
                    } while (edad < EDAD_MIN || edad > EDAD_MAX);
                    
                    if (EDAD_VAL_MIN <= edad && edad <= EDAD_VAL_MAX) {
                        
                    do{     
                        System.out.println("¿Cuál es su salario mensual bruto? "
                                + "Introduzca un dato entre 0 y 10.000.");

                    salarioMes = teclado.nextDouble(); 
                        
                    } while (SALARIO_MIN > salarioMes || salarioMes > SALARIO_MAX);
                    
                    do{ System.out.println("¿Cuánto dinero necesita? Introduce un "
                            + "valor entre 0 y 1.000.000.");

                    prestamo = teclado.nextDouble();
                    
                    } while (PRESTAMO_MIN > prestamo || prestamo > PRESTAMO_MAX);
                    
                    if (prestamo <= salarioMes * 12 * FACTOR) {
                        
                    do {
                        System.out.println("¿En cuántos años desea devolver la "
                        + "hipoteca? Introduzca un valor entre 0 y 75.");

                        aniosHipoteca = teclado.nextDouble();            
                        
                    } while(ANIOS_MIN > aniosHipoteca || aniosHipoteca > ANIOS_MAX);
                    
                    if (ANIOS_VAL_MIN <= aniosHipoteca && aniosHipoteca <= ANIOS_VAL_MAX && 
                            (aniosHipoteca + edad) <= SUMA_ANIOS_MAX){
                        
                        System.out.println("Enhorabuena, cumple las "
                            + "condiciones para solicitar la hipoteca.");                     
                        
                    } else {
                        System.out.println("Lo sentimos, no puede solicitar "
                                + "devolver la hipoteca en ese plazo.");    
                    } 
                   
                    
                    } else {
                        System.out.println("El importe deseado es superior"
                        + " al permitido.");
                    }

    
                    } else {
                        System.out.println("Está fuera del rango de la edad "
                    + "permitida.");
                        } 
                    
                    break;
                    
                case 2: 
                    
                    System.out.println("Ha seleccionado finalizar el programa.");
                    
                    break;
                    
                default: 
                    
                    break;
  
                    }
                } else {
                System.out.println("Lo sentimos, " + opcion + " no es una "
                        + "opción válida.");
            }
        } while(opcion != 2);    
        
    }

}

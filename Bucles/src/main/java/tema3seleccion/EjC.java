
package tema3seleccion;

import java.util.Scanner;

public class EjC {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un número del 1 al 10");
        
        int numero = teclado.nextInt();
        
        switch(numero)
                {
            case 1 : 
                    System.out.println("El número es I");
                    break;
            case 2 : 
                    System.out.println("El número es II");
                    break;
            case 3 : 
                    System.out.println("El número es III");
                    break;
            case 4 : 
                    System.out.println("El número es IV");
                    break;
            case 5 : 
                    System.out.println("El número es V");
                    break;
            case 6 : 
                    System.out.println("El número es VI");
                    break;
            case 7 : 
                    System.out.println("El número es VII");
                    break;
            case 8 : 
                    System.out.println("El número es VIII");
                    break;
            case 9 : 
                    System.out.println("El número es IX");
                    break;
            case 10 : 
                    System.out.println("El número es X");  
                    break;
            default: 
                    System.out.println(numero + " No es un número del 1 al 10");
                    break;        
                    
                    
        }
                


    }
    
}

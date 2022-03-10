
package T2;

import java.util.Scanner;

public class Algo03 {

    public static void main(String[] args) {
        
        Scanner teclado;
        double nota1, nota2, nota3;        
        
            teclado = new Scanner(System.in);
        
        System.out.println("Nota del primer exámen");
        
            nota1 = teclado.nextDouble();
                
        System.out.println("Nota del segundo exámen");        
            
            nota2 = teclado.nextDouble();
            
        System.out.println("Nota del tercer exámen");
        
            nota3 = teclado.nextDouble();
            
        double notaMedia = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("La nota media de los tres exámenes es "
            + notaMedia);
            
            
                    
                   
                    
                    
        
               
        
        
        
    }
    
}

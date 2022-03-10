//Nombre del paquete
package T2;

//Nombre de la clase
public class Ej06 {

    //Aplicamos método main
    public static void main(String[] args) {
       
        
        //Declaramos e inicializamos las variables
        //Declaramos variable auxiliar 'x'
        
        int a = 5;
        int b = 8;
        int x;
                
            //Mostramos los valores antes de intercambiarlos
        
            System.out.println("a = " + a + ", b = " + b);
        
        
        
        //Intercambiamos los valores con la variable auxiliar
        
        x = a;
        a = b;
        b = x;
        
        
            //Añadimos frase para indicar el intercambio
            
            System.out.println("");
            System.out.println("Los valores de a y b "
                    + "se han intercambiado y ahora:");
            System.out.println("");
            
            //Mostramos los valores después de intercambiarlos
           
            System.out.println("a = " + a + ", b = " + b);
        
        
           
    }
    
}

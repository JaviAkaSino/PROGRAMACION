
//Nombre del paquete
package T2;

//Declaración de la clase
public class Ej07 {

    //Método main
    public static void main(String[] args) {
        
        //Declaramos e inicializamos las variables
        //También una variable auxiliar para cada caso
        
        int a, b, c, x; a = 1; b = 2; c = 3;
        
        double d, e, f, y; d = 4.5; e = 5.7; f = 6.9;
        
            //Las mostramos en consola
        
            System.out.println("Las variables enteras son:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
        
            System.out.println("");
        
            System.out.println("Las variables double son:");
            System.out.println("d = " + d);
            System.out.println("e = " + e);
            System.out.println("f = " + f);     
        
        //Intercambi/home/javiakasino/Documentos/PROGRAMACIÓN/NetBeansProjectsamos las variables enteras    
        
        x = b; b = c; c = a; a = x;
        
            //Las mostramos en consola
       
            System.out.println("");
            System.out.println("Las variables enteras intercambiadas son:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
 
        //Intercambiamos las variables double    
        
        y = e; e = f; f = d; d = y; 
        
            //Las mostramos en consola
       
            System.out.println("");
            System.out.println("Las variables double intercambiadas son:");
            System.out.println("d = " + d);
            System.out.println("e = " + e);
            System.out.println("f = " + f);            
       
              
        
    }
    
}

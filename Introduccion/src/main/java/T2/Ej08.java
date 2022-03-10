//Nombre del paquete
package T2;

//Imports

//Declaración de clase
public class Ej08 {

    //Método main
    public static void main(String[] args) {
        
        /*a.- Declara e inicializa tres variables int (a=10,  b=5, i=0)
	b.- Declara e inicializa dos variables double (c=71.3 y d=4.8)
	c.- Realiza las siguiente operaciones aritméticas a+b, a-b, a*b, 
        a/b, c+d, c-d, c*d, c/d. El resultado de cada operación se 
        almacena en una nuevas variables que se crearán para tal efecto.*/
        
        //Declaramos e inicializamos tres variables int y dos double
        
        int a = 10, b = 5, i = 0;
        
        double c = 71.3, d = 4.8;
        
        /*Realizamos las operaciones aritméticas y almacenamos resultados
        en nuevas variables*/
        
        int x1 = a + b, x2 = a - b, x3 = a * b, x4 = a / b;        
        double x5 = c + d, x6 = c - d, x7 = c * d, x8 = c / d;
        
        /*d.- Muestra el resultado de cada operación, usando las variables 
        creadas en el paso c).   
       e.- También muestra en pantalla los resultados de las siguientes 
        operaciones: a*=3, b-=1, a/=b, c+=d.
	f.- Finalmente, el programa muestra en consola la siguiente 
        información, en distintas instrucciones: valor de i, 
        valor de i++, valor de i y valor de ++i.
*/
        
        //Mostramos el resultado de las operaciones
        
        System.out.println("a + b = " + x1 + "\na - b = " + x2 + "\na * b = " 
            + x3 + "\na / b = " + x4);
        System.out.println("c + d = " + x5 + " \nc - d = " + x6 + "\nc * d = " 
            + x7 + "\nc / d = " + x8);
        
        
        //Realizamos operaciones y mostramos resultados
        
        double h1 = a*=3, h2 = b-=1, h3 = a/=b, h4 = c+=d;
        
        
        System.out.println("a*=3 = " + h1 + "\nb-=1 = " + h2
            + "\na/=b = " + h3 + "\nc+=d = " + h4);
        
        
        System.out.println("i = " + i);
        
        int z = i++;
        
        System.out.println("i++ = " + z);
        
        System.out.println("i = " + i);
        
        int z1 = ++i;
        
        System.out.println("++i = " + z1);
                
        System.out.println("i = " + i);   
        
      
      

        
        
        
             
        
        
    }
    
}

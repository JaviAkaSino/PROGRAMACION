package arraylist;

/**
 *
 * @author javiakasino
 */
public class PilaTest {

    public static void main(String[] args) {

        Pila p1 = new Pila(5);

        p1.push('a');
        p1.push('b');
        p1.push('c');
        p1.push('d');
        p1.push('e');
        p1.push('f');

        System.out.println("Esta llena: " + p1.estaLlena());

        System.out.println("Elementos: " + p1.numeroElementos());

        p1.mostrarElementos();

        p1.pop();
        p1.pop();
        p1.pop();

        System.out.println("Tras 3 pops: ");
        
        System.out.println("Esta llena: " + p1.estaLlena());

        System.out.println("Elementos: " + p1.numeroElementos());
        
        p1.mostrarElementos();
        
        System.out.println("2 pops más: ");

        System.out.println(p1.pop());
        System.out.println(p1.pop());
        
        System.out.println("Está vacía: " + p1.estaVacia());

        System.out.println("Otro pop estando ya a 0: ");
        
        p1.pop();
        
        System.out.println("La llenamos de nuevo");
        
        p1.push('a');
        p1.push('b');
        p1.push('c');
        p1.push('d');
        p1.push('e');
        p1.push('f');
        
        p1.mostrarElementos();
        
        System.out.println("Sacar elementos: ");
        
        Utilidades.mostrarArrayLinealChar(p1.sacarElementos());
        
         p1.mostrarElementos();
         
         System.out.println("Está vacía: " + p1.estaVacia());
         
         System.out.println("La llenamos con un array de 7");
         
         char[] array = {'a','b','c','d','e','f','g'};
         
         p1.rellenar(array);
         
         p1.mostrarElementos();
       
         System.out.println(p1.sacarElementos());
         
    }

}

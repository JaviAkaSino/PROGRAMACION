
package ejercicio4;

/**
 *
 * @author javiakasino
 */
public class Prueba {

    public static void main(String[] args) {


        //Creamos un teatro de 20 x 20 plazas
        Teatro t = new Teatro(20,20);
        
        System.out.println("TEATRO VACÍO: \n");
        t.imprimirMatrizInt();
        System.out.println("\n\n"); //Visibilidad en consola
        
        System.out.println("Reservamos las plazas 1,1; 1,3; 3,1 y 3,3");
        System.out.println("Si sale true, se han reservado");
        System.out.println(t.reservarPlaza(1, 1));
        System.out.println(t.reservarPlaza(1, 3));
        System.out.println(t.reservarPlaza(3, 1));
        System.out.println(t.reservarPlaza(3, 3));
        
        System.out.println("COMPROBAMOS: \n");
        t.imprimirMatrizInt();
        System.out.println("\n\n"); //Visibilidad en consola
        
        System.out.println("Intentamos reservar una plaza vendida, otra reservada COVID");
        System.out.println(t.reservarPlaza(1, 1));
        System.out.println(t.reservarPlaza(1, 2));
        
        System.out.println("Obtenemos false en ambos casos");
        
        System.out.println("Cancelamos las plazas 1,1 y 3,1");
        System.out.println(t.cancelarPlaza(1, 1));
        System.out.println(t.cancelarPlaza(1, 3));
        
        System.out.println("COMPROBAMOS: \n");
        t.imprimirMatrizInt();
        System.out.println("\n\n"); //Visibilidad en consola
        
        System.out.println("Intentamos cancelar una plaza libre, otra reservada COVID");
        System.out.println(t.cancelarPlaza(1, 1));
        System.out.println(t.cancelarPlaza(1, 2));
        
        System.out.println("Obtenemos false en ambos casos");
        
        

    }
    
}

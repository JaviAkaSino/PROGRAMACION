package clientes;

/**
 *
 * @author JaviA
 */
public class Prueba {

    public static void main(String[] args) {

       Cliente c1 = new Cliente();
       Cliente c2 = new Cliente("Pepe Sánchez", "00000000A", 20);
       Cliente c3 = new Cliente("Antonio Gallardo", "11111111A", 25);
       Cliente c4 = new Cliente("Antonio Gallardo", "11111111A", 25);
       Cliente c5 = new Cliente("Antonio Gallardo", "11111111A", 25);
       
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        System.out.println(c5.hashCode());
        
        System.out.println("Propiedad transitiva");
        System.out.println("c3 = c4 y c4 = c5");
        System.out.println(c3.equals(c4));
        System.out.println(c4.equals(c5));
        System.out.println("Entonces, c3 = c5");
        System.out.println(c3.equals(c5));
        
        System.out.println("Propiedad reflexiva");
        System.out.println("c2 = c2");
        System.out.println(c2.equals(c2));
        
        System.out.println("Propiedad simétrica");
        System.out.println("Si c3 = c5, c5 = c3");
        System.out.println(c3.equals(c5));
        System.out.println(c5.equals(c3));
        
        System.out.println("Propiedad nula");
        System.out.println(c1 == null);
    }
    
}

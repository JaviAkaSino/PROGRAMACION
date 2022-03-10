package javierparodipinero;

/**
 *
 * @author JaviA
 */
public class ComplejoTest {

    public static void main(String[] args) {
        
        //NOTA: Todos los números están representados como(a, b) por simplicidad
        //La forma correcta final sería   z = a + bi

        //Construye y muestra los complejos y el contador
        Complejo z1 = new Complejo();

        Complejo z2 = new Complejo(5.4, 6.7);

        Complejo z3 = new Complejo(2.0, 3.2);

        Complejo z4 = new Complejo(5.4, 6.7);

        System.out.println("z1 = " + z1);

        System.out.println("z2 = " + z2);

        System.out.println("z3 = " + z3);
        
        System.out.println("z4 = " + z4);
        
        System.out.println("Número de instancias: " + Complejo.getContador());

        //Prueba de las distintas operaciones
        Complejo z5 = Complejo.suma(z2, z3);
        
        System.out.println("z2 + z3 = " + Complejo.suma(z2, z3));

        System.out.println("z2 - z3 = " + Complejo.resta(z2, z3));

        System.out.println("z2 * z3 = " + Complejo.multiplicacion(z2, z3));

        System.out.println("z2 / z3 = " + Complejo.division(z2, z3));

        System.out.println("¿z2 = z3? " + Complejo.igualdad(z2, z3));

        System.out.println("¿z2 = z4? " + Complejo.igualdad(z2, z4));

    }

}

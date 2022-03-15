package personas;

/**
 *
 * @author javiakasino
 */
public class Prueba {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona();

        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado();

        Programador pr1 = new Programador();
        Programador pr2 = new Programador();

        System.out.println("P1 y P2");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("E1 y E2");
        System.out.println(e1);
        System.out.println(e2);

        System.out.println("PR1 y PR2");
        System.out.println(pr1);
        System.out.println(pr2);

        System.out.println("Subir sueldo a e1 y pr2");
        e1.aumentarSalario(200);
        pr2.aumentarSalario(250);

        System.out.println(e1);
        System.out.println(pr2);

    }

}

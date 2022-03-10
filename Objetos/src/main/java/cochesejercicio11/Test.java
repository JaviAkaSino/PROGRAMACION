package cochesejercicio11;

/**
 *
 * @author javiakasino
 */
public class Test {

    public static void main(String[] args) {

        Motor m = new Motor(2.0, false);

        Ventana v1 = new Ventana(true, true);
        //Ventana v2 = new Ventana(true, true);

        Puerta pp = new Puerta(false, v1);
        Puerta pc = new Puerta(false, new Ventana(true, true));
        //Puerta pc = new Puerta(false,v2);

        Rueda rdi = new Rueda(45, true);
        Rueda rdd = new Rueda(45, true);
        Rueda rti = new Rueda(45, true);
        Rueda rtd = new Rueda(45, true);

        Coche auto = new Coche(m, pp, pc, rdi, rdd, rti, rtd);

        Coche auto2 = new Coche(new Motor(2.0, false),
                new Puerta(false, new Ventana(true, true)),
                new Puerta(false, new Ventana(true, true)),
                new Rueda(45, true),
                new Rueda(45, true),
                new Rueda(45, true),
                new Rueda(45, true));

        System.out.println("Auto 2 ----");
        System.out.println(auto2);
        System.out.println("Poner la ventana puerta piloto auto2 sin tintar");
        
        auto2.getPuertaPiloto().getVentana().setTintada(false);
        
        System.out.println(auto2);
        
        System.out.println("Diámetro de la rueda delantera izquierda coche 2");
        
        System.out.println(auto2.getRuedaDelanteraIzq().getDiametro());
        
        System.out.println("Arranca el motor coche 2");
        
        auto2.getMotor().arrancar();
        
        System.out.println(auto2.getMotor().isEstado());

    }

}

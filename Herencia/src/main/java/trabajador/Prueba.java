package trabajador;

import java.util.ArrayList;

/**
 *
 * @author javiakasino
 */
public class Prueba {

    public static void main(String[] args) {

        Camarero c1 = new Camarero("Jefe de sección", "Juan", "Palomo", "00000000A");

        Camarero c2 = new Camarero("Sumiller");

        Cocinero co1 = new Cocinero("Postres", "Luisa", "García", "11111111B");

        Trabajador t1 = new Trabajador("Paco", "Merme", "22222222C");

        System.out.println(c1);
        System.out.println(co1);
        System.out.println(t1);

        c1.cotizar();
        co1.cotizar();
        t1.cotizar();

        ArrayList<Trabajador> plantilla = new ArrayList<>();
        plantilla.add(t1);
        plantilla.add(c1); //Conversión implícita
        plantilla.add(co1); //Conversión implícit

        for (Trabajador t : plantilla) {

            System.out.println(t);
            t.cotizar();

            //Si t es una instancia de Camarero
            if (t instanceof Camarero) {

                Camarero aux = (Camarero) t; //Conversión explícita
                
                ((Camarero) t).servirMesa("05");
            }
            
            if (t instanceof Cocinero) {
 
                ((Cocinero) t).prepararPlato("Pasta");
            }
        }

    }

}

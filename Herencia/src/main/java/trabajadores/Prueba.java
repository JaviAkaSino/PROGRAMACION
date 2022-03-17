package trabajadores;

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
        Cocinero co2 = new Cocinero("Postres", "Luisa", "García", "11111111B");

        ArrayList<Trabajador> plantilla = new ArrayList<>();

        plantilla.add(c1); //Conversión implícita
        plantilla.add(co1); //Conversión implícit
        plantilla.add(c2);
        plantilla.add(co2);

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

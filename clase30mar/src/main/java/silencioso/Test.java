package silencioso;

import java.util.ArrayList;

/**
 *
 * @author javiakasino
 */
public class Test {

    public static void main(String[] args) {

        /*Crea una lista de objetos de tipo Silencioso. ¿Por qué no puedes 
        incluir en esta lista los objetos de tipo CampanaExtractora?*/
        //Porque no hereda de la interfaz Silencioso
        ArrayList<Silencioso> lista = new ArrayList<>();

        lista.add(new Frigorifico());
        lista.add(new Microondas());
        lista.add(new Microondas());
        lista.add(new Frigorifico());

        for (Silencioso s : lista) {

            System.out.println(s);
            s.silencio();
        }

    }

    
    /*La diferencia entre comparable y comparator*/
    //-En comparable indicamos el ORDEN NATURAL
}

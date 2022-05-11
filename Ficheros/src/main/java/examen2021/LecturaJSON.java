package examen2021;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author JaviA
 */
public class LecturaJSON {

    public static ArrayList<RegistroJSON> leerJSON(String ruta) {

        ArrayList<RegistroJSON> lista = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();

        try {
            lista.addAll(mapeador.readValue(new File(ruta),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, RegistroJSON.class)));

            for (RegistroJSON r : lista) {
                System.out.println(r);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

}

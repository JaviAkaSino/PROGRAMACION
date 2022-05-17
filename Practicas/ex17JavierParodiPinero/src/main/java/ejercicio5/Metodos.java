package ejercicio5;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import ejercicio4.Registro;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author javiakasino
 */
public class Metodos {
    
    public static ArrayList<Registro> leerRegistrosJSON(String ruta){
        
        ArrayList<Registro> registros = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();
         mapeador.registerModule(new JavaTimeModule());

        try {
            registros.addAll(mapeador.readValue(new File(ruta),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, Registro.class)));
            
            for (Registro r : registros) {
                System.out.println(r);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        return registros;
    } 
    
    public static Map<String, Double> precipitacionAcumulada(ArrayList<Registro> registros){
        
        
        Map<String, Double> precipitacionAcumulada = new HashMap<>(); //Crea el map vacio

        for (Registro a : registros) { //Recorre todos los registros

            double n = a.getPrecipitacion(); //Guarda las precipitaciones

            for (Registro b : registros) { //Recorre en busca de otro registro de la misma estacion

                if (a != b && a.getEstacionMeteorologica().equals(b.getEstacionMeteorologica())) { //Si es la misma estacion pero no el mismo registro

                    n += b.getPrecipitacion(); //Se añade la cantidad de precipitaciones
                }
            }

            precipitacionAcumulada.put(a.getEstacionMeteorologica(), n); //Añade elemento al map con (Estacion, precipitaciones)

        }

        return precipitacionAcumulada;
        
        /*Map<String, Double> mapEstacionTemp = new HashMap<>();
        precipitaciones.forEach(precipitacion -> {
            mapEstacionTemp.put(precipitacion.getEstacionMeteorologica(), precipitacion.getPrecipitacion());
        });

        return mapEstacionTemp;*/
        
    }
    
    
    
}

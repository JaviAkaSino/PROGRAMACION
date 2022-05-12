package ejercicio2;

import ejercicio1.Carta;
import ejercicio1.Palos;
import ejercicio1.Valores;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/**
 *
 * @author javiakasino
 */
public class Lectura {

    public static ArrayList<Ronda> lecturaRondas(String ruta) {

        ArrayList<Ronda> lista = new ArrayList<>();
        String[] tokens;

        // Variables para guardar los datos que se van leyendo
        String linea;

        try ( BufferedReader datosFichero = new BufferedReader(new InputStreamReader(new FileInputStream(ruta), "us-ascii"))) {

            // Mientras haya líneas por leer
            while ((linea = datosFichero.readLine()) != null) { //Se lee la línea

                tokens = linea.split(" "); //Se tiene en cuenta el espacio como separador

                Ronda r = new Ronda();

                //Hay dos posiciones por carta
                //Para pasar de una a otra, hay que saltar dos posiciones
                for (int i = 0; i < tokens.length; i+=2) {

                    Carta c = new Carta();
                    c.darValorCarta(tokens[i]);
                    c.darPaloCarta(tokens[i+1]);
                    r.getRonda().add(c); //Añade la carta a la ronda

                }
                
                //Se añade la ronda
                lista.add(r);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (UnsupportedEncodingException uee){
            System.out.println(uee.getMessage());
        } catch(IOException io){
            System.out.println(io.getMessage());
        }
        return lista;
    }

    
}
        

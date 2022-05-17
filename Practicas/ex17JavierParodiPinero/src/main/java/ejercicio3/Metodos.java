/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import ejercicio1.Carta;
import ejercicio2.Ronda;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author javiakasino
 */
public class Metodos {

    public static boolean igualColor(Ronda r) {

        Carta primera = r.getRonda().get(0);//Coge la primera carta
        for (Carta c : r.getRonda()) { //Recorre las cartas de la ronda
            //Si el palo de alguna es distinto, devuelve false
            if (!c.getPalo().equals(primera.getPalo())) {

                return false;
            }

        }

        return true;
    }

    public static String cartaParaEscalera(Ronda r) {
        Carta c = new Carta();
        //Si son todas del mismo palo
        if (igualColor(r)) {

            //Formula de consecutivos
            //(primero + ultimo)/2 * cantidad suma de consecutivos ==
            //primero + segundo...+ultimo
            //Son consecutivos
            //Ordenamos la lista por valores
            ArrayList<Carta> listaCartas = r.getRonda();
            Collections.sort(listaCartas, (c1, c2) -> Integer.compare(c1.getValor().getValor(), c2.getValor().getValor()));

            int primera = r.getRonda().get(0).getValor().getValor();//Coge el valor de la primera carta
            int ultima = r.getRonda().get(r.getRonda().size() - 1).getValor().getValor();//Coge el valor de la última carta

            int resultadoTeorico = (primera + ultima) * listaCartas.size() / 2;
            int resultadoPractico = 0;

            for (Carta a : listaCartas) { //Recorre las cartas de la ronda
                //Suma sus valores
                resultadoPractico += a.getValor().getValor();

            }

            if (resultadoTeorico == resultadoPractico) { //Es una escalera de por si
                //Y devolveremos la carta siguiente
                
                if (ultima < 14) {

                    c.darValorCarta(ultima + 1);
                    c.setPalo(listaCartas.get(0).getPalo());

                } else {

                    c.darValorCarta(primera - 1);
                    c.setPalo(listaCartas.get(0).getPalo());

                }

                return c.getValor().getNombre() + " " + c.getPalo();

            } else { //Hay que mirar si se puede hacer
                
                resultadoTeorico = (primera + ultima) * 5 / 2;
                resultadoPractico = 0;

                for (int i = 0; i < 5; i++) {
                    resultadoPractico += primera+i;
                            
                }
            
            if(resultadoTeorico == resultadoPractico){
                
                //Restar todos los valores al resultado para obtener el que falta
                int faltante = resultadoTeorico;
                
                for (Carta a : listaCartas) {
                    faltante -= a.getValor().getValor();
                    
                }
                
                c.darValorCarta(faltante);
                c.setPalo(listaCartas.get(0).getPalo());
                
                
                 return c.getValor().getNombre() + " " + c.getPalo();
            }
            
                
               
            }
        }
        return "NADA";

    }

}

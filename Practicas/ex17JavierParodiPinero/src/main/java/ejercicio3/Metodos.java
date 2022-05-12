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
    
    public boolean igualColor(Ronda r){
        
        Carta primera = r.getRonda().get(0);//Coge la primera carta
        for (Carta c : r.getRonda()) { //Recorre las cartas de la ronda
            //Si el palo de alguna es distinto, devuelve false
            if(!c.getPalo().equals(primera.getPalo())){
                
                return false;
            }
            
        }
       
        return true;
    }
    
    public String posibleEscalera(Ronda r){
        //Formula de consecutivos
        
        //(primero + ultimo)/2 * cantidad suma de consecutivos ==
        //primero + segundo...+ultimo
        //Son consecutivos
        //Ordenamos la lista por valores
        ArrayList<Carta> listaCartas = r.getRonda();
        Collections.sort(listaCartas, (c1, c2)-> Integer.compare(c1.getValor().getValor(), c2.getValor().getValor()));
        
        int primera = r.getRonda().get(0).getValor().getValor();//Coge el valor de la primera carta
        int ultima = r.getRonda().get(r.getRonda().size()-1).getValor().getValor();//Coge el valor de la última carta
        
        int resultadoTeorico=(primera+ultima)*listaCartas.size()/2;
        int resultadoPractico=0;
        
        for (Carta c : listaCartas) { //Recorre las cartas de la ronda
            //Suma sus valores
            resultadoPractico += c.getValor().getValor();
   
        }
        
        if (resultadoTeorico == resultadoPractico){ //Es una escalera de por si
            //Y devolveremos la carta siguiente
            
            return ""; 
            
            
        } else { //Hay que mirar si se puede hacer
            return "";
            
        }
     
    }
  
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searranca;

import java.util.ArrayList;

/**
 *
 * @author JaviA
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // No puedo instanciar objetos de interfaces ni de clases abstractas
        //Turismo es de las tres interfaces, Vehiculo, Turismo y Object
        Vehiculo v1 = new Turismo(); //Conversión implícita
        Ordenador o1 = new Ordenador();
        SeArranca i1 = new Ordenador();
        SeArranca i2 = v1; //i2 sólo da método de interfaz, v1 sólo los de Vehiculo
        
        
        System.out.println(i1.arrancar());
        
        ArrayList<SeArranca> listaArrancables = new ArrayList<>();
        
        listaArrancables.add(v1);
        listaArrancables.add(o1);
        listaArrancables.add(new Turismo());
        listaArrancables.add(new Ordenador());
        
        for (SeArranca obj : listaArrancables){
            
            obj.arrancar();
            
            if (obj instanceof Ordenador){
                
                System.out.println(((Ordenador) obj).getPrecio());
                
            }
        
        
            
        }
            
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2021;

import java.util.Map;

/**
 *
 * @author JaviA
 */
public class Alumnado implements Comparable<Alumnado>{
    
    private String nombre;
    private Map<String, String> modulos;

    public Alumnado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, String> getModulos() {
        return modulos;
    }

    public void setModulos(Map<String, String> modulos) {
        this.modulos = modulos;
    }


    
    @Override
    public String toString() {
        
        String string = "";
        
        string += this.nombre + "\n";
        
        for (String s : this.modulos.keySet()) {
            
            string += s + ": " + this.modulos.get(s) + " ";
            
        }
        
        return string ;
    }

    @Override
    public int compareTo(Alumnado o) {
        return this.getNombre().compareTo(o.getNombre());
    }
    
    
    
    
}

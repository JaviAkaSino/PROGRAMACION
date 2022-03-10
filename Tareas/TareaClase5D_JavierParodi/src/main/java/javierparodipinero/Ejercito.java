package javierparodipinero;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author JaviA
 */
public class Ejercito {
    
    private Set<Soldado> ejercito;

    public Ejercito() {
        this.ejercito = new HashSet<>();
    }
    
    //1. Saber el número de soldados que hay.
    public int numeroSoldados(){
        
        return ejercito.size();
    }
    
    //2. Alistar a un solado.
    public void alistar(Soldado s){
        
        ejercito.add(s);
    }
    
    //3. Saber si el ejército no tiene soldados.
    public boolean estaVacio(){
        
        return ejercito.isEmpty();
    }
    
    //4. Saber si un soldado está en el ejército.
    public boolean estaAlistado(Soldado s){
        
        return ejercito.contains(s);
    }
    
    //5. Sacar todos los soldados, en forma de ArrayList.
    public ArrayList<Soldado> listaSoldados(){
        
        Soldado[] array = this.ejercito.toArray(new Soldado[this.ejercito.size()]);
        ArrayList<Soldado> listaSoldados = new ArrayList<>();
        
        for (int i = 0; i < this.ejercito.size(); i++) {
            
            listaSoldados.add(array[i]);
        }
        return listaSoldados;
    }
    
    public void mostrarElementos(ArrayList<Soldado> ejercito) {

        ejercito.forEach(System.out::println);
    }
    
    //6. Desmatricular a un soldado del ejército.
    public boolean desmatricularSoldado(Soldado s){
        
       return ejercito.remove(s);    
    }

    @Override
    public String toString() {
        return "Ejercito{" + "ejercito=" + ejercito + '}';
    }
    
    
}

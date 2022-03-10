package setmap;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author javiakasino
 */
public class EjercitoOrdenado {

    private Set<Soldado> ejercito;

    public EjercitoOrdenado() {
        this.ejercito = new TreeSet<>();
    }

    //1. Saber el número de soldados que hay.
    public int numeroSoldados() {

        return ejercito.size();
    }

    //2. Alistar a un solado.
    public void alistar(Soldado s) {

        ejercito.add(s);
    }

    //3. Saber si el ejército no tiene soldados.
    public boolean estaVacio() {

        return ejercito.isEmpty();
    }

    //4. Saber si un soldado está en el ejército.
    public boolean estaAlistado(Soldado s) {

        return ejercito.contains(s);
    }

    //4. Sacar todos los soldados, en forma de ArrayList.
    public ArrayList<Soldado> listaSoldados() {

        ArrayList<Soldado> listaSoldados = new ArrayList<>();

        listaSoldados.addAll(ejercito);

        return listaSoldados;
    }

    public void mostrarElementos(ArrayList<Soldado> ejercito) {

        ejercito.forEach(System.out::println);
    }

    //5. Desmatricular a un soldado del ejército.
    public boolean desmatricularSoldado(Soldado s) {

        return ejercito.remove(s);
    }

    @Override
    public String toString() {
        return "Ejercito: " + ejercito;
    }

}

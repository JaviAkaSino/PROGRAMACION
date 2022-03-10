package arraylist;

import java.util.ArrayList;

/**
 *
 * @author javiakasino
 */
public class Pila {

    private ArrayList<Character> pila;
    private int tamanio;

    //Constructor para que se cree vacía
    public Pila(int tamanio) {

        this.pila = new ArrayList<>(tamanio);
        this.tamanio = tamanio;
    }

    public void push(char elemento) {

        if (pila.size() < tamanio) {

            pila.add(elemento);
        }
    }

    public char pop() {

        char elemento = 0;

        if (!pila.isEmpty()) {

            elemento = pila.get(pila.size() - 1);

            pila.remove(pila.size() - 1);
        }

        return elemento;
    }

    public boolean estaVacia() {

        return pila.isEmpty();
    }

    public boolean estaLlena() {

        return pila.size() == tamanio;
    }

    public int numeroElementos() {

        return pila.size();
    }

    public void mostrarElementos() {

        pila.forEach(System.out::println);
    }

    /*rellenar (char[] array), que recibe un array de letras y almacena en la 
    pila los char que hay en el array. La pila se ajusta su tamaño según el número 
    de elementos que tenga el array.*/
    public void rellenar(char[] array) {

        tamanio = array.length;
        
        for (int i = 0; i < tamanio; i++) {
            
            push(array[i]);
        }
    }

    /*char[] sacarElementos(), saca los elementos de la pila y los devuelva en 
    un array de char. La pila queda vacía.*/
    public char[] sacarElementos() {

        char[] array = new char[pila.size()];

        for (int i = 0; i < tamanio; i++) {

            array[pila.size()-1] = pop();
        }
        return array;
    }

    
    
    public ArrayList<Character> getPila() {
        return pila;
    }

    public void setPila(ArrayList<Character> pila) {
        this.pila = pila;
    }

    @Override
    public String toString() {
        return "Pila{" + "pila=" + pila + '}';
    }

}

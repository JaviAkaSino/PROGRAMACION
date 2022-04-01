package vuelos;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author JaviA
 */
public class Vuelo implements Comparable<Vuelo> {

    /*Tenemos la clase Vuelo con 5 atributos: codigo de vuelo, ciudad origen, 
    ciudad destino, duracion, lista de pasajeros. X
    -MAIN Generando una lista de vuelos
    -Método estatico que devuelve un MAP que va a contener para cada destino 
        el nº de pasajeros que llegan en total
    -Repetir metodo pero map ordenado por destinos
    -Método me permita saber por codigo de vuelo los pasajeros (lista) que hay 
        en ese vuelo*/
    private String codigo;
    private Ciudad origen;
    private Ciudad destino;
    private int minutos;
    private ArrayList<Persona> pasajeros;

    //Constructor por defecto, crea todo random
    public Vuelo() {
        this.codigo = codigoRandom();
        this.origen = origenRandom();
        this.destino = destinoRandom();
        this.minutos = numeroRandomEntre(20, 300);
        this.pasajeros = new ArrayList<>();

        llenarPasajeros(10, 20);
    }

    //Constructor que crea todo random menos el codigo
    public Vuelo(String codigo) {
        this.codigo = codigo;
        this.origen = origenRandom();
        this.destino = destinoRandom();
        this.minutos = numeroRandomEntre(20, 300);
        this.pasajeros = new ArrayList<>();

        llenarPasajeros(10, 20);
    }

    //Constructor parametrizado
    public Vuelo(String codigo, Ciudad origen, Ciudad destino, int minutos, ArrayList<Persona> pasajeros) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.minutos = minutos;
        this.pasajeros = pasajeros;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public ArrayList<Persona> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Persona> pasajeros) {
        this.pasajeros = pasajeros;
    }

    private Ciudad origenRandom() { //Devuelve un origen aleatorio del enum

        return Ciudad.values()[numeroRandomEntre(0, Ciudad.values().length - 1)];
    }

    private Ciudad destinoRandom() { //Devuelve un destino aleatorio del enum

        Ciudad dest = Ciudad.AMSTERDAM; //Se inicializa con cualquiera

        do { //Se le da un valor aleatorio

            dest = Ciudad.values()[numeroRandomEntre(0, Ciudad.values().length - 1)];

        } while (this.origen.equals(dest)); //Hasta que sea distinto al origen

        return dest;
    }

    private void llenarPasajeros(int min, int max) { //Llena la lista de pasajeros entre dos numeros dados

        for (int i = 0; i < numeroRandomEntre(min, max); i++) {

            pasajeros.add(new Persona());

        }
    }

    //MÉTODO CREAR CÓDIGO DE VUELO (POR DEFECTO)
    public static String codigoRandom() {

        Random rnd = new Random();
        String numero = "";

        for (int i = 0; i < 10; i++) {

            numero += String.valueOf(rnd.nextInt(10));
        }
        return numero;
    }

    //Da un entero aleatorio dado el intervalo
    public static int numeroRandomEntre(int valorMin, int valorMax) {

        Random numeroAleatorio = new Random();
        int aleatorio;

        try {

            aleatorio = numeroAleatorio.nextInt(valorMax - valorMin + 1) + valorMin;

        } catch (IllegalArgumentException iae) {

            aleatorio = numeroAleatorio.nextInt(valorMin - valorMax + 1) + valorMax;

        }

        return aleatorio;

    }

    public String pasajerosString() {

        String pacientesString = "";

        for (int i = 0; i < this.pasajeros.size(); i++) {

            pacientesString += this.pasajeros.get(i);

        }
        return pacientesString;
    }

    @Override
    public int compareTo(Vuelo o) {

        return this.codigo.compareTo(o.codigo);

    }

    @Override
    public String toString() {
        return "\n\n-Vuelo " + codigo + "\n" + origen + " > " + destino + " (" + minutos + " min.)\nPasajeros:\n" + pasajerosString();
    }

}

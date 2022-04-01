package com.mycompany.p62javierparodipinero;

import java.util.Random;

/**
 *
 * @author javiakasino
 */
public final class LibroDigital extends Libro implements SeDescarga {

    private int numKBytes; //Desconsiderados kB decimales

    public LibroDigital() {
        this.numKBytes = kBRandom(100, 900);
    }

    public LibroDigital(int numKBytes) {
        this.numKBytes = numKBytes;
    }

    public LibroDigital(int numKBytes, String isbn) {
        super(isbn);
        this.numKBytes = numKBytes;
    }

    public LibroDigital(int numKBytes, String isbn, String codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numKBytes = numKBytes;
    }

    public int getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(int numKBytes) {
        this.numKBytes = numKBytes;
    }

    @Override //Método polimórfico
    public String toString() {
        return "LibroDigital{" + super.toString() + "numKBytes=" + numKBytes + '}';
    }

    @Override //Método polimórfico
    public int hashCode() {

        int hash = super.hashCode();
        hash = 53 * hash + this.numKBytes;
        return hash;
    }

    @Override //Método polimórfico
    public boolean equals(Object obj) {

        if (!super.equals(obj)) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }
        final LibroDigital other = (LibroDigital) obj;
        return this.numKBytes == other.numKBytes;
    }

    @Override //Método polimórfico
    public void descargar() {

        System.out.println("http://javierparodipinero.daw/" + this.hashCode());

    }

    //Da un entero aleatorio dado el intervalo
    public static int kBRandom(int valorMin, int valorMax) {

        Random numeroAleatorio = new Random();
        int aleatorio;

        try {

            aleatorio = numeroAleatorio.nextInt(valorMax - valorMin + 1) + valorMin;

        } catch (IllegalArgumentException iae) {

            aleatorio = numeroAleatorio.nextInt(valorMin - valorMax + 1) + valorMax;

        }

        return aleatorio;

    }

    @Override
    public void anuncio() {

        System.out.println("Nuevo Kindle Paperwhite en amazon.es");
    }

}

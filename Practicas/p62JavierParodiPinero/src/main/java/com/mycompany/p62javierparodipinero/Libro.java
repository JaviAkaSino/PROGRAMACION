package com.mycompany.p62javierparodipinero;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author javiakasino
 */
public abstract class Libro extends Producto implements Comparable<Libro> {

    private String isbn;

    public Libro() {

        this.isbn = isbnRandom();
    }

    public Libro(String isbn) {
        this.isbn = isbn;
    }

    public Libro(String isbn, String codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override //Método polimórfico
    public String toString() {
        return "Libro{" + super.toString() + "isbn=" + isbn + '}';
    }

    @Override //Método polimórfico
    public int compareTo(Libro t) {

        return this.isbn.compareTo(t.isbn);
    }

    //MÉTODO CREAR ISBN (POR DEFECTO)
    public static String isbnRandom() {

        Random rnd = new Random();
        String numero = "979";

        for (int i = 0; i < 10; i++) {

            numero += String.valueOf(rnd.nextInt(10));
        }
        return numero;
    }

    @Override //Método polimórfico
    public int hashCode() {
        int hash = 7;
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
        final Libro other = (Libro) obj;
        return Objects.equals(this.isbn, other.isbn);
    }

    public abstract void anuncio();

}

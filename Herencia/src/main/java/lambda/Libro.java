package lambda;

import java.util.Objects;

public class Libro implements Comparable<Libro>{

    private String isbn;
    private String nombre;
    private String editorial;
    private int numeroPags;
    private double precio;

    public Libro(String isbn, String nombre, String editorial, int numeroPags, double precio) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.editorial = editorial;
        this.numeroPags = numeroPags;
        this.precio = precio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroPags() {
        return numeroPags;
    }

    public void setNumeroPags(int numeroPags) {
        this.numeroPags = numeroPags;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", nombre=" + nombre + ", editorial=" + editorial + ", numeroPags=" + numeroPags + ", precio=" + precio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.isbn);
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + Objects.hashCode(this.editorial);
        hash = 83 * hash + this.numeroPags;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        return hash;
    }

    @Override
    //Consideramos dos libros iguales cuando coinciden sus isbn
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;

        return Objects.equals(this.isbn, other.isbn);
    }

    //Por tanto, los objetos se ordenarán por si isbn, ya que tienen que ir a la par
    //Devuelve < 0 si es anterior, 0 si igual y > 0 si posterior
    @Override
    public int compareTo(Libro t) {

        return this.isbn.compareTo(t.isbn);
    }

}

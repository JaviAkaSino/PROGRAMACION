package listas;

import java.util.Objects;

public class Cancion implements Comparable<Cancion>{

    private String titulo, autor;
    private int anio;

    public Cancion(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public Cancion() {

        this.titulo = "";
        this.autor = "";
        this.anio = 0;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + ", " + anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    @Override
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
        final Cancion other = (Cancion) obj;
        return Objects.equals(this.titulo, other.titulo);
    }

    

    @Override
    public int compareTo(Cancion c) {

        return (this.titulo.compareTo(c.titulo));
    }

    
    
}

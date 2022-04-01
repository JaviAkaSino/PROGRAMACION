package com.mycompany.p62javierparodipinero;

/**
 *
 * @author javiakasino
 */
public final class LibroPapel extends Libro implements SeEnvia {

    private int numPaginas;

    public LibroPapel() {
    }

    public LibroPapel(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public LibroPapel(int numPaginas, String isbn) {
        super(isbn);
        this.numPaginas = numPaginas;
    }

    public LibroPapel(int numPaginas, String isbn, String codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override //Método polimórfico
    public String toString() {
        return "LibroPapel{" + super.toString() + "numPaginas=" + numPaginas + '}';
    }

    @Override //Método polimórfico
    public void enviar(String direccion) {
        System.out.println("Libro: " + this.toString()
                + "\nDirección de envío: " + direccion);

    }

    @Override //Método polimórfico
    public int hashCode() {

        int hash = super.hashCode();
        hash = 43 * hash + this.numPaginas;
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
        final LibroPapel other = (LibroPapel) obj;
        return this.numPaginas == other.numPaginas;
    }
    
    @Override
    public void anuncio() {

        System.out.println("Más libros en LaCasaDelLibro");
    }

}

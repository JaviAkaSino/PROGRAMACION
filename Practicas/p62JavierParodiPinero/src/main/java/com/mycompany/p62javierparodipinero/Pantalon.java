package com.mycompany.p62javierparodipinero;

/**
 *
 * @author javiakasino
 */
public final class Pantalon extends Ropa {

    private int talla; //Uso int por no considerar tallas decimales en pantalones

    public Pantalon() {
    }

    public Pantalon(int talla, String marca) {
        super(marca);
        this.talla = talla;
    }

    public Pantalon(int talla, String marca, String codigo, double precio, double iva, String descripcion) {
        super(marca, codigo, precio, iva, descripcion);
        this.talla = talla;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    @Override //Método polimórfico
    public String toString() {
        return "Pantalon{" + super.toString() + "Talla=" + talla + '}';
    }

    @Override //Método polimórfico
    public int hashCode() {

        int hash = super.hashCode();
        hash = 79 * hash + this.talla;
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
        final Pantalon other = (Pantalon) obj;
        return this.talla == other.talla;
    }

}

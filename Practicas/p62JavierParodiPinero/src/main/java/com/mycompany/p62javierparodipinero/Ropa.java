package com.mycompany.p62javierparodipinero;

import java.util.Objects;

/**
 *
 * @author javiakasino
 */
public abstract class Ropa extends Producto implements SeEnvia {

    private String marca;

    public Ropa() {
    }

    public Ropa(String marca) {
        this.marca = marca;
    }

    public Ropa(String marca, String codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override //Método polimórfico
    public String toString() {
        return "Ropa{" + super.toString() + "marca=" + marca + '}';
    }

    @Override //Método polimórfico
    public void enviar(String direccion) {
        System.out.println("Ropa: " + this.toString()
                + "\nDirección de envío: " + direccion);

    }

    @Override //Método polimórfico
    public int hashCode() {
        int hash = super.hashCode();
        hash = 29 * hash + Objects.hashCode(this.marca);
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
        final Ropa other = (Ropa) obj;
        return Objects.equals(this.marca, other.marca);
    }

}

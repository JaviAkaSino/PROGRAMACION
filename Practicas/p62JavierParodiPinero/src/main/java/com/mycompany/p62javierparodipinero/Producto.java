package com.mycompany.p62javierparodipinero;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author javiakasino
 */
public abstract class Producto {

    private String codigo;
    private double precio;
    private double iva;
    private String descripcion;

    public Producto() {

        this.codigo = codigoRandom();
        this.precio = precioRandom();
        this.iva = 21;
        this.descripcion = "Esta es la descripción del producto";

    }

    public Producto(String codigo, double precio, double iva, String descripcion) {
        this.codigo = codigo;
        this.precio = precio;
        this.iva = iva;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override //Método polimórfico
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", precio=" + precio + ", iva=" + iva + ", descripcion=" + descripcion + '}';
    }

    //MÉTODO CREAR CÓDIGO (POR DEFECTO)
    public static String codigoRandom() {

        Random rnd = new Random();
        String numero = "";

        for (int i = 0; i < 7; i++) {

            numero += String.valueOf(rnd.nextInt(10));
        }
        return numero;
    }

    //MÉTODO PARA CREAR PRECIO RANDOM
    private double precioRandom() {

        Random rnd = new Random();

        return Math.round((rnd.nextDouble() * 95 + 5) * 100.0) / 100;//Da un número entre 100 y 5
    }

    @Override //Método polimórfico
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.codigo);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.iva) ^ (Double.doubleToLongBits(this.iva) >>> 32));
        hash = 13 * hash + Objects.hashCode(this.descripcion);
        return hash;
    }

    @Override //Método polimórfico
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
        final Producto other = (Producto) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (Double.doubleToLongBits(this.iva) != Double.doubleToLongBits(other.iva)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return Objects.equals(this.descripcion, other.descripcion);
    }

}

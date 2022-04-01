package com.mycompany.p62javierparodipinero;

import java.util.Objects;

/**
 *
 * @author javiakasino
 */
public final class Musica extends Producto {

    private String grupo;

    public Musica() {
    }

    public Musica(String grupo) {
        this.grupo = grupo;
    }

    public Musica(String grupo, String codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override //Método polimórfico
    public String toString() {
        return "Musica{" + super.toString() + "grupo=" + grupo + '}';
    }

    @Override //Método polimórfico
    public int hashCode() {

        int hash = super.hashCode();
        hash = 67 * hash + Objects.hashCode(this.grupo);
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
        final Musica other = (Musica) obj;
        return Objects.equals(this.grupo, other.grupo);
    }

}

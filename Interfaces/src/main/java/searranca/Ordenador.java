/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searranca;

/**
 *
 * @author JaviA
 */
public class Ordenador implements SeArranca, SePara {

    private double precio;

    public Ordenador(double precio) {
        this.precio = precio;
    }

    public Ordenador() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "precio=" + precio + '}';
    }

    @Override
    public boolean arrancar() {

        System.out.println("El ordenador ha arrancado...");
        return true;
    }

    @Override
    public boolean parar() {
        System.out.println("El ordenador se ha parado...");
        return true;
    }

}

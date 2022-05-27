/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author javiakasino
 */
public class Crucero {
    
    public String nombre;
    public ArrayList<String> destinos;
    public double precio;
    public int numeroNoches;
    public String puertoSalida;
    public String buque;

    public Crucero() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getDestinos() {
        return destinos;
    }

    public void setDestinos(ArrayList<String> destinos) {
        this.destinos = destinos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroNoches() {
        return numeroNoches;
    }

    public void setNumeroNoches(int numeroNoches) {
        this.numeroNoches = numeroNoches;
    }

    public String getPuertoSalida() {
        return puertoSalida;
    }

    public void setPuertoSalida(String puertoSalida) {
        this.puertoSalida = puertoSalida;
    }

    public String getBuque() {
        return buque;
    }

    public void setBuque(String buque) {
        this.buque = buque;
    }

    @Override
    public String toString() {
        return "Crucero{" + "nombre=" + nombre + ", destinos=" + destinos + ", precio=" + precio + ", numeroNoches=" + numeroNoches + ", puertoSalida=" + puertoSalida + ", buque=" + buque + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.nombre);
        hash = 73 * hash + Objects.hashCode(this.destinos);
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 73 * hash + this.numeroNoches;
        hash = 73 * hash + Objects.hashCode(this.puertoSalida);
        hash = 73 * hash + Objects.hashCode(this.buque);
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
        final Crucero other = (Crucero) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (this.numeroNoches != other.numeroNoches) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.puertoSalida, other.puertoSalida)) {
            return false;
        }
        if (!Objects.equals(this.buque, other.buque)) {
            return false;
        }
        return Objects.equals(this.destinos, other.destinos);
    }
    
    
    
}

package cuentabancaria;

import personas.*;

/**
 *
 * @author javiakasino
 */
public class Persona {

    private String nombre, apellidos, nif;

    //Constructor defecto
    public Persona() {
        this.nombre = "Nombre";
        this.apellidos = "Apellido";
        this.nif = "00000000A";

    }

    //Constructor parametrizado
    public Persona(String nombre, String apellidos, String nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", NIF: " + nif;
    }

}

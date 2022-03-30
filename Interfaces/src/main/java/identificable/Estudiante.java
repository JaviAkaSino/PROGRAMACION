/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identificable;

/**
 *
 * @author JaviA
 */
public class Estudiante extends Persona{
    
    private String id;

    public Estudiante() {
    }

    public Estudiante(String id, String nombre, String apellidos, String nif, Direccion direccion) {
        super(nombre, apellidos, nif, direccion);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiante{" + "id=" + id + '}';
    }

    @Override
    public void identificate() {

        System.out.println("Tipo de persona: Estudiante");

    }
    
    
}

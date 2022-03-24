package tarea6c_javierparodi;

import java.util.ArrayList;

/**
 *
 * @author javiakasino
 */
public class Hospital {

    private String nombre;
    private String direccion;
    private int numeroCamas;
    private ArrayList<Empleado> plantilla;
    private ArrayList<Paciente> pacientes;

    public Hospital(String nombre, String direccion, int numeroCamas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
        this.plantilla = new ArrayList();
        this.pacientes = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public ArrayList<Empleado> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Empleado> plantilla) {
        this.plantilla = plantilla;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public String toString() {
        return "Hospital{" + super.toString() + "nombre=" + nombre + ", direccion=" + direccion + ", numeroCamas=" + numeroCamas + ", plantilla=" + plantilla + ", pacientes=" + pacientes + '}';
    }
    
    
    

    public void contratarEmpleado(Empleado emp) {

        this.plantilla.add(emp);
    }

    public void ingresarPaciente(Paciente paciente) {

        this.pacientes.add(paciente);
    }

}

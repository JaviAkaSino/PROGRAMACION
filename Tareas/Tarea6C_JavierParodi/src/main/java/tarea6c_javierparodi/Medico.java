package tarea6c_javierparodi;

import java.util.Random;

/**
 *
 * @author javiakasino
 */
public class Medico extends Empleado {

    private String especialidad;

    public Medico(String especialidad, String numeroSeguridadSocial, double salario, String nombre, String apellidos, NIF nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
        this.especialidad = especialidad;
    }

    public Medico(String especialidad) {
        this.especialidad = especialidad;
    }

    public Medico() {
        this.especialidad = "cirugia";
    }

    public void tratar(Paciente paciente, String medicina) {

        System.out.println("El médico " + this.getNombre() + " "
                + this.getApellidos() + " le ha recetado " + medicina + " a "
                + paciente.getNombre() + " " + paciente.getApellidos());

        paciente.tomarMedicina(medicina);

    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "-Médico: " + super.toString() + "\nEspecialidad: " + especialidad + " \n\n";
    }

    @Override
    public double calcularIRPF() {

        if (this.especialidad.equalsIgnoreCase("cirugia")
                || this.especialidad.equalsIgnoreCase("cirugía")) {

            return this.getSalario() * 0.25;

        } else {

            return this.getSalario() * 0.235;

        }

    }

}

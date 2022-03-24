package tarea6c_javierparodi;

import java.util.Objects;

/**
 *
 * @author javiakasino
 */
public abstract class Empleado extends Persona {

    private String numeroSeguridadSocial;
    private double salario;

    public Empleado(String numeroSeguridadSocial, double salario, String nombre, String apellidos, NIF nif) {
        super(nombre, apellidos, nif);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salario = salario;
    }

    public Empleado() {
        this.numeroSeguridadSocial = "AN45456454";
        this.salario = 2000;
    }

    public abstract double calcularIRPF();

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString() + "numeroSeguridadSocial=" + numeroSeguridadSocial + ", salario=" + salario + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.numeroSeguridadSocial);
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
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.numeroSeguridadSocial, other.numeroSeguridadSocial)) {
            return false;
        }
        return true;
    }

}

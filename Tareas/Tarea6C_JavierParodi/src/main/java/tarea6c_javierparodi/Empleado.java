package tarea6c_javierparodi;

import java.util.Objects;
import java.util.Random;

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
        this.numeroSeguridadSocial = numeroSSRandom();
        this.salario = salarioRandom();
    }

    public abstract double calcularIRPF();
    
    
    private String numeroSSRandom(){ //Crea un número de Seguridad Social aleatorio
        
        Random rnd = new Random();
        String numero = "";

        for (int i = 0; i < 12; i++) {

            numero += String.valueOf(rnd.nextInt(10));
        }
        return numero;
    
    }
    
    private double salarioRandom(){
        
        Random rnd = new Random();
        
        return Math.round((rnd.nextDouble()*3000+1000)*100.0)/100;//Da un número entre 1000 y 4000
    }
    
    
    

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
        return super.toString() + "\nNº Seguridad Social: " + numeroSeguridadSocial + ", salario: " + salario + "€";
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

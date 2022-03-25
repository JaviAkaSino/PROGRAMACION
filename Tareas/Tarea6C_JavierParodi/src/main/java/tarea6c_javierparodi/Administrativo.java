package tarea6c_javierparodi;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author javiakasino
 */
public class Administrativo extends Empleado{
    
    private Grupo grupo;

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario, String nombre, String apellidos, NIF nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
        this.grupo = grupo;
    }

    public Administrativo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Administrativo() {
        this.grupo = Grupo.D;
    }

    
    public void registrarDocumento(String nombreDoc){
        
        System.out.println("Administrativo que registra: " + 
                this.getNombre() + " " + this.getApellidos() + 
                "\n Documento: " + nombreDoc + " - " + nombreDoc.hashCode());
    }
    
    
    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "-Administrativo: " + super.toString() + grupo + "\n\n";
    }
      
   

    @Override
    public double calcularIRPF() {
        
        return Math.round((this.getSalario()*this.grupo.getIrpf()/100)*100)/100;
        
    }
}

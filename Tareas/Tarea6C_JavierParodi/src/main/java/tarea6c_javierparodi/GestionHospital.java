package tarea6c_javierparodi;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author javiakasino
 */
public class GestionHospital {

    private Hospital hospital;

    public GestionHospital() {
        this.hospital = new Hospital("Carlos Haya", "Avenida Carlos Haya 1", 500);

    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Gestion del " + hospital + ":\n";
    }

    public static void main(String[] args) {

        GestionHospital gestion = new GestionHospital();

        gestion.getHospital().contratarEmpleado(gestion.crearMedico());
        gestion.getHospital().contratarEmpleado(gestion.crearMedico());

        gestion.getHospital().contratarEmpleado(gestion.crearPersonalPAS());
        gestion.getHospital().contratarEmpleado(gestion.crearPersonalPAS());
        gestion.getHospital().contratarEmpleado(gestion.crearPersonalPAS());

        gestion.hospital.ingresarPaciente(gestion.crearPaciente());
        gestion.hospital.ingresarPaciente(gestion.crearPaciente());
        gestion.hospital.ingresarPaciente(gestion.crearPaciente());
        gestion.hospital.ingresarPaciente(gestion.crearPaciente());
        gestion.hospital.ingresarPaciente(gestion.crearPaciente());

        System.out.println(gestion); //Listas antes de ordenar
        
        gestion.hospital.ordenarPlantillaNombre();
        
        System.out.println(gestion); //Ordenadas por nombre
        
        
        System.out.println("\nCalcular el IRPF de cada empleado:\n");

        for (Empleado e : gestion.hospital.getPlantilla()) {

            System.out.println("El IRPF es de: " + e.calcularIRPF() + "€");
        }

       

        System.out.println("\nMédico aleatorio trata paciente aleatorio");
        gestion.medicoAleatorio().tratar(gestion.pacienteAleatorio(), "Pancetamol");
        
        
        System.out.println("\nRenovar DNI paciente aleatorio");
        Paciente pac = gestion.pacienteAleatorio();
        
        
        System.out.println("DNI caducado: " + pac.getNif());
     
        pac.renovarNIF(LocalDate.now());
        
        System.out.println("DNI actualizado: " + pac.getNif());

        
        
        
    }

    public Medico medicoAleatorio(){
        
        Random rnd = new Random();
        
        Medico aux = new Medico();
        Empleado emp;
        Paciente pac;
        do {
            emp = this.hospital.getPlantilla().get(rnd.nextInt(this.hospital.getPlantilla().size()));

            
            if (emp instanceof Medico) {

                aux = (Medico) emp;
            }

        } while (!(emp instanceof Medico));
        
        return aux;
    }
    
    public Paciente pacienteAleatorio(){
        
        Random rnd = new Random();
        
        return this.hospital.getPacientes().get(rnd.nextInt(this.hospital.getPacientes().size()));
    }
    
    
    public Paciente crearPaciente() {

        return new Paciente();
    }

    public Medico crearMedico() {

        return new Medico();
    }

    public Administrativo crearPersonalPAS() {

        return new Administrativo();
    }
    


}

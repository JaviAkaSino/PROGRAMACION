package tarea6c_javierparodi;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author javiakasino
 */
public class GestionHospital {

    private Hospital hospital; //?????????

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
        return "GestionHospital{" + "hospital=" + hospital + '}';
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

        Random rnd = new Random();

        for (Empleado e : gestion.hospital.getPlantilla()) {

            System.out.println("El IRPF es de: " + e.calcularIRPF() + "€");
        }

        //////////////////////////////////////
        
        Medico aux = null;
        Empleado emp;
        Paciente pac;
        do {
            emp = gestion.hospital.getPlantilla().get(rnd.nextInt(gestion.hospital.getPlantilla().size()));

            
            if (emp instanceof Medico) {

                aux = (Medico) emp;
            }

        } while (!(emp instanceof Medico));

        pac = gestion.hospital.getPacientes().get(rnd.nextInt(gestion.hospital.getPacientes().size()));
        
        aux.tratar(pac, "Pancetamol"); // ??????????????????????????????
        
        ////////////////////////////////////////
        
        System.out.println(pac.getNif());
     
        pac.renovarNIF(LocalDate.now());
        
        System.out.println(pac.getNif());

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

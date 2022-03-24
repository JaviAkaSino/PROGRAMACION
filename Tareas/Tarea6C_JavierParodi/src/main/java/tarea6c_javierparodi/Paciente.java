package tarea6c_javierparodi;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author javiakasino
 */
public class Paciente extends Persona {

    private String numeroHistoria;

    public Paciente(String numeroHistoria, String nombre, String apellidos, NIF nif) {
        super(nombre, apellidos, nif);
        this.numeroHistoria = numeroHistoria;
    }

    public Paciente(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    public Paciente() {
        this.numeroHistoria = "123456789";
    }

    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    @Override
    public String toString() {
        return "Paciente{" + "numeroHistoria=" + numeroHistoria + '}';
    }

    public void tomarMedicina(String medicina) {

        Random rnd = new Random();

        if (rnd.nextBoolean()) {

            System.out.println("El paciente se ha curado");

        } else {

            System.out.println("El paciente went con San Pedro");
        }
    }

}

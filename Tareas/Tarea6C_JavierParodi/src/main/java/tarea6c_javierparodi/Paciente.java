package tarea6c_javierparodi;

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
        this.numeroHistoria = numeroHistoriaRandom();
    }

    private String numeroHistoriaRandom() { //Crea un número de historia aleatorio

        Random rnd = new Random();
        String numero = "";

        for (int i = 0; i <= 10; i++) {

            numero += String.valueOf(rnd.nextInt(10));
        }
        return numero;

    }

    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    @Override
    public String toString() {
        return "-Paciente: " + super.toString() + "\nNº Historia: " + numeroHistoria + "\n\n";
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

package tarea6c_javierparodi;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author javiakasino
 */
public class NIF {

    private String numero;
    private char letra;
    private LocalDate fechaCaducidad;

    public NIF(String numero, LocalDate fechaCaducidad) {
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
    }

    public NIF(LocalDate fechaCaducidad) {

        this.numero = numeroDNIRandom();
        this.letra = calcularLetra();
        this.fechaCaducidad = fechaCaducidad;
    }

    public NIF() {

        this.numero = numeroDNIRandom();
        this.letra = calcularLetra();
        this.fechaCaducidad = LocalDate.now().minusYears(2);
    }

    //MÉTODO CREAR NÚMERO DE DNI (POR DEFECTO)
    public static String numeroDNIRandom() {

        Random rnd = new Random();
        String numero = "";

        for (int i = 0; i < 8; i++) {

            numero += String.valueOf(rnd.nextInt(10));
        }
        return numero;
    }

    private char calcularLetra() {

        String listaLetras = "TRWAGMYFPDXBNJZSQVHLCKE";

        return listaLetras.charAt(Integer.parseInt(numero) % 23);
    }

    public String getNumero() {
        return numero;
    }

    public char getLetra() {
        return letra;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }


    public final void renovar(LocalDate fechaSolicitudRenovacion) {

        this.fechaCaducidad = fechaSolicitudRenovacion.plusYears(10);
    }

    @Override
    public String toString() {
        return "NIF: " + this.numero + "-" + this.letra + "  Cad:" + fechaCaducidad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.numero);
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
        final NIF other = (NIF) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }

}

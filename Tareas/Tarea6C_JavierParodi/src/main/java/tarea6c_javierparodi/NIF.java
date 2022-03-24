package tarea6c_javierparodi;

import java.time.LocalDate;
import java.util.Formatter;
import javax.swing.text.DateFormatter;

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
        this.letra = calcularLetra();
        this.fechaCaducidad = fechaCaducidad;
    }

    private char calcularLetra() {

        String listaLetras = "TRWAGMYFPDXBNJZSQVHLCKE";

        return listaLetras.charAt(Integer.parseInt(numero) % 23);
    }

    public void renovar(LocalDate fechaSolicitudRenovacion) {

        this.fechaCaducidad = fechaSolicitudRenovacion.plusYears(10);
    }

    
    
    @Override
    public String toString() {
        return "NIF: " + this.numero + "-" + this.letra + "\tFecha caducidad=" + fechaCaducidad;
    }

}

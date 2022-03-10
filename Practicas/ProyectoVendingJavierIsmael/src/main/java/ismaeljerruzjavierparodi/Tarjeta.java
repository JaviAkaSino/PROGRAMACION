package ismaeljerruzjavierparodi;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Tarjeta {

    //Atributos del número, la fecha de caducidad y el cvv
    private String numeroTarjeta, caducidad, cvv;
    //Conttador de instancias que utilizaremos para creación de tarjetas
    private static int contador;

    //Da a las fechas el formato de las tarjetas
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yy");

    //CONSTRUCTOR POR DEFECTO (ALEATORIO)
    public Tarjeta() {
        this.numeroTarjeta = numeroTarjetaRandom(); //Número aleatorio
        this.cvv = cvvRandom(); //CVV aleatorio
        this.caducidad = fechaTarjetaRandom().format(formatter); //Fecha de caducidad aleatoria

        contador++;
    }

    //CONSTRUCTOR PARAMETRIZADO
    public Tarjeta(String numeroTarjeta, String cvv, int anio, int mes) {

        //Si se crea una tarjeta de forma manual, que tenga un valor lógico
        if (comprobarNumero(numeroTarjeta) && comprobarFecha(anio, mes) && comprobarCVV(cvv)) {
            this.numeroTarjeta = numeroTarjeta;
            this.cvv = cvv;
            this.caducidad = YearMonth.of(anio, mes).format(formatter);
        }
    }

    //CONSTRUCTOR PARAMETRIZADO FECHA (PARA CADUCADA)
    public Tarjeta(int anio, int mes) {
        //restricciones para que se cree el objeto
        this.numeroTarjeta = numeroTarjetaRandom();
        this.cvv = cvvRandom();
        this.caducidad = YearMonth.of(anio, mes).format(formatter);
    }

    //METODO PARA CREAR NÚMERO DE TARJETA ALEATORIO
    public static String numeroTarjetaRandom() {

        Random rnd = new Random();
        String num = "0123456789";
        String numero = "";
        char digito;

        numero += contador; //El primer número es el contador de instancias 
        //De tal modo que no habrá tarjetas iguales
        int restantes = 16 - Utilidades.cifrasDeUnNumero(contador); //Los que faltan para completar los 16

        for (int i = 0; i < restantes; i++) { //Hasta llegar a ellos

            digito = num.charAt(rnd.nextInt(10)); //Coge números aleatorios del String

            numero += Character.toString(digito); //Los guarda
        }

        return numero;
    }

    //MÉTODO PARA FECHA DE TARJETA ALEATORIA
    public static YearMonth fechaTarjetaRandom() {

        int anio = 0, mes = 0;
        //El año será uno entre el que viene y 4 más, como suele ocurrir
        anio = LocalDate.now().plusYears(Utilidades.numeroAleatorioEntre(0, 4)).getYear();
        //El mes será al menos uno más que el actual, hasta 11 por no superar el año
        mes = LocalDate.now().plusMonths(Utilidades.numeroAleatorioEntre(1, 11)).getMonthValue();

        YearMonth fecha = YearMonth.of(anio, mes);

        return fecha;
    }

    //MÉTODO CREAR CVV ALEATORIO
    public static String cvvRandom() {

        Random rnd = new Random();
        String num = "0123456789";
        String cvv = "";
        char digito;
        for (int i = 0; i < 3; i++) { //Se cogen 3 números aleatorios

            digito = num.charAt(rnd.nextInt(10));

            cvv += Character.toString(digito);
        }

        return cvv;
    }

    //MÉTODO COMPROBAR SI NÚMERO DE TARJETA TIENE 16 CARACTERES NUMÉRICOS 
    public static boolean comprobarNumero(String numeroTarjeta) {

        boolean valido = true; //El número es válido hasta que se demuestre lo contrario

        if (numeroTarjeta.length() != 16) { //Si no tiene 16 números, 
            valido = false;
        }

        for (int i = 0; i < numeroTarjeta.length(); i++) { //Recorre el String

            if (!Character.isDigit(numeroTarjeta.charAt(i))) {

                valido = false; // Si alguno no es dígito, no es válido
            }
        }

        return valido;
    }

    //MÉTODO PARA COMPROBAR SI LA FECHA ES VÁLIDA (NO MES 13, ETC)
    public static boolean comprobarFecha(int anio, int mes) {

        boolean fechaComprobada = true;

        try {
            YearMonth.of(anio, mes);

        } catch (DateTimeException DTE) {
            fechaComprobada = false;

        }
        return fechaComprobada;
    }

    //MÉTODO PARA COMPROBAR CADUCIDAD   
    public static boolean fechaValidez(int anio, int mes) {
        boolean fechaValidez = false;

            if (YearMonth.of(anio, mes).isAfter(YearMonth.now())) {

                fechaValidez = true;
            }

        return fechaValidez;
    }

    //MÉTODO COMPROBAR SI CVV TIENE 3 CARACTERES NUMÉRICOS 
    public static boolean comprobarCVV(String cvv) {

        boolean valido = true; //El número es válido hasta que se demuestre lo contrario

        if (cvv.length() != 3) { //Si no tiene 3 números, 
            valido = false;
        }

        for (int i = 0; i < cvv.length(); i++) { //Recorre el String

            if (!Character.isDigit(cvv.charAt(i))) {

                valido = false; // Si alguno no es dígito, no es válido
            }
        }

        return valido;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getCvv() {
        return cvv;
    }

    public String getCaducidad() {
        return caducidad;
    }

    @Override
    public String toString() {
        return "Número: " + numeroTarjeta + ", Validez: " + caducidad + ", CVV:" + cvv;
    }
}

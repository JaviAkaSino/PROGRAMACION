package daw.javierparodipiniero;

import java.lang.Object;
import java.time.YearMonth;
import java.lang.Character;
import java.util.Random;

/**
 *
 * @author javiakasino
 */
public class TarjetaCredito {

    //Atributos
    private final String ENTIDAD_EMISORA;
    private final String NUMERO_TARJETA;
    private final String TITULAR;
    private String pin;
    private final YearMonth FECHA;
    private double credito; //Entendiendo que puede ser decimal
    private boolean estado; //Activada = true; anulada = false

    public static final double MIN = 500;
    public static final double MAX = 3000;

    //MÉTODO CONSTRUCTOR POR DEFECTO
    public TarjetaCredito() {

        this.ENTIDAD_EMISORA = "N Bank";
        this.NUMERO_TARJETA = numeroTarjetaRandom();
        this.TITULAR = "Juan Palomo Pérez";
        this.pin = pinRandom();
        this.FECHA = YearMonth.of(2025, 05);
        this.credito = 500;
        this.estado = false;

    }

    //MÉTODO CONSTRUCTOR PARAMETRIZADO
    public TarjetaCredito(String entidadEmisora, String numero, String titular,
            String pin, YearMonth fecha, double credito) {

        this.ENTIDAD_EMISORA = entidadEmisora;

        if (!comprobarNumero(numero)) { //Si al comprobar es false, por defecto
            this.NUMERO_TARJETA = numeroTarjetaRandom();
        } else {
            this.NUMERO_TARJETA = numero;
        }

        this.TITULAR = titular;
        this.pin = pin;
        this.FECHA = YearMonth.now().plusYears(3);

        this.credito = credito;
        if (credito < 500) { //Si el credito está fuera de rango por abajo
            this.credito = MIN; //Se establece en el mínimo
        }
        if (3000 < credito) { //Si el credito está fuera de rango por abajo
            this.credito = MAX; //Se establece en el máximo
        }

        this.estado = false; //Las tarjetas se crean sin activar (anuladas)

    }

    //MÉTODOS GETTER
    public String getENTIDAD_EMISORA() {
        return ENTIDAD_EMISORA;
    }

    public String getNUMERO_TARJETA() {
        return NUMERO_TARJETA;
    }

    public String getTITULAR() {
        return TITULAR;
    }

    public String getPin() {
        return pin;
    }

    public YearMonth getFECHA() {
        return FECHA;
    }

    public double getCredito() {
        return credito;
    }

    public boolean isEstado() {
        return estado;
    }

    //MÉTODOS SETTER
    //Sólo incluimos los 3 que permiten cambio por enunciado
    //Modificados adaptandolos a la práctica
    public void cambiarPin(String pin) {  //Cambiar pin
        this.pin = pin;
    }

    public void pagar(double pago) { //Realizar un pago

        if (this.estado && pago <= this.credito) {

            this.credito -= pago;
        }

    }

    public void activarTarjeta() {  //Activar tarjeta
        this.estado = true;
    }

    public void anularTarjeta() {   //Desactivar tarjeta
        this.estado = false;
    }

    //MÉTODO COMPROBAR SI STRING TIENE 16 CARACTERES NUMÉRICOS
    private static boolean comprobarNumero(String numeroTarjeta) {

        boolean valido = true; //El número es válido hasta que se demuestre lo contrario

        if (numeroTarjeta.length() != 16){ //Si no tiene 16 números, 
            valido = false;
        }
        
        for (int i = 0; i < numeroTarjeta.length(); i++) { //Recorre el String

            if (!Character.isDigit(numeroTarjeta.charAt(i))) {

                valido = false; // Si alguno no es dígito, no es válido
            }
        }

        return valido;
    }

    //MÉTODO CREAR NÚMERO DE TARJETA ALEATORIO (POR DEFECTO)
    public static String numeroTarjetaRandom() {

        Random rnd = new Random();
        String num = "0123456789";
        String numero = "";
        char digito;
        for (int i = 0; i < 16; i++) {

            digito = num.charAt(rnd.nextInt(10));

            numero += Character.toString(digito);
        }

        return numero;
    }

    //MÉTODO CREAR pin ALEATORIO (POR DEFECTO)
    public static String pinRandom() {

        Random rnd = new Random();
        String num = "0123456789";
        String pin = "";
        char digito;
        for (int i = 0; i < 4; i++) {

            digito = num.charAt(rnd.nextInt(10));

            pin += Character.toString(digito);
        }

        return pin;
    }

    public static TarjetaCredito copiar(TarjetaCredito t) {

        TarjetaCredito aux = new TarjetaCredito(t.getENTIDAD_EMISORA(), t.getNUMERO_TARJETA(),
                t.getTITULAR(), t.getPin(), t.getFECHA(), t.getCredito());

        return aux;

    }

    //MÉTODO TOSTRING
    @Override
    public String toString() {

        return "\t" + TITULAR + "\t" + ENTIDAD_EMISORA + "\n"
                + "\t" + FECHA + "\t\t" + credito + "\n" + "\t" + NUMERO_TARJETA;
        //Pongo doble tabulador porque con uno no aparece
    }
}

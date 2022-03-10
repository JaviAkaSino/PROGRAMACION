package javierparodipinero;

/**
 *
 * @author javiakasino
 */
public class NIF {

    /*9.  Crea una clase NIF que se usará para asignar el número de DNI con su 
    correspondiente letra. Los atributos serán dos: el número de DNI (String) y 
    la letra que le corresponde a ese número de DNI (char). La clase dispondrá 
    de los siguientes métodos:*/
    private String numeroDNI;
    private char letraDNI;
    private static int contador = 0;

    /*Constructor que recibe como parámetro un String con el DNI.*/
    public NIF(String numeroDNI) {

        if (numeroDNI.length() == 8) {

            this.numeroDNI = numeroDNI;

            this.letraDNI = obtenerLetra(Integer.parseInt(this.numeroDNI));

            contador++;
        }

    }

    /*El atributo letraDNI
    se establece mediante un método método privado según el siguiente algoritmo: 
    se obtiene el resto de la división entera del número de DNI entre 23 y se 
    usa la siguiente tabla para obtener la letra que corresponde.*/
    private char obtenerLetra(int numeroDNI) {

        int restoLetra;
        char letraDNI;
        String tablaLetras = "TRWAGMYFPDXBNJZSQVHLCKE";

        restoLetra = numeroDNI % 23;

        letraDNI = tablaLetras.charAt(restoLetra);

        return letraDNI;
    }

    /*Métodos getters. No hay setters.*/
    public String getNumeroDNI() {
        return numeroDNI;
    }

    public char getLetraDNI() {
        return letraDNI;
    }

    /*Implementa un contador de instancias en la clase NIF. Incluye un método de clase 
    getContador() para consultar el número de objetos creados en el programa.*/
    public static int getContador() {
        
        
        return contador;
    }

    /*Método toString(). Devuelve un String  con el siguiente formato: ocho caracteres,
    un guión y la letra en mayúscula; por ejemplo: 00395469-F*/
    @Override
    public String toString() {
        return "NIF: " + this.numeroDNI + "-" + this.letraDNI;
    }

}

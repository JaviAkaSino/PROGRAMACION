package ejercicio1;

/**
 *
 * @author javiakasino
 */
public enum Valores {
    
    DOS("2", 2), TRES("3", 3), CUATRO("4", 4), CINCO("5", 5), SEIS("6", 6), 
    SIETE("7", 7), OCHO("8", 8), NUEVE("9", 9), DIEZ("10", 10), JACK("J", 11),
    QUEEN("Q", 12), KING("K", 13), AS("A", 14);
    
    private String nombre;
    private int valor;
    
    private Valores(String nombre, int valor){
        this.nombre = nombre;
        this.valor = valor;
    }

    
    public static Valores getDOS() {
        return DOS;
    }

    public static Valores getTRES() {
        return TRES;
    }

    public static Valores getCUATRO() {
        return CUATRO;
    }

    public static Valores getCINCO() {
        return CINCO;
    }

    public static Valores getSEIS() {
        return SEIS;
    }

    public static Valores getSIETE() {
        return SIETE;
    }

    public static Valores getOCHO() {
        return OCHO;
    }

    public static Valores getNUEVE() {
        return NUEVE;
    }

    public static Valores getDIEZ() {
        return DIEZ;
    }

    public static Valores getJACK() {
        return JACK;
    }

    public static Valores getQUEEN() {
        return QUEEN;
    }

    public static Valores getKING() {
        return KING;
    }

    public static Valores getAS() {
        return AS;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }
    
    
    
    
}

package ejercicio1;

/**
 *
 * @author javiakasino
 */
public enum Palos {
    
    P("PICAS"), D("DIAMANTES"), T("TREBOLES"), C("CORAZONES");
    
    private final String palo;

    private Palos(String palo) {
        this.palo = palo;
    }

    public static Palos getP() {
        return P;
    }

    public static Palos getD() {
        return D;
    }

    public static Palos getT() {
        return T;
    }

    public static Palos getC() {
        return C;
    }

    public String getPalo() {
        return palo;
    }

    
    
    
}

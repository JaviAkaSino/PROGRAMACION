package ismaeljerruzjavierparodi;

public class Maquina {

    private final String NUMERO_DE_SERIE; 
    private String ubicacion;
    private int numeroBandejas;
    private final CodigoAdmin CODIGO_ADMIN;
    private Bandeja bandeja1, bandeja2, bandeja3, bandeja4, bandeja5, bandeja6;
    private final Tarjeta TARJETA1, TARJETA2, TARJETA3;
    private Caja caja;

    //CONSTRUCTOR POR DEFECTO
    public Maquina() {
        this.NUMERO_DE_SERIE = numeroSerie();
        this.ubicacion = ubicacionDefault();
        this.CODIGO_ADMIN = new CodigoAdmin();

        this.TARJETA1 = new Tarjeta();
        this.TARJETA2 = new Tarjeta();
        this.TARJETA3 = new Tarjeta();

        //Stock al máximo por defecto
        this.bandeja1 = new Bandeja();
        this.bandeja2 = new Bandeja();
        this.bandeja3 = new Bandeja();
        this.bandeja4 = new Bandeja();
        this.bandeja5 = new Bandeja();
        this.bandeja6 = new Bandeja();
        
        this.numeroBandejas = Bandeja.getContador();
        
        this.caja = new Caja();
    }

    
    //MÉTODOS

    //NÚMERO DE SERIE ÚNICO 
    private String numeroSerie() {
        String numeroDeSerie = java.util.UUID.randomUUID().toString();
        return numeroDeSerie;
    }
    
    private String ubicacionDefault(){
        String[] lista = {"Calle Alcalá, Madrid 28012 (Madrid)","Avenida de los Reales, Estepona 29680 (Málaga)",
                            "Calle Juana de Arco, Sevilla 41005 (Sevilla)","Calle Falsa 123 Evergreen Terrace"};
        
        int rnd = Utilidades.numeroAleatorioEntre(0, lista.length);

        return lista[rnd];
    }
    

    //Getters
    public CodigoAdmin getCODIGO_ADMIN() {
        return CODIGO_ADMIN;
    }

    public Bandeja getBandeja1() {
        return bandeja1;
    }

    public Bandeja getBandeja2() {
        return bandeja2;
    }

    public Bandeja getBandeja3() {
        return bandeja3;
    }

    public Bandeja getBandeja4() {
        return bandeja4;
    }

    public Bandeja getBandeja5() {
        return bandeja5;
    }

    public Bandeja getBandeja6() {
        return bandeja6;
    }

    public Tarjeta getTARJETA1() {
        return TARJETA1;
    }

    public Tarjeta getTARJETA2() {
        return TARJETA2;
    }

    public Tarjeta getTARJETA3() {
        return TARJETA3;
    }

    public String getNUMERO_DE_SERIE() {
        return NUMERO_DE_SERIE;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setNumeroBandejas(int numeroBandejas) {
        this.numeroBandejas = numeroBandejas;
    }

    public void setBandeja1(Bandeja bandeja1) {
        this.bandeja1 = bandeja1;
    }

    public void setBandeja2(Bandeja bandeja2) {
        this.bandeja2 = bandeja2;
    }

    public void setBandeja3(Bandeja bandeja3) {
        this.bandeja3 = bandeja3;
    }

    public void setBandeja4(Bandeja bandeja4) {
        this.bandeja4 = bandeja4;
    }

    public void setBandeja5(Bandeja bandeja5) {
        this.bandeja5 = bandeja5;
    }

    public void setBandeja6(Bandeja bandeja6) {
        this.bandeja6 = bandeja6;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    

    @Override
    public String toString() {
        return "\nMÁQUINA VENDING: \n" + "\nNúmero de serie: " + NUMERO_DE_SERIE + "\nUbicación: "+ 
                ubicacion + "\nNúmero de bandejas: " + numeroBandejas + "\n\nCódigo de Admin: " 
                + CODIGO_ADMIN + "\n\nBandejas: \nBandeja 1: " + bandeja1 + "\nBandeja 2: " + bandeja2 
                + "\nBandeja 3: " + bandeja3 + "\nBandeja 4: " + bandeja4 + 
                "\nBandeja 5: " + bandeja5 + "\nBandeja 6: " + bandeja6 + "\n\nTarjetas: \nTarjeta 1: " 
                + TARJETA1 + "\nTarjeta 2: " + TARJETA2 + "\nTarjeta 3: " + TARJETA3 + 
                "\n\nEfectivo en máquina: " + caja;
    }

}

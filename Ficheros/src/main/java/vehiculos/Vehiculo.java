package vehiculos;

public class Vehiculo {

    private Long bastidor;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    
    private static Long contador = 1l;

    public Vehiculo(Long bastidor, String matricula, String marca, String modelo, String color, double tarifa) {
        this.bastidor = bastidor;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
    }

    public Vehiculo() {
        
        this.bastidor = 1111111l + contador;
        this.matricula = "FMD100" + contador.toString();
        this.marca = marcaDefecto();
        this.modelo = modeloDefecto();
        this.color = colorDefecto();
        this.tarifa = Math.round(Math.random()*100);
        
        contador++;
    }

    
    
    public Long getBastidor() {
        return bastidor;
    }

    public void setBastidor(Long bastidor) {
        this.bastidor = bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public String marcaDefecto(){

        String[] lista = {"SEAT", "BMW", "OPEL", "MERCEDES","RENAULT", "RENAULT"};

        String mar = lista[Math.abs(contador.intValue())/6];

        return mar;
    }
    
    public String modeloDefecto(){

        String[] lista = {"Altea", "318", "Mokka", "Vito","Megane","Berlingo"};

        String mod = lista[Math.abs(contador.intValue())/6];

        return mod;
    }
    
    public String colorDefecto(){

        String[] lista = {"Rojo", "Azul", "Blanco", "Verde","Naranja", "Amarillo"};

        String col = lista[Math.abs(contador.intValue())/6];

        return col;
    }
    
    
    public String toString() {
        return bastidor + ":" + matricula + ":" + marca+ ":" + modelo + ":" + color + ":" + tarifa;
    }

}

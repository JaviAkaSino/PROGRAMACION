package javierparodipinero;

public class CajaCarton {

    private double ancho, largo, alto, peso;

    public CajaCarton(double ancho, double largo, double alto, double peso) {

        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
        this.peso = peso;
    }

    public void abrir() {

    }

    public void cerrar() {

    }

    public double getAncho() {
        return ancho;
    }
    
    //Todos los set son void y no tienen return
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
    @Override
    public String toString() {
        return "CajaCarton{" + "ancho=" + ancho + ", largo=" + largo + ", alto=" + alto + ", peso=" + peso + '}';
    }

}

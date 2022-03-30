/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searranca;

/**
 *
 * @author JaviA
 */
public class Turismo extends Vehiculo {

    private int numeroPuertas;

    public Turismo(int numeroPuertas, String matricula) {
        super(matricula);
        this.numeroPuertas = numeroPuertas;
    }

    public Turismo(String matricula) {
        super(matricula);
    }

    public Turismo() {
    }
    
   

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    
        public boolean arrancar() {

        System.out.println("El vehículo ha arrancado...");
        return true;
    }
    

    @Override
    public String toString() {
        return super.toString() + "Turismo{" + "numeroPuertas=" + numeroPuertas + '}';
    }

    @Override
    public void repostar(String tipoCombustible) {

        System.out.println("Está repostando con " + tipoCombustible);
    }

}

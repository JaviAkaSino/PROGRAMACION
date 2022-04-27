package vehiculos;

import java.io.Serializable;

/**
 *
 * @author javiakasino
 */
public class Furgoneta extends Vehiculo  implements Serializable{

    private double cargaKg;
    private double volumenM3;

    public Furgoneta(double cargaKg, double volumenM3, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa) {
        super(bastidor, matricula, marca, modelo, color, tarifa);
        this.cargaKg = cargaKg;
        this.volumenM3 = volumenM3;
    }

    public Furgoneta() {
        this.cargaKg = (int) (Math.random()*3000);
        this.volumenM3 = (int) (Math.random()*30);
        
    }

    
    
    public double getCargaKg() {
        return cargaKg;
    }

    public double getVolumenM3() {
        return volumenM3;
    }

    public void setCargaKg(double cargaKg) {
        this.cargaKg = cargaKg;
    }

    public void setVolumenM3(double volumenM3) {
        this.volumenM3 = volumenM3;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + ";" + cargaKg + ";" + volumenM3;
    }

}

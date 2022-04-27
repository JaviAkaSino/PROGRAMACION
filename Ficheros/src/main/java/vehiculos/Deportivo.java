package vehiculos;

import java.io.Serializable;

/**
 *
 * @author javiakasino
 */
public class Deportivo extends Vehiculo implements Serializable {

    private int cilindrada;

    public Deportivo(int cilindrada, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa) {
        super(bastidor, matricula, marca, modelo, color, tarifa);
        this.cilindrada = cilindrada;
    }

    public Deportivo() {
        this.cilindrada = (int) (Math.random()*3000);
    }
    
    
    

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    
    
    @Override
    public String toString() {
        return super.toString() + ";" + cilindrada;
    }

}

package legisladores;

/**
 *
 * @author javiakasino
 */
public class Senador extends Legislador {

    private double complemento;

    public Senador(double complemento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.complemento = complemento;
    }

    public Senador(double complemento, String provincia, String partidoPolitico) {
        super(provincia, partidoPolitico);
        this.complemento = complemento;
    }

    public Senador() {

        this.complemento = 1000;
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Senador{" + super.toString() + "complemento=" + complemento + '}';
    }

    
    
    
    @Override
    public String getCamara() {

        return "Es Diputado";
    }

}

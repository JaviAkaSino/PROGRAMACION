package ejercicio15;

/**
 *
 * @author javiakasino
 */
public abstract class Legislador extends Persona {

    private String provincia, partidoPolitico;

    public Legislador(String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.provincia = provincia;
        this.partidoPolitico = partidoPolitico;
    }

    public Legislador(String provincia, String partidoPolitico) {
        this.provincia = provincia;
        this.partidoPolitico = partidoPolitico;
    }

    public Legislador() {
        this.provincia = "provincia";
        this.partidoPolitico = "partido";
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public abstract String getCamara();

    @Override
    public String toString() {
        return "Legislador{" + super.toString() + "provincia=" + provincia + ", partidoPolitico=" + partidoPolitico + '}';
    }

}

package personas;

/**
 *
 * @author javiakasino
 */
public class Programador extends Empleado {

    private Categoria categoria;

    //Constructor defecto
    public Programador() {
        super();
        this.categoria = Categoria.Junior;
    }

    //Constructor defecto parámetro categoría
    public Programador(Categoria categoria) {
        super();
        this.categoria = categoria;
    }

    //Constructor parametrizado
    public Programador(Categoria categoria, double salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.categoria = categoria;
    }

    

    public enum Categoria {

        Analista, Senior, Junior
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCategoría: " + categoria;
    }
    
    
    
    

}

package personas;

/**
 *
 * @author javiakasino
 */
public class Empleado extends Persona{
    
    private double salario;

    
    //Constructor defecto
    public Empleado() {
        
        this.salario = 1000;
    }

    
    //Constructor defecto parámetro salario
    public Empleado(double salario) {
        this.salario = salario;
    }

    
    //Constructor parametrizado
    public Empleado(double salario, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalario: " + salario + "€";
    }
    
    
    //AUMENTAR EL SALARIO
    
    public void aumentarSalario(double aumento){
        
        this.salario += aumento;
        
    }
    
    
    
    
}

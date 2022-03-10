package ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Objects;

/**
 *
 * @author javiakasino
 */
public class Trabajador {
    
    private String nombre, apellidos;
    private LocalDate fechaNacimiento;
    private CategoriaEmpleado categoria;
    
    private static final double SUELDO_BASE = 1707;

    //Constructor parametrizado que comprueba la edad => 16
    public Trabajador(String nombre, String apellidos, LocalDate fechaNacimiento, CategoriaEmpleado categoria) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.categoria = categoria;
       
        //Si la fecha de hace 16 años desde hoy es posterior o igual a la fecha         
        //de nacimiento, significa que es mayor de 16 años
        if (LocalDate.now().minusYears(16).isAfter(fechaNacimiento)
                || LocalDate.now().minusYears(16).isEqual(fechaNacimiento)){
            
            this.fechaNacimiento = fechaNacimiento;  
            
        } else {
            
            throw new IllegalArgumentException("El empleado no puede ser menor de 16 años");
        }
        
    }

    //Constructor copia
    public Trabajador(Trabajador trabajador) {
        
        this.nombre = trabajador.nombre;
        this.apellidos = trabajador.apellidos;
        this.fechaNacimiento = trabajador.fechaNacimiento;
        this.categoria = trabajador.categoria;
    }
    
    //Devuelve el sueldo incluyendo el complemento
    public double calcularSueldo(){
        
        return (SUELDO_BASE+this.categoria.getComplemento());
    }
    
    //Devuelve la fecha de jubilacion del empleado (a los 66 años)
    public static LocalDate fechaJubilacion(Trabajador trabajador){
        
         return trabajador.fechaNacimiento.plusYears(66);     
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public CategoriaEmpleado getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEmpleado categoria) {
        this.categoria = categoria;
    }

    
    
    
    @Override
    public String toString() {
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy").withLocale(new Locale("es", "ES"));
        
        return "\t" + apellidos + ", " + nombre + "\tF.Nac: " + fechaNacimiento
                + "\nCategoría: " + categoria.getCategoria() +
                "\nFecha Jubilación: " +  fechaJubilacion(this).format(formato) + 
                "\nSueldo actual: " + calcularSueldo();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + Objects.hashCode(this.apellidos);
        hash = 47 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 47 * hash + Objects.hashCode(this.categoria);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trabajador other = (Trabajador) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        return this.categoria == other.categoria;
    }
 
    
   
    
    
}

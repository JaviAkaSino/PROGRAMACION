package javierparodipinero;

/**
 *
 * @author javiakasino
 */
// Clase para tratar fechas (sólo día, mes y año)
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
// Enumerado para los meses del año (Enero, ...)
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Fecha {

    /*
15.- Crea una clase Fecha con atributos para el día, el mes y el año. Incluye, 
    al menos, los siguientes métodos:*/
    private int anio, mes, dia;

//Constructor predeterminado con el 1-1-2022, como fecha por defecto.
    public Fecha() {

        this.anio = 2000;
        this.mes = 1;
        this.dia = 1;
    }

    /*Constructor parametrizado con día, mes y año. Se debe comprobar que los 
    parámetros introducidos proporcionan una fecha válida. En caso contrario, 
    se lanzará una excepción de tipo IllegalArgument.*/
    public Fecha(int anio, int mes, int dia) {

        if (comprobarFecha(anio, mes, dia)) {
            this.anio = anio;
            this.mes = mes;
            this.dia = dia;
        } else {

            throw new IllegalArgumentException();
        }
    }

    /*comprobarFecha(int dia, int mes, int anio): comprobará si los parámetros son 
    válidos para crear una nueva fecha.  Ejemplos: 31-2-2010 no es una fecha 
    correcta. Este método se debe usar en el constructor parametrizado.*/
    private boolean comprobarFecha(int anio, int mes, int dia) {

        boolean fechaComprobada = true;

        try {
            LocalDate.of(dia, mes, anio);

        } catch (DateTimeException DTE) {
            fechaComprobada = false;

        }
        return fechaComprobada;
    }

    /*Métodos get y set. Los métodos set deben tener en cuenta las restricciones 
    lógicas y además que la nueva fecha sea válida. En caso contrario, el método
    set no hace nada.*/
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {

        if (comprobarFecha(anio, this.mes, this.dia)) {

            this.anio = anio;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {

        if (comprobarFecha(this.anio, mes, this.dia)) {

            this.mes = mes;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {

        if (comprobarFecha(this.anio, this.mes, dia)) {

            this.dia = dia;
        }
    }

//bisiesto(): indicará si el año almacenado en el atributo es bisiesto o no.
    
    public boolean bisiesto(){
        
        return LocalDate.of(this.anio, this.mes, this.dia).isLeapYear();
        
    }
    
//diasMes(): devolverá el número de días que tiene el mes de la fecha establecida.
    public int diasMes(){

        LocalDate hoy = LocalDate.of(this.anio, this.mes, this.dia);

        return hoy.lengthOfMonth();
    }

//mostrarFechaCorta(): mostrará la fecha en formato corto (02-09-2003).

    public String mostrarFechaCorta(){
        
     LocalDate hoy = LocalDate.of(this.anio, this.mes, this.dia);
    
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    
    return hoy.format(formato);  
    
    }

    /*mostrarFechaLarga(): mostrará la fecha en formato largo, empezando por el día de
    la semana (martes 2 de septiembre de 2003).*/

    public String mostrarFechaLarga(){
        
     LocalDate hoy = LocalDate.of(this.anio, this.mes, this.dia);
    
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'del' yyyy");
    
    return hoy.format(formato);  
    
    }
    
 /*diaSemana(): devolverá el día de la semana de la fecha (7 para domingo, 6 para 
    sábado, etc). El 1-1-1900 fue domingo.*/

    public int diaSemana(){
        
        LocalDate hoy = LocalDate.of(anio, mes, dia);
        
        DayOfWeek dayOfWeek = hoy.getDayOfWeek();
        
        return dayOfWeek.getValue();
        
    }
    
    
 /*diasEntreFechas(Fecha inicial, Fecha final): devolverá el número de días entre 
    ambas fechas. Este método es de clase.*//*
    public static int diasEntreFechas(Fecha inicial, Fecha final){
    
    LocalDate primera = LocalDate.of
    
}*/
    
//siguiente(): pasará al día siguiente.
    
    
//anterior(): pasará al día anterior.
    
    
//copia(): devolverá un objeto Fecha clonando la fecha almacenada en el objeto.
    
    
//igualQue(Fecha): indica si la fecha es la misma que la proporcionada.
    
    
//menorQue(Fecha): indica si la fecha es anterior a la proporcionada.
    
    
//mayorQue(Fecha): indica si la fecha es posterior a la proporcionada.
    @Override
    public String toString() {
        return "Fecha{" + "anio=" + anio + ", mes=" + mes + ", dia=" + dia + '}';
    }

}

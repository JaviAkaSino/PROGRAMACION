package ejercicio4;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author javiakasino
 */
public class Registro {
    
    @JsonProperty("fecha")
    private LocalDate fecha;
    @JsonProperty("estacionMeteorologica")
    private String estacionMeteorologica;
    @JsonProperty("provincia")
    private String provincia;
    @JsonProperty("precipitacion")
    private double precipitacion;

    public Registro() {
    }

    
    
    public Registro(LocalDate fecha, String estacionMeteorologica, String provincia, double precipitacion) {
        
        this.fecha = fecha;//LocalDate.of(fecha.get(0), fecha.get(1), fecha.get(2));
        this.estacionMeteorologica = estacionMeteorologica;
        this.provincia = provincia;
        this.precipitacion = precipitacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    

    public String getEstacionMeteorologica() {
        return estacionMeteorologica;
    }

    public void setEstacionMeteorologica(String estacionMeteorologica) {
        this.estacionMeteorologica = estacionMeteorologica;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getPrecipitacion() {
        return precipitacion;
    }

    public void setPrecipitacion(double precipitacion) {
        this.precipitacion = precipitacion;
    }

    @Override
    public String toString() {
        return "Registro{" + "fecha=" + fecha + ", estacionMeteorologica=" + estacionMeteorologica + ", provincia=" + provincia + ", precipitacion=" + precipitacion + '}';
    }

    
    
    
}

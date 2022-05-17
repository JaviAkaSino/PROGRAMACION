package ejercicio5;

import ejercicio4.Registro;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author javiakasino
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        ArrayList<Registro> registros = Metodos.leerRegistrosJSON("precipitacionesBadajoz.json");
        
        System.out.println(Metodos.precipitacionAcumulada(registros));
        
        
        /*(0,5 puntos) Usando API Stream, muestra por consola el resultado de 
        contar las estaciones meteorológicas que han sido leídas entre el 10 de 
        octubre de 2017 y el 20 de octubre de 2017, ambos días incluidos.*/
        
        long n = registros.stream()
                .filter(a->a.getFecha().isAfter(LocalDate.of(2017, 10, 9))&&a.getFecha().isBefore(LocalDate.of(2017, 10, 21)))
                .count();
        
        
        System.out.println("Nº estaciones leídas entre el 10 y el 20 de octubre de 2017: " + n);
        
        
        /*1 punto) Usando API Stream, calcula la media de precipitaciones de 
        aquellas estaciones meteorológicas leídas entre el 10 de octubre de 2017
        y el 20 de octubre de 2017, ambos días incluidos.
*/
        
         double total = registros.stream()
                .filter(a->a.getFecha().isAfter(LocalDate.of(2017, 10, 9))&&a.getFecha().isBefore(LocalDate.of(2017, 10, 21)))
                .map(a->a.getPrecipitacion())
                .reduce((acumulador,numero)-> {
                return acumulador+numero;
                }).get();
                
         
         System.out.println("Precipitaciones medias de dichas estacinoes: " + total/n);
                
        
    }
    
}

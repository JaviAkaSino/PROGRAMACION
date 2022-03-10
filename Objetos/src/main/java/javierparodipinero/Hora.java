package javierparodipinero;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author javiakasino
 */
/*17.  Crea una clase Hora con atributos para las horas, los minutos y los 
segundos. Incluye, al menos, los siguientes métodos:*/
public class Hora {

    private int horas, minutos, segundos;

    //Constructor predeterminado con el 00:00:00 como hora por defecto.
    public Hora() {

        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;

    }

    //Constructor parametrizado con horas, minutos y segundos.
    public Hora(int horas, int minutos, int segundos) {

        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;

        horaCorrecta();

    }

    /*horaCorrecta(): comprobará si la hora es correcta; si no lo es la ajustará
    a 12:00:00. Será un método privado que se usará en el constructor parametrizado.*/
    private void horaCorrecta() {

        try {

            LocalTime.of(horas, minutos, segundos);

        } catch (DateTimeException dte) {

            this.horas = 12;
            this.minutos = 0;
            this.segundos = 0;
        }

    }

    /*Métodos get y set. Los métodos set deben tener en cuenta las restricciones
    lógicas y además que la nueva hora sea válida. En caso contrario, el método 
    set no hace nada.*/
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {

        try {

            LocalTime.of(horas, minutos, segundos);

            this.horas = horas;

        } catch (DateTimeException dte) {

        }

    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {

        try {

            LocalTime.of(horas, minutos, segundos);

            this.minutos = minutos;

        } catch (DateTimeException dte) {

        }

    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {

        try {

            LocalTime.of(horas, minutos, segundos);

            this.segundos = segundos;

        } catch (DateTimeException dte) {

        }

    }

    //escribirHora(): mostrará la hora (ejemplo: 07:03:21).
    public void escribirHora() {

        LocalTime hora = LocalTime.of(horas, minutos, segundos);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(hora.format(formato));

    }

//segundosDesde(): devolverá el número de segundos transcurridos desde la medianoche.
    public static long secMidToNow() {
        long segundosTranscurridos;
        LocalTime medianoche = LocalTime.MIDNIGHT;
        LocalTime now = LocalTime.now();

        segundosTranscurridos = ChronoUnit.SECONDS.between(medianoche, now);

        return segundosTranscurridos;

    }

    public long secMidToHour() {
        long segundosTranscurridos;
        LocalTime medianoche = LocalTime.MIDNIGHT;
        LocalTime hora = LocalTime.of(this.horas, this.minutos, this.segundos);

        segundosTranscurridos = ChronoUnit.SECONDS.between(medianoche, hora);

        return segundosTranscurridos;

    }
//segundosHasta(): devolverá el número de segundos transcurridos hasta la medianoche.

    public static long secNowToMid() {
        long segundosTranscurridos;

        LocalDate maniana = LocalDate.now().plusDays(1);
        LocalTime mid = LocalTime.MIDNIGHT;

        LocalDateTime medianoche = LocalDateTime.of(maniana, mid);
        LocalDateTime now = LocalDateTime.now();

        segundosTranscurridos = ChronoUnit.SECONDS.between(now, medianoche);

        return segundosTranscurridos;

    }
//segundosEntreHoras(Hora h): devolverá el número de segundos entre la hora y el objeto Hora h.

    public long segundosEntreHoras(Hora h) {
        long segundosTranscurridos;

        LocalTime now = LocalTime.now();
        LocalTime hora = LocalTime.of(h.getHoras(), h.getMinutos(), h.getSegundos());
        segundosTranscurridos = ChronoUnit.SECONDS.between(now, hora);

        return segundosTranscurridos;
    }

//siguiente(): pasará al segundo siguiente.
    public void siguiente() {

        LocalTime.of(horas, minutos, segundos).plusSeconds(1);

    }
//anterior(): pasará al segundo anterior.

    public void anterior() {

        LocalTime.of(horas, minutos, segundos).minusSeconds(1);

    }
//copia(Hora h): devolverá un clon de la hora. Este método es de clase.

    public static Hora copia(Hora h) {
        Hora copia = new Hora();

        copia = h;

        return copia;
    }
//igualQue(Hora h): indica si la hora es la misma que la proporcionada.

    public void igualQue(Hora h) {

        LocalTime hora = LocalTime.of(h.horas, h.minutos);
        LocalTime now = LocalTime.now();

        boolean igualQue = hora.equals(now);

        if (igualQue) {
            System.out.println("La hora es la misma");

        } else {
            System.out.println("La hora no es la misma");
        }

    }
//menorQue(Hora h): indica si la hora es anterior a la proporcionada.

    public void menorQue(Hora h) {
        
        LocalTime hora = LocalTime.of(h.horas, h.minutos);
        LocalTime now = LocalTime.now();

        boolean menorQue = now.isBefore(hora);

        if (menorQue) {
            System.out.println("La hora proporcionada es anterior");

        } else {
            System.out.println("La hora proporcionada es posterior");
        }
    }

//mayorQue(Hora h): indica si la hora es posterior a la proporcionada.
    public void mayorQue(Hora h) {
        LocalTime hora = LocalTime.of(h.horas, h.minutos);
        LocalTime now = LocalTime.now();

        boolean mayorQue = now.isAfter(hora);

        if (mayorQue) {
            System.out.println("La hora proporcionada es posterior");

        } else {
            System.out.println("La hora proporcionada es anterior");
        }
    }

}

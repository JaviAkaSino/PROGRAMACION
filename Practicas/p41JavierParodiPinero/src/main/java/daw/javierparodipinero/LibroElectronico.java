package daw.javierparodipinero;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author javiakasino
 */
public class LibroElectronico {
    
    /*Los modificadores de acceso public y private sirven para definir dónde 
    será visible el atributo o método. En el caso del public, será visible en 
    cualquier clase. En caso del private, sólo será visible dentro de la clase 
    donde se define*/

    private String identificador, titulo;
    private int paginasTotales, paginaActual;
    private double megas;
   
    //Constructor por defecto
    public LibroElectronico() {

        this.identificador = RandomStringUtils.randomNumeric(3);
        this.titulo = "Don Quijote de la Mancha";
        this.paginasTotales = 1435;
        this.paginaActual = 1;
        this.megas = 5;
    }

    //Constructor parametrizado
    //No incluye parámetro identificador, ya que se crea de forma aleatoria
    //Igual con paginaActual, ya que cada nuevo libro empieza por la página 1
    public LibroElectronico(String titulo, int paginas, double megas) {
        this.identificador = RandomStringUtils.randomNumeric(3);

        this.titulo = titulo;

        /*Restricción de páginas: mayores de 9999 pasan a 0; y menores de 0,
        también, ya que no puede haber libros con páginas negativas*/
        this.paginasTotales = paginas;
        if (paginas > 9999 || paginas < 0) {

            this.paginasTotales = 0;
        }

        this.paginaActual = 1;

        //Si el tamaño en megas es mayor que 10, se pone a 0; si es negativo, también
        this.megas = megas;
        if (megas > 10 || megas < 0) {

            this.megas = 0;
        }
    }

    //Métodos getter, que reciben el valor de cada atributo
    public String getIdentificador() {
        return identificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginasTotales() {
        return paginasTotales;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    public double getMegas() {
        return megas;
    }

    //Métodos setter, que modifican los valores de los atributos
    //No incluimos setter de paginaActual, ya que no tiene sentido teniendo los
    //métodos que incluimos después
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPaginasTotales(int paginasTotales) {
        this.paginasTotales = paginasTotales;

        if (paginasTotales > 9999 || paginasTotales < 0) {

            this.paginasTotales = 0;
        }
    }

    public void setMegas(int megas) {
        this.megas = megas;

        if (megas > 10 || megas < 0) {

            this.megas = 0;
        }

    }

    //Método para pasar 1 página
    //Solo pasa si la página actual es menor que las totales, ya que si fuera igual
    //o superior, la página resultante no sería válida (no existiría)
    public void pasarPagina() {

        if (this.paginaActual < this.paginasTotales) {

            this.paginaActual++;

        }

    }
    
    //Método para retroceder 1 página
    //Sólo si la página actual es mayor a 1, ya que si fuera 1 o menor iría a 
    //la página 0 o negativas (inexistentes)
    public void retrocederPagina() {

        if (this.paginaActual > 1) {

            this.paginaActual--;

        }

    }
    
    //Método para saltar x páginas.
    //Si el valor es menor que 1 o mayor que el número total de páginas
    //Se revierte la operación para que no quede realizada
    //Condición para revertir por visibilidad (la condición con la suma sería muy larga)
    public void saltar(int paginasSaltar){
 
        this.paginaActual += paginasSaltar;
        
        if (this.paginaActual < 1 || this.paginaActual > this.paginasTotales){
            
            this.paginaActual -= paginasSaltar;
        } 
        
        
    }

    //Metodo toString, muestra los valores de los atributos
    //En este caso, está modificado por estética  y legibilidad
    @Override
    public String toString() {
        return "LIBRO: " + "\nIdentificador: " + identificador + "\nTítulo: " + titulo + "\nPáginas: " + paginasTotales + "\nPágina actual: " + paginaActual + "\nTamaño en MB: " + megas;
    }

}

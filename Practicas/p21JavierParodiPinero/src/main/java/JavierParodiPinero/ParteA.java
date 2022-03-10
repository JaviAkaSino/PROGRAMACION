//Nombre del paquete
package JavierParodiPinero;

//Imports, en este caso Scanner
import java.util.Scanner;

//Declaración de clase
public class ParteA {

    //Método main
    public static void main(String[] args) {

 /*Declaramos e inicializamos las constantes de las horas que tiene 
        cada máster y las horas que puede tener cada profesor*/
 
        final int HORAS_POR_MASTER = 975;
        final int HORAS_POR_PROFESOR = 150;

        /*Declaramos otra constante dividiendo para saber cuántos 
        profesores hacen falta para un máster, redondeando al alza;
        ya que el resultado ha de ser entero por causas evidentes
        y con la parte truncada no sería suficiente.
        Añadimos double dentro de los paréntesis para que la división
        dé los decimales, ya que al ser dos int no los daría y 
        perderíamos información necesaria.*/
     
        final double PROFESORES_POR_MASTER
                = Math.ceil((double) HORAS_POR_MASTER / HORAS_POR_PROFESOR);

        //Declaramos y construimos Scanner
        
        Scanner teclado = new Scanner(System.in);

        /*Una vez sabemos la proporción profesores/master (en este caso 7,
        ya que 975/150 = 6,5); lanzamos la pregunta mediante System out
        y recogemos la respuesta en nueva variable*/
        
        System.out.println("¿A cuántos grupos de máster se les va a"
                + " dar clase?");

        int numeroDeMaster = teclado.nextInt();

        /*Multiplicamos el número de master por el número de profesores
        necesarios para cada uno y lanzamos la respuesta con sout.
        La nueva variable debe ser double ya que profesoresPorMaster
        también lo es*/
        //Utilizo printf para que no se vea el decimal 0 en consola.
        
        double numeroDeProfesores = PROFESORES_POR_MASTER * numeroDeMaster;

        System.out.printf("El número de profesores necesarios para "
                + numeroDeMaster + " grupos de máster es %.0f",
                numeroDeProfesores);

        /*Se podría multiplicar primero el número de máster por el
        número de horas y despues dividir entre las horas/profesor y el
        resultado sería más exacto matemáticamente hablando, pero he
        considerado que era mejor así, ya que podría darse el caso de que un
        profesor no pudiera dar una clase entera y la tuviera que hacer
        de 40 minutos, por ejemplo. En el apartado B lo hago de la otra forma
         */
    }

}

//Nombre del paquete
package JavierParodiPinero;

//Imports, en este caso JOptionPane
import javax.swing.JOptionPane;

//Declaración de clase
public class ParteB {

    //Método main
    public static void main(String[] args) {

        /*Declaramos e inicializamos la constante de las horas que 
        puede tener cada profesor*/

        final int HORAS_POR_PROFESOR = 150;

        /*Leemos los datos con JOption sobre el numero de máster y las horas 
        que tiene cada uno y los recogemos en variables.
        Recordamos que JOption recoge siempre String*/
        
        String masterTexto = JOptionPane.showInputDialog("¿A cuántos grupos "
                + "de máster se les va a dar clase?");
        
        String horasMasterTexto = JOptionPane.showInputDialog("¿Cuántas "
                + "horas anuales tiene cada máster?");
        
        /*Pasamos a double las respuestas en nuevas variables con parse
        para poder operar con ellas
        Para int es Integer.parseInt()*/
        
        
        double numeroDeMasterD = Double.parseDouble(masterTexto);
        double horasPorMasterD = Double.parseDouble(horasMasterTexto);
        
        //Operamos multiplicando el nº de máster por las horas
        
        double horasTotales = numeroDeMasterD * horasPorMasterD;
        
        //Y dividimos el total entre las horas/profesor, redondeando al alza
        
        double profesoresD = Math.ceil(horasTotales / HORAS_POR_PROFESOR);
        
        //Pasamos variables double a nuevas int para qutiar el ,0 en ventana
        
        int profesores = (int) profesoresD;
        int numeroDeMaster = (int) numeroDeMasterD;
        int horasPorMaster = (int) horasPorMasterD;
        
        //Mostramos el resultado en ventana con JOption
        
        JOptionPane.showMessageDialog(null, "El número de profesores "
                + "necesarios para " + numeroDeMaster + " máster de " +
                horasPorMaster + " horas, es " + profesores);
        
       

    }

}

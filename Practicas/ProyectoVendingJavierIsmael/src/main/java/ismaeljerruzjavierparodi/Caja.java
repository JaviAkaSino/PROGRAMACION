package ismaeljerruzjavierparodi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Caja {

    //Atributos cantidad y valor de cada tipo de moneda/billete
    //Por simplicidad, llamaremos monedas tanto a éstas como los billetes
    private int[] cantidadMonedas = new int[9];
    private String[] valorDeCadaMoneda = {"20€", "10€", "5€", "2€", "1€", "0.50€", "0.20€", "0.10€", "0.05€", "FIN"};
    private int acumuladoTarjeta;
    
    private static ArrayList<String> registroCaja = new ArrayList<>();
    private static boolean bucle;

    private static final int[] VALOR_MONEDAS = new int[]{2000, 1000, 500, 200, 100, 50, 20, 10, 5};

    //CONSTRUCTOR POR DEFECTO
    public Caja() {
        //10 monedas de cada tipo
        this.cantidadMonedas = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10};
        this.acumuladoTarjeta = 0;

    }

    //CONSTRUCTOR PARAMETRIZADO
    public Caja(int[] cantidadMonedas) { //Entra la cantidad

        this.cantidadMonedas = cantidadMonedas;
        this.acumuladoTarjeta = 0;
    }

    public int totalEfectivoCaja() { //Indica el total de efectivo de la caja en céntimos

        int totalEfectivo = Utilidades.sumatorioArray(Utilidades.multiplicarArrays(cantidadMonedas, VALOR_MONEDAS));

        return totalEfectivo;
    }

    public int valorTotalEntrada(int[] entradaMonedas) { //Dada una entrada de monedas, calcula el total

        int cantidadPagada = Utilidades.sumatorioArray(Utilidades.multiplicarArrays(entradaMonedas, VALOR_MONEDAS));

        return cantidadPagada;
    }

    /*Recoge las monedas que introduce el cliente y el precio del artículo,
    busca la mejor forma de dar el cambio, y actualiza la caja*/
    public int[] cambio(int[] entradaMonedas, int precio) {

        int[] salidaMonedas = new int[9]; //Almacenará las monedas que devuelve la máquina

        int cantidadPagada = valorTotalEntrada(entradaMonedas); //Total pagado = Sumatorio(moneda*valor)

        cantidadMonedas = Utilidades.sumarArrays(cantidadMonedas, entradaMonedas); //Total monedas de cada tipo con las introducidas

        int dineroSobrante = cantidadPagada - precio; //Lo que habrá que dar de cambio

        if (dineroSobrante > 0) {

            /*Bucle para recorrer el valor de todas las monedas, desde la más grande,
        buscando dar el cambio con el menor número de monedas posible.
        En caso de falta de esa moneda en la máquina, pasa al siguiente*/
            for (int i = 0; i < 9 && dineroSobrante != 0; i++) {

                salidaMonedas[i] = dineroSobrante / VALOR_MONEDAS[i]; //Dado un sobrante, cuantas monedas de un tipo pueden darse sin sobrepasar

                if (1 <= salidaMonedas[i]) { //Si al menos se le puede devolver una moneda

                    if (salidaMonedas[i] <= cantidadMonedas[i]) { //Si hay monedas suficientes para esa cantidad

                        dineroSobrante = dineroSobrante % VALOR_MONEDAS[i]; //El dinero sobrante será el resto

                        cantidadMonedas[i] = cantidadMonedas[i] - salidaMonedas[i]; //Se actualiza la cantidad de esa moneda

                    } else { //Si deben salir X monedas pero hay menos                  

                        salidaMonedas[i] -= cantidadMonedas[i]; //Salen las que hay

                        salidaMonedas[i] = 0;

                        dineroSobrante -= salidaMonedas[i] * VALOR_MONEDAS[i]; //Se actualiza el sobrante

                        cantidadMonedas[i] = 0; //Se actualiza a 0 la cantidad de esa moneda

                    }
                }
            }

            if (dineroSobrante != 0) { //Si sigue habiendo dinero sobrante, significa que no hay cambio suficiente en la máquina

                salidaMonedas[0] = -1; //Se pone a -1 para indicar falta de cambio (se detectará en el switch)           
            }

        } else if (dineroSobrante == 0) { //Si el precio es justo, no pasa por el bucle

            Arrays.fill(salidaMonedas, 0); //Directamente se pone a 0 todo el array

        } else { //Si el sobrante es negativo, quiere decir que el saldo introducido es insuficiente

            salidaMonedas[0] = -2; //Se pone a -2 para indicar falta de efectivo introducido

        }

        return salidaMonedas;
    }

    
    //MÉTODO COBRAR CON TARJETA
    public void cobrarTarjeta(int precioVenta){
        
        this.acumuladoTarjeta += precioVenta;
        
    }
    
    //MÉTODO CONSULTAR ACUMULADO TARJETA
    public void consultarAcumuladoTarjeta(){
        JOptionPane.showMessageDialog(null, "La cantidad recaudada mediante tarjetas es es: \n"
                + Utilidades.centimosAEuro(acumuladoTarjeta) + " €");
    }

    public double getValorEuros(int centimos) { //Utilizado en toString 

        double precioEuros = (double) centimos / 100;

        return precioEuros;
    }

    //GETTERS
    public int[] getCantidadMonedas() {
        return cantidadMonedas;
    }

    public int[] getVALOR_MONEDAS() {
        return VALOR_MONEDAS;
    }

    //SETTERS
    public void setCantidadMonedas(int[] cantidadMonedas) {
        this.cantidadMonedas = cantidadMonedas;
    }

    //método vaciar caja
    public void vaciarEfectivo() {
        JOptionPane.showMessageDialog(null, "Ha extraído " + Utilidades.centimosAEuro(totalEfectivoCaja()) + " €");
        this.cantidadMonedas = new int[9];
        registroCaja.add("Caja vaciada el "+LocalDate.now().toString());
        System.out.println(registroCaja.toString());
    }

    //añadir monedas. suma 1 al índice i
    public void anadirMoneda() {
        do {
            bucle = true;
            int i = JOptionPane.showOptionDialog(null, "Introduzca las monedas", "Opciones administrador", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, valorDeCadaMoneda, valorDeCadaMoneda[0]);
            if (i != 9) {
                this.cantidadMonedas[i]++;
            } else {
                bucle = false;
            }
        } while (bucle);
        registroCaja.add("Efectivo añadido el "+LocalDate.now().toString());
        System.out.println(registroCaja.toString());
    }

    //consultar efectivo
    public void consultarEfectivo() {
        JOptionPane.showMessageDialog(null, "La cantidad de efectivo disponible es: \n"
                + "\n-Billetes de 20€: " + this.getCantidadMonedas()[0]
                + "\n-Billetes de 10€: " + this.getCantidadMonedas()[1]
                + "\n-Billetes de 5€: " + this.getCantidadMonedas()[2]
                + "\n-Monedas de 2€: " + this.getCantidadMonedas()[3]
                + "\n-Monedas de 1€: " + this.getCantidadMonedas()[4]
                + "\n-Monedas de 0.50€: " + this.getCantidadMonedas()[5]
                + "\n-Monedas de 0.20€: " + this.getCantidadMonedas()[6]
                + "\n-Monedas de 0.10€: " + this.getCantidadMonedas()[7]
                + "\n-Monedas de 0.05€: " + this.getCantidadMonedas()[8]
                + "\n\n-TOTAL: " + Utilidades.centimosAEuro(totalEfectivoCaja()) + "€");

    }

    //TO STRING MODIFICADO POR VISIBILIDAD
    @Override
    public String toString() {

        String monedas = "";

        for (int i = 0; i < 9; i++) {

            monedas += "\n" + getValorEuros(VALOR_MONEDAS[i]) + "€: " + this.cantidadMonedas[i];
        }
        return monedas;
    }

}

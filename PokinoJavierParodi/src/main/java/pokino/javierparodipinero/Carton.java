package pokino.javierparodipinero;

import java.util.Arrays;

/**
 *
 * @author JaviA
 */
public class Carton {

    private Carta[][] carton;

    private static int contador = 1;

    public Carton() {

        if (contador <= 12) { //Se limita a 12 cartones

            this.carton = new Carta[5][5];
        }

    }

    public void llenarPoker(Baraja b) {

        for (int i = 0; i < 4; i++) { //Coge las 4 cartas de un valor

            this.carton[0][i] = b.cartaPorNumero(contador); //Y llena la 1ª fila
        }

        this.carton[0][4] = b.cartaAleatoria();
    }
    
    
    public void llenarFull(){
        
        
    }

    public void imprimirCarton() {

        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {

                System.out.print(carton[i][j] + "\t");
            }

            System.out.println("");
        }
        System.out.println("");
    }

    public Carta[][] getCarton() {
        return carton;
    }

    @Override
    public String toString() {
        return "Carton{" + "carton=" + Arrays.toString(carton) + '}';
    }

}

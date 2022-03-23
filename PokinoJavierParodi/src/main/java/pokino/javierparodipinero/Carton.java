package pokino.javierparodipinero;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author JaviA
 */
public final class Carton {

    private Carta[][] carton;

    private static int contador = 1;

    public Carton() {

        if (contador <= 12) { //Se limita a 12 cartones

            this.carton = new Carta[5][5];

            Baraja baraja = new Baraja();
            baraja.barajar();

            llenarPoker(baraja);
            llenarFull(baraja);

            contador++;
        }

    }

    public void llenarPoker(Baraja b) {

        for (int i = 0; i < 4; i++) { //Coge las 4 cartas de un valor

            this.carton[0][i] = b.cartaPorNumero(contador); //Y llena la 1ª fila
        }

        this.carton[0][4] = b.cartaAleatoria();

        desordenarFila(0);
    }

    public void llenarFull(Baraja b) {

        //Controla que el valor de la pareja no sea el del Póker
        int pareja = Utilidades.numeroAleatorioEntreExcepto(1, 12, contador); //Establece el valor de la pareja

        //Controla que el valor de la pareja no sea el del Póker ni el de la pareja
        int trio = Utilidades.numeroAleatorioEntreExcepto2(1, 12, contador, pareja); //Establece el valor del trío

        for (int i = 0; i < 2; i++) { //Rellena la fila con la pareja

            this.carton[1][i] = b.cartaPorNumero(pareja);
        }

        for (int i = 2; i < 5; i++) { //Y con el trío

            this.carton[1][i] = b.cartaPorNumero(trio);
        }
        
        desordenarFila(1); //Y los desordena

    }

    
    //HACER EL CENTRO 
    
    
    //RELLENAR EL RESTO DEL CARTON
    
    

    //Desordena la fila
    public void desordenarFila(int fila) {

        ArrayList<Carta> aux = new ArrayList(); //Crea una lista auxiliar

        int posicionAleatoria;
                
        for (int i = 0; i < 5; i++) { //Guarda la fila entera en aux

            aux.add(this.carton[fila][i]);
        }

        for (int i = 0; i < 5; i++) { //Devuelve las cartas al cartón en orden aleatorio

            posicionAleatoria = Utilidades.numeroAleatorioEntre(0, aux.size() - 1);
            
            this.carton[fila][i] = aux.get(posicionAleatoria); //Coge carta aleatoria
            
            aux.remove(posicionAleatoria); //Copia a cartón y borra de aux (para que no se repitan)
        }

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

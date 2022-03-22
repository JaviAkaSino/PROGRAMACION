package pokino.javierparodipinero;

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

        //Desordena la fila
    }

    public void llenarFull(Baraja b) {

        int pareja = Utilidades.numeroAleatorioEntre(contador + 1, 12); //Establece el valor de la pareja

        int trio = Utilidades.numeroAleatorioEntreExcepto(contador + 1, 12, pareja); //Establece el valor del trío

        for (int i = 0; i < 2; i++) { //Rellenam la fila con la pareja

            this.carton[1][i] = b.cartaPorNumero(pareja);
        }

        for (int i = 2; i < 5; i++) { //Y con el trío

            this.carton[1][i] = b.cartaPorNumero(trio);
        }

        //Desordena la fila
    }
    
    
//    public void desordenaFila(int fila){
//        
//          
//        this.carton[fila];
//        
//          final int VECES = 100;
//
//        for (int i = 0; i < VECES; i++) {
//
//            this.baraja.add(this.cartaAleatoria());  
//            
//        }
//        
//        
//        int posicion = Utilidades.numeroAleatorioEntre(0, (this.carton[fila].length - 1));
//
//        Carta carta = this.baraja.get(posicion); //Copia la carta de la baraja
//
//        this.baraja.remove(posicion); //Borra la carta de la lista
//          
//    }

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

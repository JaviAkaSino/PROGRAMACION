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
    private static Baraja barajaCentro = new Baraja();

    public Carton() {

        if (contador <= 12) { //Se limita a 12 cartones

            this.carton = new Carta[5][5];

            Baraja baraja = new Baraja();
            baraja.barajar();

            llenarPoker(baraja);
            llenarFull(baraja);
            llenarCentro(baraja);
            llenarResto(baraja);

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
    public void llenarCentro(Baraja barajaCarton) { //Se pasa la baraja que usa el carton

        Carta candidata = barajaCentro.cartaAleatoria(); //Saca carta random

        if (cartaEnBaraja(barajaCarton, candidata)) {//Si la carta está aún en la baraja, no está en el cartón

            this.carton[2][2] = candidata; //Se pone en el centro

            //En la baraja del carton, se borra la carta puesta en el centro
            barajaCarton.getBaraja().remove(candidata);

        } else { //Si ya está en el cartón, la devolvemos y sacamos otra

            barajaCentro.getBaraja().add(candidata);//Devolvemos carta

            llenarCentro(barajaCarton); //Llamada recursiva

        }

    }

    //Coge una baraja y dice si la carta esta en ella aun
    public boolean cartaEnBaraja(Baraja b, Carta c) {

        return b.getBaraja().contains(c);
    }

    //RELLENAR EL RESTO DEL CARTON
    public void llenarResto(Baraja b) {

        for (int i = 2; i < carton.length; i++) { //Se salta las dos priemeras filas
            for (int j = 0; j < carton[i].length; j++) {

                if (!(i == 2 && j == 2)) { //Si no es la casilla central (ya llena)

                    this.carton[i][j] = b.cartaAleatoria();
                }
            }
        }
    }
    
    
    public void desmarcarCarton(){
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                
                this.carton[i][j].setCantada(false);
                
            }
        }
    }
    

    public boolean marcarCarta(Carta carta) { //Recorre el cartón entero

        for (int i = 0; i < this.carton.length; i++) {
            for (int j = 0; j < this.carton[i].length; j++) {

                if (this.carton[i][j].equals(carta)) { //Si la carta está

                    this.carton[i][j].setCantada(true); //La marca como cantada

                    return true; //Y devuelve true
                }

            }
        }

        return false; //Si no, devuelve false para no comprobar nuevos premios
    }

    public String posicionMarcada(Carta carta) { //Recorre el cartón entero

        for (int i = 0; i < this.carton.length; i++) {
            for (int j = 0; j < this.carton[i].length; j++) {

                if (this.carton[i][j].equals(carta)) { //Si la carta está

                    this.carton[i][j].setCantada(true); //La marca como cantada

                    return i + "-" + j;
                }

            }
        }

        return "";
    }

    public boolean comprobarCentro() { //Si ha tocado el centro, devuelve true

        if (this.carton[2][2].isCantada()) {

            return true;

        }

        return false;
    }

    public boolean comprobarEsquina() { //Si ha tocado la esquina, devuelve true

        if (this.carton[0][0].isCantada() && this.carton[0][4].isCantada()
                && this.carton[4][0].isCantada() && this.carton[4][4].isCantada()) {

            return true;

        }

        return false;
    }

    //ESTAMPA
    public boolean comprobarEstampa() {

        if (recorrerVecinas(0, 0) || recorrerVecinas(0, 4)
                || //Si una de las estampas está en true
                recorrerVecinas(4, 0) || recorrerVecinas(4, 4)) {

            return true; //Devuelve true
        }
        return false; //Si no, devuelve false
    }

    public boolean recorrerVecinas(int i, int j) {
        //Va de una posición antes a una después en la fila y en la columna, recorriendo las vecinas
        for (int k = (i - 1); k <= (i + 1); k++) {
            for (int l = (j - 1); l <= (j + 1); l++) {

                //Sólo cuenta los valores que están dentro de la matriz
                //En este caso, como pasaremos las posiciones de la esquina,
                //Cogerá la estampa
                if (0 <= k && k < this.carton.length && 0 <= l && l < this.carton[0].length) {

                    if (!this.carton[k][l].isCantada()) { //Si alguna de las cartas no está cantada

                        return false; //Devuelve falso
                    }
                }

            }

        }
        return true; //Si todas están a true, devuelve true
    }

    //POKER
    public boolean comprobarPoker() {

        for (int i = 0; i < 5; i++) { //Recorre todas las cartas de la primera fila

            //Si el valor de la carta mirada es el del Poker
            if (this.carton[0][i].getValor().equals(cartaPoker().getValor())
                    && !this.carton[0][i].isCantada()) { //Y no está cantada

                return false; //No es Póker
            }

            //Si el valor de la carta es la que no es del Póker
            if (!this.carton[0][i].getValor().equals(cartaPoker().getValor())
                    && this.carton[0][i].isCantada()) { //Y está cantada

                return false; //Tampoco hay póker
            }
        }

        return true; //Si no hay ningún false, es Poker
    }

    public Carta cartaPoker() {

        int iguales = 0;

        for (int i = 0; i < 5; i++) { //Recorre las 5 cartas

            if (this.carton[0][0].getValor().equals(this.carton[0][i].getValor())) {

                iguales++; //Si hay valores iguales que la 1ª, se suma 1

                if (iguales > 1) //Si hay mas de uno, el valor es el de la 1ª
                {
                    return this.carton[0][0];
                }
            }

        }

        return this.carton[0][1]; //Si no, es cualquier otra
    }

    //FULL
    public boolean comprobarFull() {

        for (int i = 0; i < 5; i++) {

            if (!this.carton[1][i].isCantada()) { //Si alguna del full no está marcada

                return false; //No hay full
            }

        } //Si todas los están, true
        return true;
    }

    //POKINO
    public boolean comprobarPokino(int k, int l) {

        boolean pokino = (comprobarFila(k) || comprobarColumna(l)
                || comprobarDiagonalCeroCero() || comprobarDiagonalCuatroCero());

        return pokino;
    }

    public boolean comprobarFila(int k) {

        if (k == 1) { //Si la fila es la del full, no es pokino
            return false;
        }

        //Comprobar fila
        for (int j = 0; j < 5; j++) {

            if (!this.carton[k][j].isCantada()) { //Si alguna no está cantada, variable a false

                return false;
            }

        }
        return true; //Si estám todas cantadas, es pokino
    }

    public boolean comprobarColumna(int l) {
        //Recorre la columna
        for (int i = 0; i < 5; i++) {

            if (!this.carton[i][l].isCantada()) { //Si alguna no está cantada, variable a false

                return false;

            }
        }
        return true; //Si están todas cantadas, es pokino
    }

    public boolean comprobarDiagonalCeroCero() {
        //Recorre las diagonales si la central está marcada
        if (this.carton[2][2].isCantada()) {

            for (int i = 0; i < 5; i++) { //Diagonal de [0][0] a [4][4]

                if (!this.carton[i][i].isCantada()) { //Si alguna no está cantada, variable a false

                    return false;
                }

            }
            return true; //Si están todas cantadas, es pokino
        }

        return false; //Si no está marcada la central, no hay diagonal
    }

    public boolean comprobarDiagonalCuatroCero() {
        //Recorre las diagonales si la central está marcada
        if (this.carton[2][2].isCantada()) {

            int j = 0;

            for (int i = 4; i >= 0; i--) { //Diagonal de [4][0] a [0][4]

                if (!this.carton[i][j++].isCantada()) { //Si alguna no está cantada, variable a false

                    return false;
                }

            }
            return true; //Si están todas cantadas, es pokino
        }

        return false; //Si no está marcada la central, no hay diagonal
    }

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

                System.out.print((carton[i][j] + "\t"));

                if (carton[i][j].toString().length() < 16) { //Estética
                    System.out.print("\t");
                }
            }

            System.out.println("\n");
        }
    }

    public Carta[][] getCarton() {
        return carton;
    }

    public String cartonString() {

        String s = "";

        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {

                s += carton[i][j] + "\t";
            }

            s += "\n";
        }
        s += "\n";

        return s;
    }

    @Override
    public String toString() {
        return cartonString();
    }

}

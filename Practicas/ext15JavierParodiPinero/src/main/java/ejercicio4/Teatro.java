package ejercicio4;

/**
 *
 * @author javiakasino
 */
public final class Teatro {

    private char[][] teatro;

    //Crea un teeatro vacío de n x m filas
    public Teatro(int n, int m) {
        this.teatro = new char[n][m];

        teatroVacio(); //Y lo deja preparado para las reservas
    }

    public void teatroVacio() {

        //Pone todas las plazas libres
        for (int i = 0; i < teatro.length; i++) {
            for (int j = 0; j < teatro[i].length; j++) {

                //i+1 es el numero de fila y j+1 el de columna (evitar fila 0)
                //Si ambos son impares pares se pone la plaza libre
                if ((i + 1) % 2 != 0 && (j + 1) % 2 != 0) {

                    teatro[i][j] = 'L';

                } else { //Si no, se reserva por covid

                    teatro[i][j] = 'X';
                }
            }
        }
    }

    //Si está lobre la reserva y devuelve true; si no, devuelve false
    public boolean reservarPlaza(int fila, int columna) {

        boolean reserva = false; //Si no está libre, se devuelve false

        if (this.teatro[fila - 1][columna - 1] == 'L') { //Si está libre

            this.teatro[fila - 1][columna - 1] = 'V'; //Pasa a vendido

            reserva = true; //Reserva efectiva
        }
        return reserva;
    }

    public boolean cancelarPlaza(int fila, int columna) {

        boolean reserva = false; //Si no está reservada, se devuelve false

        if (this.teatro[fila - 1][columna - 1] == 'V') { //Si está vendido

            this.teatro[fila - 1][columna - 1] = 'L'; //Pasa a libre

            reserva = true; //Cancelación efectiva
        }
        return reserva;
    }

    public void imprimirMatrizInt() {

        for (int i = 0; i < this.teatro.length; i++) {
            for (int j = 0; j < this.teatro[i].length; j++) {

                System.out.print(this.teatro[i][j] + "\t");
            }

            System.out.println("");
        }
        System.out.println("");
    }

}

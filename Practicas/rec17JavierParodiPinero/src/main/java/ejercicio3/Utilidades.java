package ejercicio3;

public class Utilidades {

    public static void imprimirMatrizStr(String[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println("");
        }
        System.out.println("");
    }

    public static void buscarIslas(String[][] matriz) {

        for (int i = 0; i < matriz.length; i++) { //Recorre la matriz
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j].equals("x")) { //Si es tierra, comprueba

                    if (esIsla(i, j, matriz)) { //Si es isla

                        System.out.println(i + ", " + j);

                    }

                }
            }
        }
    }

    public static boolean esIsla(int i, int j, String[][] matriz) {
        //Va de una posición antes a una después en la fila y en la columna
        for (int k = (i - 1); k <= (i + 1); k++) {
            for (int l = (j - 1); l <= (j + 1); l++) {

                if (!(k == i && l == j)) { //Descarta el valor de la posición en sí

                    //Sólo cuenta los valores que están dentro de la matriz
                    if (0 <= k && k < matriz.length && 0 <= l && l < matriz[0].length) {

                        if (matriz[k][l].equals("x")) {//Si alguna es tierra

                            return false;
                        }
                    }
                }
            }
        }
        
        return true; //Si no encuentra tierra, es isla
    }

}

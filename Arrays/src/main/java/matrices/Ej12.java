package matrices;

/**
 *
 * @author javiakasino
 */
public class Ej12 {

    /*Declara e inicializa una matriz de caracteres de 2x3, con los valores que 
    tú quieras. Implementa un método, en la misma clase que el método main(), que
    reciba una matriz de caracteres y la imprima por consola.*/
    public static void main(String[] args) {

        char[][] matriz = {{'1', '2', '3'}, {'a', 'b', 'c'}};

        imprimirMatrizChar(matriz);
    }

    public static void imprimirMatrizChar(char[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.println("Matriz[" + i + "]" + "[" + j + "] = " + matriz[i][j]);

            }
        }

    }

}

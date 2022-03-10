/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

/**
 *
 * @author JaviA
 */
public class Ej14 {

    public static void main(String[] args) {

        /*Escribe un programa que dada una matriz de 3x3 enteros y realice las 
        siguientes funciones:*/
        int[][] matriz = new int[3][3];
        final int MIN = 1, MAX = 100;

        //Rellenar aleatoriamente todas las casillas de la matriz con números 
        //enteros entre 1 y 100
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = Utilidades.numeroAleatorioEntre(MIN, MAX);
            }
        }

        //Calcular la media de todos los valores
        int total = matriz.length * matriz[0].length; //El total de números será FILAS*COLUMNAS        
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                suma += matriz[i][j];
            }
        }

        double media = (double) (suma / total);

        //Calcular el valor mínimo y el máximo de todos los valores
        int minimo = matriz[0][0];
        int maximo = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (minimo > matriz[i][j]) {

                    minimo = matriz[i][j];
                }

                if (maximo < matriz[i][j]) {

                    maximo = matriz[i][j];
                }
            }
        }
        
        
        Utilidades.imprimirMatrizInt(matriz);
        
        System.out.println("El valor mínimo es " + minimo +"\n");
        System.out.println("El valor máximo es " + maximo + "\n");
        System.out.println("La media es " + media + "\n");

        Utilidades.recorrerFila(2, matriz);
        
        Utilidades.recorrerColumna(1, matriz);

        System.out.println("Vecinos 0, 0");
        Utilidades.recorrerVecinas(0, 0, matriz);
        
        System.out.println("Vecinos 0, 2");
        Utilidades.recorrerVecinas(0, 2, matriz);
        
        System.out.println("Vecinos 2, 0");
        Utilidades.recorrerVecinas(2, 0, matriz);
        
        System.out.println("Vecinos 2, 2");
        Utilidades.recorrerVecinas(2, 2, matriz);
        
        System.out.println("Vecinos 1, 1");
        Utilidades.recorrerVecinas(1, 1, matriz);
        
        System.out.println("Vecinos -1, 1");
        Utilidades.recorrerVecinas(-1, 1, matriz);
        
    }

    
   
    
    
    public static void imprimirMatrizInt(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.println("Matriz[" + i + "]" + "[" + j + "] = " + matriz[i][j]);

            }
        }

    }

}

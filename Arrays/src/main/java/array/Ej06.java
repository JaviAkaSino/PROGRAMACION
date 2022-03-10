package array;

import java.util.Arrays;

/**
 *
 * @author javiakasino
 */
public class Ej06 {

    public static void main(String[] args) {

        /*Hacer un programa que determine si dos arrays son iguales. Probarlo con 
    los arrays [1,2,3] y [1,2,3], [1,2,3,4] y [1,2,3] , [1,2,3] y [1,2,2]. Este 
    ejercicio hay que hacerlo de dos formas: la primera, usando la clase Arrays;
    la segunda, creando un método que vaya comparando los valores de los arrays 
    y devuelva true si todos son iguales o false en caso contrario.*/
    
    
    int [] array1 = new int [] {1,2,3};
    int [] array2 = new int [] {1,2,3,4};
    int [] array3 = new int [] {1,2,3};
    int [] array4 = new int [] {1,2,3};
    int [] array5 = new int [] {1,2,2};
    
        System.out.println(Arrays.equals(array1, array3));
        System.out.println(arraysIguales(array1,array3));
        
        System.out.println(Arrays.equals(array1, array4));
        System.out.println(arraysIguales(array1,array4));
        
        System.out.println(Arrays.equals(array1, array2));
        System.out.println(arraysIguales(array1,array2));

    }


    public static boolean arraysIguales(int[] array1, int[] array2) {
 
        if (array1.length == array2.length) {
            
            for (int i = 0; i < array1.length; i++) {

                if (array1[i] != array2[i]) {

                    return false;
                }       //Si el método fuera más grande, mejor añadir variable
            }           //booleana y breaks para cortar el bucle
            
            return true;
        }        
        return false;
        
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author javiakasino
 */
public class SumarElementosArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] numeros = {7,1,2,3,4};
        
        System.out.println(sumarElementosArray(numeros, numeros.length));
        
    }

    public static int sumarElementosArray(int[] array, int tamanio) {

        if (tamanio == 1) {
            
            return array[0];
            
        } else {
            
            return array[tamanio-1] + sumarElementosArray(array, tamanio-1);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author javiakasino
 */
public class ListaIntegerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //ListaInteger miLista = new ListaInteger(10);
        //ArrayList<Integer> list = miLista.getLista();
        Random r = new Random();

        ArrayList<Integer> list = new ArrayList<>();

        list.add(6);
        list.add(7);
        list.add(1);
        list.add(2);

        for (int i = 0; i < 5; i++) {
            Integer aux = r.nextInt(91) + 10;
            list.add(aux);
        }

        for (Integer integer : list) {
            System.out.print(integer + " - ");

        }

        int sumaPares = 0;
        //Bucle para recorrer la lista completa
        for (int i = 0; i < list.size(); i++) {

            int numero = list.get(i); //Método get(posición)

            if (numero % 2 == 0) { //Si es par

                sumaPares += numero; //Se suma
            }
        }

        System.out.println("\nTotal pares: " + sumaPares);

        int sumaImpares = 0;
        //Bucle para recorrer la lista completa
        for (int i = 0; i < list.size(); i++) {

            int numero = list.get(i); //Método get(posición)

            if (numero % 2 != 0) { //Si es par

                sumaImpares += numero; //Se suma
            }
        }

        System.out.println("Total impares: " + sumaImpares);

        //Busca el mayor
        int mayor = Integer.MIN_VALUE;
        for (Integer num : list) {
            if (num > mayor) {
                mayor = num;
            }
        }

        System.out.println("El mayor es: " + mayor);

        System.out.println("Borrado del elemento de la posicion 3");
        //Borra lo que haya en esa posición
        list.remove(3);

        list.forEach(e -> System.out.print(e + " - "));
        //Cambia el elemento de la posicion 0 por 200
        list.set(0, 200);

        System.out.println("");

        list.forEach(e -> System.out.print(e + " - "));

        list.add(2, 500);

        System.out.println("");
        
        list.forEach(e -> System.out.print(e + " - "));
   
    
        int indice = list.indexOf(500);
        
        
        System.out.println("El 500 está en la posición " + indice);
    
    }

}

//El enlace al repositorio es https://github.com/JaviAkaSino/ParesNones.git

package javierparodipinero;

import java.util.Random;
import java.util.Scanner;

public class JuegoCompleto {

    public static void main(String[] args) {

        //Variables int, String y boolean; Scanner y Random
        Random numeroAleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        int dedos1, dedos2, totaldedos, opcion;
        String rol1, nombre1, nombre2, limpiarScanner;
        boolean rol1pares, rol1nones, pares, dedos1logico, dedos2logico;

        //Bucle '0' para que el programa se repita hasta darle a salir
        do {
            System.out.println("Menú de opciones");
            System.out.println("-------------------------");
            System.out.println("1. Jugar PvP");
            System.out.println("2. Jugar vs CPU");
            System.out.println("3. Salir del juego");
            System.out.println("Elija una opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    //Limpiamos el escáner para que no se salte la siguiente línea (\n)
                    limpiarScanner = teclado.nextLine();
                    //Pedimos nombres de los jugadores y los guardamos en sus variables
                    System.out.println("Jugador 1, introduce tu nombre:");
                    nombre1 = teclado.nextLine();
                    System.out.println("Jugador 2, introduce tu nombre:");
                    nombre2 = teclado.nextLine();

                    //1er bucle do while para que pregunte hasta que se dé una opción correcta
                    do {
                        //Pregunta por pares o nones y recoge
                        System.out.println(nombre1 + " elige, ¿pares o nones?");
                        rol1 = teclado.nextLine();

                        //Si es pares, rol1pares es true, si nones, rol1nones es true
                        //No hablamos del rol de J2, ya que es el contrario
                        rol1pares = rol1.equalsIgnoreCase("pares");
                        rol1nones = rol1.equalsIgnoreCase("nones");

                        //Si se ha seleccionado una opción correcta, sigue el programa
                        if (rol1pares == true || rol1nones == true) {

                            //2º bucle: dedos del jugador 1 entre 0 y 10, controlada por dedos1logico
                            do {
                                System.out.println(nombre1 + ", ¿cuántos dedos vas a sacar?");
                                dedos1 = teclado.nextInt();
                                dedos1logico = (0 <= dedos1 && dedos1 <= 10);

                                //Si el valor es válido, el programa continúa
                                if (dedos1logico == true) {

                                    //3er bucle : dedos del jugador 2 igual que los del 1
                                    do {
                                        System.out.println(nombre2 + ", ¿cuántos dedos vas a sacar?");
                                        dedos2 = teclado.nextInt();
                                        dedos2logico = (0 <= dedos2 && dedos2 <= 10);

                                        //Si entra en lo permitido, continúa el programa
                                        if (dedos2logico == true) {

                                            //Sumamos el total de dedos de ambos
                                            totaldedos = dedos1 + dedos2;

                                            /*Booleana pares para saber si el total es par
                                            Por teoría: si el resto de x/2 es 0, x es par
                                            Si pares=false, son nones*/
                                            pares = (totaldedos % 2 == 0);

                                            //Si J1 eligió pares y pares=true, gana J1
                                            if (rol1pares == true && pares == true) {
                                                System.out.println("El total es " + totaldedos
                                                        + ", que son pares; gana " + nombre1);

                                                //Si J1 eligió pares y pares=false, gana J2    
                                            } else if (rol1pares == true && pares == false) {
                                                System.out.println("El total es " + totaldedos
                                                        + ", que son nones; gana " + nombre2);

                                                //Si J1 eligió nones y pares=true, gana J2
                                            } else if (rol1pares == false && pares == true) {
                                                System.out.println("El total es " + totaldedos
                                                        + ", que son pares; gana " + nombre2);

                                                //Si J1 eligió nones y pares=false, gana J1
                                            } else {
                                                System.out.println("El total es " + totaldedos
                                                        + ", que son nones; gana " + nombre1);

                                            }

                                            //Si el valor no es válido, mensaje y vuelve a preguntar
                                        } else {

                                            System.out.println("Introduce  un número del 0 al 10");

                                        }

                                        //Fin de 3er bucle
                                    } while (dedos2logico == false);

                                    //Si el valor no es válido, mensaje y vuelve a preguntar
                                } else {

                                    System.out.println("Introduce  un número del 0 al 10");

                                }

                                //Fin de 2º bucle
                            } while (dedos1logico == false);

                            //Mensaje de opción no válida    
                        } else {

                            System.out.println("Introduzca una opción válida (pares o nones)");

                        }

                        //Fin del primer bucle    
                    } while (rol1pares != true && rol1nones != true);

                    break;

                case 2:

                    //Limpiamos el escáner para que no se salte la siguiente línea (\n)
                    limpiarScanner = teclado.nextLine();
                    //Pedimos nombre del jugador y lo guardamos en su variable
                    System.out.println("Jugador 1, introduce tu nombre:");
                    nombre1 = teclado.nextLine();
                    nombre2 = "CPU";

                    //1er bucle do while para que pregunte hasta que se dé una opción correcta
                    do {

                        //Pregunta por pares o nones y recoge
                        System.out.println(nombre1 + " elige, ¿pares o nones?");
                        rol1 = teclado.nextLine();

                        //Si es pares, rol1pares es true, si nones, rol1nones es true
                        //No hablamos del rol de J2, ya que es el contrario
                        rol1pares = rol1.equalsIgnoreCase("pares");
                        rol1nones = rol1.equalsIgnoreCase("nones");

                        //Si se ha seleccionado una opción correcta, sigue el programa
                        if (rol1pares == true || rol1nones == true) {

                            //2º bucle: dedos del jugador 1 entre 0 y 10, controlada por dedos1logico
                            do {
                                System.out.println(nombre1 + ", ¿cuántos dedos vas a sacar?");
                                dedos1 = teclado.nextInt();
                                dedos1logico = (0 <= dedos1 && dedos1 <= 10);

                                //Si el valor es válido, el programa continúa
                                if (dedos1logico == true) {

                                    /*A partir de aquí es donde vienen las diferencias con 
                                    la parte A. No se pregunta al J2, ya que es 'la máquina',
                                    sino que se saca por Random*/
                                    //Al ser un número del 1 al 10, ponemos 11 valores (10-0+1)
                                    dedos2 = numeroAleatorio.nextInt(11);

                                    //Mostramos los dedos sacados por la máquina(J2)
                                    System.out.println(nombre2 + " saca " + dedos2 + " dedos");

                                    //Sumamos el total de dedos de ambos
                                    totaldedos = dedos1 + dedos2;

                                    /*Booleana pares para saber si el total es par
                                    Por teoría: si el resto de x/2 es 0, x es par
                                    Si pares=false, son nones*/
                                    pares = (totaldedos % 2 == 0);

                                    //Si J1 eligió pares y pares=true, gana J1
                                    if (rol1pares == true && pares == true) {
                                        System.out.println("El total es " + totaldedos
                                                + ", que son pares; gana " + nombre1);

                                        //Si J1 eligió pares y pares=false, gana J2    
                                    } else if (rol1pares == true && pares == false) {
                                        System.out.println("El total es " + totaldedos
                                                + ", que son nones; gana " + nombre2);

                                        //Si J1 eligió nones y pares=true, gana J2
                                    } else if (rol1pares == false && pares == true) {
                                        System.out.println("El total es " + totaldedos
                                                + ", que son pares; gana " + nombre2);

                                        //Si J1 eligió nones y pares=false, gana J1
                                    } else {
                                        System.out.println("El total es " + totaldedos
                                                + ", que son nones; gana " + nombre1);

                                    }

                                    //Si el valor no es válido, mensaje y vuelve a preguntar                            
                                } else {

                                    System.out.println("Introduce  un número del 0 al 10");

                                }

                                //Fin de 2º bucle
                            } while (dedos1logico == false);

                            //Mensaje de opción no válida    
                        } else {

                            System.out.println("Introduzca una opción válida (pares o nones)");

                        }

                        //Fin del primer bucle    
                    } while (rol1pares != true && rol1nones != true);

                    break;

                case 3:

                    System.out.println("Ha seleccionado salir del juego");

                    break;

                default:

                    System.out.println("Lo sentimos, " + opcion + " no es una "
                            + "opción válida");
                    System.out.println();

                    break;
            }

        } while (opcion != 3);

    }

}

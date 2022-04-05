package pokino.javierparodipinero;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JaviA
 */
public class Juego {

    public static void main(String[] args) {

        boolean premios; //Utilizada más adelante

        //Se establece el número de jugadores
        System.out.println("Introduce el número de jugadores (1-12)");
        int jugadores;
        do {
            jugadores = Utilidades.escanearInt();
            if (jugadores < 1 || 12 < jugadores) {

                System.out.println("Introduce un número válido de jugadores");

            }

        } while (jugadores < 1 || 12 < jugadores);

        //Se crean los jugadores con su cartón y los vasos vacíos
        Pokino pokino = new Pokino(jugadores);

        //Se establece la apuesta que hará cada jugador por ronda y premio
        System.out.println("Introduce la apuesta por jugador, premio y ronda");
        double apuesta = 0;
        do {
            apuesta = Utilidades.escanearInt();
            if (apuesta <= 0) {

                System.out.println("Introduce una apuesta válida");

            }

        } while (apuesta <= 0);

        //Se da a elegir si se quiere jugar una ronda normal (Pokino finaliza)1
        //Una ronda final, en la que se dan todos los premios 2
        //O salir 0
        int opcion;
        //Do while numero de rondas o pregunta otra ronda?

        do { //SELECCIONA EL TIPO DE RONDA

            //Controla las opciones
            do {
                System.out.println("Introduce una opción: \n[1] - Ronda normal\n"
                        + "[2] - Ronda final\n[0] - Salir");

                opcion = Utilidades.escanearInt();
                if (opcion < 0 || 2 < opcion) {

                    System.out.println("Introduce una opción válida");
                }
            } while (opcion < 0 || 2 < opcion);

            //CON LA OPCIÓN VÁLIDA, PREPARAMOS RONDA
            for (int i = 0; i < 6; i++) { //Para los 6 premios
                //Se ponen boca arriba los vasos
                pokino.getPremios().get(i).setDisponible(true);
                //Cada premio es el anterior(empieza en 0) + una recarga por jugador
                pokino.getPremios().get(i).setPremio(pokino.getPremios().get(i).getPremio() + (jugadores * apuesta));

            }

            //Desmarcamos todos los cartones de los jugadores
            for (int i = 1; i <= jugadores; i++) {
                pokino.getCartones().get(i).desmarcarCarton();
            }

            //Se crea la baraja
            Baraja baraja = new Baraja();
            baraja.barajar();

            pokino.imprimirPokino();

            //Cada ronda
            do { //Sigue sacando cartas hasta que alguien cante Pokino

                //Sale carta y se enseña
                Carta carta = baraja.primeraCarta();
                System.out.println(carta);

                for (int i = 1; i <= jugadores; i++) { //Para todos los jugadores

                    //Comprueba y marca la carta como cantada en caso de estar
                    if (pokino.getCartones().get(i).marcarCarta(carta)) { //Si marca
                        //Guarda su posición
                        String posicion = pokino.getCartones().get(i).posicionMarcada(carta);

                        //COMPROBACIÓN DE PREMIOS
                        //CENTRO
                        if (pokino.getCartones().get(i).comprobarCentro()//Si tiene el centro
                                && pokino.getPremios().get(0).isDisponible()) { //Y no se ha dado

                            System.out.println("El Jugador " + i + " ha cantado"
                                    + " CENTRO.\nSe lleva "
                                    + pokino.getPremios().get(0).getPremio() + " €");

                            pokino.getPremios().get(0).setDisponible(false); //Pone disponible a false
                            pokino.getPremios().get(0).setPremio(0); //Pone a 0 el premio

                        }

                        //ESQUINA
                        if (pokino.getCartones().get(i).comprobarEsquina()//Si tiene la esquina
                                && pokino.getPremios().get(1).isDisponible()) { //Y no se ha dado

                            System.out.println("El Jugador " + i + " ha cantado"
                                    + " ESQUINA.\nSe lleva "
                                    + pokino.getPremios().get(1).getPremio() + " €");

                            pokino.getPremios().get(1).setDisponible(false); //Pone disponible a false
                            pokino.getPremios().get(1).setPremio(0); //Pone a 0 el premio

                        }

                        //ESTAMPA
                        if (pokino.getCartones().get(i).comprobarEstampa()//Si tiene la estampa
                                && pokino.getPremios().get(2).isDisponible()) { //Y no se ha dado

                            System.out.println("El Jugador " + i + " ha cantado"
                                    + " ESTAMPA.\nSe lleva "
                                    + pokino.getPremios().get(2).getPremio() + " €");

                            pokino.getPremios().get(2).setDisponible(false); //Pone disponible a false
                            pokino.getPremios().get(2).setPremio(0); //Pone a 0 el premio

                        }

                        //POKER
                        if (pokino.getCartones().get(i).comprobarPoker()//Si tiene el Póker
                                && pokino.getPremios().get(3).isDisponible()) { //Y no se ha dado

                            System.out.println("El Jugador " + i + " ha cantado"
                                    + " PÓKER.\nSe lleva "
                                    + pokino.getPremios().get(3).getPremio() + " €");

                            pokino.getPremios().get(3).setDisponible(false); //Pone disponible a false
                            pokino.getPremios().get(3).setPremio(0); //Pone a 0 el premio

                        }

                        //FULL
                        if (pokino.getCartones().get(i).comprobarFull()//Si tiene el Póker
                                && pokino.getPremios().get(4).isDisponible()) { //Y no se ha dado

                            System.out.println("El Jugador " + i + " ha cantado "
                                    + pokino.getPremios().get(4).getNombre() + ".\nSe lleva "
                                    + pokino.getPremios().get(4).getPremio() + " €");

                            pokino.getPremios().get(4).setDisponible(false); //Pone disponible a false
                            pokino.getPremios().get(4).setPremio(0); //Pone a 0 el premio

                        }

                        //POKINO
                        int x = Integer.parseInt(posicion.substring(0, 1));
                        int y = Integer.parseInt(posicion.substring(2, 3));

                        if (pokino.getCartones().get(i).comprobarPokino(x, y)//Si tiene el Pokino
                                && pokino.getPremios().get(5).isDisponible()) { //Y no se ha dado

                            System.out.println("El Jugador " + i + " ha cantado"
                                    + " POKINO.\nSe lleva "
                                    + pokino.getPremios().get(5).getPremio() + " €");

                            pokino.getPremios().get(5).setDisponible(false); //Pone disponible a false
                            pokino.getPremios().get(5).setPremio(0); //Pone a 0 el premio

                        }

                    }

                }
                premios = false; //Se presupone que ya no hay premios

                for (int m = 0; m < 5; m++) { //Pero si alguno de los premios aún
                    if (pokino.getPremios().get(m).isDisponible()) { //Está disponible

                        premios = true; //Se pone a true
                    }
                }
            } while ((opcion == 1 && pokino.getPremios().get(5).isDisponible()) //PARTIDA NORMAL, HASTA POKINO
                    || (opcion == 2 && (premios && baraja.numeroCartas() > 0))); //RONDA FINAL, SALEN TODOS LOS PREMIOS MIENTRAS HAYA CARTAS

            pokino.imprimirPokino();

            /*NOTA: El control con las cartas se hace porque es posible que el 
            Póker se quede sin cantar, ya que es posible que a todos los jugadores
            les salga la carta no perteneciente al Póker antes que el mismo.
            En ese caso, se ha decidido repartir el premio entre los jugadores*/
            if (opcion == 2 && baraja.numeroCartas() == 0) { //Si se acaban las cartas en ronda final
                System.out.println("El Póker no ha salido, por lo que se reparte el premio");
                System.out.println("Cada jugador se lleva "
                        + pokino.getPremios().get(3).getPremio() / jugadores + " €");
            }

        } while (opcion != 0 && opcion != 2);

    }

}

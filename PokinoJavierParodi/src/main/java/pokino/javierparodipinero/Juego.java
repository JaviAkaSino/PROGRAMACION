package pokino.javierparodipinero;

import java.util.Collections;

/**
 *
 * @author JaviA
 */
public class Juego {

    public static void main(String[] args) {

        //Se establece el número de jugadores
        int jugadores = 6;

        //Se crean los jugadores con su cartón y los vasos vacíos
        Pokino pokino = new Pokino(jugadores);

        //SE RELLENAN LOS PREMIOS
        //Se establece la apuesta
        double apuesta = 0.5;

        //Do while numero de rondas o pregunta otra ronda?
        //Se llenan los vasos y se ponen disponibles
        for (int i = 0; i < 6; i++) {

            pokino.getPremios().get(i).setPremio(jugadores * apuesta);
            pokino.getPremios().get(i).setDisponible(true);
        }

        //Se crea la baraja
        Baraja baraja = new Baraja();
        baraja.barajar();

        //Cada ronda
        do { //Sigue sacando cartas hasta que alguien cante Pokino

            //Sale carta y se enseña
            if (baraja.numeroCartas() == 0) { //Si se acaban las cartas
                baraja = new Baraja(); //Baraja nueva
                baraja.barajar();
            }

            Carta carta = baraja.primeraCarta();
            System.out.println(carta);

            for (int i = 1; i <= jugadores; i++) {

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

                    if (pokino.getCartones().get(i).comprobarPokino(x, y)//Si tiene el Póker
                            && pokino.getPremios().get(5).isDisponible()) { //Y no se ha dado

                        System.out.println("El Jugador " + i + " ha cantado"
                                + " POKINO.\nSe lleva "
                                + pokino.getPremios().get(5).getPremio() + " €");

                        pokino.getPremios().get(5).setDisponible(false); //Pone disponible a false
                        pokino.getPremios().get(5).setPremio(0); //Pone a 0 el premio

                    }

                }

            }

        } while (pokino.getPremios().get(5).isDisponible()); //Mientras no salga Pokino

        //Si caen varios premios de golpe se dan todos, pero si uno de ellos es pokino?
        //
        //
        pokino.imprimirPokino();

    }

    public static void comprobarPremios(Pokino pokino, int i, int j) {

        for (int k = 0; k < pokino.getCartones().size(); k++) { //Para el numero de jugadores

            for (int l = 0; l < 5; l++) { //Para los 6 premios

                if (pokino.getCartones().get(k).comprobarFull()//Si tiene el Póker
                        && pokino.getPremios().get(l).isDisponible()) { //Y no se ha dado

                    System.out.println("El Jugador " + k + " ha cantado "
                            + pokino.getPremios().get(l).getNombre() + ".\nSe lleva "
                            + pokino.getPremios().get(l).getPremio() + " €");

                    pokino.getPremios().get(l).setDisponible(false); //Pone disponible a false
                    pokino.getPremios().get(l).setPremio(0); //Pone a 0 el premio

                }
            }

        }

    }

}

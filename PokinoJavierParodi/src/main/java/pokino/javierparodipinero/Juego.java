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
            Carta carta = baraja.primeraCarta();
            System.out.println(carta);

            for (int i = 1; i <= jugadores; i++) {

                //Comprueba y marca la carta como cantada en caso de estar
                if (pokino.getCartones().get(i).marcarCarta(carta)) { //Si marca
                    
                //COMPROBACIÓN DE PREMIOS
                    //CENTRO
                    if (pokino.getCartones().get(i).comprobarCentro()//Si tiene el centro
                            && pokino.getPremios().get(0).isDisponible()) { //Y no se ha dado

                        System.out.println("El Jugador " + i + " ha cantado el"
                                + " Centro.\nSe lleva " + 
                                pokino.getPremios().get(0).getPremio() + " €" );
                        
                        pokino.getPremios().get(0).setDisponible(false); //Pone disponible a false
                        pokino.getPremios().get(0).setPremio(0); //Pone a 0 el premio
                        
                    }
                    
                    //ESQUINA
                    
                    if (pokino.getCartones().get(i).comprobarEsquina()
                            && pokino.getPremios().get(1).isDisponible()) { //Si tiene el centro

                        System.out.println("El Jugador " + i + " ha cantado la"
                                + " Esquina.\nSe lleva " + 
                                pokino.getPremios().get(1).getPremio() + " €" );
                        
                        pokino.getPremios().get(1).setDisponible(false); //Pone disponible a false
                        pokino.getPremios().get(1).setPremio(0); //Pone a 0 el premio
                        
                    }
                    
                    //ESTAMPA
                    
                    //POKER
                    
                    //FULL
                    
                    //POKINO
                    

                }

            }

            //If equals, set true, atributo boolean de carta para marcarla
        } while (pokino.getPremios().get(1).isDisponible()); //Mientras no salga Pokino

        //Sale carta, recorrer carton comparando carta
        //If equals, set true, atributo boolean de carta para marcarla
        //If posiciones clave true, se canta el premio correspondiente y premio  a false y set cantidad a 0
        //While no se cante el pokino o si pokino break
        //Si caen varios premios de golpe se dan todos, pero si uno de ellos es pokino?
        //
        //
        pokino.imprimirPokino();

        //pokino.getPokino().get(1).getCarton()[2][2].setCantada(true);
//        Utilidades.recorrerVecinas(0, 0, c1.getCarton());
    }

}

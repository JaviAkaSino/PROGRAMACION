package pokino.javierparodipinero;

import java.awt.font.TextAttribute;
import java.text.AttributedString;
import org.apache.commons.exec.util.StringUtils;

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

        //Se llenan los vasos
        for (int i = 0; i < 6; i++) {

            pokino.getPremios().get(i).setPremio(jugadores * apuesta);
        }
        
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

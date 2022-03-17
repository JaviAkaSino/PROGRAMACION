package azar;

import java.util.Random;

/**
 *
 * @author javiakasino
 */
public class Moneda extends Azar {

    @Override
    public int lanzar() {

        return new Random().nextInt(2) + 1;
    }

}

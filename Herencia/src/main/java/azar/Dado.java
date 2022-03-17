package azar;

import java.util.Random;

/**
 *
 * @author javiakasino
 */
public class Dado extends Azar {

    @Override
    public int lanzar() {

        return new Random().nextInt(6) + 1;
    }
}

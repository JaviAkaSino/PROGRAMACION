package figuras;

/**
 *
 * @author javiakasino
 */
public class Triangulo extends Figura {

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {

        return base * altura / 2;
    }
}

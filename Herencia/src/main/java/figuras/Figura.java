package figuras;

/**
 *
 * @author javiakasino
 */
public abstract class Figura {
//De las clases abstractas no se pueden crear objetos, sí de sus hijas

    protected double base, altura;

    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Figura() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Figura{" + "base=" + base + ", altura=" + altura + '}';
    }

    public abstract double calcularArea();

}

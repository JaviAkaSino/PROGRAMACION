package ejercicio12;

/**
 *
 * @author javiakasino
 */
public class CuentaAhorro extends Cuenta {

    private double interes;
    private double comisionAnual;

    public CuentaAhorro(double interes, double comisionAnual, Persona cliente) {
        super(cliente);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }

    public CuentaAhorro(Persona cliente) {
        super(cliente);
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    @Override
    public String toString() {
        return "Cuenta Ahorro - " + super.toString() + ", interes=" + interes + ", comision anual=" + comisionAnual;
    }

    @Override
    public void actualizarSaldo() {

        if (0 < this.getSaldo()) { //Si tiene saldo positivo, se le suman intereses y resta la comisión

            this.setSaldo(this.getSaldo() + this.getSaldo() * this.interes / 100 - this.comisionAnual);

        } else { //Si tiene el saldo en negativo no se le suman intereses

            this.setSaldo(this.getSaldo() - this.comisionAnual);

        }

    }

    @Override
    public void retirar(double cantidad) {

        if (cantidad <= this.getSaldo()) {

            this.setSaldo(this.getSaldo() - cantidad);
        }

    }

}

package ejercicio12;

/**
 *
 * @author javiakasino
 */
public class CuentaCorriente extends Cuenta {

    private double interes = 1.5;
    private double saldoMin;

    public CuentaCorriente(Persona cliente) {
        super(cliente);
    }

    public CuentaCorriente(double saldoMin, Persona cliente) {
        super(cliente);
        this.saldoMin = saldoMin;
    }

    @Override
    public String toString() {
        return "CuentaCorriente - " + super.toString() + ", interés: " + interes + ", saldo mínimo:" + saldoMin;
    }

    @Override
    public void actualizarSaldo() {

        if (this.getSaldo() < 1000) {

            this.setSaldo(this.getSaldo() + this.saldoMin * this.interes / 100);
        } else {

            this.setSaldo(this.getSaldo() + this.getSaldo() * this.interes / 100);
        }
    }

    @Override
    public void retirar(double cantidad) {

        if (this.saldoMin <= this.getSaldo() - cantidad) {

            this.setSaldo(this.getSaldo() - cantidad);
        }

    }

}

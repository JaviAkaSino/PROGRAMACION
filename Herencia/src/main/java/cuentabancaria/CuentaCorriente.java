package cuentabancaria;

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
        return "CuentaCorriente{" + super.toString() + "interes=" + interes + ", saldoMin=" + saldoMin + '}';
    }
    
    @Override
    public void actualizarSaldo() {
        
        if (this.getSaldo()>1000){
            
            this.setSaldo(this.getSaldo()+this.saldoMin*this.interes);
        } else {
            
            this.setSaldo(this.getSaldo()+this.getSaldo()*this.interes);
        }
    }

    @Override
    public void retirar(double cantidad) {

        if (cantidad <= this.saldoMin) {

            this.saldoMin += cantidad;
        }

    }
    
    
    
}

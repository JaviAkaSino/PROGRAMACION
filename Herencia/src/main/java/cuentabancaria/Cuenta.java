package cuentabancaria;

import java.util.Random;

/**
 *
 * @author javiakasino
 */
public abstract class Cuenta {

    private String numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta(Persona cliente) {

        this.numeroCuenta = numeroCuentaRandom();
        this.saldo = 0;
        this.cliente = cliente;
    }

    //MÉTODO CREAR NÚMERO DE CUENTA ALEATORIO (POR DEFECTO)
    public static String numeroCuentaRandom() {

        Random rnd = new Random();
        String num = "0123456789";
        String numero = "";
        char digito;
        for (int i = 0; i < 20; i++) {

            digito = num.charAt(rnd.nextInt(10));

            numero += Character.toString(digito);
        }

        return numero;
    }

    public abstract void actualizarSaldo();

    public abstract void retirar(double cantidad);

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }

}

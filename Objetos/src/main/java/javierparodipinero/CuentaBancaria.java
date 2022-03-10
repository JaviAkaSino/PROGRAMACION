package javierparodipinero;

import org.apache.commons.lang3.RandomStringUtils;

public class CuentaBancaria {

    /*7.  Crea una clase CuentaBancaria con atributos para el número de cuenta 
    (String), el NIF del cliente (String), nombre del cliente, el saldo actual 
    y el interés anual que se aplica a la cuenta (entre 0.1% y 3%). Define en la
    clase los siguientes métodos:
     */
    private String numeroCuenta, nif, nombre;
    private double saldo, interes;

    /*Constructor por defecto, con los valores que tú consideres oportunos. 
El número de cuenta debe tener 20 dígitos y se debe generar usando la clase 
RandomStringUtils de la librería Apache Commons. Para ello, copia la siguiente línea:*/
    public CuentaBancaria() {
        this.numeroCuenta = RandomStringUtils.randomNumeric(20);
        this.nif = "12345678X";
        this.nombre = "Pepe";
        this.saldo = 1000;
        this.interes = 2;

    }

    public CuentaBancaria(String numeroCuenta, String nif, String nombre, double saldo, double interes) {
        this.numeroCuenta = RandomStringUtils.randomNumeric(20);
        this.nif = nif;
        this.nombre = nombre;
        this.saldo = saldo;

        if (saldo < 0) {

            this.saldo = 0;
        }

        this.interes = interes;

        if (interes < 0.1) {

            this.interes = 0.1;
        }

        if (interes > 3) {

            this.interes = 3;
        }

    }

    /*ingresarIntereses(): aumenta el saldo de la cuenta, aplicando el 
    interés anual [saldo = saldo + (interés * saldo)].*/
    public void ingresarIntereses() {

        this.saldo += this.saldo * interes / 100;

    }

    /*ingresarDinero(double cantidad): permite ingresar una cantidad en la cuenta.*/
    public void ingresarDinero(double cantidad) {
         
        if(0 < cantidad){
            
            this.saldo += cantidad;   
        }
        

    }

    /*retirarEfectivo(double cantidad): permite sacar una cantidad de la cuenta 
    (si hay saldo). Si no hay saldo suficiente no se realiza la operación.*/
    public void retirarEfectivo(double cantidad) {

        if (cantidad <= this.saldo && cantidad > 0) {

            this.saldo -= cantidad;

        }

    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {

        this.interes = interes;

        if (interes < 0.1) {

            this.interes = 0.1;
        }

        if (interes > 3) {

            this.interes = 3;
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", nif=" + nif + ", nombre=" + nombre + ", saldo=" + saldo + ", interes=" + interes + '}';
    }

}

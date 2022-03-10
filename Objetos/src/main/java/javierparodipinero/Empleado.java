package javierparodipinero;

public class Empleado {

    /*Crear una clase Empleado que modele la información que una empresa mantiene 
    sobre cada empleado: nombre, apellidos, NIF, sueldo base, pago por hora extra, 
    horas extra realizadas en el mes, tipo de IRPF (entre 1% y 20%), casado o no y 
    número de hijos. Crea un constructor por defecto que inicialice los valores como 
    consideres oportunos y otro constructor parametrizado. Además debes establecer los 
    métodos get, set y toString. En una clase de prueba, con el método main(), crea un 
    par de objetos y prueba los métodos get y set.*/
    private String nombre, appellidos, nif;
    private double precioHE, numHE, irpf, sueldoBase;
    private int hijos;
    private boolean casado;

    public Empleado(String nombre, String appellidos, String nif, double precioHE,
            double numHE, double irpf, double sueldoBase, int hijos, boolean casado) {

        this.nombre = nombre;
        this.appellidos = appellidos;
        this.nif = nif;
        this.precioHE = precioHE;
        if (precioHE < 10 || precioHE > 25) {

            throw new IllegalArgumentException("Pago por horas está fuera de rango");
        }

        this.numHE = numHE;
        
        this.irpf = irpf;
        
        if (irpf < 1 || irpf > 20) {

            this.irpf = 0;
        }
        
        this.sueldoBase = sueldoBase;
        this.hijos = hijos;
        this.casado = casado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppellidos() {
        return appellidos;
    }

    public void setAppellidos(String appellidos) {
        this.appellidos = appellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getPrecioHE() {
        return precioHE;
    }

    public void setPrecioHE(double precioHE) {

        if (precioHE < 10 || precioHE > 25) {

            throw new IllegalArgumentException("Pago por horas está fuera de rango");
        }

        this.precioHE = precioHE;
    }

    public double getNumHE() {
        return numHE;
    }

    public void setNumHE(double numHE) {
        this.numHE = numHE;
    }

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {

        this.irpf = irpf;

        if (irpf < 1 || irpf > 20) {

            irpf = 0;
        }
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", appellidos=" + appellidos
                + ", nif=" + nif + ", pagoHE=" + precioHE + ", numHE=" + numHE
                + ", irpf=" + irpf + ", sueldoBase=" + sueldoBase + ", hijos="
                + hijos + ", casado=" + casado + '}';
    }

    public Empleado() {
    }

    /*Cálculo del complemento correspondiente a las horas extra realizadas. El 
    valor debe ser devuelto por el método.*/
    public double totalHE() {

        double totalHorasE;

        totalHorasE = this.numHE * this.precioHE;

        return totalHorasE;
    }

    /*Cálculo del sueldo bruto. El valor debe ser devuelto por el método. 
    El sueldo bruto es el resultado del sueldo base más el complemento por 
    las horas extra trabajadas en el mes.*/
    public double sueldoBruto() {

        double sueldoBruto = this.sueldoBase + totalHE();

        return sueldoBruto;
    }

    /*Cálculo de las retenciones (IRPF) a partir del tipo, teniendo en cuenta 
    que el porcentaje de retención que hay que aplicar es el tipo menos 2 puntos
    si el empleado está casado y menos 1 punto por cada hijo que tenga; el 
    porcentaje se aplica sobre todo el sueldo bruto.*/
    public double retencionesIrpf() {

        double retenciones, irpfX = 0;

        if (this.casado) {
            irpfX = this.irpf - 2;
        }

        irpfX = irpfX - this.hijos;

        if (irpfX < 0) {

            irpfX = 0;

        }

        retenciones = irpfX / 100 * sueldoBruto();

        return retenciones;

    }

    /*Cálculo del sueldo neto. El valor debe ser devuelto por el método. El 
    sueldo neto es el bruto menos las retenciones.*/
    public double sueldoNeto() {

        double neto;

        neto = sueldoBruto() - retencionesIrpf();

        return neto;
    }

    /*escribirBasicInfo(): visualización en consola de la información básica del
    empleado: nombre, apellidos, NIF, estado civil y número de hijos.*/
    public void escribirBasicInfo() {
        System.out.println("Nombre: " + this.nombre);

        System.out.println("Apellidos: " + this.appellidos);

        System.out.println("NIF: " + this.nif);

        System.out.print("Estado civil: ");
        if (this.casado) {
            System.out.println("Casado");
        } else {
            System.out.println("Soltero");
        }

        System.out.println("Número de hijos: " + this.hijos);
    }

    /*escribirAllInfo(): visualización en consola de toda la información del empleado, 
    esto es, la información básica más el sueldo base, el complemento por horas extra, 
    el sueldo bruto, la retención de IRPF y el sueldo neto. Intenta reutilizar código.*/
    public void escribirAllInfo() {

        escribirBasicInfo();
        System.out.println("Sueldo base: " + this.sueldoBase + "\nComplemento HE: "
                + totalHE() + "\nSueldo bruto: " + sueldoBruto() + "\nRetención IRPF: "
                + retencionesIrpf() + "\nSueldo neto: " + sueldoNeto());

    }

    //Dinero por HE entre 10 y 25
}

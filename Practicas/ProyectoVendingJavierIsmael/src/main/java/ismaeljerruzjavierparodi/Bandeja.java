package ismaeljerruzjavierparodi;

import javax.swing.JOptionPane;

public class Bandeja {

    //ATRIBUTOS
    private String codigoBandeja; //Por defecto A01, A02, A03...
    private String nombreProducto; //Nombre del producto de la bandeja
    private int precioCent; //Operaremos todo en céntimos por simplicidad
    private int stock; //Máximo 15

    private static int contador = 0; //Contador de instancias, utilizado para codigoAuto
    private static final int PRECIO_MIN = 60; //Precio mínimo de un producto
    private static final int PRECIO_MAX = 1000; //Precio máximo de un producto

    private static boolean bucle;

    //MÉTODO CONSTRUCTOR POR DEFECTO
    public Bandeja() {
        this.codigoBandeja = codigoDefault(); //Código automático
        this.nombreProducto = productoDefault();
        this.precioCent = precioDefault();
        this.stock = 15; //Por lógica se entiende que se llena la bandeja

        contador++;
    }

    //MÉTODO CONSTRUCTOR PARAMETRIZADO CON STOCK A FULL (LÓGICO)
    public Bandeja(String producto, int precio) {

        this.codigoBandeja = codigoDefault(); //Se crea código por defecto

        this.nombreProducto = producto;

        this.precioCent = comprobarPrecio(precio); //Precio con excepción regulada y posterior control por requisitos

        this.stock = 15;

        contador++;
    }

    //MÉTODO CONSTRUCTOR PARAMETRIZADO
    public Bandeja(String producto, int precio, int stock) {

        this.codigoBandeja = codigoDefault(); //Se crea código por defecto

        this.nombreProducto = producto;

        this.precioCent = comprobarPrecio(precio); //Precio con excepción regulada y posterior control por requisitos

        this.stock = stock;

        if (15 < stock) {       //Si el stock es mayor a 15    
            this.stock = 15;    //se sobreentiende que está lleno (a 15)   
        }

        contador++;
    }

    //MÉTODOS
    public static int comprobarPrecio(int precioIntroducido) { //Comprueba si el precio es válido

        int precioFinal = 0;

        if (PRECIO_MAX < precioIntroducido) { //Precio máximo: 10€

            precioFinal = PRECIO_MAX; //Si supera precio máximo, se establece el máximo

        } else if (precioIntroducido < PRECIO_MIN) { //Precio mínimo actual: 60 céntimos

            precioFinal = PRECIO_MIN; //Si no llega al mínimo, se establece el mínimo

        } else { //Si llega al mínimo y no supera al máx, está en rango válido

            if (precioIntroducido % 5 == 0) {   //Si es múltiplo de 5, es válido

                precioFinal = precioIntroducido;

            } else { //Si no, al no haber monedas de 5 céntimos, no será válido

                precioFinal = precioIntroducido + 5 - precioIntroducido % 5; //Y lo redondeamos al alza
            }
        }

        return precioFinal;
    }

    public static int comprobarStock(int stock) {
        int stockComprobado = stock;

        if (15 < stockComprobado) {       //Si el stock es mayor a 15    
            stockComprobado = 15;    //se sobreentiende que está lleno (a 15) 

        } else if (stock < 0) {
            stockComprobado = 0;
        }

        return stockComprobado;
    }

    //GETTERS Y SETTERS
    public static int getContador() {
        return contador;
    }

    public String getCodigoBandeja() {
        return codigoBandeja;
    }

    public void setCodigoBandeja(String codigoBandeja) {

        this.codigoBandeja = codigoBandeja;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    //Cambiar el producto
    public void cambiarProducto(String nombreProducto, int precio, int stock) {
        this.nombreProducto = nombreProducto; //Al poner un nombreProducto nuevo
        this.precioCent = comprobarPrecio(precio);
        this.stock = comprobarStock(stock); //Se entiende que hay un nuevo precio
    }

    //Sobreentendiendo que se llena la bandeja al cambiar el producto
    public void cambiarProducto(String nombreProducto, int precio) {
        this.nombreProducto = nombreProducto;
        this.precioCent = comprobarPrecio(precio);
        this.stock = 15;
    }

    public int getPrecioCent() {
        return precioCent;
    }

    public double getPrecioEuros() { //Método modificado para visibilidad

        double precioEuros = (double) precioCent / 100;

        return precioEuros;
    }

    public void setPrecioCent(int precio) { //Se controla que sea válido

        this.precioCent = comprobarPrecio(precio);
    }

    //MÉTODOS STOCK
    public void venta() {

        this.stock--;
    }

    public int getStock() {

        return stock;
    }

    //ELIMINADO setStock()
    public void vaciarBandeja() {

        this.stock = 0;
    }

    public void llenarBandeja() {
        this.stock = 15;
    }

    //MÉTODO DE PARA CREAR CÓDIGO DE BANDEJA AUTOMÁTICO
    //Creará códigos que empiecen por 'A0' para que no coincidan con los 
    //Introducidos a mano. Quedarán A01, A02, A03...
    private String codigoDefault() {

        //Contador + 1 para que el primer código sea A01
        String codigoAuto = "A0" + Integer.toString(contador + 1);

        return codigoAuto;
    }

    //MÉTODO DE PARA CREAR PRODUCTO AUTOMÁTICO
    //Está relacionado con el precio, ya que su método utiliza el mismo contador
    private String productoDefault() {

        String[] lista = {"Agua", "Zumo", "Cerveza", "Bocadillo de jamón",
            "Sándwich vegetal", "Sándwich mixto", "Lays", "Doritos", "Coca-Cola"};

        String producto = lista[contador];

        return producto;
    }

    //MÉTODO DE PARA CREAR PRECIO AUTOMÁTICO
    //Está relacionado con el producto, ya que su método utiliza el mismo contador
    private int precioDefault() {

        int[] lista = {80, 100, 120, 380, 220, 220, 80, 60, 150};

        int precio = lista[contador];

        return precio;
    }

    //METODO CONSULTAR / CAMBIAR CODBANDEJA
    public static boolean modificarCodBandeja(String codigo) {

        boolean codigoCorrecto = false;

        if (codigo.length() == 3) { //Comprueba que el código tenga 3 caracteres

            codigoCorrecto = true;

        }
        return codigoCorrecto;
    }

    //METODO CONSULTAR O MODIFICAR PRODUCTO
    public void modificarProducto() {
        try {
            String str = JOptionPane.showInputDialog("El producto de la bandeja es " + this.nombreProducto
                    + "\nIntroduzca un nuevo producto");
            if (!str.equalsIgnoreCase("")) {
                this.nombreProducto = str;
            }
        } catch (NullPointerException npe) {

        }
    }

    //METODO CONSULTAR O MODIFICAR PRECIO
    public void modificarPrecio() {
        do {

            try {
                bucle = true;
                String str = JOptionPane.showInputDialog("El producto de la bandeja  cuesta " + Utilidades.centimosAEuro(this.precioCent) + " €."
                        + "\nIntroduzca un nuevo precio en céntimos");
                if (str.equalsIgnoreCase("")) { //Sin el ignorecase se rompe
                    bucle = false;
                } else {

                    try {
                        int i = Integer.valueOf(str); //El programa se rompe al intentar crear un INT desde una string vacio ""
                        if (i >= PRECIO_MIN && i <= PRECIO_MAX) {
                            this.precioCent = i;
                            bucle = false;
                        } else {
                            JOptionPane.showMessageDialog(null, "Cantidad no válida. Por favor, inténtelo de nuevo.");
                        }

                    } catch (NumberFormatException nfe) {

                        JOptionPane.showMessageDialog(null, "Cantidad no válida. Por favor, inténtelo de nuevo.");
                    }
                }

            } catch (NullPointerException npe) {

                bucle = false;
            }

        } while (bucle);
    }

    //METODO CONSULTAR O MODIFICAR STOCK
    public void modificarStock() {
        do {
            try {
                bucle = true;
                String str = JOptionPane.showInputDialog("En la bandeja hay " + this.stock + " unidades de producto."
                        + "\nIntroduzca un nuevo stock (Máximo 15)");
                if (str.equalsIgnoreCase("")) {
                    bucle = false;
                } else {
                    try {
                        
                        int i = Integer.valueOf(str);
                        if (i >= 0 && i < 15) {
                            this.stock = i;
                            bucle = false;
                        } else if (i >= 15) {
                            this.stock = 15;
                            bucle = false;
                        } else {
                            JOptionPane.showMessageDialog(null, "Cantidad no válida. Por favor, inténtelo de nuevo.");
                        }

                    } catch (NumberFormatException nfe) {

                        JOptionPane.showMessageDialog(null, "Cantidad no válida. Por favor, inténtelo de nuevo.");
                    }
                }

            } catch (NullPointerException npe) {

                bucle = false;
            }

        } while (bucle);
    }

    //MÉTODO TOSTRING
    @Override
    public String toString() {
        return "Código: " + codigoBandeja + ", Producto: " + nombreProducto + ", Precio: " + precioCent + ", Stock: " + stock;
    }

}

package ismaeljerruzjavierparodi;

import javax.swing.JOptionPane;

public class MaquinaVending {

    public static void main(String[] args) {

        //NOTA: PULSAR 0 PARA TERMINAR EL PROGRAMA
        Maquina maquina = new Maquina(); //Se crea la máquina

        //Listas de strings usadas en los carteles joption para permitir su uso en diferentes posiciones del código
        String[] listaMenu = {"Caja", "Bandeja 1", "Bandeja 2", "Bandeja 3", "Bandeja 4", "Bandeja 5", "Bandeja 6", "Salir"}; //del 0 al 8
        String[] subListaCaja = {"Consultar efectivo", "Recaudar efectivo", "Añadir efectivo", "Consultar acumulado por tarjetas", "Atrás"}; //del 1 al 5
        String[] subListaProducto = {"Consultar y modificar código de bandeja", "Consultar y modificar producto", "Consultar y modificar precio", "Consultar y modificar stock", "Atrás"}; //del 1 al 4
        boolean modoAdmin = true; //Nos hará salir del modo admin
        boolean seleccion = true; //Boolean para salir de los submenus

        int menuAdmin, subMenuAdmin;  //Usados para seleccionar en los arrays la opcion de menu, submenu

        System.out.println(maquina); //Se muestran por consola sus atributos

        System.out.println("\nPara apagar la máquina, introducir \"000\" + el código de administrador");
        
        String opcion = ""; //Opcion que se va a elegir

        do {
            opcion = JOptionPane.showInputDialog("Introduzca el número de bandeja");

            /*Condición para entrar a cada una de las 6 bandejas (esto cambiará el 
            valor de precio, nombre y stock), otra para entrar en el modo administrador,
            y el resto de opciones que, serán opciones inválidas.*/
            try { //Controla el botón cancelar

                //MODO ADMINISTRADOR
                if (opcion.equalsIgnoreCase(maquina.getCODIGO_ADMIN().getCODIGO())) {

                    do {
                        seleccion = true;
                        menuAdmin = JOptionPane.showOptionDialog(null, "Elija una opción", "Opciones administrador", JOptionPane.DEFAULT_OPTION,
                                JOptionPane.QUESTION_MESSAGE, null, listaMenu, listaMenu[0]);

                        switch (menuAdmin) {
                            case 0:
                                //MENU 1 - OPCIONES DE CAJA
                                do {
                                    subMenuAdmin = JOptionPane.showOptionDialog(null, "Elija una opción", "Opciones administrador", JOptionPane.DEFAULT_OPTION,
                                            JOptionPane.QUESTION_MESSAGE, null, subListaCaja, subListaCaja[0]);
                                    switch (subMenuAdmin) {
                                        case 0:
                                            //MENU 1.1 - CONSULTAR EFECTIVO
                                            maquina.getCaja().consultarEfectivo();

                                            break;

                                        case 1:
                                            //MENU 1.2 - VACIAR CAJA
                                            maquina.getCaja().vaciarEfectivo();
                                            break;

                                        case 2:
                                            //MENU 1.3 - AÑADIR EFECTIVO
                                            maquina.getCaja().anadirMoneda();
                                            break;

                                        case 3:
                                            //MENU 1.4 - RECAUDADO TARJETAS
                                            maquina.getCaja().consultarAcumuladoTarjeta();
                                            break;

                                        case 4:
                                            //SALIR DE SUBMENU 1
                                            seleccion = false;
                                            break;
                                    }
                                } while (seleccion);
                                break;

                            case 1:
                                //MENU 2 - OPCIONES BANDEJA 1
                                do {
                                    subMenuAdmin = JOptionPane.showOptionDialog(null, "Elija una opción", "Opciones administrador", JOptionPane.DEFAULT_OPTION,
                                            JOptionPane.QUESTION_MESSAGE, null, subListaProducto, subListaProducto[0]);
                                    switch (subMenuAdmin) {
                                        case 0:

                                            //subMENU 2.1 - CONSULTAR Y/O MODIFICAR CODBANDEJA
                                            consultarModificarCodigoBandeja(maquina, maquina.getBandeja1());
                                            break;

                                        case 1:
                                            //subMENU 2.2 - CONSULTAR Y/O MODIFICAR PRODUCTO
                                            maquina.getBandeja1().modificarProducto();
                                            break;

                                        case 2:
                                            //subMENU 2.3 - CONSULTAR Y/O MODIFICAR PRECIO
                                            maquina.getBandeja1().modificarPrecio();
                                            break;

                                        case 3:
                                            //subMENU 2.4 - CONSULTAR Y/O MODIFICAR STOCK
                                            maquina.getBandeja1().modificarStock();
                                            break;

                                        case 4:
                                            //SALIR DE SUBMENU 2
                                            seleccion = false;
                                            break;
                                    }
                                } while (seleccion);
                                break;

                            case 2:
                                //MENU 3 - OPCIONES BANDEJA 2
                                do {
                                    subMenuAdmin = JOptionPane.showOptionDialog(null, "Elija una opción", "Opciones administrador", JOptionPane.DEFAULT_OPTION,
                                            JOptionPane.QUESTION_MESSAGE, null, subListaProducto, subListaProducto[0]);
                                    switch (subMenuAdmin) {
                                        case 0:
                                            //subMENU 3.1 - CONSULTAR Y/O MODIFICAR CODBANDEJA
                                            consultarModificarCodigoBandeja(maquina, maquina.getBandeja2());

                                            break;

                                        case 1:
                                            //subMENU 3.2 - CONSULTAR Y/O MODIFICAR PRODUCTO
                                            maquina.getBandeja2().modificarProducto();
                                            break;

                                        case 2:
                                            //subMENU 3.3 - CONSULTAR Y/O MODIFICAR PRECIO
                                            maquina.getBandeja2().modificarPrecio();
                                            break;

                                        case 3:
                                            //subMENU 3.4 - CONSULTAR Y/O MODIFICAR STOCK
                                            maquina.getBandeja2().modificarStock();
                                            break;

                                        case 4:
                                            //SALIR DE subMENU 3
                                            seleccion = false;
                                            break;
                                    }
                                } while (seleccion);
                                break;

                            case 3:
                                //MENU 4 - OPCIONES BANDEJA 3
                                do {
                                    subMenuAdmin = JOptionPane.showOptionDialog(null, "Elija una opción", "Opciones administrador", JOptionPane.DEFAULT_OPTION,
                                            JOptionPane.QUESTION_MESSAGE, null, subListaProducto, subListaProducto[0]);
                                    switch (subMenuAdmin) {
                                        case 0:
                                            //subMENU 4.1 - CONSULTAR Y/O MODIFICAR CODBANDEJA
                                            consultarModificarCodigoBandeja(maquina, maquina.getBandeja3());

                                            break;

                                        case 1:
                                            //subMENU 4.2 - CONSULTAR Y/O MODIFICAR PRODUCTO
                                            maquina.getBandeja3().modificarProducto();
                                            break;

                                        case 2:
                                            //subMENU 4.3 - CONSULTAR Y/O MODIFICAR PRECIO
                                            maquina.getBandeja3().modificarPrecio();
                                            break;

                                        case 3:
                                            //subMENU 4.4 - CONSULTAR Y/O MODIFICAR STOCK
                                            maquina.getBandeja3().modificarStock();
                                            break;

                                        case 4:
                                            //SALIR DE SUBMENU 4
                                            seleccion = false;
                                            break;
                                    }
                                } while (seleccion);
                                break;

                            case 4:
                                //MENU 5 - OPCIONES BANDEJA 4
                                do {
                                    subMenuAdmin = JOptionPane.showOptionDialog(null, "Elija una opción", "Opciones administrador", JOptionPane.DEFAULT_OPTION,
                                            JOptionPane.QUESTION_MESSAGE, null, subListaProducto, subListaProducto[0]);
                                    switch (subMenuAdmin) {
                                        case 0:
                                            //subMENU 5.1 - CONSULTAR Y/O MODIFICAR CODBANDEJA
                                            consultarModificarCodigoBandeja(maquina, maquina.getBandeja4());

                                            break;

                                        case 1:
                                            //subMENU 5.2 - CONSULTAR Y/O MODIFICAR PRODUCTO
                                            maquina.getBandeja4().modificarProducto();
                                            break;

                                        case 2:
                                            //subMENU 5.3 - CONSULTAR Y/O MODIFICAR PRECIO
                                            maquina.getBandeja4().modificarPrecio();
                                            break;

                                        case 3:
                                            //subMENU 5.4 - CONSULTAR Y/O MODIFICAR STOCK
                                            maquina.getBandeja4().modificarStock();
                                            break;

                                        case 4:
                                            //SALIR DE SUBMENU 5
                                            seleccion = false;
                                            break;
                                    }
                                } while (seleccion);
                                break;

                            case 5:
                                //MENU 6 - OPCIONES BANDEJA 5
                                do {
                                    subMenuAdmin = JOptionPane.showOptionDialog(null, "Elija una opción", "Opciones administrador", JOptionPane.DEFAULT_OPTION,
                                            JOptionPane.QUESTION_MESSAGE, null, subListaProducto, subListaProducto[0]);
                                    switch (subMenuAdmin) {
                                        case 0:
                                            //subMENU 6.1 - CONSULTAR Y/O MODIFICAR CODBANDEJA
                                            consultarModificarCodigoBandeja(maquina, maquina.getBandeja5());

                                            break;

                                        case 1:
                                            //subMENU 6.2 - CONSULTAR Y/O MODIFICAR PRODUCTO
                                            maquina.getBandeja5().modificarProducto();
                                            break;

                                        case 2:
                                            //subMENU 6.3 - CONSULTAR Y/O MODIFICAR PRECIO
                                            maquina.getBandeja5().modificarPrecio();
                                            break;

                                        case 3:
                                            //subMENU 6.4 - CONSULTAR Y/O MODIFICAR STOCK
                                            maquina.getBandeja5().modificarStock();
                                            break;

                                        case 4:
                                            //SALIR DE SUBMENU 6
                                            seleccion = false;
                                            break;
                                    }
                                } while (seleccion);
                                break;

                            case 6:
                                //MENU 7 - OPCIONES BANDEJA 6
                                do {
                                    subMenuAdmin = JOptionPane.showOptionDialog(null, "Elija una opción", "Opciones administrador", JOptionPane.DEFAULT_OPTION,
                                            JOptionPane.QUESTION_MESSAGE, null, subListaProducto, subListaProducto[0]);
                                    switch (subMenuAdmin) {
                                        case 0:
                                            //subMENU 7.1 - CONSULTAR Y/O MODIFICAR CODBANDEJA
                                            consultarModificarCodigoBandeja(maquina, maquina.getBandeja6());

                                            break;

                                        case 1:
                                            //subMENU 7.2 - CONSULTAR Y/O MODIFICAR PRODUCTO
                                            maquina.getBandeja6().modificarProducto();
                                            break;

                                        case 2:
                                            //subMENU 7.3 - CONSULTAR Y/O MODIFICAR PRECIO
                                            maquina.getBandeja6().modificarPrecio();
                                            break;

                                        case 3:
                                            //subMENU 7.4 - CONSULTAR Y/O MODIFICAR STOCK
                                            maquina.getBandeja6().modificarStock();
                                            break;

                                        case 4:
                                            //SALIR DE SUBMENU 7
                                            seleccion = false;
                                            break;
                                    }
                                } while (seleccion);
                                break;

                            case 7:
                                //SALIR DE MODO ADMIN
                                modoAdmin = false;
                                break;
                        }
                    } while (modoAdmin);

                    //FIN MODO ADMIN
                    //COMPARA CON LOS CÓDIGOS DE BANDEJA
                } else if (opcion.equalsIgnoreCase(maquina.getBandeja1().getCodigoBandeja())) {

                    ventaProducto(maquina, maquina.getBandeja1()); //Método que realiza la venta completa de cada bandeja                

                } else if (opcion.equalsIgnoreCase(maquina.getBandeja2().getCodigoBandeja())) {

                    ventaProducto(maquina, maquina.getBandeja2());

                } else if (opcion.equalsIgnoreCase(maquina.getBandeja3().getCodigoBandeja())) {

                    ventaProducto(maquina, maquina.getBandeja3());

                } else if (opcion.equalsIgnoreCase(maquina.getBandeja4().getCodigoBandeja())) {

                    ventaProducto(maquina, maquina.getBandeja4());

                } else if (opcion.equalsIgnoreCase(maquina.getBandeja5().getCodigoBandeja())) {

                    ventaProducto(maquina, maquina.getBandeja5());

                } else if (opcion.equalsIgnoreCase(maquina.getBandeja6().getCodigoBandeja())) {

                    ventaProducto(maquina, maquina.getBandeja6());

                } else if (opcion.equals("000" + maquina.getCODIGO_ADMIN().getCODIGO())) {

                    JOptionPane.showMessageDialog(null, "Apagando máquina...");
                    break; //Evita el mensaje "Código no válido al finalizar el programa

                } else { //Si no es ninguna de las opciones, no es válido

                    JOptionPane.showMessageDialog(null, "Código no válido");

                    //stock = -1; //Stock negativo para que salte directamente al while
                }

            } catch (NullPointerException npe) {
                /*Al tomar el valor 0, es distinto a la condición while, por lo 
                que no permite apagar la máquina salvo al admin.
                Si se desea cambiar esta opción para que el botón "Cancelar"
                apague la máquina, sencillamente habría que comentar la línea
                opcion = "0"; y descomentar la siguiente:*/
                //opcion = "000" + maquina.getCODIGO_ADMIN().getCODIGO();
                opcion = "0";
            }

        } while (!opcion.equals("000" + maquina.getCODIGO_ADMIN().getCODIGO())); //Si introduce 000 + el código de administrador, se apaga la máquina  
    }

    private static void ventaProducto(Maquina maquina, Bandeja bandeja) {

        String[] valorDeCadaMoneda = {"20€", "10€", "5€", "2€", "1€", "0.50€", "0.20€", "0.10€", "0.05€", "FIN"};//del 1 al 10

        if (bandeja.getStock() > 0) { //Hay suficiente stock del producto

            //Muestra el producto, precio y pregunta por el pago
            JOptionPane.showMessageDialog(null, "Ha elegido el producto "
                    + bandeja.getNombreProducto() + "\nPrecio: " + Utilidades.centimosAEuro(bandeja.getPrecioCent()) + " €");

            //Opciones de pago(0 efectivo, 1 tarjeta, 2 cancelar)
            String[] pago = {"Efectivo", "Tarjeta", "Cancelar"};

            int metodoDePago = JOptionPane.showOptionDialog(null, "¿Cómo desea pagar",
                    "Pasarela de pago", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, pago, pago[0]);

            if (metodoDePago == 0) { //Efectivo
                //Introducir Monedas
                int[] cantidadDeCadaMoneda = new int[9];
                int entradaMonedas;

                do {
                    entradaMonedas = JOptionPane.showOptionDialog(null, "Introduzca las monedas",
                            "Pasarela de pago", JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, valorDeCadaMoneda,
                            valorDeCadaMoneda[0]);

                    if (entradaMonedas != 9) { //Si no se pulsa FIN

                        cantidadDeCadaMoneda[entradaMonedas]++; //Se añade la moneda introducida
                    }

                } while (entradaMonedas != 9); //Hasta que se pulse FIN            

                //Las pasamos al método cambio para comprobar si hay cambio
                int[] cambio = maquina.getCaja().cambio(cantidadDeCadaMoneda, bandeja.getPrecioCent());

                switch (cambio[0]) { //Primera posición del array devuelto por cambio

                    case -1: //-1 Indica falta de cambio

                        JOptionPane.showMessageDialog(null, "Cambio insuficiente");
                        break;

                    case -2: // -2 Indica dinero introducido insuficiente

                        JOptionPane.showMessageDialog(null, "El dinero introducido es insuficiente");
                        break;

                    default: //En los demás casos, se realiza la operación

                        JOptionPane.showMessageDialog(null, "Su cambio: \n"
                                + "\n-Billetes de 20€: " + cambio[0]
                                + "\n-Billetes de 10€: " + cambio[1]
                                + "\n-Billetes de 5€: " + cambio[2]
                                + "\n-Monedas de 2€: " + cambio[3]
                                + "\n-Monedas de 1€: " + cambio[4]
                                + "\n-Monedas de 0.50€: " + cambio[5]
                                + "\n-Monedas de 0.20€: " + cambio[6]
                                + "\n-Monedas de 0.10€: " + cambio[7]
                                + "\n-Monedas de 0.05€: " + cambio[8]);

                        JOptionPane.showMessageDialog(null, "¡Gracias por su compra!");

                        maquina.getBandeja1().venta();

                        break;
                }

            } else if (metodoDePago == 1) { //Tarjeta

                String numeroDeTarjeta = "", cvv = "";
                int anio = 0, mes = 0;

                try { //Controla NFE para entradas en blanco

                    numeroDeTarjeta = JOptionPane.showInputDialog("Número de tarjeta: ");

                    mes = Integer.parseInt(JOptionPane.showInputDialog("Mes de caducidad (mm): "));

                    anio = Integer.parseInt(JOptionPane.showInputDialog("Año de caducidad (aaaa): "));

                    cvv = JOptionPane.showInputDialog("CVV: ");

                    //Si los datos corresponden con una tarjeta lógica
                    if (Tarjeta.comprobarNumero(numeroDeTarjeta)
                            && Tarjeta.comprobarFecha(anio, mes) && Tarjeta.comprobarCVV(cvv)) {

                        Tarjeta introducida = new Tarjeta(numeroDeTarjeta, cvv, anio, mes);

                        //Comprueba si está caducada
                        if (!Tarjeta.fechaValidez(anio, mes)) {

                            JOptionPane.showMessageDialog(null, "Tarjeta vencida\nOperación cancelada");

                            //Comprueba si coincide con alguna de las tarjetas de la BBDD
                        } else if (introducida.toString().equals(maquina.getTARJETA1().toString())
                                || introducida.toString().equals(maquina.getTARJETA2().toString())
                                || introducida.toString().equals(maquina.getTARJETA3().toString())) {

                            maquina.getCaja().cobrarTarjeta(bandeja.getPrecioCent());

                            JOptionPane.showMessageDialog(null, "¡Gracias por su compra!");

                        } else {

                            JOptionPane.showMessageDialog(null, "Tarjeta no válida\nOperación cancelada");
                        }

                    } else {

                        JOptionPane.showMessageDialog(null, "Tarjeta no válida\nOperación cancelada");

                    }

                } catch (NumberFormatException nfe) {

                    JOptionPane.showMessageDialog(null, "Tarjeta no válida\nOperación cancelada");

                }

            }

        } else if (bandeja.getStock() == 0) { //Si el stock es 0

            JOptionPane.showMessageDialog(null, "Producto agotado"); //Salta al while
        }

    }

    private static void consultarModificarCodigoBandeja(Maquina maquina, Bandeja bandeja) {

        boolean bucle = true;

        do { //Pide el código hasta uno correcto

            String nuevoCodigo = "";

            try { //Controla el botón cancelar

                nuevoCodigo = JOptionPane.showInputDialog("El código de la Bandeja es " + bandeja.getCodigoBandeja()
                        + "\nIntroduzca un nuevo código").toUpperCase();

                if (Bandeja.modificarCodBandeja(nuevoCodigo)) { //Comprueba que tiene 3 dígitos

                    if (nuevoCodigo.equalsIgnoreCase(maquina.getBandeja1().getCodigoBandeja()) //Si el número es igual que algún otro, no lo cambia
                            || nuevoCodigo.equalsIgnoreCase(maquina.getBandeja2().getCodigoBandeja())
                            || nuevoCodigo.equalsIgnoreCase(maquina.getBandeja3().getCodigoBandeja())
                            || nuevoCodigo.equalsIgnoreCase(maquina.getBandeja4().getCodigoBandeja())
                            || nuevoCodigo.equalsIgnoreCase(maquina.getBandeja5().getCodigoBandeja())
                            || nuevoCodigo.equalsIgnoreCase(maquina.getBandeja6().getCodigoBandeja())) {

                        JOptionPane.showMessageDialog(null, "Código ya utilizado en otra bandeja");

                    } else {

                        bandeja.setCodigoBandeja(nuevoCodigo);
                        bucle = false;
                    }

                } else {

                    JOptionPane.showMessageDialog(null, "Formato no válido. Por favor, inténtelo de nuevo.");
                }

            } catch (NullPointerException npe) {

                bucle = false;
            }

        } while (bucle);

    }

}

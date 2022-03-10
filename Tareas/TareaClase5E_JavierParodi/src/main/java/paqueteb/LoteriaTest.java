package paqueteb;

import javax.swing.JOptionPane;

/**
 *
 * @author JaviA
 */
public class LoteriaTest {

    public static void main(String[] args) {

        //Crea una lotería de 1000 registros
        Loteria loteria = new Loteria(1000);

        loteria.mostrarNumeros();

        String decimo;

        do {

            decimo = JOptionPane.showInputDialog("Introduce el número a comprobar");

            try {

                if (decimo.length() == 5) { //Comprueba que tenga 5 dígitos

                    boolean validez = true;

                    for (int i = 0; i < 5; i++) { //Comprueba que son números

                        if (decimo.charAt(i) < 48 || decimo.charAt(i) > 57) {

                            validez = false;
                        }

                    }

                    if (validez) { //Si todos lo son, comprueba premio

                        String premio = loteria.consultarPremio(decimo); //Consulta premio

                        if (premio == null) { //Si no existe el número

                            premio = "No premiado"; //No premiado
                        }

                        JOptionPane.showMessageDialog(null, premio);

                    } else {

                        JOptionPane.showMessageDialog(null, "Introduzca un número válido");
                    }

                } else {

                    JOptionPane.showMessageDialog(null, "Longitud no válida");
                }

            } catch (NullPointerException npe) {

                JOptionPane.showMessageDialog(null, "¡Mucha suerte!");
            }

        } while (decimo != null); //Hasta pulsar 'Cancelar' o 'X'

    }

}

package tarea1gui.javierparodipinero;

import javax.swing.JFrame;

/**
 *
 * @author JaviA
 */
public class Test3 {

    public static void main(String[] args) {
        // Construimos la ventana
        JFrame frame = new JFrame("Javier Parodi Piñero");

        // La ventana no se puede redimensionar
        frame.setResizable(false);

        // Posición de la ventana
        frame.setLocationRelativeTo(null);

        // Incluimos el panel en la ventana
        frame.add(new Saludo());

        // Ajusta el frame al contenido
        frame.pack();

        // Hacemos visible la ventana
        frame.setVisible(true);

        //Acción por defecto al pulsar el botón de cierre de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

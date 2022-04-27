package tarea1gui.javierparodipinero;

import java.awt.Color;
import javax.swing.JFrame;

public class Test1 {

    public static void main(String[] args) {

        // Construimos la ventana
        JFrame ventanaPrincipal = new JFrame("Javier Parodi Piñero");

        // Establecemos posición y tamaño
        //ventanaPrincipal.setBounds(250, 250, 800, 600);
        ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);

        // Añadimos un objeto MiPanel al JFrame
        MiPanel fondoNaranja = new MiPanel(Color.ORANGE);
        ventanaPrincipal.add(fondoNaranja);
        fondoNaranja.getEtiqueta().setText("Fondo naranja");

        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);

        // Acción por defecto al pulsar el botón de cierre de la ventana
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

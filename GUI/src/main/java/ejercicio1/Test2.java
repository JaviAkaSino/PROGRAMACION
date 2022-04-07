package ejercicio1;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

public class Test2 {

    public static void main(String[] args) {

        // Construimos la ventana
        JFrame ventanaPrincipal = new JFrame("Javier Parodi Piñero");

        // Establecemos posición y tamaño
        //ventanaPrincipal.setBounds(250, 250, 800, 600);
        ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);

        // Añadimos un objeto MiPanel al JFrame
        //ventanaPrincipal.add(new MiPanel(Color.ORANGE));
        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);

        // Acción por defecto al pulsar el botón de cierre de la ventana
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //
        // Establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());

        // Añadir los paneles en cada posición del BorderLayout
        // Añadir panel rosa en la posición superior (NORTH)
        MiPanel norte = new MiPanel(Color.PINK);
        norte.getEtiqueta().setText("Arriba");
        ventanaPrincipal.add(norte, BorderLayout.NORTH);

        // Añadir panel magenta en la posición inferior (SOUTH)
        MiPanel sur = new MiPanel(Color.MAGENTA);
        ventanaPrincipal.add(sur, BorderLayout.SOUTH);
        sur.getEtiqueta().setText("Abajo");

        // Añadir panel gris en la posición central (CENTER)
        MiPanel centro = new MiPanel(Color.BLUE);
        ventanaPrincipal.add(centro, BorderLayout.CENTER);
        centro.getEtiqueta().setText("Centro");

        // Añadir panel cián en la posición izquierda (WEST)
        MiPanel oeste = new MiPanel(Color.CYAN);
        ventanaPrincipal.add(oeste, BorderLayout.WEST);
        oeste.getEtiqueta().setText("Izquierda");

        // Añadir panel negro en la posición derecha (EAST)
        MiPanel este = new MiPanel(Color.BLACK);
        ventanaPrincipal.add(este, BorderLayout.EAST);
        este.getEtiqueta().setText("Derecha");

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import javax.swing.JFrame;

/**
 *
 * @author JaviA
 */
public class Calculadora {

    public static void main(String[] args) {


        // Construimos la ventana
        JFrame frame = new JFrame("Calculadora");

        // La ventana se puede redimensionar
        frame.setResizable(true);

        // Posición de la ventana
        frame.setLocationRelativeTo(null);

        // Incluimos el panel en la ventana
        frame.add(new PanelCalculadora());

        // Ajusta el frame al contenido
        frame.pack();

        // Hacemos visible la ventana
        frame.setVisible(true);

        //Acción por defecto al pulsar el botón de cierre de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}

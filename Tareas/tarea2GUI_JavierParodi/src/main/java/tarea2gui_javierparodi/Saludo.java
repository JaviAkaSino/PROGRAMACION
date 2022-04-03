/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2gui_javierparodi;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

// Se implementa la interfaz
public class Saludo extends JPanel implements ActionListener {

    private JButton botonNombre;
    private JButton botonApellidos;
    private JTextArea texto;

    public Saludo() {
        initComponents();
    }

    private void initComponents() {

        botonNombre = new JButton("Nombre");
        botonApellidos = new JButton("Apellidos");
        texto = new JTextArea(1, 25);
        texto.setBackground(Color.ORANGE);

        this.setLayout(new FlowLayout());

        this.add(botonNombre);
        this.add(botonApellidos);
        this.add(texto);

        /* Se le indica al objeto boton que escuche eventos tipo click
        y se pasa como argumento una referencia de tipo ActionListener
        En este caso se pasa this que es el panel sobre el 
        que está el botón y que implementa la interfaz ActionListener*/
        botonNombre.addActionListener(this);
        botonApellidos.addActionListener(this);

    }

    @Override
    // Sobrescribimos el método de la interfaz
    public void actionPerformed(ActionEvent ae) {

        // Si el botón pulsado es botonSaludar
        if (ae.getSource() == botonNombre) {

            texto.setBackground(Color.WHITE);
            texto.setText("Javier");

        } else {

            texto.setBackground(Color.BLUE);
            texto.setText("Parodi Piñero");
        }

    }

}

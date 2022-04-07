/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

// Se implementa la interfaz
public class NumeroAleatorio extends JPanel implements ActionListener {

    private JButton botonAleatorio;
    private JLabel numero;

    public NumeroAleatorio() {
        initComponents();
    }

    private void initComponents() {

        botonAleatorio = new JButton("Generar Aleatorio");
        numero = new JLabel("Número");

        this.setLayout(new FlowLayout());

        this.add(botonAleatorio);
        this.add(numero);

        botonAleatorio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                Random rnd = new Random();
                int random = rnd.nextInt(11);

                numero.setText(random + "");

            }
        });

        botonAleatorio.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent me) {

                
                
            }

            @Override
            public void mousePressed(MouseEvent me) {

            }

            @Override
            public void mouseReleased(MouseEvent me) {

            }

            @Override
            public void mouseEntered(MouseEvent me) {

                botonAleatorio.setBackground(Color.ORANGE);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                botonAleatorio.removeMouseListener(this);

            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

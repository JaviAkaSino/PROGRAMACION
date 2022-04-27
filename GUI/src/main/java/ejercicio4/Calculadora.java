/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio3.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

// Se implementa la interfaz
public class Calculadora extends JPanel implements ActionListener {

    private JButton boton0 =  new JButton("0");
    private JButton boton1 =  new JButton("1");
    private JButton boton2 =  new JButton("2");
    private JButton boton3 =  new JButton("3");
    private JButton boton4 =  new JButton("4");
    private JButton boton5 =  new JButton("5");
    private JButton boton6 =  new JButton("6");
    private JButton boton7 =  new JButton("7");
    private JButton boton8 =  new JButton("8");
    private JButton boton9 =  new JButton("9");
    private JButton botonComa =  new JButton(",");
    
    private JButton botonSuma =  new JButton("+");
    private JButton botonResta =  new JButton("-");
    private JButton botonMulti =  new JButton("*");
    private JButton botonDivi =  new JButton("/");
    private JButton botonIgual = new JButton("=");
    
    private JButton botonClear = new JButton("C");
    
    private JLabel numero;

    public Calculadora() {
        initComponents();
    }

    private void initComponents() {

        this.setLayout(new GridLayout());

        this.add(boton0);
        this.add(numero);

        boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                Random rnd = new Random();
                int random = rnd.nextInt(11);

                numero.setText(random + "");

            }
        });

        boton0.addMouseListener(new MouseListener() {

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

                boton0.setBackground(Color.ORANGE);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                boton0.setBackground(null);

            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

package ejercicio4;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

// Se implementa la interfaz
@SuppressWarnings("serial")
public class Botones extends JPanel {

    private JButton[] listaBotones = new JButton[20];

    public Botones() {
        this.initComponents();
    }

    private void initComponents() {

        //Creación de los botones	
        

        listaBotones[0] = new JButton("7");
        listaBotones[1] = new JButton("8");
        listaBotones[2] = new JButton("9");
        listaBotones[3] = new JButton("/");
        listaBotones[4] = new JButton("V");
        listaBotones[5] = new JButton("4");
        listaBotones[6] = new JButton("5");
        listaBotones[7] = new JButton("6");
        listaBotones[8] = new JButton("*");
        listaBotones[9] = new JButton("x²");
        listaBotones[10] = new JButton("1");
        listaBotones[11] = new JButton("2");
        listaBotones[12] = new JButton("3");
        listaBotones[13] = new JButton("-");
        listaBotones[14] = new JButton("<-");
        listaBotones[15] = new JButton(".");
        listaBotones[16] = new JButton("0");
        listaBotones[17] = new JButton("C");
        listaBotones[18] = new JButton("+");
        listaBotones[19] = new JButton("=");
        listaBotones[19].setBackground(Color.cyan);

        // Establecemos el layout
        this.setLayout(new GridLayout(4, 5));

        for (JButton boton : listaBotones) {
            this.add(boton);
        }

    }

    public JButton[] getListaBotones() {
        return listaBotones;
    }

}

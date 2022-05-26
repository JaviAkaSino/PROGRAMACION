package ejercicio4;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

// Se implementa la interfaz
@SuppressWarnings("serial")
public class Botones extends JPanel{
	
	private JButton[] listaBotones = new JButton[16];
	
	
	
	public Botones() {
		this.initComponents();
	}

	private void initComponents() {
		
	//Creación de los botones	
	for(int i = 0; i < 10 ; i++){

		listaBotones[i] = new JButton(Integer.toString(i)); 		
	}
	
		listaBotones[10] = new JButton("+");
		listaBotones[11] = new JButton("-");
		listaBotones[12] = new JButton("*");
		listaBotones[13] = new JButton("/");
	    listaBotones[14] = new JButton("=");
	    listaBotones[15] = new JButton("C");
	
	
	    // Establecemos el layout
        this.setLayout(new GridLayout(4, 4));

        for (JButton boton : listaBotones) {
            this.add(boton);
        }
 
}

	public JButton[] getListaBotones() {
	            return listaBotones;
	        }

}

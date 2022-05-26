package ejercicio4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelCalculadora extends JPanel implements ActionListener {

	private Botones botones;
	private JTextArea areaTexto;
	private int tipoOperacion;
	private String operador = "";
	private String segundo = "0";
	private int operando1, operando2;

	public PanelCalculadora() {
		initComponents();
		this.tipoOperacion = -1;
	}

	// Se inicializan los componentes gráficos y se colocan en el panel
	private void initComponents() {

		// Creamos el panel de botones
		botones = new Botones();

		// Creamos el área de texto
		areaTexto = new JTextArea(10, 50);

		areaTexto.setEditable(false);
		areaTexto.setBackground(Color.white);

		// Establecemos layout del panel principal
		this.setLayout(new BorderLayout());
		// Colocamos la botonera y el área texto
		this.add(areaTexto, BorderLayout.NORTH);
		this.add(botones, BorderLayout.SOUTH);

		for (JButton boton : this.botones.getListaBotones()) {
			boton.addActionListener(this);
		}

	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		String pulsado;

		// Se obtiene el objeto que desencadena el evento
		Object o = ae.getSource();

		// Si es un botón
		if (o instanceof JButton) {

			try {
				
				pulsado = ((JButton) o).getText();

				if ("0123456789".contains(pulsado)) { // Si es un número

					areaTexto.setText(areaTexto.getText() + ((JButton) o).getText());

					// Deb
					System.out.println(areaTexto.getText());

				} else if ("+-/*".contains(pulsado)) { // Si es un operador

					operando1 = Integer.parseInt(areaTexto.getText());// Guarda el operando 1

					operador = pulsado; // Guarda el operador

					areaTexto.setText("");// Se limpia la pantalla y busca el operando 2


				} else if (pulsado.equals("=")) { // Se pulsa =

					operando2 = Integer.parseInt(areaTexto.getText());// Guarda el operando 2

					System.out.println("Igual");

					switch (operador) {

					case "+":

						areaTexto.setText(Integer.toString(operando1 + operando2));
						System.out.println("SUMA");
											
						break;

					case "-":

						areaTexto.setText(Integer.toString(operando1 - operando2));
						System.out.println("RESTA");
						
						break;

					case "*":
						
						areaTexto.setText(Integer.toString(operando1 * operando2));
						System.out.println("MULTIPLICACIÓN");

						break;

					case "/":
						
						areaTexto.setText(Integer.toString(operando1 / operando2));
						System.out.println("DIVISIÓN");

						break;

					}

				} else { // Se pulsa C
					areaTexto.setText("");
					System.out.println("C");
				}
				
			} catch (NumberFormatException nfe) {
				
				areaTexto.setText("");
				System.out.println("ERROR");
				
			}

			

		}

		/*
		 * if (o == botones.getListaBotones()[0]) {
		 * 
		 * if (!areaTexto.getText().equals("")) {
		 * 
		 * areaTexto.setText(areaTexto.getText() + "0"); }
		 * 
		 * }
		 */

	}

}

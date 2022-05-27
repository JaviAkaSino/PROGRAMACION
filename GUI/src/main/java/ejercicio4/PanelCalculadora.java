package ejercicio4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelCalculadora extends JPanel implements ActionListener {

    private Botones botones;
    private JTextArea areaTexto;
    private String operador = "";
    private double operando1, operando2;

    public PanelCalculadora() {
        initComponents();
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

        String pulsado; //Guardará el valor del botón pulsado

        // Se obtiene el objeto que desencadena el evento
        Object o = ae.getSource();

        // Si es un botón
        if (o instanceof JButton) {

            try { //Controla las posibles excepciones

                pulsado = ((JButton) o).getText(); //Guarda el valor del botón pulsado

                if ("0123456789.".contains(pulsado)) { // Si es un número o .
                    //Guarda su valor en el textArea
                    areaTexto.setText(areaTexto.getText() + ((JButton) o).getText());

                    // Debug
                    System.out.println(areaTexto.getText());

                } else if (pulsado.equals("=")) { // Se pulsa =

                    //Si no hay valores, el resultado es 0
                    if (areaTexto.getText().equals("") && operando1 == 0 && operando2 == 0) {
                        areaTexto.setText("0");
                    }
                    
                        try{
                            operando2 = Double.parseDouble(areaTexto.getText());// Guarda el operando 2
                            
                        }catch(NumberFormatException nfe){
                            operando2=0;
                        }
                        
                        
                    
                    

                    switch (operador) {

                        case "+": //Suma

                            areaTexto.setText(Double.toString(operando1 + operando2));
                            System.out.println("SUMA");

                            break;

                        case "-": //Resta

                            areaTexto.setText(Double.toString(operando1 - operando2));
                            System.out.println("RESTA");

                            break;

                        case "*": //Multiplicación

                            areaTexto.setText(Double.toString(operando1 * operando2));
                            System.out.println("MULTIPLICACIÓN");

                            break;

                        case "/": //División

                            if (operando2 != 0) { // COntrola las divisiones entre 0

                                areaTexto.setText(Double.toString(operando1 / operando2));

                            } else {

                                areaTexto.setText("Indeterminación (división entre 0)");
                            }

                            break;

                        case "x²": //Cuadrado

                            areaTexto.setText(Double.toString(Math.pow(operando1, 2)));
                            System.out.println("CUADRADO");

                            break;

                        case "V": //Cuadrado

                            areaTexto.setText(Double.toString(Math.sqrt(operando1)));
                            System.out.println("RAIZ CUADRADA");

                            break;

                    }

                    //Se vacían los operandos y el operador para la nueva cuenta
                    //Se mantiene el valor del areaTexto por si se quiere seguir operando
                    operando1 = 0;
                    operando2 = 0;
                    operador = "";

                } else if (pulsado.equals("C")) { // Se pulsa C - Borrar todo
                    areaTexto.setText("");
                    operando1 = 0;
                    operando2 = 0;
                    operador = "";

                } else if (pulsado.equals("<-")) { // Borra 1
                    if (areaTexto.getText().length() > 1) {

                        areaTexto.setText(areaTexto.getText().substring(0, areaTexto.getText().length() - 1));

                    } else {

                        areaTexto.setText("");
                    }

                } else { // Si es un operador ("+-/*x²V".contains(pulsado)) 

                    operando1 = Double.parseDouble(areaTexto.getText());// Guarda el operando 1

                    operador = pulsado; // Guarda el operador

                    areaTexto.setText("");// Se limpia el textArea y busca el operando 2

                }

            } catch (NumberFormatException nfe) {

                areaTexto.setText("ERROR");
                operando1 = 0;
                operando2 = 0;
                operador = "";
                System.out.println("ERROR");

            }

        }

    }

}

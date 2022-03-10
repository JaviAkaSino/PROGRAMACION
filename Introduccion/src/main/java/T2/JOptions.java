
package T2;

import javax.swing.JOptionPane;
        
public class JOptions {

    public static void main(String[] args) {
        
        double velMMin;
        double distancia;
        final double KMH_MMIN = 1000.0 / 60.0;
        
        
        
        String texto = JOptionPane.showInputDialog(null, "Introduce la "
                + "velocidad en Km/h");
        
        double velKmH = Double.parseDouble(texto);
        
        texto = JOptionPane.showInputDialog(null, "Introduce el tiempo "
                + "en minutos");
        
        double tiempoMin = Double.parseDouble(texto);
        
        velMMin = velKmH * KMH_MMIN;

        distancia = velMMin * tiempoMin;
        
        JOptionPane.showMessageDialog(null, "La distancia recorrida por el "
                + "cuerpo es de " + distancia + "metros");
        
                
        
        
        
        
        
        
        
        
        
                
        
                
              
    }
    
}

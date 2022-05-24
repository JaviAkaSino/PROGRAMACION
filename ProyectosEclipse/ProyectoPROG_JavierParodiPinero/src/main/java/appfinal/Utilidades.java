package appfinal;

import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class Utilidades {

	public static <T> String listaString(List<T> lista) { //Lee cualquier lista y devuelve el String resultante
			
		String str = "";
		
		
		for (Iterator<T> iterator = lista.iterator(); iterator.hasNext();) {
			T t = (T) iterator.next();
			str += t + "\n\n";	
			
		}
		
		return str;
	}
	
	public static int leerEnteroJOption(String mensaje) { //Lee un entero por JOptionPane con un mensaje dado
		
		int entero;
	
		String str = JOptionPane.showInputDialog(null, mensaje); //Guarda el resultado
			
		
			try {
			
			 entero = Integer.parseInt(str); //Intenta parsearlo y salir del bucle
	
		} catch(NumberFormatException nfe) {

			if ( str == null) { //Si se pulsa cancelar o X se devuelve -1
				
				return -1; //Código que no se utilizará como pk (comodín)
			}
			
			JOptionPane.showMessageDialog(null, "Introducza un número entero");
			entero = leerEnteroJOption(mensaje); //Llama recursivamente al método
			
		}
	
		return entero;
		
	}
	
	
public static double leerDoubleJOption(String mensaje) { //Lee un entero por JOptionPane con un mensaje dado
		
		double numero;

		String str = JOptionPane.showInputDialog(null, mensaje); //Guarda el resultado
			
		
			try {
				
				if ( str == null) { //Si se pulsa cancelar o X se devuelve -1
					
					return -1; //Código que no se utilizará como pk (comodín)
				}
			
				numero = Double.parseDouble(str); //Intenta parsearlo y salir del bucle
	
		} catch(NumberFormatException nfe) {

			if ( str == null) { //Si se pulsa cancelar o X se devuelve -1
				
				return -1; //Código que no se utilizará como pk (comodín)
			}
			
			JOptionPane.showMessageDialog(null, "Introducza un número decimal");
			numero = leerEnteroJOption(mensaje); //Llama recursivamente al método
			
		}
	
		return numero;
		
	}
	
	
	public static String pedirStringLimitado(int longitudMaxima, String mensaje) {
		
		String str = null;
		boolean repetir = true;
		
		do {
			str = JOptionPane.showInputDialog(null, mensaje);
		
			if(str == null) {
				return null;
			}
			
			if (str.equals("")){ //Si el campo está vacío
				
				JOptionPane.showMessageDialog(null, "El valor introducido no puede estar vacío");
				
			}
			
			else if (str.length() > longitudMaxima) { //Si la longitud sobrepasa la indicada
				
				JOptionPane.showMessageDialog(null, "El valor introducido no puede superar los " 
						+ longitudMaxima + " caracteres");
				
			} else { //Si todo está correcto, sale del bucle
				
				repetir = false;
			}
		
		} while(repetir);
		
	return str; 
	}
		
		
		
	

	
}

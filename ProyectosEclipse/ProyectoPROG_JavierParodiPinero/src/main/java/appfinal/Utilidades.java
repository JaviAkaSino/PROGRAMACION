package appfinal;

import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class Utilidades {

	public static <T> String listaString(List<T> lista) { //Lee cualquier lista y devuelve el String resultante
			
		String str = "";
		
		
		for (Iterator<T> iterator = lista.iterator(); iterator.hasNext();) {
			T t = (T) iterator.next();
			str += t + "\n";	
			
		}
		
		return str;
	}
	
	public static int leerEnteroJOption(String mensaje) { //Lee un entero por JOptionPane con un mensaje dado
		
		boolean solicitar = true;
		int entero;
		
		
		String str = JOptionPane.showInputDialog(null, mensaje); //Guarda el resultado
			
		
			try {
			
			 entero = Integer.parseInt(str); //Intenta parsearlo y salir del bucle
	
		} catch(NumberFormatException nfe) {

			if ( str == null) { //Si se pulsa cancelar o no se introduce dato
				
				return -1; //Codigo que no se utilizará como pk
			}
			
			JOptionPane.showMessageDialog(null, "Introducza un número entero");
			entero = leerEnteroJOption(mensaje);
			
		}
	
		return entero;
		
	}
	
	
	public static String pedirStringLimitado(int longitudMaxima, String mensaje) {
		
		String str = "";
		boolean repetir = true;
		
		do {
			JOptionPane.showInputDialog(null, mensaje);
		
			if (str.length() <= longitudMaxima && str != null) { //Si la longitud no sobrepasa la indicada ni es null
				
				repetir = false;
				
			} else {
				
				JOptionPane.showMessageDialog(null, "El valor introducido no puede superar los " + longitudMaxima + " caracteres ni estar vacío");
			}
		
		} while(repetir);
		
	return str; 
	}
		
		
		
	

	
}

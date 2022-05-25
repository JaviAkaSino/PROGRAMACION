package appfinal;

import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class Utilidades {

	public static <T> String listaString(List<T> lista) { // Lee cualquier lista y devuelve el String resultante

		String str = "";

		for (Iterator<T> iterator = lista.iterator(); iterator.hasNext();) {
			T t = (T) iterator.next();
			str += t + "\n\n";

		}

		return str;
	}

	public static int leerEnteroJOption(String mensaje) { // Lee un entero por JOptionPane con un mensaje dado

		int entero = -1;
		boolean repetir = true;

		do {

			String str = JOptionPane.showInputDialog(null, mensaje); // Guarda el resultado

			try {

				entero = Integer.parseInt(str); // Intenta parsearlo y salir del bucle
				repetir = false;

			} catch (NumberFormatException nfe) {

				if (str == null) { // Si se pulsa cancelar o X se devuelve -1

					return -1; // Código que no se utilizará como pk (comodín)

				}

				JOptionPane.showMessageDialog(null, "Introduzca un número entero");

			}

		} while (repetir);

		return entero;
	}

	public static double leerDouble7_2(String mensaje) { // Lee un double por JOptionPane con un mensaje dado, máximo 5
															// valores enteros
		boolean repetir = true;
		double numero = -1;

		do {

			String str = JOptionPane.showInputDialog(null, mensaje); // Guarda el resultado

			try {

				numero = Double.parseDouble(str); // Intenta parsearlo y salir del bucle

				// No hace falta ya que sql redondea a dos decimales
				// numero = Math.round(numero*100)/100; //Redondea a dos decimales

				// Si la parte entera tiene más de 5 dígitos, se informa de no ser posible y
				// repite
				if (numero > 99999.99) {

					JOptionPane.showMessageDialog(null, "El salario no puede ser superior a 99999.99€");
					numero = leerDouble7_2(mensaje);
				}

				repetir = false;

			} catch (NumberFormatException nfe) {

				if (str == null) { // Si se pulsa cancelar o X se devuelve -1

					return -1; // Código que no se utilizará como pk (comodín)
				}

				JOptionPane.showMessageDialog(null, "Introduzca un número decimal");

			}

		} while (repetir);

		return numero; // Valor absoluto por si los negativos

	}

	public static String pedirStringLimitado(int longitudMaxima, String mensaje) {

		String str = null;
		boolean repetir = true;

		do {
			str = JOptionPane.showInputDialog(null, mensaje);

			if (str == null) {
				return null;
			}

			if (str.equals("")) { // Si el campo está vacío

				JOptionPane.showMessageDialog(null, "El campo no puede estar vacío");

			}

			else if (str.length() > longitudMaxima) { // Si la longitud sobrepasa la indicada

				JOptionPane.showMessageDialog(null,
						"El valor introducido no puede superar los " + longitudMaxima + " caracteres");

			} else { // Si todo está correcto, sale del bucle

				repetir = false;
			}

		} while (repetir);

		return str;
	}

}

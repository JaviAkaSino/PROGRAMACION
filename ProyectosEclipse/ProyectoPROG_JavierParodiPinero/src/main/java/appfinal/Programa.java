package appfinal;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {

		String[] listaTablas = {"Usuarios","Orientadores","Preguntas", "Salir"};
		int opcion; 
		boolean repetir = true;
		
		do {
			
			opcion = JOptionPane.showOptionDialog(null, "Seleccione una tabla de la base de datos","Tablas", 
					0, 1, null, listaTablas, null);
			
			switch(opcion) {
			
			case 0:
					
				GestionUsuario.menuGestionesUsuario();	
				
				break;
				
			case 1:
				
				GestionOrientador.menuGestionesOrientador();
				
				break;
				
			case 2: 
				
				break;
				
			default: //Para incluir el 3, que es 'Salir' y la 'X'
				
				repetir = false;
				
				break;
				
			}

		}while(repetir);
	
		
	}

}

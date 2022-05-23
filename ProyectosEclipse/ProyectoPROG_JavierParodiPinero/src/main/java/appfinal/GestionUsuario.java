package appfinal;

import java.util.List;
import javax.persistence.*;
import javax.swing.JOptionPane;
import controladores.ControladorUsuario;
import entidades.Usuario;

public class GestionUsuario {

	
	public static void menuGestionesUsuario() {
		
		ControladorUsuario cu = new ControladorUsuario(); //Inicializa el controlador pertinente
		//Crea la lista de opciones
		String[] listaOpciones = {"Consultar registros","Crear registro","Actualizar registro",
				"Borrar registro","Borrar TODOS los datos", "Salir"};
		//Aquí recoge la opción
		int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción","Elegir", 
				0, 1, null, listaOpciones, null);
		
		switch(opcion) {
		
		case 0: //Consultar registros
				
			System.out.println(cu.findAll());
			
			break;
			
		case 1: //Crear registro
			
			
			
			break;
			
		case 2: //Actualizar registro
			
			
			
			break;
			
		case 3: //Borrar registro
			
			
			
			break;
			
		case 4: //Borrar TODOS los datos
			
			
			
			break;
			
		case 5: //Salir
			
			
			
			break;
			
		case 6: 
			
			
			
			break;
			
		}
		
	}
	
	
	
}

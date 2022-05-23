package appfinal;

import javax.swing.JOptionPane;
import controladores.ControladorUsuario;
import entidades.Usuario;

public class GestionUsuario {

	
	public static void menuGestionesUsuario() {
		
		ControladorUsuario cu = new ControladorUsuario(); //Inicializa el controlador pertinente
		//Crea la lista de opciones
		String[] listaOpciones = {"Consultar registros","Crear registro","Actualizar registro",
				"Borrar registro", "Salir"};
		
		boolean seguir = true;
		do {
		
			
			//Aquí recoge la opción
			int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción","Opciones", 
					0, 1, null, listaOpciones, null);
			
			Usuario u = new Usuario(); //Registro con el que se trabajará
			
			switch(opcion) {
			
				
			
			case 0: //Consultar registros
					
				JOptionPane.showMessageDialog(null, (Utilidades.listaString(cu.findAll())));
				
				break;
				
			case 1: //Crear registro
				
				u.setNombre(Utilidades.pedirStringLimitado(100,"Introduce el nombre del nuevo usuario"));
				u.setResidencia(Utilidades.pedirStringLimitado(30,"Introduce la residencia del nuevo usuario"));
				u.setEmail(Utilidades.pedirStringLimitado(100,"Introduce el e-mail del nuevo usuario"));
				u.setTelefono(Utilidades.pedirStringLimitado(12,"Introduce el teléfono del nuevo usuario"));
				
				cu.crearUsuario(u);
							
				break;
				
			case 2: //Actualizar registro
				
				//Iguala u al registro con la pk dada
				u = cu.findByPK(Utilidades.leerEnteroJOption("Introduce el código del usuario a editar"));
				
				if(u != null) {
					
					u.setNombre(JOptionPane.showInputDialog(null, "Introduce el nombre del usuario"));
					u.setResidencia(JOptionPane.showInputDialog(null, "Introduce la residencia del nuevo usuario"));
					u.setEmail(JOptionPane.showInputDialog(null, "Introduce el e-mail del nuevo usuario"));
					u.setTelefono(JOptionPane.showInputDialog(null, "Introduce el teléfono del nuevo usuario"));
				
					cu.modificarUsuario(u);
				
				} else {
					
					JOptionPane.showMessageDialog(null, "El registro no existe");
				}
				
				
				break;
				
			case 3: //Borrar registro
				
				u.setCoduser(Utilidades.leerEnteroJOption(JOptionPane.showInputDialog(null, "Introduce el código del usuario a borrar")));
				
				cu.borrarUsuario(u); /*referencedCoumnName="codorientador", insertable=false, updatable=false)*/
				
				break;

			default: //Salir
				
				seguir = false;
				
				break;
				
			}
			
			
		} while (seguir);
		
		
	}
	
	
		
		
	
	
	
	
}

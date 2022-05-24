package appfinal;

import javax.swing.JOptionPane;
import controladores.ControladorOrientador;
import entidades.Orientador;

public class GestionOrientador {

	
	public static void menuGestionesOrientador() {
		
		ControladorOrientador co = new ControladorOrientador(); //Inicializa el controlador pertinente
		
		String[] listaOpciones = {"Consultar registros","Crear registro","Actualizar registro",
				"Borrar registro", "Salir"}; //Crea la lista de opciones
		
		boolean seguir = true;
		do {
		
			
			//Aquí recoge la opción
			int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción","Opciones", 
					0, 1, null, listaOpciones, null);
			
			Orientador o = new Orientador(); //Registro con el que se trabajará
			
			switch(opcion) {
			
				
			
			case 0: //Consultar registros
					
				JOptionPane.showMessageDialog(null, (Utilidades.listaString(co.findAll())));
				
				break;
				
			case 1: //Crear registro
				
				//Pide los datos de los Orientadors uno a uno, limitando su número de caracteres
				//El método pedirStringLimitado(int, String), también impide recoger ""

				
				
				o.setUsuario(GestionUsuario.menuObtenerUsuario());
				
				
				if(o.getUsuario()==null) { //Si se pulsa cancelar o X en la selección del usuario
					JOptionPane.showMessageDialog(null, "Operación cancelada");
					break;
				}
				
				o.setSalario(Utilidades.leerDoubleJOption("Introduce el salario del nuevo Orientador"));
				
				if(o.getSalario()==-1) { //Si se pulsa cancelar o X, no pide mas datos
					JOptionPane.showMessageDialog(null, "Operación cancelada");
					break;
				}
				
				o.setAntiguedad(0); //Al ser nuevo, su antigüedad es 0
				
				co.crearOrientador(o); //Si todos los datos se han dado, se crea el registro
							
				break;
				
			case 2: //Actualizar registro
				
				boolean repetir = true;
				
				do {

					int codigo = Utilidades.leerEnteroJOption("Introduce el código del Orientador a editar");
					o = co.findByPK(codigo); //Iguala u al registro con la pk dada
					
					if(o != null) { // Si se ha encontrado el Orientador
						
						//actualizarOrientador(o, co); //Se abre el menú de actualización
						
						repetir = false; //Sale del bucle
					
					} else if (codigo == -1){ //Si se pulsa cancelar o X
						
						JOptionPane.showMessageDialog(null, "Operación cancelada");
						
						repetir = false;
						
					} else { // Si no existe
						
						JOptionPane.showMessageDialog(null, "El registro no existe"); //Informa y vuelve a pedir
					}
					
				}while(repetir);			
				
				break;
				
			case 3: //Borrar registro
				
				repetir = true;
				
				do {

					int codigo = Utilidades.leerEnteroJOption("Introduce el código del Orientador a eliminar");
					o = co.findByPK(codigo); //Iguala u al registro con la pk dada
					
					if(o != null) { // Si se ha encontrado el Orientador
						
						co.borrarOrientador(o); //Se borra el registro
						
						repetir = false; //Sale del bucle
					
					} else if (codigo == -1){ //Si se pulsa cancelar o X
						
						JOptionPane.showMessageDialog(null, "Operación cancelada");
						
						repetir = false;
						
					} else { // Si no existe
						
						JOptionPane.showMessageDialog(null, "El registro no existe"); //Informa y vuelve a pedir
					}
					
				}while(repetir);
				
				break;

			default: //Para incluir el 4, que es 'Salir' y la 'X'
				
				seguir = false;
				
				break;
				
			}
			
			
		} while (seguir);
		
		
	}
	
	
		/*
		
	private static void actualizarOrientador(Orientador u, ControladorOrientador cu) {
		
		boolean repetir = true;
		int opcion;
		String[] listaOpciones = {"Cambiar nombre","Cambiar residencia","Cambiar e-mail",
				"Cambiar teléfono", "Salir"}; //Crea la lista de opciones
		
		do {
			
			opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción","Opciones", 
					0, 1, null, listaOpciones, null);
			
			switch(opcion) {
			
			case 0: //Cambiar nombre
				
				u.setNombre(Utilidades.pedirStringLimitado(100,"Introduce el nuevo nombre del Orientador"));
				
				if(u.getNombre()!=null) { //Si no se pulsa cancelar ni x, se guarda el cambio
					
					cu.modificarOrientador(u);				
					
				}				
				
				break;
				
			case 1:// Cambiar residencia
				
				u.setResidencia(Utilidades.pedirStringLimitado(100,"Introduce la nueva residencia del Orientador"));
				
				if(u.getResidencia()!=null) { //Si no se pulsa cancelar ni x, se guarda el cambio
					
					cu.modificarOrientador(u);				
					
				}	
				
				break;
				
			case 2: //Cambiar email
				
				u.setEmail(Utilidades.pedirStringLimitado(100,"Introduce el nuevo e-mail del Orientador"));
				
				if(u.getEmail()!=null) { //Si no se pulsa cancelar ni x, se guarda el cambio
					
					cu.modificarOrientador(u);				
					
				}
				
				
				break;
				
			case 3: //Cambiar telefono
				
				u.setTelefono(Utilidades.pedirStringLimitado(100,"Introduce el nuevo teléfono del Orientador"));
				
				if(u.getTelefono()!=null) { //Si no se pulsa cancelar ni x, se guarda el cambio
					
					cu.modificarOrientador(u);				
					
				}
				
				break;
		
			default: //Para incluir el 4, que es 'Salir' y la 'X'
				
				repetir = false;
				
				break;
			
			}
			
			
		}while(repetir);
		
		
		
	}
	
	
	*/
}

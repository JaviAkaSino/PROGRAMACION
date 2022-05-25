package appfinal;

import javax.swing.JOptionPane;
import controladores.ControladorOrientador;
import entidades.Orientador;

public class GestionOrientador {

	public static void menuGestionesOrientador() {

		ControladorOrientador co = new ControladorOrientador(); // Inicializa el controlador pertinente

		String[] listaOpciones = { "Consultar orientadores", "Crear orientador", "Actualizar orientador",
				"Borrar orientador", "Consultar preguntas orientador", "Salir" }; // Crea la lista de opciones

		boolean seguir = true;
		do {

			// Aquí recoge la opción
			int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Orientadores", 0, 1, null,
					listaOpciones, null);

			Orientador o = new Orientador(); // Registro con el que se trabajará

			switch (opcion) {

			case 0: // Consultar registros

				JOptionPane.showMessageDialog(null, (Utilidades.listaString(co.findAll())));

				break;

			case 1: // Crear registro

				// Pide los datos de los Orientadors uno a uno, limitando su número de
				// caracteres
				// El método pedirStringLimitado(int, String), también impide recoger ""
				// Promero introduce el usuario con un menú

				o.setUsuario(GestionUsuario.menuObtenerUsuario());

				if (o.getUsuario() == null) { // Si se pulsa cancelar o X en la selección del usuario
					JOptionPane.showMessageDialog(null, "Operación cancelada");
					break;
				}

				int pkuser = o.getUsuario().getCoduser();

				o.setSalario(Utilidades.leerDouble7_2("Introduce el salario del nuevo Orientador"));

				if (o.getSalario() == -1) { // Si se pulsa cancelar o X, no pide mas datos
					JOptionPane.showMessageDialog(null, "Operación cancelada");
					break;
				}

				o.setAntiguedad(0); // Al ser nuevo, su antigüedad es 0

				co.crearOrientador(o); // Si todos los datos se han dado, se crea el registro

				o.getUsuario().setCoduser(pkuser); // Vuelve a ponerle su pk original al usuario

				co.modificarOrientador(o); // Y lo modifica

				break;

			case 2: // Actualizar registro

				boolean repetir = true;

				do {

					int codigo = Utilidades.leerEnteroJOption("Introduce el código del Orientador a editar");
					o = co.findByPK(codigo); // Iguala u al registro con la pk dada

					if (o != null) { // Si se ha encontrado el Orientador

						actualizarOrientador(o, co); // Se abre el menú de actualización

						repetir = false; // Sale del bucle

					} else if (codigo == -1) { // Si se pulsa cancelar o X

						JOptionPane.showMessageDialog(null, "Operación cancelada");

						repetir = false;

					} else { // Si no existe

						JOptionPane.showMessageDialog(null, "El registro no existe"); // Informa y vuelve a pedir
					}

				} while (repetir);

				break;

			case 3: // Borrar registro

				repetir = true;

				do {

					int codigo = Utilidades.leerEnteroJOption("Introduce el código del Orientador a eliminar");
					o = co.findByPK(codigo); // Iguala u al registro con la pk dada

					if (o != null) { // Si se ha encontrado el Orientador

						co.borrarOrientador(o); // Se borra el registro

						repetir = false; // Sale del bucle

					} else if (codigo == -1) { // Si se pulsa cancelar o X

						JOptionPane.showMessageDialog(null, "Operación cancelada");

						repetir = false;

					} else { // Si no existe

						JOptionPane.showMessageDialog(null, "El registro no existe"); // Informa y vuelve a pedir
					}

				} while (repetir);

				break;

			case 4: // Consultar preguntas de un orientador

				repetir = true;

				do {

					int codigo = Utilidades.leerEnteroJOption("Introduce el código del Orientador");
					o = co.findByPK(codigo); // Iguala u al registro con la pk dada

					if (o != null) { // Si se ha encontrado el Orientador

						if (o.getPreguntas().size() != 0) { // Si hay alguna pregunta la muestra

							JOptionPane.showMessageDialog(null, Utilidades.listaString(o.getPreguntas()));

						} else {

							JOptionPane.showMessageDialog(null,
									"El orientador seleccionado no ha publicado ninguna pregunta");
						}

						repetir = false; // Sale del bucle

					} else if (codigo == -1) { // Si se pulsa cancelar o X

						JOptionPane.showMessageDialog(null, "Operación cancelada");

						repetir = false;

					} else { // Si no existe

						JOptionPane.showMessageDialog(null, "El registro no existe"); // Informa y vuelve a pedir
					}

				} while (repetir);

				break;

			default: // Para incluir el 4, que es 'Salir' y la 'X'

				seguir = false;

				break;

			}

		} while (seguir);

	}

	private static void actualizarOrientador(Orientador o, ControladorOrientador co) {

		boolean repetir = true;
		int opcion;
		String[] listaOpciones = { "Cambiar salario", "Cambiar antigüedad", "Salir" }; // Crea la lista de opciones

		do {

			opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Opciones", 0, 1, null, listaOpciones,
					null);

			switch (opcion) {

			case 0: // Cambiar salario

				o.setSalario(Utilidades.leerDouble7_2("Introduce el nuevo salario del Orientador"));

				if (o.getSalario() != -1) { // Si no se pulsa cancelar ni x, se guarda el cambio

					co.modificarOrientador(o);

				}

				break;

			case 1:// Cambiar antigüedad

				o.setAntiguedad(Utilidades.leerEnteroJOption("Introduce la nueva antigüedad del Orientador"));

				if (o.getUsuario().getResidencia() != null) { // Si no se pulsa cancelar ni x, se guarda el cambio

					co.modificarOrientador(o);

				}

				break;

			default: // Para incluir el 2, que es 'Salir' y la 'X'

				repetir = false;

				break;

			}

		} while (repetir);

	}
	
	
	
	public static Orientador menuObtenerOrientador() {

			ControladorOrientador co = new ControladorOrientador(); // Inicializa el controlador pertinente

			String[] listaOpciones = { "Crear orientador", "Cargar orientador", "Salir" }; // Crea la lista de opciones

			boolean seguir = true;
			Orientador o = new Orientador(); // Registro con el que se trabajará
			do {

				// Aquí recoge la opción
				int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Orientadores", 0, 1, null,
						listaOpciones, null);

				

				switch (opcion) {

				case 0: // Crear registro

					// Pide los datos de los Orientadors uno a uno, limitando su número de
					// caracteres
					// El método pedirStringLimitado(int, String), también impide recoger ""
					// Promero introduce el usuario con un menú

					o.setUsuario(GestionUsuario.menuObtenerUsuario());

					if (o.getUsuario() == null) { // Si se pulsa cancelar o X en la selección del usuario
						JOptionPane.showMessageDialog(null, "Operación cancelada");
						break;
					}

					int pkuser = o.getUsuario().getCoduser();

					o.setSalario(Utilidades.leerDouble7_2("Introduce el salario del nuevo Orientador"));

					if (o.getSalario() == -1) { // Si se pulsa cancelar o X, no pide mas datos
						JOptionPane.showMessageDialog(null, "Operación cancelada");
						break;
					}

					o.setAntiguedad(0); // Al ser nuevo, su antigüedad es 0

					co.crearOrientador(o); // Si todos los datos se han dado, se crea el registro

					o.getUsuario().setCoduser(pkuser); // Vuelve a ponerle su pk original al usuario

					co.modificarOrientador(o); // Y lo modifica
					
					seguir = false;

					break;

				case 1: // Cargar registro

					boolean repetir = true;

					do {

						int codigo = Utilidades.leerEnteroJOption("Introduce el código del Orientador a cargar");
						o = co.findByPK(codigo); // Iguala u al registro con la pk dada

						if (o != null) { // Si se ha encontrado el Orientador

							return o;

						} else if (codigo == -1) { // Si se pulsa cancelar o X

							repetir = false; // Vuelve al menu de cargar o crear orientador

						} else { // Si no existe

							JOptionPane.showMessageDialog(null, "El registro no existe"); // Informa y vuelve a pedir
						}

					} while (repetir);
					
					seguir = false;

					break;
					
				default:
					
					return null;	
		
				}
				
			} while (seguir);
			
			
			return o;
	
	}

}


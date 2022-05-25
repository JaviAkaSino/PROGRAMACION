package appfinal;

import javax.swing.JOptionPane;
import controladores.ControladorUsuario;
import entidades.Usuario;

public class GestionUsuario {

	public static void menuGestionesUsuario() {

		ControladorUsuario cu = new ControladorUsuario(); // Inicializa el controlador pertinente

		String[] listaOpciones = { "Consultar usuarios", "Crear usuario", "Actualizar usuario", "Borrar usuario",
				"Salir" }; // Crea la lista de opciones

		boolean seguir = true;
		do {

			// Aquí recoge la opción
			int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Usuarios", 0, 1, null,
					listaOpciones, null);

			Usuario u = new Usuario(); // Registro con el que se trabajará

			
			
			switch (opcion) {

			case 0: // Consultar registros

				JOptionPane.showMessageDialog(null, (Utilidades.listaString(cu.findAll())));

				break;

			case 1: // Crear registro

				// Pide los datos de los usuarios uno a uno, limitando su número de caracteres
				// El método pedirStringLimitado(int, String), también impide recoger ""
				u.setNombre(Utilidades.pedirStringLimitado(100, "Introduce el nombre del nuevo usuario"));

				if (u.getNombre() == null) { // Si se pulsa cancelar o X, no pide mas datos
					JOptionPane.showMessageDialog(null, "Operación cancelada");
					break;
				}

				u.setResidencia(Utilidades.pedirStringLimitado(30, "Introduce la residencia del nuevo usuario"));

				if (u.getResidencia() == null) { // Si se pulsa cancelar o X, no pide mas datos
					JOptionPane.showMessageDialog(null, "Operación cancelada");
					break;
				}

				u.setEmail(Utilidades.pedirStringLimitado(100, "Introduce el e-mail del nuevo usuario"));

				if (u.getEmail() == null) { // Si se pulsa cancelar o X, no pide mas datos
					JOptionPane.showMessageDialog(null, "Operación cancelada");
					break;
				}

				u.setTelefono(Utilidades.pedirStringLimitado(12, "Introduce el teléfono del nuevo usuario"));

				if (u.getTelefono() == null) { // Si se pulsa cancelar o X, no pide mas datos
					JOptionPane.showMessageDialog(null, "Operación cancelada");
					break;
				}

				cu.crearUsuario(u); // Si todos los datos se han dado, se crea el registro

				break;

			case 2: // Actualizar registro

				boolean repetir = true;

				do {

					int codigo = Utilidades.leerEnteroJOption("Introduce el código del usuario a editar");
					u = cu.findByPK(codigo); // Iguala u al registro con la pk dada

					if (u != null) { // Si se ha encontrado el usuario

						actualizarUsuario(u, cu); // Se abre el menú de actualización

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

					int codigo = Utilidades.leerEnteroJOption("Introduce el código del usuario a eliminar");
					u = cu.findByPK(codigo); // Iguala u al registro con la pk dada

					if (u != null) { // Si se ha encontrado el usuario

						cu.borrarUsuario(u); // Se borra el registro

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

	private static void actualizarUsuario(Usuario u, ControladorUsuario cu) {

		boolean repetir = true;
		int opcion;
		String[] listaOpciones = { "Cambiar nombre", "Cambiar residencia", "Cambiar e-mail", "Cambiar teléfono",
				"Salir" }; // Crea la lista de opciones

		do {

			opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Opciones", 0, 1, null, listaOpciones,
					null);

			switch (opcion) {

			case 0: // Cambiar nombre

				u.setNombre(Utilidades.pedirStringLimitado(100, "Introduce el nuevo nombre del usuario"));

				if (u.getNombre() != null) { // Si no se pulsa cancelar ni x, se guarda el cambio

					cu.modificarUsuario(u);

				}

				break;

			case 1:// Cambiar residencia

				u.setResidencia(Utilidades.pedirStringLimitado(100, "Introduce la nueva residencia del usuario"));

				if (u.getResidencia() != null) { // Si no se pulsa cancelar ni x, se guarda el cambio

					cu.modificarUsuario(u);

				}

				break;

			case 2: // Cambiar email

				u.setEmail(Utilidades.pedirStringLimitado(100, "Introduce el nuevo e-mail del usuario"));

				if (u.getEmail() != null) { // Si no se pulsa cancelar ni x, se guarda el cambio

					cu.modificarUsuario(u);

				}

				break;

			case 3: // Cambiar telefono

				u.setTelefono(Utilidades.pedirStringLimitado(100, "Introduce el nuevo teléfono del usuario"));

				if (u.getTelefono() != null) { // Si no se pulsa cancelar ni x, se guarda el cambio

					cu.modificarUsuario(u);

				}

				break;

			default: // Para incluir el 4, que es 'Salir' y la 'X'

				repetir = false;

				break;

			}

		} while (repetir);

	}

	public static Usuario menuObtenerUsuario() {

		ControladorUsuario cu = new ControladorUsuario(); // Inicializa el controlador pertinente

		String[] listaOpciones = { "Nuevo usuario", "Cargar usuario", "Salir" }; // Crea la lista de opciones

		boolean seguir = true;
		Usuario u = new Usuario(); // Registro con el que se trabajará

		do {
			// Aquí recoge la opción
			int opcion = JOptionPane.showOptionDialog(null, "Elija el usuario a añadir", "Opciones", 0, 1, null,
					listaOpciones, null);

			switch (opcion) {

			case 0: // Crear registro
				String aux;
				// Pide los datos de los usuarios uno a uno, limitando su número de caracteres
				// El método pedirStringLimitado(int, String), también impide recoger ""

				aux = Utilidades.pedirStringLimitado(100, "Introduce el nombre del nuevo usuario");

				if (aux == null) { // Si se pulsa cancelar o X, no pide mas datos
					JOptionPane.showMessageDialog(null, "Operación cancelada");
					break;
				} // Si no, set nombre

				u.setNombre(aux);

				aux = Utilidades.pedirStringLimitado(30, "Introduce la residencia del nuevo usuario");

				if (aux == null) { // Si se pulsa cancelar o X, no pide mas datos
					JOptionPane.showMessageDialog(null, "Operación cancelada");
					break;
				}

				u.setResidencia(aux);

				aux = Utilidades.pedirStringLimitado(100, "Introduce el e-mail del nuevo usuario");

				if (aux == null) { // Si se pulsa cancelar o X, no pide mas datos
					JOptionPane.showMessageDialog(null, "Operación cancelada");
					break;
				}

				u.setEmail(aux);

				aux = Utilidades.pedirStringLimitado(12, "Introduce el teléfono del nuevo usuario");

				if (aux == null) { // Si se pulsa cancelar o X, no pide mas datos
					JOptionPane.showMessageDialog(null, "Operación cancelada");
					break;
				}

				u.setTelefono(aux);

				seguir = false; // Ya esta creado el usuario, salir

				// cu.crearUsuario(u); //Si todos los datos se han dado, se crea el registro

				break;

			case 1: // Cargar registro

				boolean repetir = true;

				do {

					int codigo = Utilidades.leerEnteroJOption("Introduce el código del usuario a cargar");

					u = cu.findByPK(codigo); // Iguala u al registro con la pk dada

					if (u != null) { // Si se ha encontrado el usuario

						return u; // Lo devuelve

					} else if (codigo == -1) { // //Si se pulsa cancelar o X

						repetir = false; // Vuelve al menu de cargar o crear usuario

					} else {

						JOptionPane.showMessageDialog(null, "El registro no existe"); // Informa y vuelve a pedir
					}

				} while (repetir);

				break;

			default: // Para incluir el 2, que es 'Salir' y la 'X'

				return null;

			}

		} while (seguir);

		return u;
	}

}

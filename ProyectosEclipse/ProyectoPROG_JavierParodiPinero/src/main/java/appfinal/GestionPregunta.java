package appfinal;

import javax.swing.JOptionPane;
import controladores.ControladorPregunta;
import entidades.Pregunta;

public class GestionPregunta {

	public static void menuGestionesPregunta() {

		ControladorPregunta cp = new ControladorPregunta(); // Inicializa el controlador pertinente

		String[] listaOpciones = { "Consultar Preguntas", "Crear Pregunta", "Actualizar Pregunta", "Borrar Pregunta",
				"Salir" }; // Crea la lista de opciones

		boolean seguir = true;
		do {

			// Aquí recoge la opción
			int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Preguntas", 0, 1, null,
					listaOpciones, null);

			Pregunta p = new Pregunta(); // Registro con el que se trabajará

			switch (opcion) {

			case 0: // Consultar registros

				JOptionPane.showMessageDialog(null, (Utilidades.listaString(cp.findAll())));

				break;

			case 1: // Crear registro

				// Pide los datos de las Preguntas uno a uno, limitando su número de caracteres
				// El método pedirStringLimitado(int, String), también impide recoger ""
				// Primero introduce el usuario con un menú

				p.setOrientador(GestionOrientador.menuObtenerOrientador());

				if (p.getOrientador() == null) { // Si se pulsa cancelar o X en la selección del usuario
					JOptionPane.showMessageDialog(null, "Operación cancelada");
					break;
				}

				int pkuser = p.getOrientador().getCodorientador(); //Guarda la pk original del orientador (para que no se borre y se actualice con cascade)

				p.setTextopreg(Utilidades.pedirStringLimitado(100, "Introduzca el texto de la nueva pregunta"));

				if (p.getTextopreg() == null) { // Si se pulsa cancelar o X, no pide mas datos
					JOptionPane.showMessageDialog(null, "Operación cancelada");
					break;
				}

				p.setNivelconcrecion(Utilidades.leerEnteroJOption("Introduzca el nivel de concreción de la nueva pregunta"));

				cp.crearPregunta(p);
								
				p.getOrientador().setCodorientador(pkuser); // Vuelve a ponerle su pk original al usuario

				cp.modificarPregunta(p); // Y lo modifica

				break;

			case 2: // Actualizar registro

				boolean repetir = true;

				do {

					int codigo = Utilidades.leerEnteroJOption("Introduce el código de la pregunta a editar");
					p = cp.findByPK(codigo); // Iguala u al registro con la pk dada

					if (p != null) { // Si se ha encontrado el Pregunta

						actualizarPregunta(p, cp); // Se abre el menú de actualización

						repetir = false; // Sale del bucle

					} else if (codigo == -1) { // Si se pulsa cancelar o X

						JOptionPane.showMessageDialog(null, "Operación cancelada");

						repetir = false;

					} else { // Si no existe

						JOptionPane.showMessageDialog(null, "La pregunta no existe"); // Informa y vuelve a pedir
					}

				} while (repetir);

				break;

			case 3: // Borrar registro

				repetir = true;

				do {

					int codigo = Utilidades.leerEnteroJOption("Introduce el código de la pregunta a eliminar");
					p = cp.findByPK(codigo); // Iguala u al registro con la pk dada

					if (p != null) { // Si se ha encontrado el Pregunta

						cp.borrarPregunta(p); // Se borra el registro

						repetir = false; // Sale del bucle

					} else if (codigo == -1) { // Si se pulsa cancelar o X

						JOptionPane.showMessageDialog(null, "Operación cancelada");

						repetir = false;

					} else { // Si no existe

						JOptionPane.showMessageDialog(null, "La pregunta no existe"); // Informa y vuelve a pedir
					}

				} while (repetir);

				break;

			default: // Para incluir el 4, que es 'Salir' y la 'X'

				seguir = false;

				break;

			}

		} while (seguir);

	}

	private static void actualizarPregunta(Pregunta p, ControladorPregunta cp) {

		boolean repetir = true;
		int opcion;
		String[] listaOpciones = { "Cambiar texto", "Cambiar nivel de concreción", "Salir" }; // Crea la lista de opciones

		do {

			opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Opciones", 0, 1, null, listaOpciones,
					null);

			switch (opcion) {

			case 0: // Cambiar texto

				p.setTextopreg(Utilidades.pedirStringLimitado(100, "Introduce el nuevo texto de la pregunta"));

				if (p.getTextopreg() != null) { // Si no se pulsa cancelar ni x, se guarda el cambio

					cp.modificarPregunta(p);

				}

				break;

			case 1:// Cambiar nivel de concreción

				p.setNivelconcrecion(Utilidades.leerEnteroJOption("Introduce el nuevo nivel de concreción de la pregunta"));

				if (p.getNivelconcrecion() != -1) { // Si no se pulsa cancelar ni x, se guarda el cambio

					cp.modificarPregunta(p);

				}

				break;

			default: // Para incluir el 2, que es 'Salir' y la 'X'

				repetir = false;

				break;

			}

		} while (repetir);

	}

}

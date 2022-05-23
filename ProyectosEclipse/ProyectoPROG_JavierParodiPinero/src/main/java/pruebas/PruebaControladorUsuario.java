package pruebas;

import controladores.*;
import entidades.*;


public class PruebaControladorUsuario {

	public static void main(String[] args) {
		
		ControladorUsuario cu = new ControladorUsuario();

		// Se imprimen todos los registros que haya en la tabla Usuario
		imprimirEntidades(cu);
		
		// Consulta de Usuario por pk
		Usuario Usuario = cu.findByPK(1);
		System.out.println();
		System.out.println("Usuario PK = 1: " + Usuario);
		

		// Creación del Usuario
		Usuario u1 = new Usuario();
		u1.setEmail("emaildeejemplo@ejemplo.es");
		u1.setNombre("Paco pepe");
		u1.setResidencia("Matalascañas");
		u1.setTelefono("600000000");

		//Volvemos a imprimir las entidades para comprobar que se han efectuado los cambios
		cu.crearUsuario(u1);
		imprimirEntidades(cu);
	}

	
	private static void imprimirEntidades(ControladorUsuario cu) {
		System.out.println("ENTIDADES EN LA BASE DE DATOS ---------------");
		// Al obtener un cliente, se obtiene también la tarjeta asociada gracias
		// a la bidireccionalidad
		for (Usuario u : cu.findAll()) {
			System.out.println(u);
		}
	}
}

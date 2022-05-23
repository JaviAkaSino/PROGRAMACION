package pruebas;

import controladores.*;
import entidades.*;


public class PruebaControladorOrientador {

	public static void main(String[] args) {
		
		ControladorOrientador co = new ControladorOrientador();

		// Se imprimen todos los registros que haya en la tabla Orientador
		imprimirEntidades(co);
		
		// Consulta de Orientador por pk
		Orientador Orientador = co.findByPK(1);
		System.out.println();
		System.out.println("Orientador PK = 1: " + Orientador);
		

		//Crea usuario para el orientador
		Usuario u1 = new Usuario();

		u1.setNombre("Orientador Orientado");
		u1.setEmail("orientador@ejemplo.es");
		u1.setResidencia("Guarromán");
		u1.setTelefono("611111111");
		
				
		// Creación del Orientador
		Orientador o1 = new Orientador();
		o1.setUsuario(u1);
		o1.setSalario(2222.22);
		o1.setAntiguedad(22);

		//Volvemos a imprimir las entidades para comprobar que se han efectuado los cambios
		
		co.crearOrientador(o1);
		imprimirEntidades(co);
	}

	
	private static void imprimirEntidades(ControladorOrientador co) {
		System.out.println("ENTIDADES EN LA BASE DE DATOS ---------------");
		// Al obtener un cliente, se obtiene también la tarjeta asociada gracias
		// a la bidireccionalidad
		for (Orientador u : co.findAll()) {
			System.out.println(u);
		}
	}
}

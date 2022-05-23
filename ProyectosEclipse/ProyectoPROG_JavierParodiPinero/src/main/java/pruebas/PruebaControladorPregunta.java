package pruebas;

import java.sql.Date;
import java.time.LocalDate;

import controladores.*;
import entidades.*;


public class PruebaControladorPregunta {

	public static void main(String[] args) {

		ControladorPregunta cp = new ControladorPregunta();

		// Se imprimen todos los registros que haya en la tabla cliente
		imprimirEntidades(cp);

		//Crea un usuario
		Usuario u1 = new Usuario();
		u1.setEmail("orientadorParaPregunta@ejemplo.es");
		u1.setNombre("Juan Palomo");
		u1.setResidencia("Jubrique");
		u1.setTelefono("622222222");
		
		// Creación del Orientador
		Orientador o1 = new Orientador();
		o1.setUsuario(u1);
		o1.setSalario(3333.33);
		o1.setAntiguedad(33);

		// Creación de un Pregunta
		Pregunta p1 = new Pregunta();
		p1.setOrientador(o1);
		p1.setTextopreg("Esta es la pregunta insertada PruebaControlador");
		p1.setNivelconcrecion(33);
		
		
		cp.crearPregunta(p1);
		imprimirEntidades(cp);

	}

	
	private static void imprimirEntidades(ControladorPregunta cv) {
		System.out.println("ENTIDADES EN LA BASE DE DATOS ---------------");
		// Al obtener un cliente, se obtiene también la tarjeta asociada gracias
		// a la bidireccionalidad
		for (Pregunta v : cv.findAll()) {
			System.out.println(v);
		}
	}
}

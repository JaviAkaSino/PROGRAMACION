
package ejercicio3;

import ejercicio1.CategoriaEmpleado;
import ejercicio1.Trabajador;
import ejercicio2.Empresa;
import java.time.LocalDate;
import java.util.Arrays;

/**
 *
 * @author javiakasino
 */
public class Prueba {

    public static void main(String[] args) {

        Empresa empresaA = new Empresa("CostaSol", "B1996916E");
        Empresa empresaB = new Empresa("Aguasal", "B1954416J");
        
        empresaA.imprimir();
        
        Trabajador t1 = new Trabajador("Javier", "Parodi Piñero", LocalDate.of(1996, 9, 16), CategoriaEmpleado.MEDIA);
        Trabajador t2 = new Trabajador("Antonio", "García Limones", LocalDate.of(1985, 8, 5), CategoriaEmpleado.AVANZADA);
        Trabajador t3 = new Trabajador("Obi-wan", "Que no ví", LocalDate.of(1986, 5, 8), CategoriaEmpleado.MEDIA);
        Trabajador t4 = new Trabajador("Gabriel", "Allende", LocalDate.of(1989, 5, 20), CategoriaEmpleado.AVANZADA);
        Trabajador t5 = new Trabajador("Pepe", "Torres Téllez", LocalDate.of(1995, 9, 16), CategoriaEmpleado.INICIAL);
        Trabajador t6 = new Trabajador(t3);
         
        empresaA.contratar(t1);
        empresaA.contratar(t2);
        empresaA.contratar(t3);
        
        empresaB.contratar(t4);
        empresaB.contratar(t5);
        empresaB.contratar(t6);
        
        System.out.println("Empresas al principio:\n");
        empresaA.imprimir();
        empresaB.imprimir();
        
        empresaB.despedir(t5);
        empresaA.contratar(t5);
        
        empresaA.ordenarNombre();
        empresaB.ordenarNombre();
        
        System.out.println("Empresas tras cambio y ordenar:\n");
        empresaA.imprimir();
        empresaB.imprimir();
        
        System.out.println("Posicion t3 en A");
        System.out.println(empresaA.buscarNombre(t3));
        System.out.println("Posicion t3 en B");
        System.out.println(empresaB.buscarNombre(t3));
        
    }
    
}

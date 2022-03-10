package setmap;

/**
 *
 * @author javiakasino
 */
public class EjercitoOrdenadoTest {

    public static void main(String[] args) {

        EjercitoOrdenado ejercito = new EjercitoOrdenado();
    
        System.out.println("Está vacío:");
        System.out.println(ejercito.estaVacio());
        
        ejercito.alistar(new Soldado("12345678A", "Antonio", "Pérez", "Ruiz", 18));
        ejercito.alistar(new Soldado("98765432B", "Juan", "Sánchez", "Piña", 20));
        ejercito.alistar(new Soldado("54645644G", "Jose", "Torres", "López", 45));
        ejercito.alistar(new Soldado("64815146D", "María", "Ponce", "Mendoza", 19));
        ejercito.alistar(new Soldado("56418511W", "Laura", "González", "Martínez", 21));
        ejercito.alistar(new Soldado("75415245F", "Marina", "Rodríguez", "Antolín", 23));
        
        ejercito.mostrarElementos(ejercito.listaSoldados());
        
        System.out.println("Número de soldados");
        System.out.println(ejercito.numeroSoldados());
        
        System.out.println("Buscamos por DNI: 75415245F");
        System.out.println("Está alistado: " + ejercito.estaAlistado(new Soldado("75415245F","","","",0)));
    
        System.out.println("Se intenta introducir un soldado repetido (75415245F)");
        ejercito.alistar(new Soldado("75415245F", "Marina", "Rodríguez", "Antolín", 23));
        
        ejercito.mostrarElementos(ejercito.listaSoldados());
        
        System.out.println("Buscamos por DNI: 45454545L");
        System.out.println("Está alistado: " + ejercito.estaAlistado(new Soldado("45454545L","","","",0)));
        
        System.out.println("Desmatriculamos al soldado con DNI 54645644G");
        ejercito.desmatricularSoldado(new Soldado("54645644G","","","",0));
        
        ejercito.mostrarElementos(ejercito.listaSoldados());
        
        System.out.println("Está vacío: " + ejercito.estaVacio());

    }
    
}

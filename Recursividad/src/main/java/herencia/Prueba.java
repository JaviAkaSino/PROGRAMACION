package herencia;

/**
 *
 * @author javiakasino
 */
public class Prueba {

    public static void main(String[] args) {

        String atributos;
        
        Vehiculo v1 = new Vehiculo(343245l, "4050 ABJ", "VW", "GTI", "Blanco",100.0);

        Turismo t1 = new Turismo(5, true, 345674l, "4060 TUR", "Skoda", "Fabia","Blanco",90.0);
        
        Deportivo d1 = new Deportivo(3000, 78654l, "4070 DEP","Ford", "Mustang", "Rojo",150.0);
        
        Furgoneta f1 = new Furgoneta(5000, 10, 16199l, "4080 FUR", "Fiat", "Ducato", "Azul", 80.0);
        
        
        System.out.println(f1.getAtributos());
    }
    
}

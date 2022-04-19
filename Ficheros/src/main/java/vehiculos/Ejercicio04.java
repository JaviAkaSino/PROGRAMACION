package vehiculos;

/**
 *
 * @author javiakasino
 */
public class Ejercicio04 {

    public static void main(String[] args) {

/*4.- Usando la clase Vehículo, implementa un programa que realice lo 
siguiente:
        
    Crea 30 vehículos (10 Turismos, 10 Deportivos y 10 Furgonetas) con valores 
        de tu elección y guárdalos en una lista de objetos tipo Vehiculo.*/

        for (int i = 0; i < 10; i++) {
            
            
        }

        Turismo t1 = new Turismo(5, true, 345674l, "4060 TUR", "Skoda", "Fabia","Blanco",90.0);
        
        Deportivo d1 = new Deportivo(3000, 78654l, "4070 DEP","Ford", "Mustang", "Rojo",150.0);
        
        Furgoneta f1 = new Furgoneta(5000, 10, 16199l, "4080 FUR", "Fiat", "Ducato", "Azul", 80.0);
        
    /*Guarda los vehículos en un fichero de texto llamado “vehículos.txt”, haciendo 
        uso del método polimórfico toString(), teniendo en cuenta que el string 
        devuelto lleve separados los campos del objeto por el carácter dos 
        puntos (:).
        
    Cada línea del fichero estará compuesta por un número, un espacio, un guión,
        un espacio y los datos del vehículo en cuestión. El número de cada línea
        será 0, 1 o 2 si el objeto es un Turismo, un Deportivo o una Furgoneta, 
        respectivamente. 
        
    Cada vehículo irá en una línea distinta del fichero.
    Ejemplos de líneas, los campos no tienen porqué coincidir con los de tus clases:
 
        0 – 4534JTK:Seat:Ibiza:Blanco:… (Este vehículo sería un Turismo)
        1 – 3322FFF:Ford:Kuga:Rojo:… (Este vehículo sería un Deportivo)*/



    }

}

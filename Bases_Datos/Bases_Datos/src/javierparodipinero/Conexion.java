
package javierparodipinero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String SERVIDOR = "jdbc:mysql://localhost/";
    private static final String NOMBRE_BASE_DATOS = "bdprog";
    private static final String USER = "root";
    private static final String PASS = "Jana2009narseis8s_";

    private static Connection instancia = null;
    
    // Patron Singleton
    // Constructor privado no accesible desde otras clases
    private Conexion() {

    }

    // M�todo de clase para acceder a la instancia del objeto Connection
    public static Connection getInstance() {
        // Si el objeto Connection no está creado, se crea
        if (instancia == null) {
            try {

                // Se crea el objeto Connection	
                instancia = DriverManager.getConnection(SERVIDOR + NOMBRE_BASE_DATOS, USER, PASS);

                System.out.println("Conexi�n realizada con �xito.");

            } catch (SQLException e) {

                // Error en la conexi�n
                System.out.println("Conexi�n fallida: " + e.getMessage());
            }
        }
        return instancia;
    }

}

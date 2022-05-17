/*
 * Interface que usa el patrón DAO sobre la tabla Pregunta
 */

package javierparodipinero;

import java.sql.SQLException;
import java.util.List;


public interface IPregunta {
    
    // Método para obtener todos los registros de la tabla
    List<PreguntaVO> getAll() throws SQLException;
    
    // Méodo para obtener un registro a partir de la PK
    PreguntaVO findByPk(int codpreg) throws SQLException;
    
    // Método para insertar un registro
    int insertPregunta (PreguntaVO pregunta) throws SQLException;
    
    // Método para insertar varios registros
    int insertPregunta (List<PreguntaVO> lista) throws SQLException;
    
    // Método para borrar una pregunta
    int deletePregunta (PreguntaVO p) throws SQLException;
    
    // Método para borrar toda la tabla
    int deletePregunta() throws SQLException;
    
    // Método para modificar una pregunta. Se modifica a la pregunta que tenga ese 'codpreg'
    // con los nuevos datos que traiga la pregunta 'nuevosDatos'
    int updatePregunta (int codpreg, PreguntaVO nuevosDatos) throws SQLException;
    
}

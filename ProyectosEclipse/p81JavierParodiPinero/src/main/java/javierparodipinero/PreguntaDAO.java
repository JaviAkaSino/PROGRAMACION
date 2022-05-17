/*
 * Clase que implementa la interface IPersona
 */
package javierparodipinero;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PreguntaDAO implements IPregunta {

    private Connection conexion = null;

    public PreguntaDAO() {
    	conexion = Conexion.getInstance();
    }

    @Override
    public List<PreguntaVO> getAll() throws SQLException {
        List<PreguntaVO> lista = new ArrayList<>();

        // Preparamos la consulta de datos mediante un objeto Statement
        // ya que no necesitamos parametrizar la sentencia SQL
        try (Statement st = conexion.createStatement()) {
            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            ResultSet res = st.executeQuery("select * from preguntas");
            // Ahora construimos la lista, recorriendo el ResultSet y mapeando los datos
            while (res.next()) {
            	PreguntaVO pregunta = new PreguntaVO();
                // Recogemos los datos de la persona, guardamos en un objeto
            	pregunta.setCodpregunta(res.getInt("codpregunta"));
            	pregunta.setCodorientador(res.getInt("codorientador"));
            	pregunta.setTextopreg(res.getString("textopreg"));
            	pregunta.setNivelconcrecion(res.getInt("nivelconcrecion"));

                //Añadimos el objeto a la lista
                lista.add(pregunta);
            }
        }

        return lista;
    }

    @Override
    public PreguntaVO findByPk(int codpreg) throws SQLException {

        ResultSet res = null;
        PreguntaVO pregunta = new PreguntaVO();

        String sql = "select * from preguntas where codpregunta=?";

        try (PreparedStatement prest = conexion.prepareStatement(sql)) {
            // Preparamos la sentencia parametrizada
            prest.setInt(1, codpreg);

            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            res = prest.executeQuery();

            // Nos posicionamos en el primer registro del Resultset. Sólo debe haber una fila
            // si existe esa pk
            if (res.next()) {
                // Recogemos los datos de la persona, guardamos en un objeto
            	pregunta.setCodpregunta(res.getInt("codpregunta"));
            	pregunta.setCodorientador(res.getInt("codorientador"));
            	pregunta.setTextopreg(res.getString("textopreg"));
            	pregunta.setNivelconcrecion(res.getInt("nivelconcrecion"));
                
                return pregunta;
            }

            return null;
        }
    }

    @Override
    public int insertPregunta(PreguntaVO pregunta) throws SQLException {

        int numFilas = 0;
        String sql = "insert into preguntas values (?,?,?,?)";

        if (findByPk(pregunta.getCodpregunta()) != null) {
            // Existe un registro con esa pk
            // No se hace la inserción
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try (PreparedStatement prest = conexion.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setInt(1, pregunta.getCodpregunta());
                prest.setInt(2, pregunta.getCodorientador());
                prest.setString(3, pregunta.getTextopreg());
                prest.setInt(4, pregunta.getNivelconcrecion());

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }

    }

    @Override
    public int insertPregunta(List<PreguntaVO> lista) throws SQLException {
        int numFilas = 0;

        for (PreguntaVO tmp : lista) {
            numFilas += insertPregunta(tmp);
        }

        return numFilas;
    }

    @Override
    public int deletePregunta() throws SQLException {

        String sql = "delete from preguntas";

        int nfilas = 0;

        // Preparamos el borrado de datos  mediante un Statement
        // No hay parámetros en la sentencia SQL
        try (Statement st = conexion.createStatement()) {
            // Ejecución de la sentencia
            nfilas = st.executeUpdate(sql);
        }

        // El borrado se realizó con éxito, devolvemos filas afectadas
        return nfilas;

    }

    @Override
    public int deletePregunta(PreguntaVO pregunta) throws SQLException {
        int numFilas = 0;

        String sql = "delete from preguntas where codpregunta = ?";

        // Sentencia parametrizada
        try (PreparedStatement prest = conexion.prepareStatement(sql)) {

            // Establecemos los parámetros de la sentencia
            prest.setInt(1, pregunta.getCodpregunta());
            // Ejecutamos la sentencia
            numFilas = prest.executeUpdate();
        }
        return numFilas;
    }

    @Override
    public int updatePregunta(int codpreg, PreguntaVO nuevosDatos) throws SQLException {

        int numFilas = 0;
        String sql = "update preguntas set codorientador = ?, textopreg = ?, nivelconcrecion = ? where codpregunta = ?";

        if (findByPk(codpreg) == null) {
            // La preutna a actualizar no existe
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try (PreparedStatement prest = conexion.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
            	
                prest.setInt(1, nuevosDatos.getCodorientador());
                prest.setString(2, nuevosDatos.getTextopreg());
                prest.setInt(3, nuevosDatos.getNivelconcrecion());
                prest.setInt(4, codpreg);
                
                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }
    }


}


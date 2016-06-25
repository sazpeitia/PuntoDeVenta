package puntodeventa.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLConnection {

    private String stringConnection;
    private String user;
    private String pass;
    private String driver = "com.mysql.jdbc.Driver";
    private String sql;
    private Connection conexion;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public SQLConnection(String stringConnection, String user, String pass) {

        this.stringConnection = stringConnection;
        this.user = user;
        this.pass = pass;
    }

    public void crearConexion() {

        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(stringConnection, user, pass);

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println("Conexion fallida. El error es : " + e.getMessage());

        }

    }

    public void cerrarTodo() {

        if (getResultSet() != null) {
            try {
                getResultSet().close();
            } catch (SQLException sQLException) {
                System.out.println("Error al cerrar ResultSet. El error : " + 
                        sQLException.getMessage());
            }
        }
        if (getPreparedStatement() != null) {
            try {
                getPreparedStatement().close();
            } catch (SQLException sQLException) {
                System.out.println("Error al cerrar PreparedStatement. El error : " + 
                        sQLException.getMessage());
            }
        }
        if (getConexion() != null) {
            try {
                getConexion().close();
             } catch (SQLException sQLException) {
                System.out.println("Error al cerrar Conexion. El error : " + 
                        sQLException.getMessage());
            }
        }
    }
    
    public void cerrarResultSet() {
        if (getResultSet() != null) {
            try {
                getResultSet().close();
            } catch (SQLException sQLException) {
                System.out.println("Error al cerrar ResultSet. El error : " + 
                        sQLException.getMessage());
            }
        }
    }
    
    public void cerrarPreparedStatement() {
         if (getPreparedStatement() != null) {
            try {
                getPreparedStatement().close();
            } catch (SQLException sQLException) {
                System.out.println("Error al cerrar PreparedStatement. El error : " + 
                        sQLException.getMessage());
            }
        }
    }

    public void ejecutarQuery() {

        try {

            resultSet = preparedStatement.executeQuery();

        } catch (SQLException sqlexception) {
            System.out.println("Ocurrió un error al realizar la consulta. El error es : " + sqlexception.getMessage());
            cerrarTodo();
            resultSet = null;
        }
    }

    public void ejecutar() {

        try {

            preparedStatement.execute();

        } catch (SQLException sqlexception) {
            System.out.println("Ocurrió un error al realizar INSERT/UPDATE/DELETE. El error es : " + sqlexception.getMessage());
            cerrarTodo();
            resultSet = null;
        }
    }

    public List<Object[]> getResultSetAsObjects(String[] columns) {

        List<Object[]> listaObjectos = new ArrayList<>();

        try {
            while (resultSet.next()) {

                Object[] columnasObjetos = new Object[columns.length];
                for (int columnaActual = 0; columnaActual < columns.length; columnaActual++) {
                    columnasObjetos[columnaActual] = resultSet.getObject(columns[columnaActual]);
                }

                listaObjectos.add(columnasObjetos);
            }
        } catch (SQLException sQLException) {

            System.out.println("Ocurrió un error al procesar el Result Set. El error es : "
                    + sQLException.getMessage());
            return null;
        }

        return listaObjectos;
    }

    public void preparedStatementSet(int indice, Object objeto) {

        // Para Integer
        try {
            preparedStatement.setString(indice, (String) objeto);
        } catch (SQLException sQLException) {

            System.out.println("Ocurrió un error al setear el String del Result Set. El error es : "
                    + sQLException.getMessage());
        } catch (ClassCastException castExceptionString) {

            // Para Strings
            try {
                preparedStatement.setInt(indice, (int) objeto);
            } catch (SQLException sQLException) {

                System.out.println("Ocurrió un error al setear el Integer del Result Set. El error es : "
                        + sQLException.getMessage());
            } catch (ClassCastException castExceptionInt) {

                System.out.println("Ocurrió un error al tratar de hacer Cast a Integer. El error es : "
                        + castExceptionInt.getMessage());
            }
        }

    }

    public void setServidor(String servidor) {
        this.stringConnection = servidor;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * @return the conexion
     */
    public Connection getConexion() {
        return conexion;
    }

    /**
     * @return the preparedStatement
     */
    public PreparedStatement getPreparedStatement() {
        return preparedStatement;
    }

    /**
     * @return the resultSet
     */
    public ResultSet getResultSet() {
        return resultSet;
    }

    /**
     * @return the query
     */
    public String getSQL() {
        return sql;
    }

    /**
     * @param sql
     */
    public void setSQL(String sql) {

        try {
            preparedStatement = conexion.prepareStatement(sql);
        } catch (SQLException sQLException) {

            System.out.println("Ocurrió un error al procesar el SQL. El error es : "
                    + sQLException.getMessage());
        }
    }
}

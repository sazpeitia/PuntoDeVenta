package puntodeventa.sql;

import java.util.ArrayList;
import java.util.List;
import puntodeventa.Categoria;

public class SQLCategoria {

    private final SQLConnection sqlConnection;

    public SQLCategoria(SQLConnection sqlConnection) {

        this.sqlConnection = sqlConnection;
    }

    public void actualizarCategoria(Categoria categoria) {

        String sql = "UPDATE PUNTOVENTA_CATEGORIA SET NOMBRE_CATEGORIA = ?, ID_CATEGORIA_PADRE = ? WHERE ID_CATEGORIA = ?";
        String sql2 = "UPDATE PUNTOVENTA_CATEGORIA SET NOMBRE_CATEGORIA = ?, ID_CATEGORIA_PADRE = NULL WHERE ID_CATEGORIA = ?";
        
        if ( categoria.getCategoriaPadre() == 0 ){
            
            sqlConnection.setSQL(sql2);
            sqlConnection.preparedStatementSet(1, categoria.getCategoria());
            sqlConnection.preparedStatementSet(2, categoria.getIdCategoria());
        }
        else {
            
            sqlConnection.setSQL(sql);
            sqlConnection.preparedStatementSet(1, categoria.getCategoria());
            sqlConnection.preparedStatementSet(2, categoria.getCategoriaPadre());
            sqlConnection.preparedStatementSet(3, categoria.getIdCategoria());
        }
        
        sqlConnection.ejecutar();
        sqlConnection.cerrarResultSet();
        sqlConnection.cerrarPreparedStatement();
    }

    public void insertarCategoria(Categoria categoria) {

        String sql1 = "INSERT INTO PUNTOVENTA_CATEGORIA(NOMBRE_CATEGORIA) VALUES (?)";
        String sql2 = "INSERT INTO PUNTOVENTA_CATEGORIA(NOMBRE_CATEGORIA, ID_CATEGORIA_PADRE) VALUES (?, ?)";
        
        if ( categoria.getCategoriaPadre() == 0 ){
            
            sqlConnection.setSQL(sql1);
            sqlConnection.preparedStatementSet(1, categoria.getCategoria());
        }
        else {
            
            sqlConnection.setSQL(sql2);
            sqlConnection.preparedStatementSet(1, categoria.getCategoria());
            sqlConnection.preparedStatementSet(2, categoria.getCategoriaPadre());
        }
        sqlConnection.ejecutar();
        sqlConnection.cerrarResultSet();
        sqlConnection.cerrarPreparedStatement();
    }

    public List<Categoria> consultaCategorias() {

        String sql = "SELECT * FROM PUNTOVENTA_CATEGORIA";
        sqlConnection.setSQL(sql);
        sqlConnection.ejecutarQuery();
        List<Object[]> listaObjectos
                = sqlConnection.getResultSetAsObjects(
                        new String[]{
                            "ID_CATEGORIA",
                            "NOMBRE_CATEGORIA",
                            "ID_CATEGORIA_PADRE"}
                );
        List<Categoria> categorias = transformarACategorias(listaObjectos);
        sqlConnection.cerrarResultSet();
        sqlConnection.cerrarPreparedStatement();
        
        return categorias;
    }
    
     public Categoria consultaCategoriasPorNombre(String nombreCategoria) {

        String sql = "SELECT * FROM PUNTOVENTA_CATEGORIA WHERE NOMBRE_CATEGORIA = ?";
        sqlConnection.setSQL(sql);
        sqlConnection.preparedStatementSet(1, nombreCategoria);
        sqlConnection.ejecutarQuery();
        List<Object[]> listaObjectos
                = sqlConnection.getResultSetAsObjects(
                        new String[]{
                            "ID_CATEGORIA",
                            "NOMBRE_CATEGORIA",
                            "ID_CATEGORIA_PADRE"}
                );
        
        sqlConnection.cerrarResultSet();
        sqlConnection.cerrarPreparedStatement();
        
        List<Categoria> categorias = transformarACategorias(listaObjectos);

        if (categorias.size() == 1) {
            return categorias.get(0);
        } else {
            System.out.println("El numero de categorias encontradas excede a 1.");
            return categorias.get(0);
        }
    }
     
      public Categoria consultaCategoriasPorID(int idCategoria) {

        String sql = "SELECT * FROM PUNTOVENTA_CATEGORIA WHERE ID_CATEGORIA = ?";
        sqlConnection.setSQL(sql);
        sqlConnection.preparedStatementSet(1, idCategoria);
        sqlConnection.ejecutarQuery();
        List<Object[]> listaObjectos
                = sqlConnection.getResultSetAsObjects(
                        new String[]{
                            "ID_CATEGORIA",
                            "NOMBRE_CATEGORIA",
                            "ID_CATEGORIA_PADRE"}
                );
        
        sqlConnection.cerrarResultSet();
        sqlConnection.cerrarPreparedStatement();
        
        List<Categoria> categorias = transformarACategorias(listaObjectos);

        if (categorias.size() == 1) {
            return categorias.get(0);
        } else {
            return categorias.get(0);
        }
    }
    
    private List<Categoria> transformarACategorias( List<Object[]> listaObjectos ) {
        
        List<Categoria> categorias = new ArrayList<>();

        for (Object[] objeto : listaObjectos) {

            Categoria categoria = new Categoria();
            categoria.setIdCategoria( (int) objeto[0] );
            categoria.setCategoria( (String) objeto[1] );
            try {
                
                categoria.setCategoriaPadre( (int) objeto[2] );
            }
            
            catch ( NullPointerException nullPointerException ) {
                
                
            }
            
            categorias.add( categoria );
        }
        return categorias;
    }
}

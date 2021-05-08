package DatosEstudiantes;

import java.sql.*;

/**
 *
 * @author Giovanni López
 */
public class ConexionCRUD {
    
    private final String servidor = "jdbc:mysql://127.0.0.1:3308/bd_institucion";
    
    private final String usuario = "root";
    
    private final String clave = "";
    
    private final String driverConector = "com.mysql.jdbc.Driver";
    
    private static Connection conexion;
    
    //Metodo para establecer conección
    public ConexionCRUD(){
        try {
            Class.forName(driverConector);
            
            conexion = DriverManager.getConnection(servidor, usuario, clave);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Conexion fallida! Error! : " + e.getMessage());
        }
    }
    
    public Connection getConnection(){
        return conexion;
    }
    
    //Metodo para guardar registros
    public void guardarRegistros(String tabla, String camposTabla, String valoresCampos){
        ConexionCRUD conectar  = new ConexionCRUD();
        Connection cone = conectar.getConnection();
        
        try {
            String sqlQueryStmt = "INSERT INTO " + tabla + " (" + camposTabla + ") VALUES (" + valoresCampos + ");";
            Statement stmt;
            stmt = cone.createStatement();
            stmt.executeUpdate(sqlQueryStmt);
            
            stmt.close();
            cone.close();
            System.out.println("Registro guardado correctamente XD");           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
    }
    
    //Metodo para actualizar y eliminar
    public void actualizarEliminarRegistro(String tabla, String valoresCamposNuevos, String condicion){
        ConexionCRUD conectar = new ConexionCRUD();
        Connection cone = conectar.getConnection();
        try {
            Statement stmt;
            String sqlQueryStmt;
            
            if(valoresCamposNuevos.isEmpty()){
                sqlQueryStmt = "DELETE FROM " + tabla + " WHERE " + condicion + ";";                
            }else{
                sqlQueryStmt = "UPDATE " + tabla + " SET " + valoresCamposNuevos + " WHERE " + condicion + ";";
            }
            stmt = cone.createStatement();
            stmt.executeUpdate(sqlQueryStmt);
            stmt.close();
            cone.close();
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido el siguiente error: " + ex.getMessage());
        }
    }
}

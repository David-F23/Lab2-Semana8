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
}

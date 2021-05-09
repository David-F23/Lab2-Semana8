package DatosEstudiantes;
import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author Alex_Hernandez
 */
public class Delete {
    Delete() throws SQLException {
        Scanner sc = new Scanner(System.in);
        ConexionCRUD utilerias = new ConexionCRUD();
        System.out.println("<< ELIMINAR REGISTROS >> ");
        
        System.out.println("Ingresar el id del registro: ");
        String id_estudiante = sc.next();
        
        String tabla = "tb_estudiante";
        String campos = "*";
        String condicion = "id_estudiante = " + id_estudiante;
        utilerias.desplegarRegistros(tabla, campos, condicion);
        
        System.out.println("Presionar << Y >> para confirmar: ");
        String confirmarBorrar = sc.next();
        
        if("Y".equals(confirmarBorrar) || "y".equals(confirmarBorrar)) {
            String valoresCamposNuevos = "";
            
            utilerias.actualizarEliminarRegistro(tabla, valoresCamposNuevos, condicion);
            System.out.println("Registro borrado exitosamente!!!");
        } 
        MenuPrincipal.desplegarMenu();
    }
}

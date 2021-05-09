package DatosEstudiantes;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Sam-Chorro
 */
public class Create {
    
    Create() throws SQLException {
    
        Scanner leer = new Scanner(System.in);
        Estudiante alumno = new Estudiante();
        
        System.out.println("        <<- CREAR REGISTRO->>    ");
        System.out.println("--ingrese los datos solicitados porfavor.");
        System.out.println("---------------------------------");
        
        
        System.out.println("Carnet del Estudiante:  ");
        alumno.setCarnet_estudiante(leer.nextLine());
        
        System.out.println("Nombre del Estudiante:  ");
        alumno.setNom_estudiante(leer.nextLine());
        
        System.out.println("Apellido del Estudiante:  ");
        alumno.setApe_estudiante(leer.nextLine());
        
        System.out.println("Edad del Estudiante:   ");
        alumno.setEdad_estudiante(leer.nextInt());
        
        String tabla= "tb_estudiante";
        String camposTabla = "carnet_estudiante, nom_estudiante, ape_estudiante, edad_estudiante";
        String valoresCampos= "'"+ alumno.getCarnet_estudiante()+ "','"+alumno.getNom_estudiante()+"','"+alumno.getApe_estudiante()+"','"+ alumno.getEdad_estudiante()+"'";
      
        ConexionCRUD utilerias = new ConexionCRUD();
        
        utilerias.guardarRegistros(tabla, camposTabla, valoresCampos);
        
       MenuPrincipal.desplegarMenu();
    }
}

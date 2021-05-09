package DatosEstudiantes;

import java.sql.SQLException; 
import java.util.Scanner; 

public class Update {
    Update() throws SQLException {
        Scanner leer = new Scanner(System.in); 
        Estudiante student = new Estudiante(); 
        ConexionCRUD utilerias = new ConexionCRUD(); 
        System.out.println("<<ACTUALIZAR REGISTROS>>");
        
        System.out.println("Ingrese el ID del registro a modificar: ");
        student.setId_estudiante(leer.nextInt());
        
        String tablaBuscar = "tb_estudiante"; 
        String camposBuscar = "id_estudiante, carnet_estudiante, nom_estudiante, ape_estudiante, edad_estudiante"; 
        String condicionBuscar = "id_estudiante = " + student.getId_estudiante(); 
        
        utilerias.desplegarRegistros(tablaBuscar, camposBuscar, condicionBuscar);
        
        System.out.println("Carnet:");
        student.setCarnet_estudiante(leer.nextLine());
        System.out.println("Nombre:");
        student.setNom_estudiante(leer.nextLine());
        System.out.println("Apellido");
        student.setApe_estudiante(leer.nextLine());
        System.out.println("Edad");
        student.setEdad_estudiante(leer.nextInt());
        
        String tabla = "tb_estudiante"; 
        
        String valoresCamposNuevos = "carnet_estudiante = '" + student.getCarnet_estudiante() + "', nom_estudiante = '" + student.getNom_estudiante() + "', ape_estudiante = '" + student.getApe_estudiante() + "', edad_estudiante = '" + student.getEdad_estudiante() + "'";
        
        
        
        utilerias.actualizarEliminarRegistro(tabla, valoresCamposNuevos, condicionBuscar);
        System.out.println("Modificado Correctamente");
        
        
        
        MenuPrincipal.desplegarMenu();
    }
     
}



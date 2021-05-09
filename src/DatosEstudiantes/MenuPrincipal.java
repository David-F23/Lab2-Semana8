package DatosEstudiantes;

//  Crear el crud para almacenar registros de la siguiente tabla
//  ----------------------------------------------------------------------------------
//  |                                 ESTUDIANTE                                     |
//  ----------------------------------------------------------------------------------
//  |campos            |tipo de datos   |otros                                       |
//  |---------------------------------------------------------------------------------
//  |id_estudiante     |int             |llave primaria autoincrementable desde 1001 |
//  |carnet_estudiante |varchar(6)      |ejemplo MP1234                              |
//  |nom_estudiante    |varchar(30)     |                                            |
//  |ape_estudiante    |varchar(30)     |                                            |
//  |edad_estudiante   |int(3)          |                                            |
//  ----------------------------------------------------------------------------------

import java.sql.SQLException;
import java.util.Scanner;

public class MenuPrincipal {
    
    public static void main(String[] args)throws SQLException {
        desplegarMenu();
    }
    
    public static void desplegarMenu()throws SQLException {
        Scanner opcionSeleccionada= new Scanner(System.in);
        String opcionMenu;
        
        System.out.println("--------------------------------------");
        System.out.println("             --BIENVENIDO--");
        System.out.println("             Menu Principal    ");
        System.out.println("--------------------------------------");
        System.out.println("   SELECCIONE UNA DE LAS SIGUIENESTES.     ");       
        System.out.println("Opciones:");
        System.out.println("         1.  Crear Registros");
        System.out.println("         2.  Consultar Registros");
        System.out.println("         3.  Actualizar Registros");
        System.out.println("         4.  Elimiar Registros");
        System.out.println("         5.  Salir");
        System.out.println("--------------------------------------");

        opcionMenu= opcionSeleccionada.next();
        
        switch(opcionMenu){
            
            case"1":
                Create create= new Create();
                break;
            
            case "2":
                Read read= new Read();
                break;
                
            case "3":
                Update update= new Update();
                break;
                
            case "4":
                Delete delete= new Delete();
                break;
                
            case "5":
                System.exit(0);
                break;
                
            default:
                System.out.println("** Seleccion inválida! **");
                System.out.println("** Por favor seleccione una opcion de las que se presentan en el Menu. **");
                break;
        
        }
    }
}

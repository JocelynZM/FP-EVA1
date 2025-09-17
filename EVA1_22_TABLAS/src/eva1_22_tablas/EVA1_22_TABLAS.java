
package eva1_22_tablas;

import java.util.Scanner;

public class EVA1_22_TABLAS {
final static String ACCESO_USU = "JOCELYN"; //CONSTANTES (MAYUSCULAS)
    final static String ACCESO_CONTRA = "1234"; //VALOR FIJO
    
    public static void main(String[] args) {
       
        String usuario, contra;
        Scanner captura = new Scanner(System.in);
        
        System.out.println("**********CONTROL DE ACCCESO**********");
        System.out.println("RESTAURANTE LA PALOMINA");
        System.out.println("USUARIO: ");
        usuario = captura.nextLine();
        
        System.out.println("CONTRASEÑA: ");
        contra  = captura.nextLine();
        
        //OPERADOR AND && USUARIO Y CONTRASEÑA CORRECTAS
        //AND LOS DOS VALORES SE CUMPLEN
        if(usuario.equals(ACCESO_USU) && contra.equals(ACCESO_CONTRA)){
        System.out.println("ACCESO CONCEDIDO");
    }
        else{
            System.out.println("ACCESO DENEGADO");
        }
        
    }
    
}


package eva1_19_acceso;

import java.util.Scanner;

public class EVA1_19_ACCESO {
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
        
        //COMPARACION DE DATOS 
        if(usuario.equals(ACCESO_USU)){ //COMPARA LA CADENA
            
            if(contra.equals(ACCESO_CONTRA)){
                System.out.println("ACCESO CONCEDIDO!!!");
                
            }
            else{
                 System.out.println("ACCESO DENEGADO");
            }
        
        }
        else{
            System.out.println("INCORRECTO");
        }

        


        
        
        
        
    }
    
}

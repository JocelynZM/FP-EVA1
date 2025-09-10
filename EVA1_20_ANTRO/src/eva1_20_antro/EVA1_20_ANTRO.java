
package eva1_20_antro;

import java.util.Scanner;

public class EVA1_20_ANTRO {
final static String ACCESO_CONCEDIDO = "SI";

    public static void main(String[] args) {
       //EDAD Y CREDENCIAL
       
       String edad;
       String credencial;
       
       Scanner captura = new Scanner(System.in);
       System.out.println("*********ANTRO LAS BUENAS COPAS*********");
       System.out.println("ERES MAYOR DE EDAD");
       
       edad = captura.nextLine();
       
       if(edad.equals(ACCESO_CONCEDIDO)){
       System.out.println("CUENTAS CON CREDENCIAL?: ");
       credencial = captura.nextLine();
       
       if(credencial.equals(ACCESO_CONCEDIDO))
       System.out.println("USTED PUEDE INGRESAR");
       
       else{
            System.out.println("NO PUEDE INGRESAR");
       }
           
           }
       
       
       else {
        System.out.println("NO PUEDE INGRESAR");
       }

       
       
        
        
    }
    
}

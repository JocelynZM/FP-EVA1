
package eva1_23_compras;

import java.util.Scanner;

public class EVA1_23_COMPRAS {

    final static String EFECTIVO = "SI"; //CONSTANTES (MAYUSCULAS)
   final static String CREDITO = "SI";

    
    public static void main(String[] args) {
        
        
         //PREGUNTAR SI TIENE CREDITO Y SI TIENE EFECTIVO
         //COMPRAR SI TIENE UNO O EL OTRO (O AMBOS)
         String efectivo,credito, EF;
        Scanner captura = new Scanner(System.in);
        
        System.out.println("**********CONTROL DE PAGO**********");
        System.out.println("ALSUPER");
        System.out.println("TIENE EFECTIVO: ");
        efectivo = captura.nextLine();
        
         System.out.println("TIENE CREDITO: ");
        credito = captura.nextLine();
        
        
        
        //OPERADOR OR || 
        // SI UNO O OTRA CONDICION SE CUMPLE EXCEPTO A QUE LAS DOS SEAN FALSAS
        
        if (efectivo.equals(EFECTIVO) || credito.equals(CREDITO)){
        System.out.println("USTED PUEDE PAGAR");
        
        }
        else{
            System.out.println("USTED NO PUEDE PAGAR");
        }
        
        
        
    }
    
         
         
        
    }
    


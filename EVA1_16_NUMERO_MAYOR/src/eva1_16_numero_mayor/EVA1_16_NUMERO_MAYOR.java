
package eva1_16_numero_mayor;

import java.util.Scanner;

public class EVA1_16_NUMERO_MAYOR {

    public static void main(String[] args) {
        
        int numero1;
        int numero2;
       Scanner captura = new Scanner(System.in);
       
       System.out.println("INTRODUCE EL PRIMER NUMERO: ");
       numero1 = captura.nextInt();
       
       System.out.println("INTRODUCE EL SEGUNDO NUMERO: ");
       numero2 = captura.nextInt();
        
       
       if(numero1>numero2){
        System.out.println("EL NUMERO MAYOR ES: "+numero1);
           
       }
       else{
         System.out.println("EL NUMERO MAYOR ES: "+numero2);
       }
    }
    
}

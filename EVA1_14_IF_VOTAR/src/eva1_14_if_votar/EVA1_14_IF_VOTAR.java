
package eva1_14_if_votar;

import java.util.Scanner;

public class EVA1_14_IF_VOTAR {


    public static void main(String[] args) {
        
        int Na;
        Scanner captura = new Scanner(System.in);
        System.out.println("CAPTURA AÑO DE NACIMIENTO:");
        Na = captura.nextInt();
        
        if(Na<=2007){
             System.out.println("USTED PUEDE VOTAR.");
        }
        else{
             System.out.println("USTED NO PUEDE VOTAR");
        }
    }
    
}

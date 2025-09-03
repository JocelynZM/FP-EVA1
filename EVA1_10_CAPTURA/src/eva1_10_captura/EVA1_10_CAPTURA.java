
package eva1_10_captura;

import java.util.Scanner;

public class EVA1_10_CAPTURA {

   
    public static void main(String[] args) {
       //SOLICITAR LA TEMPERATURA EN FARENHEIT
       Scanner captura = new Scanner(System.in);//AÑADIR IMPORTE SCANNER
       double centigrados, farenheit;
       //CAPTURA
       System.out.println("TEMPERATURA EN GRADOS FARENHEIT:");
       farenheit = captura.nextDouble(); 
       //DARLE LA TEMPERATURA EN GRADOS CENTIGRADOS
       centigrados = 5*(farenheit -32)/9;
       System.out.println("TEMPERATURA EN GRADOS CELSIUS SON:");
       System.out.println(centigrados);

       
       
        
        
        
    }
    
}

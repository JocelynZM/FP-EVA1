
package eva1_28_moneda;

import java.util.Scanner;

public class EVA1_28_MONEDA {

    public static void main(String[] args) {
        
        Scanner captura = new Scanner(System.in);
        int usuario;
        System.out.println("ELIGE AGUILA O SELLO (1/0");
        usuario = captura.nextInt();
        //System.out.println(Math.random()); //RANDOM= VALOR ALEATORIO
        double valor = Math.random();
        
         System.out.println(valor);
        
         
         //AGUILA
        if(valor> 0.5 && usuario == 1){
             System.out.println("AGUILA GANASTE");
             

            
        }
       else if(valor< 0.5 && usuario == 1){
                 System.out.println("SELLO PERDISTE");
             }
        //SELLO
        
        if (valor< 0.5 && usuario == 0){
        System.out.println("SELLO GANASTE");  
                 }
        else if(valor> 0.5 && usuario == 0){
                 System.out.println("AGUILA PERDISTE");
             }

        
        
            
        
        
    }
    
}

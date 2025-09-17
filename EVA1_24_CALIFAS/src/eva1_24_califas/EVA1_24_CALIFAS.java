
package eva1_24_califas;

import java.util.Scanner;

public class EVA1_24_CALIFAS {

    public static void main(String[] args) {
        
        int calificacion;
        Scanner captura = new Scanner(System.in); 
        System.out.println("INGRESE SU CALIFICACION: ");
        calificacion = captura.nextInt();
        
        if(calificacion>=90 && calificacion<=100){
            System.out.println("TU CALIFICACION ES A"); 
            
        }
        else if(calificacion>=80 && calificacion<=89 ){
            System.out.println("TU CALIFICACION ES B");
        }
         else if(calificacion>=70 && calificacion<=79 ){
            System.out.println("TU CALIFICACION ES C");
        }
         else if(calificacion>=60 && calificacion<=69 ){
            System.out.println("TU CALIFICACION ES D");
        }
         else if(calificacion>=0 &&  calificacion<=59 ){
            System.out.println("TU CALIFICACION ES F");
        }
         else{
    System.out.println("CALIFICACION NO ACEPTADA");
    
}
    }
   
}


package eva1_13_if;

import java.util.Scanner;

public class EVA1_13_IF {

    
    public static void main(String[] args) {
       //DECLARACION DE VARIABLES
       //CAPTURA
       double calificacion;
       System.out.println("INTRODUCE TU CALIFICACION:");
       Scanner captura = new Scanner(System.in);
       calificacion = captura.nextDouble();
       //ESTRUCTURA DE CONTROL IF  - THEN - ELSE
       //IF SOLO EVALUA VERDADERO O FALSO
       if(calificacion >= 70){
            System.out.println("FELICIDADES, ACREDITASTE!!!");
           
       }
 
       
       else{
            System.out.println("AZOTES!!!");
       }
       
       
       
    }
    
}

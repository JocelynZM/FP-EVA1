
package eva1_17_anidado;

import java.util.Scanner;

public class EVA1_17_ANIDADO {

    public static void main(String[] args) {
       
        int DIA;
        Scanner captura = new Scanner(System.in);
        System.out.println("NUMERO DEL DIA DE LA SEMANA: ");
        DIA = captura.nextInt();
        
        //ELSE - IF --> ANIDADO
         
        if(DIA==1){
         System.out.println("DOMINGO");

        }else if(DIA==2){
                
                  System.out.println("LUNES");

                 }
        else if(DIA==3){
                
                  System.out.println("MARTES");

                 }
        else if(DIA==4){
                
                  System.out.println("MIERCOLES");

                 }
        else if(DIA==5){
                
                  System.out.println("JUEVES");

                 }
        else if(DIA==6){
                
                  System.out.println("VIERNES");

                 }
        else if(DIA==7){
                
                  System.out.println("SABADO");

                 }
        else{
            System.out.println("DIA DE LA SEMANA NO VALIDO");
        }
        }
        
        
    }
    


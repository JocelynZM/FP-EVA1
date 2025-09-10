/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_meses;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_18_MESES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int MES;
        Scanner captura = new Scanner(System.in);
        System.out.println("NUMERO DEL MES: ");
        MES = captura.nextInt();
        
        //ELSE - IF --> ANIDADO
        //FUNCIONA PARA SITUACIONES CON  MAS DE DOS OPCIONES
        if(MES==1){
         System.out.println("ENERO");

        }else if(MES==2){
                
                  System.out.println("FEBRERO");

                 }
        else if(MES==3){
                
                  System.out.println("MARZO");

                 }
        else if(MES==4){
                
                  System.out.println("ABRIL");

                 }
        else if(MES==5){
                
                  System.out.println("MAYO");

                 }
        else if(MES==6){
                
                  System.out.println("JUNIO");

                 }
        else if(MES==7){
                
                  System.out.println("JULIO");

                 }
        else if(MES==8){
                
                  System.out.println("AGOSTO");

                 }
        else if(MES==9){
                
                  System.out.println("SEPTIEMBRE");

                 }
        else if(MES==10){
                
                  System.out.println("OCTUBRE");

                 }
        else if(MES==11){
                
                  System.out.println("NOVIEMBRE");

                 }
        else if(MES==12){
                
                  System.out.println("DICIEMBRE");

                 }
        else{
            System.out.println("MES NO VALIDO");
        }
        }
        
    }
    


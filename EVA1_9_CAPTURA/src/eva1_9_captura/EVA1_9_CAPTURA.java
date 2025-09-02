/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_captura;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_9_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Nombre;
        int Edad;
        double Promedio;
        Scanner captura = new Scanner(System.in); //CREANDO EL SCANNER
                //COMO CAPTURAR JAVA

        System.out.println("INTRODUCE TU NOMBRE COMPLETO: ");
       
        Nombre = captura.nextLine();//CAPTURAMOS TEXTO
         
        System.out.println("INTRODUCE TU EDAD: ");
         Edad = captura.nextInt();
       
        System.out.println("INTRODUCE TU PROMEDIO: ");
     
        Promedio= captura.nextDouble();//CAPTURAMOS TEXTO
        
        System.out.println("EL NOMBRE CAPTURADO ES: ");
        System.out.println(Nombre);
        
         System.out.println("LA EDAD ES: ");
        System.out.println(Edad);
        
         System.out.println("EL PROMEDIO ES: ");
        System.out.println(Promedio);




    }
    
}

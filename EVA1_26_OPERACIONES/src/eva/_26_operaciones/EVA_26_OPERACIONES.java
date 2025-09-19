/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva._26_operaciones;

/**
 *
 * @author Usuario
 */
public class EVA_26_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //RESIDUO
        //DIVISIONES
        int val1 = 1, val2 = 3;
        int residuo;
        residuo = val1/val2;
        System.out.print("1 / 3 = ");
        System.out.println(residuo);
        
        
         double v1 = 7.0, v2 = 3.0;
        double res;
        res = val1/val2;
        System.out.print("7 / 3 = ");
        System.out.println(res);
        
        
        //CALCULAR RESIDUO
        //RESIDUO = MODULO = %
        
        int num1 = 2024, num2 = 4;
        int resi;
        resi = num1 % num2; //CALCULO DEL RESIDUO
         System.out.print("7 RESIDUO DE 2024 % 4 = ");
          System.out.println(resi);
        
          if(resi == 0){
               System.out.print("PUEDE QUE SEA BISIESTO");
          }
    }
    
    
}

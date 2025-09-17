
package eva1_21_errores_comunes;

public class EVA1_21_ERRORES_COMUNES {
    
    public static void main(String[] args) {
       
        int num1 = 1, num2 = 2;
        if(num1>num2) //; SI SE PONE ENTONCES ACABA AHI
            //if(num1>num2); QUEDA FUERA DEL IF LAS DEMAS INSTRUCCIONES
            
            // if(num1>num2)
            System.out.println("NUM1 MAYOR");
        else //PARECE QUE PERTENECE AL PRIMER IF PERO PERTENECE AL SEGUNDO
            System.out.println("NUM1 MAYOR");

        //UNA SOLA INSTRUCCION NO NECESITA LLAVES
        
         //if(num1>num2){
            //System.out.println("Unps, fuera del IF");
        //if(num1>num2) 
           // if(num1>2)
           // System.out.println("Num1 es mayor");
       // else 
           // System.out.println("Num2 es mayor");}

    
    
    
}
}

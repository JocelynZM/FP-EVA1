
package eva1_27_conversiones;

public class EVA1_27_CONVERSIONES {

    public static void main(String[] args) {
       int temp;
       double tempDec = 25.7;
       
       //CATSING
       temp = (int) tempDec; //convierte de double a entero O A LO QUE SELE AGREGUE EN EL PARENTESIS
       
       System.out.println(temp);
       double tempDec2;
       tempDec2 = temp;
       System.out.println(tempDec2);
       
       
       String cade,mensaje;
       cade = "LA TEMEPRATURA ES:";
       mensaje = cade + temp; //CONTATENACION (UNION) //CONVIERTE LPOS DATOS EN CADENA 
       System.out.println(mensaje);
    }
    
}

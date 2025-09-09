
package eva1_15_descuento;

import java.util.Scanner;

public class EVA1_15_DESCUENTO {

    public static void main(String[] args) {
        
        double Monto;
        double descuento;
        double descuento2;

        Scanner captura = new Scanner(System.in);
        System.out.println("CAPTURA EL MONTO DE LA VENTA:");
        
        Monto = captura.nextDouble();
        
        if(Monto>1000){
            //15% de descuento
            descuento = Monto * 0.85;
            descuento2 = Monto * 0.15;
            System.out.println("EL MONTO A PAGAR ES: "+descuento);
            System.out.println("A RECIBIDO EL "+descuento2+" DE DESCUENTO..");


        }
        else{
            System.out.println("EL MONTO A PAGAR ES:"+Monto);
        }
    }
    
}

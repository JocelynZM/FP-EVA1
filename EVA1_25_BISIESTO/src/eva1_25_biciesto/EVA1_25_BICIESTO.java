package eva1_25_biciesto;

import java.util.Scanner;

public class EVA1_25_BICIESTO {

    public static void main(String[] args) {

        // CALCULAR RESIDUO
        // RESIDUO = MODULO = %

        int num1;
        int resi, resi1, resi2;
        Scanner captura = new Scanner(System.in);
        System.out.print("INGRESE EL AÑO: ");
        num1 = captura.nextInt();

        resi = num1 % 4; 

        if (resi == 0) { 
            resi1 = num1 % 100; 

            if (resi1 == 0) { 
                resi2 = num1 % 400; 

                if (resi2 == 0) {
                    System.out.println("BISIESTO"); 
                } else {
                    System.out.println("NO ES BISIESTO"); 
                }

            } else {
                System.out.println("BISIESTO"); 
            }

        } else {
            System.out.println("NO ES BISIESTO"); 
        }
    }

}

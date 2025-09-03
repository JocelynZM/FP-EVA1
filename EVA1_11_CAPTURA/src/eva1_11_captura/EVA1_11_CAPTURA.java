
package eva1_11_captura;

import java.util.Scanner;

public class EVA1_11_CAPTURA {

    public static void main(String[] args) {
        //CALCULA VELOCIDAD
        //SOLICITAR DISTANCIA (M) Y TIEMPO (S)
        //CALCULAR LA VELOCIDAD (M/S)
        //v=d/t
        //DECLARAR VARIABLES Y SCANNER
        double Distancia, Tiempo, Velocidad,VelocidadKM;
        Scanner captura = new Scanner(System.in);
        //CAPTURAR DATOS
        System.out.println("INGRESA EL VALOR DE LA DISTANCIA (M)");
        Distancia = captura.nextDouble();
        
        System.out.println("INGRESA EL VALOR DEL TIEMPO (S)");
        Tiempo = captura.nextDouble();
        
        //CALCULOS
        Velocidad = Distancia/Tiempo;
        VelocidadKM = (Distancia/Tiempo)*3.6;
        //MOSTRAR RESULTADOS
        
        //M/S
        System.out.println("LA VELOCIDAD ES: ");
        System.out.println(Velocidad+"(M/S)");
        
        
        //K/H
        System.out.println("LA VELOCIDAD ES: ");
        System.out.println(VelocidadKM+"(K/H)");

        




    }
    
}

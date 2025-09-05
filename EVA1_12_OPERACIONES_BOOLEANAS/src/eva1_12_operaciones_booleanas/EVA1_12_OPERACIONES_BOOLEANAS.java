
package eva1_12_operaciones_booleanas;

public class EVA1_12_OPERACIONES_BOOLEANAS {

    public static void main(String[] args) {
       int radio = 5; //DECLARACION E INICIALIZACION
       boolean resultado; //TRUE O FALSE
       
       //== COMPARACION, = ASIGNACION, ! NEGACION, != DIFERENTE DE,
       
       //USO DE OPERADORES BOOLEANOS
       resultado = radio > 0; //RADIO (5) < 0 FALSO
       System.out.println("RADIO (5) > 0 ES:");
       System.out.println(resultado);
       
       
       resultado = radio < 0; //RADIO (5) < 0 FALSO
       System.out.println("RADIO (5) < 0 ES:");
       System.out.println(resultado);
       
       resultado = radio == 0; //RADIO (5) < 0 FALSO
       System.out.println("RADIO (5) == 0 ES:");
       System.out.println(resultado);
       
       resultado = radio != 0; //RADIO (5) < 0 FALSO
       System.out.println("RADIO (5) != 0 ES:");
       System.out.println(resultado);
       
    }
 
    
}

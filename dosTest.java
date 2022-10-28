package tonterias;

import java.util.*;

public class dosTest {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int temp = 0;
        dos calculadora = new dos();
        calculadora.menu();
        calculadora.opcion();

        System.out.println("¿Quieres volver a usar la calculadora?");
        System.out.println("(1) - Si");
        System.out.println("(2) - No");
        temp=sc.nextInt();
        
        while(temp == 1){
            calculadora.menu();
            calculadora.opcion();
        }
    }
}

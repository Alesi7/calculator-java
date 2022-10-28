package tonterias;

import java.util.*;

public class dos {
    int opcion=0;
    int num1=0;
    int num2=0;
    Scanner sc = new Scanner(System.in);

    public dos() {
    }

    public void menu(){
        System.out.println("Elige una opción del menú de la calculadora: ");
        System.out.println("(1) - Suma");
        System.out.println("(2) - Resta");
        System.out.println("(3) - Multiplicación");
        System.out.println("(4) - División");
        System.out.println("(5) - Potencia");
        System.out.println("(6) - Resto");
        System.out.println("(0) - Salir del programa");
        opcion=sc.nextInt();
    }
    
    public void opcion(){
        switch(opcion){
            case 1:
                System.out.println("Introduce dos números para realizar la suma: ");
                System.out.println("Primer dígito: ");num1=sc.nextInt();
                System.out.println("Segundo dígito: ");num2=sc.nextInt();
                    System.out.println(num1+num2);
                        break;
            case 2:
                System.out.println("Introduce dos números para realizar la resta: ");
                System.out.println("Primer dígito: ");num1=sc.nextInt();
                System.out.println("Segundo dígito: ");num2=sc.nextInt();
                    System.out.println(num1-num2);
                        break;
            case 3:
                System.out.println("Introduce dos números para realizar la multiplicación: ");
                System.out.println("Primer dígito: ");num1=sc.nextInt();
                System.out.println("Segundo dígito: ");num2=sc.nextInt();
                    System.out.println(num1*num2);
                        break;
            case 4:
                System.out.println("Introduce dos números para realizar la división: ");
                System.out.println("Primer dígito: ");num1=sc.nextInt();
                System.out.println("Segundo dígito: ");num2=sc.nextInt();
                    System.out.println(num1/num2);
                        break;
            case 5:
                System.out.println("Introduce dos números para realizar la potencia: ");
                System.out.println("Primer dígito: ");num1=sc.nextInt();
                System.out.println("Segundo dígito: ");num2=sc.nextInt();
                    System.out.println(num1^num2);
                        break;
            case 6:
                System.out.println("Introduce dos números para realizar el resto: ");
                System.out.println("Primer dígito: ");num1=sc.nextInt();
                System.out.println("Segundo dígito: ");num2=sc.nextInt();
                    System.out.println(num1%num2);
                        break;
            case 0:
                System.out.println("Saliendo del programa...");
                        break;                
        }   
        }
    }
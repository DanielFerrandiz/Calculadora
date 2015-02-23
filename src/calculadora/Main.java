/*
 *Calculadora simple, programa creado para entorno de desarrollo
 */

package calculadora;
import calculadora.Calculando;
import java.util.*;

/**
 *
 * @author usuario
 * @version
 */
public class Main {

    
    public static void main(String[] args) {
        Calculando trabajo=new Calculando();
       Scanner introducir = new Scanner (System.in);
       double a,b;
       System.out.println("\n");
       System.out.println("1.SUMA");
       System.out.println("2.RESTA");
       System.out.println("3.MULTIPLICACION");
       System.out.println("4.DIVISION");
       System.out.println("\n");
       System.out.println("Introduce los dos valores a calcular");
       System.out.print("valor a: ");
       a=introducir.nextDouble();
       introducir.nextLine();
       System.out.print("valor b: ");
       b=introducir.nextDouble();
       introducir.nextLine();
       System.out.print("Introduce la opcion: ");
       int opcion=0;
        opcion=introducir.nextInt();
        double result;
       introducir.nextLine();
       switch (opcion){
           case 1:
               result=trabajo.add(a,b);
               System.out.println(result);
               break;
           case 2:
               result=trabajo.subtract(a,b);
               System.out.println(result);
               break;
           case 3:
               result=trabajo.multiply(a, b);
               System.out.println(result);
               break;
           case 4:
               result=trabajo.divide(a, b);
               System.out.println(result);
               break;
           default:
               
       }
    }

}

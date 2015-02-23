/*
 * metodos de la calculadora
 */

package calculadora;

/**
 *
 * @author enrique
 */
public class Calculando {
/**
 * 
 * @param number1 Numero 1 sera el parametro a 
 * @param number2 Numero 2 sera el parametro b
 * @return  devolvera la operacion
 */
    public double add(double number1, double number2){
        double result=0;
        result=number1 + number2; 
    return result;
    } 
    
    public double subtract(double number1, double number2){ 
    double result=0;
        result=number1 - number2; 
    return result; 
    } 
    
    public double multiply(double number1, double number2) { 
    double result=0;
        result=number1 * number2; 
    return result; 
    } 

    public double divide(double number1, double number2){ 
    double result=0;
        result=number1 / number2; 
    return result; 
}




}

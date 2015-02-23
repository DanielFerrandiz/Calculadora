/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Noé Fernández Sánchez
 */
public class CalculandoTest {
    
    public CalculandoTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Calculando.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double number1 = 2.1;
        double number2 = 2.9;
        Calculando instance = new Calculando();
        double expResult = 5.0;
        double result = instance.add(number1, number2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of subtract method, of class Calculando.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        double number1 = 8.0;
        double number2 = 1.0;
        Calculando instance = new Calculando();
        double expResult = 1.0;
        double result = instance.subtract(number1, number2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of multiply method, of class Calculando.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double number1 = 3.0;
        double number2 = 2.0;
        Calculando instance = new Calculando();
        double expResult = 6.0;
        double result = instance.multiply(number1, number2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of divide method, of class Calculando.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double number1 = 4.0;
        double number2 = 2.0;
        Calculando instance = new Calculando();
        double expResult = 2.0;
        double result = instance.divide(number1, number2);
        assertEquals(expResult, result, 0.0);
        
    }
}

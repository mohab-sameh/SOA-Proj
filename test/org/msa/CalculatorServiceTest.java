/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.msa;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mohab
 */
public class CalculatorServiceTest {
    
    public CalculatorServiceTest() {
    }
    
    /**
     * Test of Add method, of class CalculatorService.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        double n1 = 12.0;
        double n2 = 4.0;
        CalculatorService instance = new CalculatorService();
        double expResult = 16.0;
        double result = instance.Add(n1, n2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Subtract method, of class CalculatorService.
     */
    @Test
    public void testSubtract() {
        System.out.println("Subtract");
        double n1 = 20.0;
        double n2 = 10.0;
        CalculatorService instance = new CalculatorService();
        double expResult = 10.0;
        double result = instance.Subtract(n1, n2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Multiply method, of class CalculatorService.
     */
    @Test
    public void testMultiply() {
        System.out.println("Multiply");
        double n1 = 5.0;
        double n2 = 10.0;
        CalculatorService instance = new CalculatorService();
        double expResult = 50.0;
        double result = instance.Multiply(n1, n2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Divide method, of class CalculatorService.
     */
    @Test
    public void testDivide() {
        System.out.println("Divide");
        double n1 = 40.0;
        double n2 = 20.0;
        CalculatorService instance = new CalculatorService();
        double expResult = 2.0;
        double result = instance.Divide(n1, n2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Power method, of class CalculatorService.
     */
    @Test
    public void testPower() {
        System.out.println("Power");
        double n1 = 2.0;
        double n2 = 2.0;
        CalculatorService instance = new CalculatorService();
        double expResult = 4.0;
        double result = instance.Power(n1, n2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SquareRoot method, of class CalculatorService.
     */
    @Test
    public void testSquareRoot() {
        System.out.println("SquareRoot");
        double n1 = 4.0;
        CalculatorService instance = new CalculatorService();
        double expResult = 2.0;
        double result = instance.SquareRoot(n1);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Factorial method, of class CalculatorService.
     */
    @Test
    public void testFactorial() {
        System.out.println("Factorial");
        double n1 = 4.0;
        CalculatorService instance = new CalculatorService();
        double expResult = 24.0;
        double result = instance.Factorial(n1);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sin method, of class CalculatorService.
     */
    @Test
    public void testSin() {
        System.out.println("sin");
        double n1 = 90.0;
        CalculatorService instance = new CalculatorService();
        double expResult = 1.0;
        double result = instance.sin(n1);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cos method, of class CalculatorService.
     */
    @Test
    public void testCos() {
        System.out.println("cos");
        double n1 = 90.0;
        CalculatorService instance = new CalculatorService();
        double expResult = 6.123233995736766E-17;
        double result = instance.cos(n1);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of tan method, of class CalculatorService.
     */
    @Test
    public void testTan() {
        System.out.println("tan");
        double n1 = 45.0;
        CalculatorService instance = new CalculatorService();
        double expResult = 0.9999999999999999;
        double result = instance.tan(n1);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

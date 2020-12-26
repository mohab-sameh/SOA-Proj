/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calculator;

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
     * Test of Subtract method, of class CalculatorService.
     */
    @Test
    public void testSubtract() {
        System.out.println("Subtract");
        double n1 = 0.0;
        double n2 = 0.0;
        CalculatorService instance = new CalculatorService();
        double expResult = 0.0;
        double result = instance.Subtract(n1, n2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Multiply method, of class CalculatorService.
     */
    @Test
    public void testMultiply() {
        System.out.println("Multiply");
        double n1 = 0.0;
        double n2 = 0.0;
        CalculatorService instance = new CalculatorService();
        double expResult = 0.0;
        double result = instance.Multiply(n1, n2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Divide method, of class CalculatorService.
     */
    @Test
    public void testDivide() {
        System.out.println("Divide");
        double n1 = 0.0;
        double n2 = 0.0;
        CalculatorService instance = new CalculatorService();
        double expResult = 0.0;
        double result = instance.Divide(n1, n2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SquareRoot method, of class CalculatorService.
     */
    @Test
    public void testSquareRoot() {
        System.out.println("SquareRoot");
        double n1 = 0.0;
        double n2 = 0.0;
        CalculatorService instance = new CalculatorService();
        double expResult = 0.0;
        double result = instance.SquareRoot(n1, n2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

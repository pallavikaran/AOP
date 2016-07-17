/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package junitdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class CalculatorTest {
    Calculator instance;
    public CalculatorTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        instance=new Calculator();
    }
    
    @After
    public void tearDown() {
        instance=null;
    }

    /**
     * Test of sum method, of class Calculator.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int x = 10;
        int y = 20;
       // Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.sum(x, y);
        assertEquals(30, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testProduct() {
        System.out.println("Product");
        int x = 10;
        int y = 20;
        //Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.product(x, y);
        assertEquals(200, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}

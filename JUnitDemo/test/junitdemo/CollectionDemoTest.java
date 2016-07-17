/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package junitdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class CollectionDemoTest {
    
    public CollectionDemoTest() {
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
     * Test of add method, of class CollectionDemo.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String data = "ABC";
        CollectionDemo instance = new CollectionDemo();
        instance.add(data);
       
        assertEquals("Size of List",instance.list.size(), 1);
        
    }
   // @Ignore
    @Test(timeout=1000)
     public void testInfinity()
    {
        CollectionDemo collectionDemo= new CollectionDemo();
        collectionDemo.infinity();
    }
}

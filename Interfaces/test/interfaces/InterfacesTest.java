/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package interfaces;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 0041432413002
 */
public class InterfacesTest {
    
    public InterfacesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Interfaces.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Interfaces.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
        int x = 1;
        // assertEquals(valor esperado, variavel a ser comparada);
        //assertEquals(2, x);
        assertTrue("ok",1 < 2);
        //assertEquals(2, x);
    }
}

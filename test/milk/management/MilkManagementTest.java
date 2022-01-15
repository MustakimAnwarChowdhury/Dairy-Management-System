/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package milk.management;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class MilkManagementTest {
    MilkManagement milk;
    public MilkManagementTest() {
    }
    
    @Before
    public void setUp() {
        milk = new MilkManagement();
    }
    
    @After
    public void tearDown() {
        milk = null;
    }

    /**
     * Test of main method, of class MilkManagement.
     */
    @Test
    public void testadd() {
        int a=20, b=20, c;
        c = milk.add(a, b);
        assertEquals(40,c);
    }
    
}

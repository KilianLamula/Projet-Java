/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsem2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lamul
 */
public class AnimateurTest {
    
    public AnimateurTest() {
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
     * Test of getTexteASauver method, of class Animateur.
     */
    @Test
    public void testGetTexteASauver() {
        System.out.println("getTexteASauver");
        Animateur instance = new Animateur("","");
        String expResult = "||";
        String result = instance.getTexteASauver();
        assertEquals(expResult, result);
    }
    
}

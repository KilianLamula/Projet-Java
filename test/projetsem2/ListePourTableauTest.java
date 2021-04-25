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
public class ListePourTableauTest {
    
    public ListePourTableauTest() {
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
     * Test of toString method, of class ListePourTableau.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListePourTableau instance = new ListePourTableau(10,"Fiction","nom",4);
        String expResult = "ListePourTableau{heureDebut=10, type=Fiction, nom=nom, duree=4}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}

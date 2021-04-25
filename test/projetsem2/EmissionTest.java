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
public class EmissionTest {
    
    public EmissionTest() {
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
     * Test of toString method, of class Emission.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Emission instance = new Emission("Fiction","nom",4,10);
        String expResult = "Fiction : nom=nom, duree=4, heureDebut=10";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getType method, of class Emission.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Emission instance = new Emission("Fiction","nom",4,10);
        String expResult = "Fiction";
        String result = instance.getType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNom method, of class Emission.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Emission instance = new Emission("Fiction","nom",4,10);
        String expResult = "nom";
        String result = instance.getNom();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDuree method, of class Emission.
     */
    @Test
    public void testGetDuree() {
        System.out.println("getDuree");
        Emission instance = new Emission("Fiction","nom",4,10);
        int expResult = 4;
        int result = instance.getDuree();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHeureDebut method, of class Emission.
     */
    @Test
    public void testGetHeureDebut() {
        System.out.println("getHeureDebut");
        Emission instance = new Emission("Fiction","nom",4,10);
        int expResult = 10;
        int result = instance.getHeureDebut();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTexteASauver method, of class Emission.
     */
    @Test
    public void testGetTexteASauver() {
        System.out.println("getTexteASauver");
        Emission instance = new Emission("Fiction","nom",4,10);
        String expResult = "Fiction|nom|4|10";
        String result = instance.getTexteASauver();
        assertEquals(expResult, result);
    }
    
}

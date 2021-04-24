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
 * @author paul
 */
public class PersonneTest {
    
    public PersonneTest() {
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
     * Test of toString method, of class Personne.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Personne instance = new Personne("","");
        String expResult = "(Personne : nom=, prenom=)";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getNom method, of class Personne.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom Test");
        Personne instance = new Personne("","");
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrenom method, of class Personne.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        Personne instance = new Personne("","");
        String expResult = "";
        String result = instance.getPrenom();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTexteASauver method, of class Personne.
     */
    @Test
    public void testGetTexteASauver() {
        System.out.println("getTexteASauver");
        Personne instance = new Personne("","");
        String expResult = "||";
        String result = instance.getTexteASauver();
        assertEquals(expResult, result);
    }
    
}

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
     * Test of getNom method, of class Personne.
     */
    @Test
    public void testGetNomVide() {
        System.out.println("getNom null");
        Personne instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        fail("La fonction getNom est disfonctionnelle si elle est vide");
    }
    
    public void testGetNom() {
        System.out.println("getNom Test");
        Personne instance = ('Nom','Prenom');
        String expResult = "Test";
        String result = instance.getNom();
        assertEquals(expResult, result);
        fail("La fonction getNom est disfonctionnelle avec le nom 'Test' ");
    }

    /**
     * Test of getPrenom method, of class Personne.
     */
    @Test
    public void testGetPrenomVide() {
       System.out.println("getPrenom null");
        Personne instance = null;
        String expResult = "";
        String result = instance.getPrenom();
        assertEquals(expResult, result);
        fail("La fonction getPrenom est disfonctionnelle si elle est vide");
    }
      public void testGetPrenomTest() {
        System.out.println("getPrenom Test");
        Personne instance = (Nom,Prenom);
        String expResult = "Test";
        String result = instance.getPrenom();
        assertEquals(expResult, result);
        fail("La fonction getPrenom est disfonctionnelle avec le nom 'Test' ");
    }
    
}

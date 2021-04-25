/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsem2;

import java.util.ArrayList;
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
public class ProgrammeTeleTest {
    
    public ProgrammeTeleTest() {
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
     * Test of toString method, of class ProgrammeTele.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ArrayList<Emission> lesEmissions = new ArrayList<Emission>();
        ProgrammeTele instance = new ProgrammeTele(lesEmissions);
        String expResult = "Le programme télé est : " + "\n" + lesEmissions;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of validationGrille method, of class ProgrammeTele.
     */
    @Test
    public void testValidationGrille() throws Exception {
        System.out.println("validationGrille");
        ArrayList<Emission> lesEmissions = new ArrayList<Emission>();
        ProgrammeTele instance = new ProgrammeTele(lesEmissions);
        instance.validationGrille();
    }

    /**
     * Test of sauverTexte method, of class ProgrammeTele.
     */
    @Test
    public void testSauverTexte() throws Exception {
        System.out.println("sauverTexte");
        String filePath = "";
        ArrayList<Emission> lesEmissions = new ArrayList<Emission>();
        ProgrammeTele instance = new ProgrammeTele(lesEmissions);
        instance.sauverTexte(filePath);
    }

    /**
     * Test of lireTexte method, of class ProgrammeTele.
     */
    @Test
    public void testLireTexte() throws Exception {
        System.out.println("lireTexte");
        String filePath = "";
        ProgrammeTele expResult = null;
        ProgrammeTele result = ProgrammeTele.lireTexte(filePath);
        assertEquals(expResult, result);
    }
    
}

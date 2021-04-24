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
public class ReportageTest {
    
    public ReportageTest() {
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
     * Test of toString method, of class Reportage.
     */
    @Test
    public void testToString() throws HoraireInvalideException, DureeInvalideException {
        System.out.println("toString");
        Reportage instance = new Reportage("",4,Theme.ANIMALIER);
        String expResult = "Reportage : nom=, duree=1, heureDebut=4, theme=ANIMALIER)"+"\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTexteASauver method, of class Reportage.
     */
    @Test
    public void testGetTexteASauver() throws HoraireInvalideException, DureeInvalideException {
        System.out.println("getTexteASauver");
        Reportage instance = new Reportage("",4,Theme.ANIMALIER);
        String expResult = "Reportage||1|4|ANIMALIER|";
        String result = instance.getTexteASauver();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of DureeInvalideException exception, of class Reportage.
     */
    //Remarque : la durée est fixée pour un reportage, ce test n'a donc pas vraiment de sens, du moins on ne s'attend à aucune levée d'exception
    @Test 
    public void testReportageDureeInvalideException() throws HoraireInvalideException, DureeInvalideException {
        Reportage instance = new Reportage("",4,Theme.ANIMALIER);
        int expResult = 1;
        int result = instance.getDuree();
        assertTrue(expResult == result);
    }
    
    /**
     * Test of HoraireInvalideException exception, of class Reportage.
     */
    @Test (expected = HoraireInvalideException.class)
    public void testReportageHoraireInvalideException() throws HoraireInvalideException, DureeInvalideException {
        //Si tout se passe bien on sort du test dés la première ligne sinon fail
        Reportage instance = new Reportage("",10,Theme.ANIMALIER);
        fail("On aurait dû avoir une exception !"); 
    }
}

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
public class DivertissementTest {
    
    public DivertissementTest() {
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
     * Test of toString method, of class Divertissement.
     */
    @Test
    public void testToString() throws HoraireInvalideException, DureeInvalideException {
        System.out.println("toString");
        Divertissement instance = new Divertissement("",19,new Animateur("",""));
        String expResult = "Divertissement : nom=, duree=2, heureDebut=19, (Animateur : nom=, prenom=))"+"\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTexteASauver method, of class Divertissement.
     */
    @Test
    public void testGetTexteASauver() throws HoraireInvalideException, DureeInvalideException {
        System.out.println("getTexteASauver");
        Divertissement instance = new Divertissement("",19,new Animateur("",""));
        String expResult = "Divertissement||2|19|||";
        String result = instance.getTexteASauver();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of DureeInvalideException exception, of class Divertissement.
     */
    //Remarque : la durée est fixée pour un divertissement, ce test n'a donc pas vraiment de sens, du moins on ne s'attend à aucune levée d'exception
    @Test 
    public void testDivertissementDureeInvalideException() throws HoraireInvalideException, DureeInvalideException {
        Divertissement instance = new Divertissement("",19,new Animateur("",""));
        int expResult = 2;
        int result = instance.getDuree();
        assertTrue(expResult == result);
    }
    
    /**
     * Test of HoraireInvalideException exception, of class Divertissement.
     */
    @Test (expected = HoraireInvalideException.class)
    public void testDivertissementHoraireInvalideException() throws HoraireInvalideException, DureeInvalideException {
        Divertissement instance = new Divertissement("",19,new Animateur("",""));
        int expResult = 19;
        int result = instance.getHeureDebut();
        assertTrue(expResult == result);
        //Si tout se passe bien on sort du test (car mauvais horaire donc exception) dés la première ligne sinon fail
        Divertissement instance2 = new Divertissement("",10,new Animateur("",""));
        fail("On aurait dû avoir une exception !"); 
    }
}

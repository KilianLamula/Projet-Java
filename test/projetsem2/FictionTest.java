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
public class FictionTest {
    
    public FictionTest() {
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
     * Test of toString method, of class Fiction.
     */
    @Test
    public void testToString() throws HoraireInvalideException, DureeInvalideException {
        System.out.println("toString");
        Fiction instance = new Fiction("",4,10,2010,true,new Realisateur("",""));
        String expResult = "Fiction : nom=, duree=4, heureDebut=10, annee=2010, rediffusion=true, (Realisateur : nom=, prenom=))"+"\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTexteASauver method, of class Fiction.
     */
    @Test
    public void testGetTexteASauver() throws HoraireInvalideException, DureeInvalideException {
        System.out.println("getTexteASauver");
        Fiction instance = new Fiction("",4,10,2010,true,new Realisateur("",""));
        String expResult = "Fiction||4|10|2010|true|||";
        String result = instance.getTexteASauver();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAnnee method, of class Fiction.
     */
    @Test
    public void testGetAnnee() throws HoraireInvalideException, DureeInvalideException {
        System.out.println("getAnnee");
        Fiction instance = new Fiction("",4,10,2010,true,new Realisateur("",""));
        int expResult = 2010;
        int result = instance.getAnnee();
        assertEquals(expResult, result);
    }

    /**
     * Test of isRediffusion method, of class Fiction.
     */
    @Test
    public void testIsRediffusion() throws HoraireInvalideException, DureeInvalideException {
        System.out.println("isRediffusion");
        Fiction instance = new Fiction("",4,10,2010,true,new Realisateur("",""));
        boolean expResult = true;
        boolean result = instance.isRediffusion();
        assertEquals(expResult, result);
    }
    
        /**
     * Test of DureeInvalideException exception, of class Fiction.
     */
    @Test (expected = DureeInvalideException.class)
    public void testFictionDureeInvalideException() throws HoraireInvalideException, DureeInvalideException {
        Fiction instance = new Fiction("",4,10,2010,true,new Realisateur("",""));
        int expResult = 4;
        int result = instance.getDuree();
        assertTrue(expResult == result);
        //Test de levée d'exception : on teste avec une durée > 4
        Fiction instance2 = new Fiction("",5,10,2010,true,new Realisateur("",""));
        fail("On aurait dû avoir une DureeInvalideException !"); 
    }
    
    /**
     * Test of HoraireInvalideException exception, of class Fiction.
     */
    @Test (expected = HoraireInvalideException.class)
    public void testFictionHoraireInvalideException() throws HoraireInvalideException, DureeInvalideException {
        Fiction instance = new Fiction("",4,10,2010,true,new Realisateur("",""));
        int expResult = 10;
        int result = instance.getHeureDebut();
        assertTrue(expResult == result);
        //Si tout se passe bien on sort du test (une fiction non rediffusée doit commencer après 21h donc exception) dés la première ligne sinon fail
        Fiction instance2 = new Fiction("",4,19,2010,false,new Realisateur("",""));
        fail("On aurait dû avoir une HoraireInvalideException !"); 
    }
}

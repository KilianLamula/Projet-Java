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
public class TableauProgrammeTest {
    
    public TableauProgrammeTest() {
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
     * Test of getEmission method, of class TableauProgramme.
     */
    @Test
    public void testGetEmission() {
        System.out.println("getEmission");
        ArrayList<Emission> emissions = new ArrayList<Emission>();
        TableauProgramme instance = new TableauProgramme(emissions);
        instance.getEmission();
    }
    
}

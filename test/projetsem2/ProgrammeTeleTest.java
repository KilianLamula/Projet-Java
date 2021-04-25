/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsem2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author lamul
 */
public class ProgrammeTeleTest {

    public ProgrammeTeleTest(){
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
    public void testValidationGrilleValide() throws Exception {
        System.out.println("validationGrille");
        ArrayList<Emission> lesEmissionsValide = new ArrayList<Emission>();
        
        lesEmissionsValide.add(new Fiction("Inception", 4, 0, 2010, true, new Realisateur("Nolan", "Christopher")));
        lesEmissionsValide.add(new Reportage("La danse des oiseaux", 4, Theme.ANIMALIER));
        lesEmissionsValide.add(new Fiction("Independence", 4, 5, 1996, true, new Realisateur("Emmerich", "Roland")));
        lesEmissionsValide.add(new Fiction("Avatar", 3, 9, 2009, true, new Realisateur("Cameron", "James")));
        lesEmissionsValide.add(new Fiction("Alita", 4, 12, 2019, true, new Realisateur("Rodriguez", "Robert")));
        lesEmissionsValide.add(new Fiction("Passengers", 3, 16, 2016, true, new Realisateur("Tyldum", "Morten")));
        lesEmissionsValide.add(new Divertissement("TPMP", 19, new Animateur("Hanouna", "Cyril")));
        lesEmissionsValide.add(new Fiction("Interstellar", 3, 21, 2014, false, new Realisateur("Nolan", "Christopher")));

        ProgrammeTele instance = new ProgrammeTele(lesEmissionsValide);        
        instance.validationGrille();
    }

    /**
     * Test of validationGrille method, of class ProgrammeTele.
     */
    @Test(expected = TrouException.class)
    public void testValidationGrilleTrouException() throws Exception {
        System.out.println("validationGrille");
        ArrayList<Emission> lesEmissionsTrou = new ArrayList<Emission>();
        
        lesEmissionsTrou.add(new Fiction("Inception", 4, 0, 2010, true, new Realisateur("Nolan", "Christopher")));
        lesEmissionsTrou.add(new Reportage("La danse des oiseaux", 4, Theme.ANIMALIER));
        lesEmissionsTrou.add(new Fiction("Independence", 4, 5, 1996, true, new Realisateur("Emmerich", "Roland")));
        lesEmissionsTrou.add(new Fiction("Avatar", 3, 9, 2009, true, new Realisateur("Cameron", "James")));
        lesEmissionsTrou.add(new Fiction("Alita", 4, 12, 2019, true, new Realisateur("Rodriguez", "Robert")));
        lesEmissionsTrou.add(new Fiction("Passengers", 3, 16, 2016, true, new Realisateur("Tyldum", "Morten")));
        lesEmissionsTrou.add(new Fiction("Interstellar", 3, 21, 2014, false, new Realisateur("Nolan", "Christopher")));

        ProgrammeTele instance = new ProgrammeTele(lesEmissionsTrou);        
        instance.validationGrille();
        fail("On aurait dû avoir une TrouException !");
    }
    
    /**
     * Test of validationGrille method, of class ProgrammeTele.
     */
    @Test(expected = ChevauchementException.class)
    public void testValidationGrilleChevauchementException() throws Exception {
        System.out.println("validationGrille");
        ArrayList<Emission> lesEmissionsChevauchement = new ArrayList<Emission>();
        
        lesEmissionsChevauchement.add(new Fiction("Inception", 4, 0, 2010, true, new Realisateur("Nolan", "Christopher")));
        lesEmissionsChevauchement.add(new Reportage("La danse des oiseaux", 4, Theme.ANIMALIER));
        lesEmissionsChevauchement.add(new Fiction("Independence", 4, 5, 1996, true, new Realisateur("Emmerich", "Roland")));
        lesEmissionsChevauchement.add(new Fiction("Avatar", 4, 9, 2009, true, new Realisateur("Cameron", "James")));
        lesEmissionsChevauchement.add(new Fiction("Alita", 4, 12, 2019, true, new Realisateur("Rodriguez", "Robert")));
        lesEmissionsChevauchement.add(new Fiction("Passengers", 3, 16, 2016, true, new Realisateur("Tyldum", "Morten")));
        lesEmissionsChevauchement.add(new Fiction("Interstellar", 3, 21, 2014, false, new Realisateur("Nolan", "Christopher")));

        ProgrammeTele instance = new ProgrammeTele(lesEmissionsChevauchement);        
        instance.validationGrille();
        fail("On aurait dû avoir une ChevauchementException !");
    }
    
    /**
     * Test of validationGrille method, of class ProgrammeTele.
     */
    @Test(expected = HoraireInvalideException.class)
    public void testValidationGrilleHoraireInvalideException() throws Exception {
        System.out.println("validationGrille");
        ArrayList<Emission> lesEmissionsHoraire = new ArrayList<Emission>();
        
        lesEmissionsHoraire.add(new Fiction("Inception", 4, 0, 2010, true, new Realisateur("Nolan", "Christopher")));
        lesEmissionsHoraire.add(new Reportage("La danse des oiseaux", 4, Theme.ANIMALIER));
        lesEmissionsHoraire.add(new Fiction("Independence", 4, 5, 1996, true, new Realisateur("Emmerich", "Roland")));
        lesEmissionsHoraire.add(new Fiction("Avatar", 3, 9, 2009, true, new Realisateur("Cameron", "James")));
        lesEmissionsHoraire.add(new Fiction("Alita", 4, 12, 2019, true, new Realisateur("Rodriguez", "Robert")));
        lesEmissionsHoraire.add(new Fiction("Passengers", 3, 16, 2016, true, new Realisateur("Tyldum", "Morten")));
        lesEmissionsHoraire.add(new Fiction("Interstellar", 4, 21, 2014, false, new Realisateur("Nolan", "Christopher")));

        ProgrammeTele instance = new ProgrammeTele(lesEmissionsHoraire);        
        instance.validationGrille();
        fail("On aurait dû avoir une HoraireInvalideException !");
    }

    /**
     * Test of sauverTexte method, of class ProgrammeTele.
     */
    @Test
    public void testSauverTexte() throws Exception {
        System.out.println("sauverTexte");
        String filePath = "C:\\Users\\lamul\\OneDrive\\Documents\\NetBeansProjects\\ProjetSEM2\\src\\projetsem2\\Sauvegarde du programme.txt";
        
        ArrayList<Emission> lesEmissions = new ArrayList<Emission>();
        
        lesEmissions.add(new Fiction("Inception", 4, 0, 2010, true, new Realisateur("Nolan", "Christopher")));
        lesEmissions.add(new Reportage("La danse des oiseaux", 4, Theme.ANIMALIER));
        lesEmissions.add(new Fiction("Independence", 4, 5, 1996, true, new Realisateur("Emmerich", "Roland")));
        lesEmissions.add(new Fiction("Avatar", 3, 9, 2009, true, new Realisateur("Cameron", "James")));
        lesEmissions.add(new Fiction("Alita", 4, 12, 2019, true, new Realisateur("Rodriguez", "Robert")));
        lesEmissions.add(new Fiction("Passengers", 3, 16, 2016, true, new Realisateur("Tyldum", "Morten")));
        lesEmissions.add(new Divertissement("TPMP", 19, new Animateur("Hanouna", "Cyril")));
        lesEmissions.add(new Fiction("Interstellar", 3, 21, 2014, false, new Realisateur("Nolan", "Christopher")));
        
        ProgrammeTele instance = new ProgrammeTele(lesEmissions);
        instance.sauverTexte(filePath);
    }
    
    /**
     * Test of sauverTexte method, of class ProgrammeTele.
     */
    @Test(expected = IOException.class)
    public void testSauverTexteIOException() throws Exception {
        System.out.println("sauverTexte");
        String filePath = null;
        
        ArrayList<Emission> lesEmissions = new ArrayList<Emission>();
        
        lesEmissions.add(new Fiction("Inception", 4, 0, 2010, true, new Realisateur("Nolan", "Christopher")));
        lesEmissions.add(new Reportage("La danse des oiseaux", 4, Theme.ANIMALIER));
        lesEmissions.add(new Fiction("Independence", 4, 5, 1996, true, new Realisateur("Emmerich", "Roland")));
        lesEmissions.add(new Fiction("Avatar", 3, 9, 2009, true, new Realisateur("Cameron", "James")));
        lesEmissions.add(new Fiction("Alita", 4, 12, 2019, true, new Realisateur("Rodriguez", "Robert")));
        lesEmissions.add(new Fiction("Passengers", 3, 16, 2016, true, new Realisateur("Tyldum", "Morten")));
        lesEmissions.add(new Divertissement("TPMP", 19, new Animateur("Hanouna", "Cyril")));
        lesEmissions.add(new Fiction("Interstellar", 3, 21, 2014, false, new Realisateur("Nolan", "Christopher")));
        
        //On créé un fichier verrouillé qui devrait lever une IOException lors de sa lecture
        final RandomAccessFile raFile = new RandomAccessFile("", "rw");
        raFile.getChannel().lock();
        
        ProgrammeTele instance = new ProgrammeTele(lesEmissions);
        instance.sauverTexte(raFile.readLine());
    }

    /**
     * Test of lireTexte method, of class ProgrammeTele.
     */
    @Test
    public void testLireTexte() throws Exception {
        System.out.println("lireTexte");
        String filePath = "C:\\Users\\lamul\\OneDrive\\Documents\\NetBeansProjects\\ProjetSEM2\\src\\projetsem2\\Sauvegarde du programme.txt";
        
        ArrayList<Emission> lesEmissions = new ArrayList<Emission>();
        lesEmissions.add(new Fiction("Inception", 4, 0, 2010, true, new Realisateur("Nolan", "Christopher")));
        lesEmissions.add(new Reportage("La danse des oiseaux", 4, Theme.ANIMALIER));
        lesEmissions.add(new Fiction("Independence", 4, 5, 1996, true, new Realisateur("Emmerich", "Roland")));
        lesEmissions.add(new Fiction("Avatar", 3, 9, 2009, true, new Realisateur("Cameron", "James")));
        lesEmissions.add(new Fiction("Alita", 4, 12, 2019, true, new Realisateur("Rodriguez", "Robert")));
        lesEmissions.add(new Fiction("Passengers", 3, 16, 2016, true, new Realisateur("Tyldum", "Morten")));
        lesEmissions.add(new Divertissement("TPMP", 19, new Animateur("Hanouna", "Cyril")));
        lesEmissions.add(new Fiction("Interstellar", 3, 21, 2014, false, new Realisateur("Nolan", "Christopher")));
        
        ProgrammeTele programme = new ProgrammeTele(lesEmissions);
        ProgrammeTele expResult = programme;
        ProgrammeTele result = ProgrammeTele.lireTexte(filePath);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of lireTexte method, of class ProgrammeTele.
     */
    @Test(expected = HoraireInvalideException.class)
    public void testLireTexteHoraireInvalideException() throws Exception {
        System.out.println("lireTexte");
        String filePath = "C:\\Users\\lamul\\OneDrive\\Documents\\NetBeansProjects\\ProjetSEM2\\test\\projetsem2\\Sauvegarde du programme HORAIREEXCEPT pour JUnit.txt";
        ProgrammeTele result = ProgrammeTele.lireTexte(filePath);
        fail("On aurait dû avoir une HoraireInvalideException !");
    }
    
    /**
     * Test of lireTexte method, of class ProgrammeTele.
     */
    @Test(expected = DureeInvalideException.class)
    public void testLireTexteDureeInvalideException() throws Exception {
        System.out.println("lireTexte");
        String filePath = "C:\\Users\\lamul\\OneDrive\\Documents\\NetBeansProjects\\ProjetSEM2\\test\\projetsem2\\Sauvegarde du programme DUREEEXCEPT pour JUnit.txt";
        ProgrammeTele result = ProgrammeTele.lireTexte(filePath);
        fail("On aurait dû avoir une DureeInvalideException !");
    }
    
    /**
     * Test of lireTexte method, of class ProgrammeTele.
     */
    @Test(expected = IOException.class)
    public void testLireTexteIOException() throws Exception {
        System.out.println("lireTexte");
        
        //On créé un fichier verrouillé qui devrait lever une IOException lors de sa lecture
        final RandomAccessFile raFile = new RandomAccessFile("", "rw");
        raFile.getChannel().lock();
        
        ProgrammeTele result = ProgrammeTele.lireTexte(raFile.readLine());
        fail("On aurait dû avoir une IOException !");
    }
    
}

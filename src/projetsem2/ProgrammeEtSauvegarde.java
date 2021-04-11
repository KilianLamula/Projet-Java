/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsem2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lamul
 */
public class ProgrammeEtSauvegarde {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Création de la liste d'émissions
        ArrayList<Emission> lesEmissions = new ArrayList<Emission>();

        //Création du programme télé
        ProgrammeTele programme = new ProgrammeTele(lesEmissions);

        //Chemin d'accès au fichier de sauvegarde
        String filepath = "C:\\Users\\lamul\\OneDrive\\Documents\\NetBeansProjects\\ProjetSEM2\\src\\projetsem2\\Sauvegarde du programme.dat";

        try {
            //Création des émissions
            Emission e1 = new Fiction("Inception", 4, 0, 2010, true, new Realisateur("Nolan", "Christopher"));
            Emission e2 = new Reportage("La danse des oiseaux", 4, Theme.ANIMALIER);
            Emission e3 = new Fiction("Independence", 4, 5, 1996, true, new Realisateur("Emmerich", "Roland"));
            Emission e4 = new Fiction("Avatar", 3, 9, 2009, true, new Realisateur("Cameron", "James"));
            Emission e5 = new Fiction("Alita", 4, 12, 2019, true, new Realisateur("Rodriguez", "Robert"));
            Emission e6 = new Fiction("Passengers", 3, 16, 2016, true, new Realisateur("Tyldum", "Morten"));
            Emission e7 = new Divertissement("TPMP", 19, new Animateur("Hamouna", "Cyril"));
            Emission e8 = new Fiction("Interstellar", 3, 21, 2014, false, new Realisateur("Nolan", "Christopher"));

            //Remplissage de la liste
            lesEmissions.add(e1);
            lesEmissions.add(e2);
            lesEmissions.add(e3);
            lesEmissions.add(e4);
            lesEmissions.add(e5);
            lesEmissions.add(e6);
            lesEmissions.add(e7);
            lesEmissions.add(e8);

        } catch (HoraireInvalideException ex) {
            Logger.getLogger(ProgrammeEtSauvegarde.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DureeInvalideException ex) {
            Logger.getLogger(ProgrammeEtSauvegarde.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Sauvegarde en binaire
        try {
            programme.sauver(filepath);
            System.out.println("Programme sauvegardé en binaire dans le fichier " + filepath);
        } catch (IOException ex) {
            Logger.getLogger(ProgrammeEtSauvegarde.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Lecture en binaire
        try {
            ProgrammeTele lue = ProgrammeTele.lire(filepath);
            System.out.println("Programme lue en binaire = " + lue);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ProgrammeEtSauvegarde.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

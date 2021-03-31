/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsem2;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lamul
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Création de la liste d'émissions
        ArrayList<Emission> lesEmissions = new ArrayList<Emission>();
        //Création du programme télé savane
        ProgrammeTele programme = new ProgrammeTele(lesEmissions);

        try {
            //Création des émissions
            //Grille Valide:
            Emission e1 = new Fiction("Inception", 4, 0, 2010, true, new Realisateur("Nolan", "Christopher"));
            Emission e2 = new Reportage("La danse des oiseaux", 4, Theme.ANIMALIER);
            Emission e3 = new Fiction("Independence", 4, 5, 1996, true, new Realisateur("Emmerich", "Roland"));
            Emission e4 = new Fiction("Avatar", 3, 9, 2009, true, new Realisateur("Cameron", "James"));
            Emission e5 = new Fiction("Alita", 4, 12, 2019, true, new Realisateur("Rodriguez", "Robert"));
            Emission e6 = new Fiction("Passengers", 3, 16, 2016, true, new Realisateur("Tyldum", "Morten"));
            Emission e7 = new Divertissement("TPMP", 19, new Animateur("Hamouna", "Cyril"));
            Emission e8 = new Fiction("Interstellar", 3, 21, 2014, false, new Realisateur("Nolan", "Christopher"));

            //Grille chevauchement
            Emission e9 = new Fiction("Independence", 4, 5, 1996, true, new Realisateur("Emmerich", "Roland"));
            Emission e10 = new Fiction("Avatar", 4, 8, 2009, true, new Realisateur("Cameron", "James"));

            //Remplissage de la liste
            lesEmissions.add(e1);
            lesEmissions.add(e2);
            lesEmissions.add(e3);
            lesEmissions.add(e4);
            lesEmissions.add(e5);
            lesEmissions.add(e6);
            lesEmissions.add(e7);
            lesEmissions.add(e8);

            try {
                programme.validationGrille();
            } catch (TrouException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ChevauchementException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (HoraireInvalideException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Affichage du programme
            System.out.println("Grille Valide:");
            System.out.println("Les émissions diffusé dans la journée sont : " + '\n' + lesEmissions);

            //On supprime toutes les émissions pour pouvoir créer une nouvelle grille
            lesEmissions.clear();

            //Remplissage de la liste pour obtenir un chevauchement
            lesEmissions.add(e1);
            lesEmissions.add(e2);
            lesEmissions.add(e9);
            lesEmissions.add(e10);
            lesEmissions.add(e5);
            lesEmissions.add(e6);
            lesEmissions.add(e7);
            lesEmissions.add(e8);

            try {
                programme.validationGrille();
            } catch (TrouException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ChevauchementException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (HoraireInvalideException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Affichage du programme
            System.out.println("Grille Valide:");
            System.out.println("Les émissions diffusé dans la journée sont : " + '\n' + lesEmissions);

            //On supprime toutes les émissions pour pouvoir créer une nouvelle grille
            lesEmissions.clear();

            //Remplissage de la liste pour obtenir un Trou
            lesEmissions.add(e1);
            lesEmissions.add(e2);
            lesEmissions.add(e3);
            lesEmissions.add(e4);
            lesEmissions.add(e5);
            lesEmissions.add(e6);
            lesEmissions.add(e8);

        } catch (DureeInvalideException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HoraireInvalideException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Validation de la grille : vérification des trous/chevauchements
        try {
            programme.validationGrille();
        } catch (TrouException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ChevauchementException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HoraireInvalideException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Affichage du programme
        System.out.println("Grille Valide:");
        System.out.println("Les émissions diffusé dans la journée sont : " + '\n' + lesEmissions);

    }

}

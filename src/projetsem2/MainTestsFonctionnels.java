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
public class MainTestsFonctionnels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Création de la liste d'émissions
        ArrayList<Emission> lesEmissions = new ArrayList<Emission>();
        //Création d'une liste pour stocker les messages d'exceptions
        ArrayList<Exception> exceptions = new ArrayList();
        //Création du programme télé
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
            Emission e7 = new Divertissement("TPMP", 19, new Animateur("Hanouna", "Cyril"));
            Emission e8 = new Fiction("Interstellar", 3, 21, 2014, false, new Realisateur("Nolan", "Christopher"));

            //Grille chevauchement
            Emission e9 = new Fiction("Independence", 4, 5, 1996, true, new Realisateur("Emmerich", "Roland"));
            Emission e10 = new Fiction("Avatar", 4, 8, 2009, true, new Realisateur("Cameron", "James"));

            //Remplissage de la liste valide
            lesEmissions.add(e1);
            lesEmissions.add(e2);
            lesEmissions.add(e3);
            lesEmissions.add(e4);
            lesEmissions.add(e5);
            lesEmissions.add(e6);
            lesEmissions.add(e7);
            lesEmissions.add(e8);

            //Validation de la grille valide : vérification des trous/chevauchements
            try {
                programme.validationGrille();
            } catch (TrouException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                exceptions.add(ex);
            } catch (ChevauchementException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                exceptions.add(ex);
            } catch (HoraireInvalideException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                exceptions.add(ex);
            }

            //Affichage du programme pour la grille valide
            System.out.println("Grille Valide:");
            System.out.println("Les émissions diffusé dans la journée sont : " + '\n' + lesEmissions + '\n');

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

            //Validation de la grille avec un chevauchement : vérification des trous/chevauchements
            try {
                programme.validationGrille();
            } catch (TrouException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                exceptions.add(ex);
            } catch (ChevauchementException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                exceptions.add(ex);
            } catch (HoraireInvalideException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                exceptions.add(ex);
            }

            //Affichage du programme pour la grille chevauchement
            System.out.println("Grille Chevauchement:");
            System.out.println("Les émissions diffusé dans la journée sont : " + '\n' + lesEmissions + '\n');

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

            //Validation de la grille à trous : vérification des trous/chevauchements
            try {
                programme.validationGrille();
            } catch (TrouException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                exceptions.add(ex);
            } catch (ChevauchementException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                exceptions.add(ex);
            } catch (HoraireInvalideException ex) {
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                exceptions.add(ex);
            }

        } catch (DureeInvalideException ex) {
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            exceptions.add(ex);
        } catch (HoraireInvalideException ex) {
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            exceptions.add(ex);
        }

        //Affichage du programme
        System.out.println("Grille Trou:");
        System.out.println("Les émissions diffusé dans la journée sont : " + '\n' + lesEmissions + '\n');
        System.out.println("Les erreurs s'étant produites pendant le développement sont: " + '\n');
        for(Exception ex : exceptions) {
            System.out.println(ex);
        }
    }

}

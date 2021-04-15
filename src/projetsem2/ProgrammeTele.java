/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsem2;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author lamul
 */
public class ProgrammeTele extends ArrayList {

    private ArrayList<Emission> lesEmissions;

    public ProgrammeTele(ArrayList<Emission> lesEmissions) {
        this.lesEmissions = lesEmissions;
    }

    public String toString() {
        return "Le programme télé est : " + "\n" + lesEmissions;
    }

    //Méthode pour gérer les trous et les chevauchements
    public void validationGrille() throws TrouException, ChevauchementException, HoraireInvalideException {
        boolean grille[] = new boolean[24];
        //On initialise toutes les cases du tableau de booléen à false
        for (int a = 0; a < grille.length; a++) {
            grille[a] = false;
        }
        for (Emission e : lesEmissions) {
            //On remplie la grille de 'true' pour chaque heure où une émission est programmée et on gère le problème de chevauchement en même temps
            for (int i = e.getHeureDebut(); i < (e.getHeureDebut() + e.getDuree()); i++) {
                if ((e.getHeureDebut() + e.getDuree()) > 24) {
                    throw new HoraireInvalideException("Le programme doit commencer à minuit et finir à 00h : la dernière émission ne peut donc pas aller au delà de 00h."
                            + " Ainsi l'heure de début (" + e.getHeureDebut() + ") avec une durée de (" + e.getDuree() + ") de l'émission (" + e + ") dépasse 00h.");
                }
                if (grille[i] == true) {
                    throw new ChevauchementException("Il y a un chevauchement avec l'émission (" + e + ") entre " + e.getHeureDebut() + "h et " + (e.getHeureDebut() + e.getDuree()) + "h.");
                }
                if (grille[i] == false) {
                    grille[i] = true;
                }
            }
        }
        //On vérifie si il y a des trous (donc des 'false') dans la grille après l'avoir remplie
        for (int j = 0; j < grille.length; j++) {
            if (grille[j] == false) {
                throw new TrouException("Il y a un trou à " + j + "h.");
            }
        }
        System.out.println("La grille est valide :" + '\n');
    }

    //Les deux méthodes pour la sauvegarde du programme :
    
    //Méthode qui permet de sauvegarder le programme dans un fichier texte
    public void sauverTexte(String filePath) throws IOException {
        FileWriter fw = new FileWriter(filePath, false);
        // Pour chaque attribut de mon instance je l'écris dans le fichier
        for (Emission e : lesEmissions) {
            fw.write(e.getTexteASauver());
            // On insère un retour à la ligne
            fw.write(System.lineSeparator());
        }
        fw.close();
    }
    //Méthode qui permet de lire le fichier texte enregistré
    public static ProgrammeTele lireTexte(String filePath) throws IOException, HoraireInvalideException, DureeInvalideException {
        Scanner sc = new Scanner(Paths.get(filePath)).useDelimiter("\n");
        ArrayList<Emission> lesEmissions = new ArrayList<>();
        while (sc.hasNext()) {
            String ligne = sc.next();
            StringTokenizer token = new StringTokenizer(ligne, "|");
            String type = token.nextToken();
            String nom = token.nextToken();
            int duree = Integer.parseInt(token.nextToken());
            int heureDebut = Integer.parseInt(token.nextToken());
            //On différencie trois cas pour les 3 types d'émissions car elles ont des attributs différents
            if (type.contains("Reportage")) {
                String val = token.nextToken();
                Theme theme = null;
                if((val.contains("ANIMALIER"))){
                    theme = Theme.ANIMALIER;
                }
                else if(val.contains("INFORMATION")){
                    theme = Theme.INFORMATION;
                }
                else{
                    theme = Theme.CULTUREL;
                }
                lesEmissions.add(new Reportage(nom, heureDebut, theme));
            } else if (type.contains("Divertissement")) {
                String aNom = token.nextToken();
                String aPrenom = token.nextToken();
                lesEmissions.add(new Divertissement(nom, heureDebut, new Animateur(aNom, aPrenom)));
            } else{
                int annee = Integer.parseInt(token.nextToken());
                boolean rediff = Boolean.parseBoolean(token.nextToken());
                String rNom = token.nextToken();
                String rPrenom = token.nextToken();
                lesEmissions.add(new Fiction(nom, duree, heureDebut, annee, rediff, new Realisateur(rNom, rPrenom)));
            }
        }
        return new ProgrammeTele(lesEmissions);
    }

}

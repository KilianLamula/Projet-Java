/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsem2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author lamul
 */
public class Emission {

    protected String nom;
    protected int duree;
    protected int heureDebut;

    public Emission(String nom, int duree, int heureDebut) {
        this.nom = nom;
        this.duree = duree;
        this.heureDebut = heureDebut;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " : nom=" + nom + ", duree=" + duree + ", heureDebut=" + heureDebut;
    }

    public String getNom() {
        return nom;
    }

    public int getDuree() {
        return duree;
    }

    public int getHeureDebut() {
        return heureDebut;
    }

    //Les trois méthodes pour la sauvegarde du programme en texte
    public void sauverTexte(String filePath) throws IOException {
        FileWriter fw = new FileWriter(filePath, false);
        // Pour chaque attribut de mon instance je l'écris dans le fichier
        fw.write(this.getTexteASauver());
        fw.write(System.lineSeparator());
        fw.close();
    }

    public static Emission lireTexte(String content) {
        StringTokenizer token = new StringTokenizer(content, "|");
        String nom = token.nextToken();
        String sDuree = token.nextToken();
        String sHeureDebut = token.nextToken();
        int duree = Integer.parseInt(sDuree);
        int heureDebut = Integer.parseInt(sHeureDebut);
        return new Emission(nom, duree, heureDebut);
    }

    public String getTexteASauver() {
        return nom + "|" + duree + "|" + heureDebut;
    }
}

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

    protected String type;
    protected String nom;
    protected int duree;
    protected int heureDebut;

    public Emission(String type, String nom, int duree, int heureDebut) {
        this.type = type;
        this.nom = nom;
        this.duree = duree;
        this.heureDebut = heureDebut;
    }

    public String toString() {
        return type + " : nom=" + nom + ", duree=" + duree + ", heureDebut=" + heureDebut;
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

    public String getTexteASauver() {
        return type + "|" + nom + "|" + duree + "|" + heureDebut;
    }
}

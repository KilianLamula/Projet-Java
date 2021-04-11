/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsem2;

import java.io.Serializable;

/**
 *
 * @author lamul
 */
public class Personne implements Serializable {

    private String nom;
    private String prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String toString() {
        return "(" + this.getClass().getSimpleName() + " : nom=" + nom + ", prenom=" + prenom + ')';
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

}

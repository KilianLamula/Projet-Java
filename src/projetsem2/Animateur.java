/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsem2;

import java.io.Serializable;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author lamul
 */
public class Animateur extends Personne {

    public Animateur(String nom, String prenom) {
        super(nom, prenom);
    }
    
    //Méthode pour la sauvegarde en texte
    public String getTexteASauver() {
        return super.getTexteASauver();
    }

}

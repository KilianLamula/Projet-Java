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
public class Emission implements Serializable{
    
    protected String nom;
    protected int duree;
    protected int heureDebut;

    public Emission(String nom, int duree, int heureDebut) {
        this.nom = nom;
        this.duree = duree;
        this.heureDebut = heureDebut;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " : nom=" + nom + ", duree=" + duree + ", heureDebut=" + heureDebut ;
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
    
    
}
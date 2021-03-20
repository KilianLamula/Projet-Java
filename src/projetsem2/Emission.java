/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsem2;

/**
 *
 * @author lamul
 */
public class Emission {
    
    private String nom;
    private int duree;
    private int heureDebut;

    public Emission(String nom, int duree, int heureDebut) {
        this.nom = nom;
        this.duree = duree;
        this.heureDebut = heureDebut;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " : nom=" + nom + ", duree=" + duree + ", heureDebut=" + heureDebut ;
    }
}
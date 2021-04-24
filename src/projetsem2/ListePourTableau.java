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
public class ListePourTableau {
    
    protected int heureDebut;
    protected String type;
    protected String nom;
    protected int duree;

    public ListePourTableau(int heureDebut, String type, String nom, int duree) {
        this.heureDebut = heureDebut;
        this.type = type;
        this.nom = nom;
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "ListePourTableau{" + "heureDebut=" + heureDebut + ", type=" + type + ", nom=" + nom + ", duree=" + duree + '}';
    }
    
    
}

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
public class Reportage extends Emission {
    
    protected Theme theme;
    
    public Reportage(String nom, int heureDebut, Theme theme) throws GrilleException{
        super(nom, 1, heureDebut);
        this.theme = theme;
        
        //Exception pour l'heure de début
        if(!(14 <= heureDebut || heureDebut<= 17) && !(0 <= heureDebut || heureDebut <= 5)){
            throw new GrilleException("Le reportage doit avoir une heure de début ("+heureDebut+") entre 14h et 17h ou entre 00h et 5h");
        }
        
        //Exception pour l'heure de fin
        int heureFin = heureDebut+duree;
        if(!(heureFin >= 15 || heureFin <= 18 ) && (heureFin >= 1 || heureFin <= 6)){
            throw new GrilleException("Le reportage doit avoir une heure de fin ("+heureFin+") entre 15h et 18h ou entre 1h et 6h");
        }
    }

    public String toString() {
        return super.toString() + "theme=" + theme + ')' + '\n';
    }
    
}

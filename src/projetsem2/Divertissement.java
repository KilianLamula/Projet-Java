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
public class Divertissement extends Emission {

    protected Animateur a;

    public Divertissement(String nom, int heureDebut, Animateur a) throws HoraireInvalideException, DureeInvalideException {
        super("Divertissement", nom, 2, heureDebut);
        this.a = a;
        
        //Exception horaires programmation : uniquement entre 18h et 23h compris
        if ((heureDebut < 18) || ((heureDebut + duree) > 23)) {
            throw new HoraireInvalideException("Le divertissement doit avoir une heure de début ("+heureDebut+") et une heure de fin ("+(heureDebut+duree)+") fixées entre 18h et 21h");
        }
    }
    
    public String toString() {
        return super.toString() + ", " + a + ')' + '\n';
    }
    
    //Méthode pour la sauvegarde en texte
    public String getTexteASauver() {
        return super.getTexteASauver() + "|" + a.getTexteASauver();
    }
}


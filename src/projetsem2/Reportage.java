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
    
    public Reportage(String nom, int heureDebut, Theme theme) throws HoraireInvalideException, DureeInvalideException{
        super(nom, 1, heureDebut);
        this.theme = theme;
        
        if((((heureDebut > 6) && (heureDebut < 14)) || (((heureDebut+duree) > 18) && ((heureDebut+duree) < 0)))){
            throw new HoraireInvalideException("Le reportage doit avoir une heure de début ("+heureDebut+") et une heure de fin ("+(heureDebut+duree)+") fixées entre 14h et 18h ou entre 00h et 6h");
        }
    }

    public String toString() {
        return super.toString() + "theme=" + theme + ')' + '\n';
    }
    
}

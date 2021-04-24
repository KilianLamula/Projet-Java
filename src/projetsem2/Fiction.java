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
public class Fiction extends Emission {

    protected int annee;
    protected boolean rediffusion;
    protected Realisateur r;

    public Fiction(String nom, int duree, int heureDebut, int annee, boolean rediffusion, Realisateur r) throws HoraireInvalideException, DureeInvalideException {
        super("Fiction", nom, duree, heureDebut);
        this.annee = annee;
        this.rediffusion = rediffusion;
        this.r = r;
        
        //Exception horaires programmation : si ce n'est pas une rediffusion uniquement après 21h compris
        if(rediffusion == false && heureDebut < 21) {
            throw new HoraireInvalideException("Si une émission de Fiction n'est pas rediffusée, elle doit commencer après 21h et ne peut donc pas commencer à " + heureDebut + "h.");
        }
        
        //Exception durée : choix de limiter la durée d'une fiction à 4h max
        if(duree > 4 || duree <= 0){
            throw new DureeInvalideException("La durée suivante :" + duree + "h ne peut pas être supérieure à 4h (ni inférieure ou égale à 0) pour une fiction.");
        }
    }

    public String toString() {
        return super.toString() + ", annee=" + annee + ", rediffusion=" + rediffusion + ", " + r + ')' + '\n';
    }
    
    //Méthode pour la sauvegarde en texte
    public String getTexteASauver() {
        return super.getTexteASauver() + "|" + annee + "|" + rediffusion + "|" + r.getTexteASauver();
    }
    
    public int getAnnee() {
        return annee;
    }
    
    public boolean isRediffusion() {
        return rediffusion;
    }
    
    

}
